from keras.models import Sequential
from keras.layers import LSTM, Dense, Embedding
import pickle


def preprocess(data_path, num_samples):
    # Retrieve dat from files
    with open(data_path + 'features.txt', 'r', encoding='utf-8') as f:
        s_lines = f.read().split('\n')
    with open(data_path + 'labels.txt', 'r', encoding='utf-8') as f:
        l_lines = f.read().split('\n')
    # Keep only num_samples
    seqs = s_lines[: min(num_samples, len(s_lines) - 1)]
    l_lines = l_lines[: min(num_samples, len(l_lines) - 1)]
    # To int
    labels = []
    for label in l_lines:
        labels.append(int(label))
    # Return desired data, with tokens being sorted and converted to list
    return seqs, labels


# Get data
def retrieve_texts(data_path, num_samples, max_input_length):
    draft_seqs, draft_labels = preprocess(data_path, num_samples)
    # Special treatment for input code sequences
    draft_features = []
    for seq in draft_seqs:
        seq = seq.replace("(", " ( ")
        seq = seq.replace(")", " ) ")
        seq = seq.replace("_", " _ ")
        draft_features.append(seq.split())
    # Remove long sequences
    seqs, features, labels = [], [], []
    for seq, feature, label in zip(draft_seqs, draft_features, draft_labels):
        if len(feature) <= max_input_length:
            seqs.append(seq)
            features.append(feature)
            labels.append(label)

    return seqs, features, labels


def fetch_corrisponding(data_points, comb_pairs, seqs, features, labels):
    ss, fs, ls = [], [], []
    for pair in data_points:
        for i, all_pair in enumerate(comb_pairs):
            if pair == all_pair:
                ss.append(seqs[i])
                fs.append(features[i])
                ls.append(labels[i])
                break
    return ss, fs, ls


def tokenize_data(features):
    vocab = set()
    for input_list in features:
        for token in input_list:
            vocab.add(token)
    return sorted(list(vocab))+["<unknown>"]


class DataObject:
    def __init__(self, seqs, features, vocab, labels):
        self.seqs = seqs
        self.features = features
        self.vocab = vocab
        self.labels = labels


def data_shapes(do):
    num_encoder_tokens = len(do.vocab)
    max_encoder_seq_length = max([len(txt) for txt in do.features])
    min_encoder_seq_length = min([len(txt) for txt in do.features])
    n_input_samples = len(do.features)

    return num_encoder_tokens, max_encoder_seq_length, min_encoder_seq_length, n_input_samples


def shape_info(n_input_samples, num_encoder_tokens, max_encoder_seq_length, min_encoder_seq_length):
    print('Number of samples:', n_input_samples)
    print('Number of unique input tokens:', num_encoder_tokens)
    print('Max sequence length for inputs:', max_encoder_seq_length)
    print('Min sequence length for inputs:', min_encoder_seq_length)


def token_integer_mapping(input_tokens):
    input_token_index = dict([(token, i+1) for i, token in enumerate(input_tokens)])
    reverse_input_token_index = dict((i, token) for token, i in input_token_index.items())
    return input_token_index, reverse_input_token_index


def build_model(latent_dim, num_input_tokens, drop_prob=0.2):
    model = Sequential()
    model.add(Embedding(num_input_tokens+1, latent_dim, mask_zero=True))
    model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
    # model.add(LSTM(latent_dim * 2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    # model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    # model.add(LSTM(latent_dim//2, dropout=drop_prob, recurrent_dropout=drop_prob))
    model.add(Dense(1, activation='sigmoid'))
    model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

    return model


def write_to_file(data, path):
    with open(path, 'wb') as f:
        pickle.dump(data, f)


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
    p, r, f1 = 0, 0, 0
    if tp + fp > 0 and tp + fn > 0:
        p, r = tp / (tp + fp), tp / (tp + fn)
    elif tp + fp > 0:
        p = tp / (tp + fp)
    elif tp + fn > 0:
        r = tp / (tp + fn)
    if (p + r) > 0:
        f1 = 2 * p * r / (p + r)
    print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1)

    return tp, tn, fp, fn, p, r, f1