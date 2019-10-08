import pickle
import numpy as np


def retrieve_dataset(data_directory):
    with open(data_directory + 'cv_set.pkl', 'rb') as f:
        cv = pickle.load(f)
    with open(data_directory + 'tune_set.pkl', 'rb') as f:
        tune = pickle.load(f)
    with open(data_directory + 'ast_tokens_to_ints.pkl', 'rb') as f:
        tokens_ints = pickle.load(f)
    with open(data_directory + 'ast_ints_to_tokens.pkl', 'rb') as f:
        ints_tokens = pickle.load(f)
    print('# CV AST sequences:', len(cv.input_lists))
    print('# tuning AST sequences:', len(tune.input_lists))
    print('All together:', len(cv.input_lists) + len(tune.input_lists))
    print("Vocabulary size:", len(tokens_ints))

    return cv, tune, tokens_ints, ints_tokens


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


def results(predictions, y_test):
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
