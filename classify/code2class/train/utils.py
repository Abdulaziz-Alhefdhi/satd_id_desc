from keras.models import Sequential
from keras.layers import LSTM, Dense, Embedding
import pickle


def preprocess(data_path, num_samples, max_input_length):
    # Variable declarations
    vocab, seqs, labels = set(), [], []
    # Retrieve dat from files
    with open(data_path + 'features.txt', 'r', encoding='utf-8') as f:
        s_lines = f.read().split('\n')
    with open(data_path + 'labels.txt', 'r', encoding='utf-8') as f:
        l_lines = f.read().split('\n')
    # Keep only num_samples
    s_lines = s_lines[: min(num_samples, len(s_lines) - 1)]
    l_lines = l_lines[: min(num_samples, len(l_lines) - 1)]

    # Tokenize
    for seq, label in zip(s_lines, l_lines):
        # Throwing out long texts
        if len(seq) > max_input_length:
            continue
        seqs.append(seq)
        labels.append(label)
        # Dealing with ast-sequence-specific characters
        seq = seq.replace("(", " ( ")
        seq = seq.replace(")", " ) ")
        seq = seq.replace("_", " _ ")
        # Tokenize inputs
        for token in seq.split():
            vocab.add(token)

    # Return desired data, with tokens being sorted and converted to list
    return sorted(list(vocab)), seqs, labels


# Get data
def retrieve_texts(data_path, num_samples, max_input_length):
    vocab, seqs, labels = preprocess(data_path, num_samples, max_input_length)
    # Special treatment for input code sequences
    features = []
    for seq in seqs:
        seq = seq.replace("(", " ( ")
        seq = seq.replace(")", " ) ")
        seq = seq.replace("_", " _ ")
        features.append(seq.split())
    # add "<unknown>" token for unknown words during testing
    vocab = vocab + ["<unknown>"]

    return seqs, features, vocab, labels



class DataObject:
    def __init__(self, seqs, features, vocab, labels):
        self.seqs = seqs
        self.features = features
        self.vocab = vocab
        self.labels = labels


def data_shapes(do):
    num_encoder_tokens = len(do.vocab)
    max_encoder_seq_length = max([len(txt) for txt in do.features])
    n_input_samples = len(do.features)

    return num_encoder_tokens, max_encoder_seq_length, n_input_samples


def shape_info(n_input_samples, num_encoder_tokens, max_encoder_seq_length):
    print('Number of samples:', n_input_samples)
    print('Number of unique input tokens:', num_encoder_tokens)
    print('Max sequence length for inputs:', max_encoder_seq_length)


def token_integer_mapping(input_tokens):
    input_token_index = dict([(token, i+1) for i, token in enumerate(input_tokens)])
    reverse_input_token_index = dict((i, token) for token, i in input_token_index.items())
    return input_token_index, reverse_input_token_index


def build_model(latent_dim, num_input_tokens, drop_prob=0.2):
    model = Sequential()
    model.add(Embedding(num_input_tokens+1, latent_dim, mask_zero=True))
    model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
    model.add(Dense(1, activation='sigmoid'))
    model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])

    return model


def write_to_file(data, path):
    with open(path, 'wb') as f:
        pickle.dump(data, f)