import pickle
import numpy as np
import sys
from keras.models import Sequential
from keras.layers import Dense, LSTM, Embedding, GlobalAveragePooling1D, GlobalMaxPooling1D


def retrieve_dataset(data_directory):
    with open(data_directory+'dataset.pkl', 'rb') as f:
        cv = pickle.load(f)
    with open(data_directory+'tune_val/dataset.pkl', 'rb') as f:
        tune = pickle.load(f)
    # with open(data_directory + 'ast_tokens_to_ints.pkl', 'rb') as f:
    #     tokens_ints = pickle.load(f)
    # with open(data_directory + 'ast_ints_to_tokens.pkl', 'rb') as f:
    #     ints_tokens = pickle.load(f)
    print('# CV AST sequences:', len(cv.input_lists))
    print('# tuning AST sequences:', len(tune.input_lists))
    print('All together:', len(cv.input_lists) + len(tune.input_lists))
    print("Vocabulary size:", len(set(cv.input_vocab+tune.input_vocab)))

    return cv, tune


def token_integer_mapping(v):
    input_token_index = dict([(token, i + 1) for i, token in enumerate(v)])
    reverse_input_token_index = dict((i, token) for token, i in input_token_index.items())

    return input_token_index, reverse_input_token_index


def encode_integers(seqs, tokens_to_ints):
    tokens = set(tokens_to_ints.keys())
    int_seqs = []
    for seq in seqs:
        int_seq = [tokens_to_ints[word] if word in tokens else 0 for word in seq]
        int_seqs.append(np.array(int_seq))

    return np.array(int_seqs)


def create_features(int_seqs, embeddings, max_length=1500):
    features = []
    for seq in int_seqs:
        vectors = [embeddings[x] for x in seq]
        vec_sum = np.sum(vectors, axis=0)
        vec_avg = vec_sum / max_length
        features.append(vec_avg)

    return np.array(features)


# def results(predictions, y_test):
#     tp, tn, fp, fn = 0, 0, 0, 0
#     for pred, lbl in zip(predictions, y_test):
#         if lbl == 1 and pred == 1:
#             tp += 1
#         if lbl == 0 and pred == 0:
#             tn += 1
#         if lbl == 0 and pred == 1:
#             fp += 1
#         if lbl == 1 and pred == 0:
#             fn += 1
#     print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
#     p, r, f1, acc = 0, 0, 0, 0
#     if tp + fp > 0 and tp + fn > 0:
#         p, r = tp / (tp + fp), tp / (tp + fn)
#     elif tp + fp > 0:
#         p = tp / (tp + fp)
#     elif tp + fn > 0:
#         r = tp / (tp + fn)
#     if (p + r) > 0:
#         f1 = 2 * p * r / (p + r)
#     acc = (tp+tn)/(tp+tn+fp+fn)
#     print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1, "- Accuracy =", "%.3f" % acc)
#
#     return tp, tn, fp, fn, p, r, f1, acc


def build_model(latent_dim, v_size, num_layers, pooling=None, drop_prob=0.2):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    new_model = Sequential()
    new_model.add(Embedding(v_size+1, latent_dim))
    if num_layers == 1:
        if pooling is None:
            new_model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
        else:
            new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    elif num_layers == 2:
        new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        if pooling is None:
            new_model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
        else:
            new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    else:
        new_model.add(LSTM(latent_dim*2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        if pooling is None:
            new_model.add(LSTM(latent_dim//2, dropout=drop_prob, recurrent_dropout=drop_prob))
        else:
            new_model.add(LSTM(latent_dim//2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    # old_model = load_model('/home/aa043/sea/gpu/experiments/trained_models/td/pretrain/dp50311_v27359_ep15_1lay_lat32_b2048.h5')
    # new_model = Sequential()
    # new_model.add(old_model.layers[0])
    # new_model.add(old_model.layers[1])
    if pooling is not None:
        if pooling == 'max':
            new_model.add(GlobalMaxPooling1D())
        else:
            new_model.add(GlobalAveragePooling1D())
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
