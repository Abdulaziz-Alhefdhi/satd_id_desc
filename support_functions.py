import string
from random import sample, seed
import sys
import numpy as np
import pickle
from keras.models import Sequential, Model
from keras.layers import LSTM, Dense, Embedding, Input, dot, Activation, concatenate, GlobalAveragePooling1D, GlobalMaxPooling1D
import smtplib
from tqdm import tqdm
from nltk.translate.bleu_score import corpus_bleu
from lxml import etree as ET
from collections import Counter, defaultdict
import pandas as pd
seed(30)


def extract_data(data_path):
    # Retrieve data from files
    print("Retrieving data from disk...")
    with open(data_path + 'ast_seqs.txt', 'r', encoding='utf-8') as f:
        draft_input_lines = f.read().split('\n')
    with open(data_path + 'labels.txt', 'r', encoding='utf-8') as f:
        draft_label_lines = f.read().split('\n')
    with open(data_path + 'comments.txt', 'r', encoding='utf-8') as f:
        draft_comment_lines = f.read().split('\n')
    with open(data_path + 'codes.txt', 'r', encoding='utf-8') as f:
        draft_code_lines = f.read().split('\n')
    # Remove last (empty) items
    draft_input_lines   = draft_input_lines[:-1]
    draft_label_lines   = draft_label_lines[:-1]
    draft_comment_lines = draft_comment_lines[:-1]
    draft_code_lines    = draft_code_lines[:-1]

    # Ignore non-English data
    input_lines, label_lines, comment_lines, code_lines = [], [], [], []
    c = 0
    for inp_ln, lbl_ln, com_ln, cod_ln in zip(draft_input_lines, draft_label_lines, draft_comment_lines, draft_code_lines):
        match = False
        for char in string.ascii_letters:
            if char in com_ln:
                match = True
                input_lines.append(inp_ln)
                label_lines.append(lbl_ln)
                comment_lines.append(com_ln)
                code_lines.append(cod_ln)
                break
        if not match:
            c += 1
    print(c, "comments do not contain English text at all")

    # Combine data to remove duplicates
    aggregated = []
    for inp_ln, lbl_ln, com_ln, cod_ln in zip(input_lines, label_lines, comment_lines, code_lines):
        aggregated.append((inp_ln, lbl_ln, com_ln, cod_ln))
    # Remove duplicates
    aggregated = set(aggregated)
    # Re-order data (pos before neg)
    dataset = []
    for item in aggregated:
        if item[1] == "1":
            dataset.append(item)
    for item in aggregated:
        if item[1] == "0":
            dataset.append(item)

    return dataset


# Get data
def retrieve_data(data_path, num_samples, max_input_length, max_comment_length):
    if num_samples % 2 != 0:
        sys.exit("Error: num_samples must be an even number")

    dataset = extract_data(data_path)

    # AST sequences
    print("Treating code sequences...")
    draft_input_lists = []
    for item in dataset:
        input_list = item[0].replace("(", " ( ")
        input_list = input_list.replace(")", " ) ")
        input_list = input_list.replace("_", " _ ")
        draft_input_lists.append(input_list.split())

    # Labels to int
    draft_labels = []
    for item in dataset:
        if item[1] == "1":
            draft_labels.append(1)
        else:
            draft_labels.append(0)

    # Comments
    print("Deleting non-English characters from comments...")
    draft_comment_lists = []
    for item in dataset:
        txt = item[2]
        for char in txt:
            if char not in string.ascii_letters:
                txt = txt.replace(char, " ")
        draft_comment_lists.append(txt.lower().split())
    # Add start and end symbols to target lists
    for i in range(len(draft_comment_lists)):
        draft_comment_lists[i] = ["<sos>"] + draft_comment_lists[i] + ["<eos>"]

    # Codes
    draft_code_lines = []
    for item in dataset:
        draft_code_lines.append(item[3])

    # Remove too-long codes and comments
    input_lists, labels, comment_lists, code_lines = [], [], [], []
    for il, lbl, cl, co in zip(draft_input_lists, draft_labels, draft_comment_lists, draft_code_lines):
        if len(il) <= max_input_length and len(cl) <= max_comment_length:
            input_lists.append(il)
            labels.append(lbl)
            comment_lists.append(cl)
            code_lines.append(co)

    # Separate positive from negative
    pos_data, neg_data = [], []
    for il, lbl, cl, co in zip(input_lists, labels, comment_lists, code_lines):
        if lbl == 1:
            pos_data.append((il, lbl, cl, co))
        else:
            neg_data.append((il, lbl, cl, co))

    # Clean, shuffle, and cut negative data
    # Lengths as in positive data
    max_pos_seq = max([len(x[0]) for x in pos_data])
    max_pos_com = max([len(x[2]) for x in pos_data])
    clean_neg_data = []
    for item in neg_data:
        if len(item[0]) <= max_pos_seq and len(item[2]) <= max_pos_com:
            clean_neg_data.append(item)
    neg_data = sample(clean_neg_data, k=len(clean_neg_data))  # Shuffle
    neg_data = neg_data[:len(pos_data)]  # Cut

    # Use num_samples or less, deducting form positive and negative data equally
    pos_data = sample(pos_data, k=len(pos_data))  # Shuffle positive data
    pos_data = pos_data[: min(num_samples//2, len(pos_data))]
    neg_data = neg_data[: min(num_samples//2, len(neg_data))]

    print("Creating final version of dataset...")
    input_lists, labels, comment_lists, code_lines = [], [], [], []
    for item in pos_data:
        input_lists.append(item[0])
        labels.append(item[1])
        comment_lists.append(item[2])
        code_lines.append(item[3])
    for item in neg_data:
        input_lists.append(item[0])
        labels.append(item[1])
        comment_lists.append(item[2])
        code_lines.append(item[3])

    return np.array(input_lists), np.array(labels), np.array(comment_lists), np.array(code_lines)


def tokenize(array):
    vocab = set()
    for seq in array:
        for token in seq:
            vocab.add(token)
    return sorted(list(vocab)) + ["<unknown>"]


class DataObject:
    def __init__(self, input_lists, labels, comment_lists, code_lines, input_vocab=None, comment_vocab=None):
        self.input_lists   = input_lists
        self.labels        = labels
        self.comment_lists = comment_lists
        self.code_lines    = code_lines
        self.input_vocab   = input_vocab
        self.comment_vocab = comment_vocab


def data_shapes(dataset):
    # num_encoder_tokens = len(dataset.input_vocab)
    # num_decoder_tokens = len(dataset.comment_vocab)
    num_encoder_tokens = len(tokenize(dataset.input_lists))
    num_decoder_tokens = len(tokenize(dataset.comment_lists))
    max_encoder_seq_length = max([len(txt) for txt in dataset.input_lists])
    max_decoder_seq_length = max([len(txt) for txt in dataset.comment_lists])
    n_input_samples = len(dataset.input_lists)

    return num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length, n_input_samples


def shape_info(n_input_samples, num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length):
    print('Number of samples:', n_input_samples)
    print('Number of unique input tokens:', num_encoder_tokens)
    print('Number of unique comment words:', num_decoder_tokens)
    print('Max sequence length for inputs:', max_encoder_seq_length)
    print('Max sequence length for comments:', max_decoder_seq_length)


def write_to_disk(data_path, dataset):
    # Input sequences
    with open(data_path + 'ast_seqs.txt', 'w', encoding='utf-8') as f:
        for line in dataset.input_lists:
            f.write(' '.join(line) + '\n')
    # labels
    with open(data_path + 'labels.txt', 'w', encoding='utf-8') as f:
        for item in dataset.labels:
            f.write(str(item) + '\n')
    # comments
    with open(data_path + 'comments.txt', 'w', encoding='utf-8') as f:
        for line in dataset.comment_lists:
            f.write(' '.join(line) + '\n')
    # Conditional statements
    with open(data_path + 'codes.txt', 'w', encoding='utf-8') as f:
        for line in dataset.code_lines:
            f.write(line + '\n')
    # Input vocabulary
    with open(data_path + 'input_vocab.txt', 'w', encoding='utf-8') as f:
        for line in dataset.input_vocab:
            f.write(line + '\n')
    # Comment vocabulary
    with open(data_path + 'comment_vocab.txt', 'w', encoding='utf-8') as f:
        for line in dataset.comment_vocab:
            f.write(line + '\n')
    # Save the dataset object
    with open(data_path + 'dataset.pkl', 'wb') as f:
        pickle.dump(dataset, f)


def token_integer_mapping(input_tokens, target_tokens):
    input_token_index  = dict([(token, i+1) for i, token in enumerate(input_tokens)])
    target_token_index = dict([(token, i+1) for i, token in enumerate(target_tokens)])
    reverse_input_token_index  = dict((i, token) for token, i in input_token_index.items())
    reverse_target_token_index = dict((i, token) for token, i in target_token_index.items())

    return input_token_index, target_token_index, reverse_input_token_index, reverse_target_token_index


def prepare_model_data(input_lists, target_lists, input_token_index, target_token_index,
                       max_encoder_seq_length, max_decoder_seq_length, generation=False):
    # Define model's input & output data and initialize them with zeros
    encoder_input_data = np.zeros((len(input_lists), max_encoder_seq_length), dtype='int32')
    decoder_input_data = np.zeros((len(target_lists), max_decoder_seq_length), dtype='int32')
    if generation:
        decoder_target_data = np.zeros((len(target_lists), max_decoder_seq_length, len(target_token_index)+1), dtype='float32')
    else:
        decoder_target_data = np.zeros((len(target_lists), max_decoder_seq_length), dtype='int32')
    # Loop samples
    for i, (input_list, target_list) in enumerate(zip(input_lists, target_lists)):
        # Loop input sequences
        for t, token in enumerate(input_list):
            encoder_input_data[i, t] = input_token_index[token]
        # Loop target sequences
        for t, token in enumerate(target_list):
            # decoder_target_data is ahead of decoder_input_data by one time step
            decoder_input_data[i, t] = target_token_index[token]
            if generation:
                if t > 0:
                    # decoder_target_data will be ahead by one time step and will not include the start character. Initial value altered.
                    decoder_target_data[i, t-1, target_token_index[token]] = 1.

    return encoder_input_data, decoder_input_data, decoder_target_data


def replace_unseen(new_vocab, old_vocab, new_model_inputs):
    """ Replace unseen-before tokens with: <unknown> """
    # Find
    unseen_tokens = set()
    for token in new_vocab:
        if token not in old_vocab:
            unseen_tokens.add(token)
    # Replace (with a workaround to solve a weird referencing issue)
    modified_model_inputs = []
    for i, x in enumerate(new_model_inputs):
        matches = set(x) & unseen_tokens  # find the unseen-before tokens in an input sample
        if len(matches) > 0:
            a_seq = []
            for j, token in enumerate(x):
                if token in matches:
                    # modified_model_inputs[i][j] = "<unknown>"
                    a_seq.append("<unknown>")
                else:
                    a_seq.append(token)
            modified_model_inputs.append(a_seq)
        else:
            modified_model_inputs.append(x)

    return np.array(modified_model_inputs)


def build_classifier(latent_dim, num_input_tokens, num_layers, drop_prob=0.2):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    model = Sequential()
    model.add(Embedding(num_input_tokens+1, latent_dim, mask_zero=True))
    if num_layers == 1:
        model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
    elif num_layers == 2:
        model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
    else:
        model.add(LSTM(latent_dim*2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        model.add(LSTM(latent_dim//2, dropout=drop_prob, recurrent_dropout=drop_prob))
    model.add(Dense(1, activation='sigmoid'))
    model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

    return model


def build_classifier_w_pooling(latent_dim, num_input_tokens, num_layers, drop_prob=0.2):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    model = Sequential()
    model.add(Embedding(num_input_tokens+1, latent_dim))
    if num_layers == 1:
        model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    elif num_layers == 2:
        model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    else:
        model.add(LSTM(latent_dim*2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        model.add(LSTM(latent_dim//2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    # model.add(GlobalMaxPooling1D())
    model.add(GlobalAveragePooling1D())
    model.add(Dense(1, activation='sigmoid'))
    model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

    # inputs = Input(shape=(None,))
    # clf = Embedding(num_input_tokens+1, latent_dim)(inputs)
    # clf = LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob)(clf)
    # clf = GlobalAveragePooling1D()(clf)
    # outputs = Dense(1, activation='sigmoid')(clf)
    # model = Model(inputs, outputs)
    # model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

    return model


def build_generator(latent_dim, num_encoder_tokens, num_decoder_tokens, num_layers):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    encoder_inputs = Input(shape=(None,))
    decoder_inputs = Input(shape=(None,))
    en_x = Embedding(num_encoder_tokens + 2, latent_dim, mask_zero=True)(encoder_inputs)
    de_x = Embedding(num_decoder_tokens + 2, latent_dim, mask_zero=True)(decoder_inputs)
    if num_layers == 1:
        encoder_outputs, state_h, state_c = LSTM(latent_dim, return_sequences=True, return_state=True)(en_x)
        decoder_outputs = LSTM(latent_dim, return_sequences=True)(de_x, initial_state=[state_h, state_c])
    elif num_layers == 2:
        en_x = LSTM(latent_dim, return_sequences=True)(en_x)
        encoder_outputs, state_h, state_c = LSTM(latent_dim, return_sequences=True, return_state=True)(en_x)
        de_x = LSTM(latent_dim, return_sequences=True)(de_x, initial_state=[state_h, state_c])
        decoder_outputs = LSTM(latent_dim, return_sequences=True)(de_x)
    else:
        en_x = LSTM(latent_dim, return_sequences=True)(en_x)
        en_x = LSTM(latent_dim, return_sequences=True)(en_x)
        encoder_outputs, state_h, state_c = LSTM(latent_dim, return_sequences=True, return_state=True)(en_x)
        de_x = LSTM(latent_dim, return_sequences=True)(de_x, initial_state=[state_h, state_c])
        de_x = LSTM(latent_dim, return_sequences=True)(de_x)
        decoder_outputs = LSTM(latent_dim, return_sequences=True)(de_x)
    # Attention Mechanism
    attention = dot([decoder_outputs, encoder_outputs], axes=[2, 2])
    attention = Activation('softmax', name='attention')(attention)
    context = dot([attention, encoder_outputs], axes=[2, 1])
    decoder_combined_context = concatenate([context, decoder_outputs])
    attention_context_output = Dense(latent_dim, activation="tanh")(decoder_combined_context)
    model_output = Dense(num_decoder_tokens + 1, activation="softmax")(attention_context_output)

    return encoder_inputs, decoder_inputs, model_output


def results(predictions, y_test):
    tp, tn, fp, fn = 0, 0, 0, 0
    for pred, lbl in zip(predictions, y_test):
        if lbl == 1 and pred[0] == 1:
            tp += 1
        if lbl == 0 and pred[0] == 0:
            tn += 1
        if lbl == 0 and pred[0] == 1:
            fp += 1
        if lbl == 1 and pred[0] == 0:
            fn += 1
    print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
    p, r, f1, acc = 0, 0, 0, 0
    if tp + fp > 0 and tp + fn > 0:
        p, r = tp / (tp + fp), tp / (tp + fn)
    elif tp + fp > 0:
        p = tp / (tp + fp)
    elif tp + fn > 0:
        r = tp / (tp + fn)
    if (p + r) > 0:
        f1 = 2 * p * r / (p + r)
    acc = (tp+tn)/(tp+tn+fp+fn)
    print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1, "- Accuracy =", "%.3f" % acc)

    return tp, tn, fp, fn, p, r, f1, acc


def results_baseline(predictions, y_test):
    tp, tn, fp, fn = 0, 0, 0, 0
    for pred, lbl in zip(predictions, y_test):
        if lbl == 1 and pred == 1:
            tp += 1
        if lbl == 0 and pred == 0:
            tn += 1
        if lbl == 0 and pred == 1:
            fp += 1
        if lbl == 1 and pred == 0:
            fn += 1
    print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
    p, r, f1, acc = 0, 0, 0, 0
    if tp + fp > 0 and tp + fn > 0:
        p, r = tp / (tp + fp), tp / (tp + fn)
    elif tp + fp > 0:
        p = tp / (tp + fp)
    elif tp + fn > 0:
        r = tp / (tp + fn)
    if (p + r) > 0:
        f1 = 2 * p * r / (p + r)
    acc = (tp+tn)/(tp+tn+fp+fn)
    print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1, "- Accuracy =", "%.3f" % acc)

    return tp, tn, fp, fn, p, r, f1, acc


def send_email(title, content="No content!"):
    TO = 'ahh1427@gmail.com'
    SUBJECT = title
    TEXT = content

    # Email Sign In
    gmail_sender = 'username@email.com'
    gmail_passwd = 'password'

    server = smtplib.SMTP('smtp.gmail.com', 587)
    server.ehlo()
    server.starttls()
    server.login(gmail_sender, gmail_passwd)

    BODY = '\r\n'.join(['To: %s' % TO,
                        'From: %s' % gmail_sender,
                        'Subject: %s' % SUBJECT,
                        '', TEXT])

    try:
        server.sendmail(gmail_sender, [TO], BODY)
        print('Email sent')
    except:
        print('Error sending email')

    server.quit()


def decode_sequence(input_seq, model, max_decoder_seq_length, target_token_index, reverse_target_token_index):
    target_seq = np.zeros(shape=(len(input_seq), max_decoder_seq_length))
    target_seq[:, 0] = target_token_index["<sos>"]  # Populate the first character of target sequence with the start character.
    # Loop from the second to the last character in the sequence
    for i in range(1, max_decoder_seq_length):
        prediction = model.predict([input_seq, target_seq]).argmax(axis=2)
        if reverse_target_token_index[prediction[:, i][0]] == "<eos>":
            break
        ###print(reverse_target_token_index[prediction[:, i][0]])
        target_seq[:, i] = prediction[:, i]
    # Decode predicted numbers to words
    decoded_sentence = []
    for idx in target_seq[:, 1:][0]:
        if idx == 0:
            break
        decoded_sentence.append(reverse_target_token_index[idx])
    return decoded_sentence


def translate_corpus(model, encoder_input_data, comment_lists, max_decoder_seq_length_test, target_token_index, reverse_target_token_index, results_dir, model_name):
    predicted_lists = []
    c = 1
    for seq_index in tqdm(range(len(encoder_input_data))):
        # Take one sequence (part of the testing set) for trying out decoding.
        input_seq = encoder_input_data[seq_index:seq_index + 1]
        decoded_sentence = decode_sequence(
            input_seq, model, max_decoder_seq_length_test, target_token_index, reverse_target_token_index)
        predicted_lists.append(decoded_sentence)
        print_deocded = ''
        for token in decoded_sentence:
            print_deocded += token + ' '
        print_target = ''
        for i, token in enumerate(comment_lists[seq_index]):
            if 0 < i and i < len(comment_lists[seq_index]) - 1:  # Don't print "<sos>" and "<eos>"
                print_target += token + ' '
        with open(results_dir + model_name + ".txt", "a", encoding='utf-8') as f:
            f.write(str(c) + '. Target sentence:  ' + print_target + "\n")
            f.write(str(c) + '. Decoded sentence: ' + print_deocded + "\n-\n")
        c += 1
    return predicted_lists


def calculate_bleu(target_lists, predicted_lists):
    # Cut out <sos> and <eos>
    references = []
    for a_list in target_lists:
        references.append([a_list[1:-1]])

    bleu1 = corpus_bleu(references, predicted_lists, weights=(1., 0., 0., 0.))
    bleu2 = corpus_bleu(references, predicted_lists, weights=(1/2, 1/2, 0., 0.))
    bleu3 = corpus_bleu(references, predicted_lists, weights=(1/3, 1/3, 1/3, 0.))
    bleu4 = corpus_bleu(references, predicted_lists, weights=(1/4, 1/4, 1/4, 1/4))
    bleu  = corpus_bleu(references, predicted_lists)
    print("Bleu-1 Score: %.3f" % bleu1, " Bleu-2 Score: %.3f" % bleu2, " Bleu-3 Score: %.3f" % bleu3, " Bleu-4 Score: %.3f" % bleu4, " Bleu Score: %.3f" % bleu)

    return bleu1, bleu2, bleu3, bleu4, bleu


def dummy_fun(doc):
    return doc


def positive_only(dataset):
    input_lists, labels, comment_lists, code_lines = [], [], [], []
    for in_list, lbl, comment, code in zip(dataset.input_lists, dataset.labels, dataset.comment_lists, dataset.code_lines):
        if lbl == 1:
            input_lists.append(in_list)
            labels.append(lbl)
            comment_lists.append(comment)
            code_lines.append(code)

    input_array   = np.array(input_lists)
    label_array   = np.array(labels)
    comment_array = np.array(comment_lists)
    code_array    = np.array(code_lines)
    input_vocab = tokenize(input_array)
    comment_vocab = tokenize(comment_array)

    positive_set = DataObject(input_array, label_array, comment_array, code_array, input_vocab, comment_vocab)

    return positive_set


def extract_code_metrics(path, parser):
    # Retrieve xml files from disk (preparing for M features)
    with open(path, 'r', encoding='utf-8') as f:
        inputs = f.read().split("\n")
    inputs = inputs[:-1]
    # Parse every input code into its own AST (in an XML format)
    forest = [ET.fromstring(x, parser) for x in inputs]
    # Clean defective inputs (replace 'None' inputs with a single 'if' element with no children)
    forest = [ET.Element("if") if x is None else x for x in forest]
    # Feature extraction (M)
    tree_tags = []
    for tree in forest:
        temp_tags = [x.tag for x in tree.iter()]
        tree_tags.append(temp_tags)
    m_counts = [Counter(x) for x in tree_tags]
    m_counts = [dict(x) for x in m_counts]

    return forest, m_counts


def feature_set_counts(feature_counts):
    # print(dataset_name, "feature counts:-")
    features = []
    for fc in feature_counts:
        for f, count in fc.items():
            for i in range(count):
                features.append(f)
    # print(Counter(features))
    # print(dataset_name, "- # unique features:", len(Counter(features)))
    return dict(Counter(features))


def calc_cyclo(forest):
    cyclo_tags = ["if", "case", "catch", "throw", "do", "while", "for", "break", "continue"]
    cyclos = []
    for tree in forest:
        c = 0
        for leaf in tree.iter():
            if leaf.tag in cyclo_tags or leaf.tag == "operator" and leaf.text == '&&' or leaf.tag == "operator" and leaf.text == '||':
                c += 1
        cyclos.append(c)

    return cyclos


def extract_pmd_metrics(path, data_length):
    # Read from csv file
    pmd_report = pd.read_csv(path, index_col="Problem")

    # Edit line numbers & let the dict values be the # of occurrences of a key pair
    corr_lin_no = {}
    for key, value in pmd_report.groupby(['Line', 'Rule']).groups.items():
        if 2 < key[0] < data_length + 3:
            corr_lin_no[(key[0] - 2, key[1])] = len(value.values)

    # Let the key be the line and the value be a list of rules whose length = # occurrences
    line_lists = defaultdict(list)
    for key, value in corr_lin_no.items():
        for i in range(value):
            line_lists[key[0]].append(key[1])

    # Make the list of Counter objects
    ps = []
    for i in range(data_length):
        if i + 1 not in list(line_lists.keys()):
            ps.append(list())
        else:
            ps.append(line_lists[i + 1])
    p_counts = [Counter(x) for x in ps]

    return p_counts


def retrieve_r(path):
    with open(path, 'r', encoding='utf-8') as f:
        rs = f.read().split("\n")
    rs = rs[:-1]
    rs = [float(x) for x in rs]

    return rs


def create_bm_dataset(m_counts, p_counts, cyclos, reads, l_path, f_path):
    with open(l_path, 'r', encoding='utf-8') as f:
        labels = f.read().split("\n")
    labels = labels[:-1]
    labels = [int(x) for x in labels]

    fs1 = pd.DataFrame(m_counts)
    fs2 = pd.DataFrame(p_counts)
    fs3 = pd.DataFrame({'cyclo': cyclos})
    fs4 = pd.DataFrame({'read': reads})
    lbls = pd.DataFrame({'label': labels})

    dataset = pd.concat([fs1, fs2, fs3, fs4, lbls], axis=1)
    dataset.fillna(0, inplace=True)

    dataset.to_csv(f_path, index=False)
