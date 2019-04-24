from utils import DataObject, data_shapes, shape_info, token_integer_mapping, build_model, results
from keras.callbacks import ModelCheckpoint
import numpy as np
import datetime
import pickle
from sklearn.model_selection import StratifiedKFold


batch_size = 64   # Batch size for training.
epochs = 15       # Number of epochs to train for.
latent_dim = 64  # Latent dimensionality of the encoding space.

data_path = '/home/aziz/experiments/data/td/code2class/v2/no_dups/data_object.pkl'
results_dir = '/home/aziz/experiments/output/td/classify/code2class/v2/cv/dim64_b64/'

# Get data
with open(data_path, 'rb') as f:
    do = pickle.load(f)
# Data shapes
num_input_tokens, max_input_seq_length, min_input_seq_length, n_input_samples = data_shapes(do)
# Print shape info
print("================\nDataset info:-")
shape_info(n_input_samples, num_input_tokens, max_input_seq_length, min_input_seq_length)
print("Batch size:", batch_size)
print("Embedding dimensionality:", latent_dim)
print("================")

# Convert tokens to integers since the DL model accepts only integers
input_token_index, reverse_input_token_index = token_integer_mapping(do.vocab)


# Stratified 10-fold cross-validation
skf = StratifiedKFold(n_splits=10)  # Number of folds
X, y = np.array(do.features), np.array(do.labels)  # Convert lists to np arrays
print("Training started at:", datetime.datetime.now())
print("================")

tps, tns, fps, fns, precisions, recalls, f1_scores, accs = [], [], [], [], [], [], [], []
fold = 1
for train_index, test_index in skf.split(X, y):
    print("Fold #", fold, ":")
    # Split training and testing data for the current fold
    X_train, X_test = X[train_index], X[test_index]
    y_train, y_test = y[train_index], y[test_index]

    # Prepare training model input data
    train_vocab = set()  # Keep track of training tokens to later replace unseen-before testing tokens with '<unknown>'
    train_max_seq_length = max([len(txt) for txt in X_train])
    train_model_inputs = np.zeros((len(X_train), train_max_seq_length), dtype='int32')
    train_model_outputs = np.array(y_train, dtype='int32')
    for i, feature in enumerate(X_train):
        for t, token in enumerate(feature):
            train_model_inputs[i, t] = input_token_index[token]
            train_vocab.add(token)

    # Prepare testing model input data
    # Keep track of testing tokens to replace unseen-before tokens with '<unknown>'
    test_vocab = set()
    for feature in X_test:
        for token in feature:
            test_vocab.add(token)
    # Replace unseen-before tokens with: <unknown>
    # Find
    unseen_tokens = set()
    for token in test_vocab:
        if token not in train_vocab:
            unseen_tokens.add(token)
    # Replace
    for i, x in enumerate(X_test):
        matches = set(x) & unseen_tokens
        if len(matches) > 0:
            for j, token in enumerate(x):
                if token in matches:
                    X_test[i][j] = "<unknown>"
    # Model testing data
    test_max_seq_length = max([len(txt) for txt in X_test])
    test_model_inputs = np.zeros((len(X_test), test_max_seq_length), dtype='int32')
    for i, feature in enumerate(X_test):
        for t, token in enumerate(feature):
            test_model_inputs[i, t] = input_token_index[token]

    # Build, train, and test the model
    model = build_model(latent_dim, len(train_vocab))
    model.summary()
    # Let the model iterate through the entire training data 'epochs' times, testing its performance on the
    # testing data each time
    f_tp, f_tn, f_fp, f_fn, f_ps, f_rs, f_f1s, f_accs = [], [], [], [], [], [], [], []
    for i in range(epochs):
        print("Epoch", i+1, "of", epochs, ":")
        model.fit(train_model_inputs, train_model_outputs, batch_size=batch_size)  # Train
        predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=len(y_test))  # Test
        # Calculate scores
        tp, tn, fp, fn, p, r, f1 = results(predictions, y_test)
        f_tp.append(tp)
        f_tn.append(tn)
        f_fp.append(fp)
        f_fn.append(fn)
        f_ps.append(p)
        f_rs.append(r)
        f_f1s.append(f1)
        f_accs.append((tp+tn)/(tp+tn+fp+fn))

    print("Best scores of fold", fold, ":")
    print("Precision:", "%.3f" % max(f_ps), ". Recall:", "%.3f" % max(f_rs), ". F1 Score:", "%.3f" % max(f_f1s))
    # Accumulate scores
    tps.append(f_tp)
    tns.append(f_tn)
    fps.append(f_fp)
    fns.append(f_fn)
    precisions.append(f_ps)
    recalls.append(f_rs)
    f1_scores.append(f_f1s)
    accs.append(f_accs)

    fold += 1

print("================")
print("Training completed at:", datetime.datetime.now())


# Write results to disk
with open(results_dir+'tps.pkl', 'wb') as f:
    pickle.dump(tps, f)
with open(results_dir+'tns.pkl', 'wb') as f:
    pickle.dump(tns, f)
with open(results_dir+'fps.pkl', 'wb') as f:
    pickle.dump(fps, f)
with open(results_dir+'fns.pkl', 'wb') as f:
    pickle.dump(fns, f)
with open(results_dir+'precisions.pkl', 'wb') as f:
    pickle.dump(precisions, f)
with open(results_dir+'recalls.pkl', 'wb') as f:
    pickle.dump(recalls, f)
with open(results_dir+'f1_scores.pkl', 'wb') as f:
    pickle.dump(f1_scores, f)

# Show average scores
print("================")
best_ps = []
for fold in precisions:
    best_ps.append(max(fold))
print("Average Precision:", "%.3f" % (sum(best_ps)/len(best_ps)))
best_rs = []
for fold in recalls:
    best_rs.append(max(fold))
print("Average Recall:", "%.3f" % (sum(best_rs)/len(best_rs)))
best_f1s = []
for fold in f1_scores:
    best_f1s.append(max(fold))
print("Average F1-score:", "%.3f" % (sum(best_f1s)/len(best_f1s)))
best_accs = []
for fold in accs:
    best_accs.append(max(fold))
print("Average Accuracy:", "%.3f" % (sum(best_accs)/len(best_accs)))
