from random import sample
from collections import Counter
import pickle
import numpy as np
from keras.models import Sequential
from keras.layers import Dense, LSTM, Embedding
import sys


def process_comments(comment_list, max_seq_len):
    proc_comms = []
    for comment in comment_list:
        # Replace problematic characters that're basically spaces!
        for char in ['\u2009', '\u202f', '\xa0']:
            proc_comm = comment.replace(char, ' ')
        # Delete non-alphabetic input data
        for char in proc_comm:
            if (not char.isalpha()) and (char != " "):
                proc_comm = proc_comm.replace(char, " ")
        # Lower case then split into list of words
        proc_comms.append(proc_comm.lower().split()[:max_seq_len])

    return proc_comms


class DataObject:
    def __init__(self, comm_lists, comms, lbls, pname):
        self.comm_lists = comm_lists
        self.comms = comms
        self.lbls = lbls
        self.pname = pname


def data_by_project(project_name, comment_array, comment_list, proj_list, label_list):
    # Combine and assign correct labels
    project_data = []
    for comm_list, comment, proj, label in zip(comment_array, comment_list, proj_list, label_list):
        if proj == project_name:
            if label == "WITHOUT_CLASSIFICATION":
                project_data.append([comm_list, comment, 0])
            else:
                project_data.append([comm_list, comment, 1])

    # Shuffle data
    shuf_proj_data = sample(project_data, k=len(project_data))
    # We don't need code for removing duplicates because there are none
    # Prepare for data object
    comment_array = [x[0] for x in shuf_proj_data]
    comment_list = [x[1] for x in shuf_proj_data]
    label_list = [x[2] for x in shuf_proj_data]
    short_name = ''
    if project_name == 'argouml':
        short_name = 'argouml'
    elif project_name == 'columba-1.4-src':
        short_name = 'columba'
    elif project_name == 'hibernate-distribution-3.3.2.GA':
        short_name = 'hibernate'
    elif project_name == 'jEdit-4.2':
        short_name = 'jedit'
    elif project_name == 'jfreechart-1.0.19':
        short_name = 'jfreechart'
    elif project_name == 'apache-jmeter-2.10':
        short_name = 'jmeter'
    elif project_name == 'jruby-1.4.0':
        short_name = 'jruby'
    else:
        short_name = 'sql'

    # Create and return data object for this project
    return DataObject(comment_array, comment_list, label_list, short_name)


def token_integer_mapping(data_seqs):
    flat_seq = [seq for subseq in data_seqs for seq in subseq]
    word_c = Counter(flat_seq)
    # sorting the words from most to least frequent in text occurrence
    sorted_vocab = sorted(word_c, key=word_c.get, reverse=True)
    int_to_vocab = {j+1: word for j, word in enumerate(sorted_vocab)}
    int_to_vocab[0] = '<UNKN/PAD>'
    vocab_to_int = {word: j for j, word in int_to_vocab.items()}

    return vocab_to_int, int_to_vocab


def write_data_to_disk(project_data, tokens_to_ints, ints_to_tokens, data_directory):
    with open(data_directory + 'argouml.pkl', 'wb') as pdf:
        pickle.dump(project_data[0], pdf)
    with open(data_directory + 'columba.pkl', 'wb') as pdf:
        pickle.dump(project_data[1], pdf)
    with open(data_directory + 'hibernate.pkl', 'wb') as pdf:
        pickle.dump(project_data[2], pdf)
    with open(data_directory + 'jedit.pkl', 'wb') as pdf:
        pickle.dump(project_data[3], pdf)
    with open(data_directory + 'jfreechart.pkl', 'wb') as pdf:
        pickle.dump(project_data[4], pdf)
    with open(data_directory + 'jmeter.pkl', 'wb') as pdf:
        pickle.dump(project_data[5], pdf)
    with open(data_directory + 'jruby.pkl', 'wb') as pdf:
        pickle.dump(project_data[6], pdf)
    with open(data_directory + 'sql.pkl', 'wb') as pdf:
        pickle.dump(project_data[7], pdf)
    with open(data_directory + 'words_to_ints.pkl', 'wb') as pdf:
        pickle.dump(tokens_to_ints, pdf)
    with open(data_directory + 'ints_to_words.pkl', 'wb') as pdf:
        pickle.dump(ints_to_tokens, pdf)


def retrieve_dataset(data_directory):
    with open(data_directory + 'argouml.pkl', 'rb') as f:
        argouml = pickle.load(f)
    with open(data_directory + 'columba.pkl', 'rb') as f:
        columba = pickle.load(f)
    with open(data_directory + 'hibernate.pkl', 'rb') as f:
        hibernate = pickle.load(f)
    with open(data_directory + 'jedit.pkl', 'rb') as f:
        jedit = pickle.load(f)
    with open(data_directory + 'jfreechart.pkl', 'rb') as f:
        jfreechart = pickle.load(f)
    with open(data_directory + 'jmeter.pkl', 'rb') as f:
        jmeter = pickle.load(f)
    with open(data_directory + 'jruby.pkl', 'rb') as f:
        jruby = pickle.load(f)
    with open(data_directory + 'sql.pkl', 'rb') as f:
        sql = pickle.load(f)
    with open(data_directory + 'words_to_ints.pkl', 'rb') as f:
        tokens_ints = pickle.load(f)
    with open(data_directory + 'ints_to_words.pkl', 'rb') as f:
        ints_tokens = pickle.load(f)
    proj_list = [argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql]
    print('# argouml data points:   ', len(argouml.comm_lists))
    print('# columba data points:   ', len(columba.comm_lists))
    print('# hibernate data points: ', len(hibernate.comm_lists))
    print('# jedit data points:     ', len(jedit.comm_lists))
    print('# jfreechart data points:', len(jfreechart.comm_lists))
    print('# jmeter data points:    ', len(jmeter.comm_lists))
    print('# jruby data points:     ', len(jruby.comm_lists))
    print('# sql data points:       ', len(sql.comm_lists))
    print('================')
    print('All together:            ', sum([len(x.comm_lists) for x in proj_list]))
    print('Vocabulary size:         ', len(tokens_ints))

    return argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql, tokens_ints, ints_tokens


def encode_integers(seqs, tokens_to_ints):
    tokens = set(tokens_to_ints.keys())
    int_seqs = []
    for seq in seqs:
        int_seq = [tokens_to_ints[word] if word in tokens else 0 for word in seq]
        int_seqs.append(np.array(int_seq))

    return int_seqs


def model_ready_data(project_list, project_name, tokens_to_ints):
    train_comments, train_labels, test_comments, test_labels = [], [], [], []
    for project in project_list:
        for comment, label in zip(project.comm_lists, project.lbls):
            if project.pname == project_name:
                test_comments.append(comment)
                test_labels.append(label)
            else:
                train_comments.append(comment)
                train_labels.append(label)

    x_train = np.array(encode_integers(train_comments, tokens_to_ints))
    x_test = np.array(encode_integers(test_comments, tokens_to_ints))
    y_train = np.array(train_labels)
    y_test = np.array(test_labels)

    return x_train, y_train, x_test, y_test


def build_model(latent_dim, v_size, num_layers):
    # print('dropout + recurrent_dropout')
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    new_model = Sequential()
    new_model.add(Embedding(v_size, latent_dim))
    if num_layers == 1:
        new_model.add(LSTM(latent_dim))
        # new_model.add(LSTM(latent_dim, dropout=0.2, recurrent_dropout=0.2))
    elif num_layers == 2:
        new_model.add(LSTM(latent_dim, return_sequences=True))
        new_model.add(LSTM(latent_dim))
    else:
        new_model.add(LSTM(latent_dim*2, return_sequences=True))
        new_model.add(LSTM(latent_dim, return_sequences=True))
        new_model.add(LSTM(latent_dim//2))
    # old_model = load_model('/home/aa043/sea/gpu/experiments/trained_models/td/pretrain/dp50311_v27359_ep15_1lay_lat32_b2048.h5')
    # new_model = Sequential()
    # new_model.add(old_model.layers[0])
    # new_model.add(old_model.layers[1])
    new_model.add(Dense(1, activation='sigmoid'))
    new_model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

    return new_model


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
