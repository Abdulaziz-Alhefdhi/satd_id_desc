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
    n_input_samples = len(do.features)

    return num_encoder_tokens, max_encoder_seq_length, n_input_samples


def shape_info(n_input_samples, num_encoder_tokens, max_encoder_seq_length):
    print('Number of samples:', n_input_samples)
    print('Number of unique input tokens:', num_encoder_tokens)
    print('Max sequence length for inputs:', max_encoder_seq_length)
