import sys
# sys.path.append('/home/aa043/sea/gpu/experiments/problems/tech_debt/')
# sys.path.append('/home/aa043/sea/gpu/experiments/problems/tech_debt/classify/code2class/')
sys.path.append('/home/aa043/sea/problems/tech_debt/')
sys.path.append('/home/aa043/sea/problems/tech_debt/classify/code2class/')
from support_functions import DataObject
# from utils import build_model, train_model
from tqdm import tqdm
from keras.models import load_model
import datetime
from sklearn.model_selection import StratifiedKFold
import numpy as np
from keras.models import Sequential
from keras.layers import Dense, LSTM, Embedding, GlobalAveragePooling1D, GlobalMaxPooling1D
from keras.backend import clear_session
from cv_utils import retrieve_dataset, encode_integers


def build_model(latent_dim, v_size, num_layers, pooling=None, drop_prob=0.2):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    new_model = Sequential()
    new_model.add(Embedding(v_size, latent_dim, mask_zero=True))
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
    # old_model = load_model('/home/aa043/sea/gpu_data/trained_models/td/pretrain/dp50311_v27359_'
    #                        + str(num_layers) + 'lay_lat' + str(latent_dim) + '_b2048_ep30000.h5')
    #
    # new_model = Sequential()
    # new_model.add(old_model.layers[0])
    # new_model.add(old_model.layers[1])
    # new_model.add(old_model.layers[2])

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


# data_dir = '/home/aa043/sea/gpu/experiments/data/td/CT/data_objects/'
data_dir = '/home/aa043/sea/gpu_data/data/td/CT/data_objects/'
# cp_dir = '/home/aziz/experiments/trained_models/td/pretrain/'
# max_seq_length = 1000000  # To reduce the huge size of the dataset
n_layers = 1              # Number of RNN layers
latent = 32               # Dimensionality for embedding and model layers
batch_size = 256         # How many data points to train in every batch
epochs = 20
pool = None

print("================\nRetrieving dataset...")
cv_set, tune_set, tokens_to_ints, ints_to_tokens = retrieve_dataset(data_dir)
vocab_size = len(tokens_to_ints)
print('================')


print("Batch size:", batch_size)
print("Number of model layers:", n_layers)
print("Latent dimensionality:", latent)
print('Pooling:', 'none' if pool is None else pool)
print('================')

print('Encode tokens to integers and convert to numpy arrays...')
cv_ints = encode_integers(cv_set.input_lists, tokens_to_ints)
tune_ints = encode_integers(tune_set.input_lists, tokens_to_ints)
cv_labels = np.array(cv_set.labels)
tune_labels = np.array(tune_set.labels)

start_time = datetime.datetime.now().replace(microsecond=0)
print("================")
print("Training started at:", start_time)

# Stratified 10-fold cross-validation
skf = StratifiedKFold(n_splits=10)  # Number of folds
fold = 1
precisions, recalls, f1_scores, accs = [], [], [], []
for train_index, test_index in skf.split(cv_ints, cv_labels):
    print("================")
    print("Fold " + str(fold) + ":")
    # Split
    X_train, X_test = cv_ints[train_index], cv_ints[test_index]
    y_train, y_test = cv_labels[train_index], cv_labels[test_index]
    # Add the tuning set to the training set
    X_train = np.concatenate((X_train, tune_ints))
    y_train = np.concatenate((y_train, tune_labels))

    # Prepare SKF training and testing data
    train_max_seq_length = max([len(seq) for seq in X_train])
    train_model_inputs = np.zeros((len(X_train), train_max_seq_length), dtype='int64')
    train_model_outputs = np.array(y_train, dtype='int64')
    for i, seq in enumerate(X_train):
        train_model_inputs[i, :len(seq)] = seq
    test_max_seq_length = max([len(seq) for seq in X_test])
    test_model_inputs = np.zeros((len(X_test), test_max_seq_length), dtype='int64')
    for i, seq in enumerate(X_test):
        test_model_inputs[i, :len(seq)] = seq

    # Build, train, and test the model
    model = build_model(latent, vocab_size, n_layers, pool)
    model.summary()
    # test at the end of each epoch
    f_ps, f_rs, f_f1s, f_accs = [], [], [], []
    for i in range(1, epochs + 1):
        print("Epoch", i, "of", str(epochs) + ":")
        # model_name = "td_pred_cv_" + name_info + "_e" + str(i) + ".hdf5"
        # checkpoint = ModelCheckpoint(filepath=trained_models_dir+name_info+"/"+model_name, verbose=1)
        model.fit(train_model_inputs, train_model_outputs, batch_size=batch_size)  # Train
        predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=len(y_test))  # Test
        tp, tn, fp, fn, p, r, f1, acc = results(predictions, y_test)  # Calculate scores
        f_ps.append(p)
        f_rs.append(r)
        f_f1s.append(f1)
        f_accs.append(acc)
    print("================")
    print("Best scores of fold", fold, "with regards to F1 score:")
    idx_best_f1 = max((x, i) for i, x in enumerate(f_f1s))[1]
    print("Precision:", "%.3f" % f_ps[idx_best_f1], ". Recall:", "%.3f" % f_rs[idx_best_f1], ". F1 Score:",
          "%.3f" % f_f1s[idx_best_f1], ". Accuracy:", "%.3f" % f_accs[idx_best_f1])
    precisions.append(f_ps)
    recalls.append(f_rs)
    f1_scores.append(f_f1s)
    accs.append(f_accs)
    fold += 1
    clear_session()

print("================")
end_time = datetime.datetime.now().replace(microsecond=0)
print("Training completed at:", end_time)
print("Training took (h:m:s)", end_time - start_time)

# Show average scores
print("================")
idx_best_f1s = []
for fold in f1_scores:
    idx_best_f1s.append(max((x, i) for i, x in enumerate(fold))[1])
best_ps = []
for i, fold in enumerate(precisions):
    best_ps.append(fold[idx_best_f1s[i]])
best_rs = []
for i, fold in enumerate(recalls):
    best_rs.append(fold[idx_best_f1s[i]])
best_f1s = []
for i, fold in enumerate(f1_scores):
    best_f1s.append(fold[idx_best_f1s[i]])
best_accs = []
for i, fold in enumerate(accs):
    best_accs.append(fold[idx_best_f1s[i]])
print("Average Precision:", "%.3f" % (sum(best_ps) / len(best_ps)))
print("Average Recall:   ", "%.3f" % (sum(best_rs) / len(best_rs)))
print("Average F1-score: ", "%.3f" % (sum(best_f1s)/len(best_f1s)))
print("Average Accuracy: ", "%.3f" % (sum(best_accs)/len(best_accs)))
