from keras.backend import clear_session
import numpy as np
import datetime
import pickle
import sys
import os
sys.path.append('/home/aa043/sea/problems/tech_debt/')
from support_functions import DataObject, data_shapes, shape_info, token_integer_mapping, \
    prepare_model_data, replace_unseen, build_classifier_w_pooling, results, send_email, tokenize
from sklearn.model_selection import StratifiedKFold
from keras.callbacks import ModelCheckpoint


batch_size = 64   # Batch size for training (16, 256, 256, 64)
epochs = 20       # Number of epochs to train for
num_layers = 1    # Number of model layers (2, 1, 2, 2)
latent_dim = 64   # Latent dimensionality of the encoding space (8, 32, 32, 16)

# exp_sets = [(64, 64, 1), (8, 16, 2), (32, 256, 1), (32, 256, 2), (16, 64, 2)]  # (emb, b, l)
exp_sets = [(32, 256, 1), (32, 256, 2), (16, 64, 2), (8, 16, 2)]  # (emb, b, l)

data_dir    = '/home/aa043/sea/gpu/experiments/data/td/CT/'
# results_dir = '/home/aziz/experiments/output/td/classify/code2class/v2/cv/dim64_b64/'
# trained_models_dir = "/home/aa043/sea/gpu/experiments/trained_models/td/classify/CT/cv/"

# Get data
with open(data_dir+'dataset.pkl', 'rb') as f:  # train_set
    cv_set = pickle.load(f)
with open(data_dir+'tune_val/dataset.pkl', 'rb') as f:  # val_set
    tune_set = pickle.load(f)

# Redefine vocab list
# all_input_vocab = set()
# # CV set
# for token in cv_set.input_vocab[:-1]:  # Don't include '<unknown>' yet
#     all_input_vocab.add(token)
# # Tuning set
# for token in tune_set.input_vocab[:-1]:  # Don't include '<unknown>' yet
#     all_input_vocab.add(token)
# all_input_vocab = sorted(list(all_input_vocab)) + ["<unknown>"]

# Loop through best 5 hyper-parameter settings
for setting in exp_sets:
    dim = setting[0]
    b = setting[1]
    nl = setting[2]
    # Print hyper-parameter info
    print("================\nBatch size:", b)
    print("Number of model layers:", nl)
    print("Embedding dimensionality:", dim)
    name_info = "emb"+str(dim)+"_b"+str(b)+"_"+str(nl)+"l"  # Model name to be saved
    # Make train-models directory
    # if not os.path.exists(trained_models_dir+name_info):
    #     os.makedirs(trained_models_dir+name_info+"/")

    start_time = datetime.datetime.now().replace(microsecond=0)
    print("================")
    print("Training started at:", start_time)

    # Stratified 10-fold cross-validation
    skf = StratifiedKFold(n_splits=10)  # Number of folds
    fold = 1
    precisions, recalls, f1_scores, accs = [], [], [], []
    for train_index, test_index in skf.split(cv_set.input_lists, cv_set.labels):
        print("================")
        print("Fold "+str(fold)+":")
        # Split
        X_train, X_test = cv_set.input_lists[train_index], cv_set.input_lists[test_index]
        y_train, y_test = cv_set.labels[train_index], cv_set.labels[test_index]
        # Add the tuning set to the training set
        X_train = np.concatenate((X_train, tune_set.input_lists))
        y_train = np.concatenate((y_train, tune_set.labels))

        # Tokenization
        train_vocab = tokenize(X_train)
        test_vocab = tokenize(X_test)

        # Convert tokens to integers since the DL model accepts only integers
        # input_token_index, reverse_input_token_index = token_integer_mapping(train_vocab)
        input_token_index, _, _, _ = \
            token_integer_mapping(train_vocab, tune_set.comment_vocab)

        # Prepare training model input data
        train_max_seq_length = max([len(txt) for txt in X_train])
        train_model_inputs = np.zeros((len(X_train), train_max_seq_length), dtype='int32')
        train_model_outputs = np.array(y_train, dtype='int32')
        # train_vocab = set()  # Keep track of training tokens to later replace unseen-before testing tokens with '<unknown>'
        for i, feature in enumerate(X_train):
            for t, token in enumerate(feature):
                train_model_inputs[i, t] = input_token_index[token]
                # train_vocab.add(token)
        # train_vocab = sorted(list(train_vocab)) + ["<unknown>"]

        # Prepare testing model input data
        # Keep track of testing tokens to replace unseen-before tokens with '<unknown>'
        # test_vocab = set()
        # for feature in X_test:
        #     for token in feature:
        #         test_vocab.add(token)
        # test_vocab = sorted(list(test_vocab)) + ["<unknown>"]
        X_test = replace_unseen(test_vocab, train_vocab, X_test)
        # Model testing data
        test_max_seq_length = max([len(txt) for txt in X_test])
        test_model_inputs = np.zeros((len(X_test), test_max_seq_length), dtype='int32')
        for i, feature in enumerate(X_test):
            for t, token in enumerate(feature):
                test_model_inputs[i, t] = input_token_index[token]

        # Build, train, and test the model
        model = build_classifier_w_pooling(dim, len(train_vocab), nl)
        model.summary()
        # Let the model iterate through the entire training data 'epochs' times, testing its performance on the
        # testing data each time
        f_ps, f_rs, f_f1s, f_accs = [], [], [], []
        for i in range(1, epochs+1):
            print("Epoch", i, "of", str(epochs)+":")
            model_name = "td_pred_cv_"+name_info+"_e"+str(i)+".hdf5"
            # checkpoint = ModelCheckpoint(filepath=trained_models_dir+name_info+"/"+model_name, verbose=1)
            model.fit(train_model_inputs, train_model_outputs, batch_size=b)  # Train
            predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=len(y_test))  # Test
            tp, tn, fp, fn, p, r, f1, acc = results(predictions, y_test)  # Calculate scores
            f_ps.append(p)
            f_rs.append(r)
            f_f1s.append(f1)
            f_accs.append(acc)
        print("================")
        print("Best scores of fold", fold, ":")
        print("Precision:", "%.3f" % max(f_ps), ". Recall:", "%.3f" % max(f_rs), ". F1 Score:", "%.3f" % max(f_f1s), ". Accuracy:", "%.3f" % max(f_accs))
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
    send_email(name_info+" TRAINING DONE!")

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
    print("================")

