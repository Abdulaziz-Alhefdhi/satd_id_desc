import numpy as np
import pickle
import sys
import datetime
from support_functions import DataObject, data_shapes, shape_info, results_baseline, dummy_fun
from sklearn.feature_extraction.text import CountVectorizer, TfidfTransformer
from sklearn.model_selection import StratifiedKFold
from sklearn.naive_bayes import MultinomialNB
from sklearn.linear_model import SGDClassifier
from sklearn import svm
# from sklearn import metrics
# import pandas as pd

sys.path.append('/home/aa043/sea/problems/tech_debt/')
data_dir    = '/home/aa043/sea/gpu/experiments/data/td/CT/'


# Get data
with open(data_dir+'dataset.pkl', 'rb') as f:  # train_set
    cv_set = pickle.load(f)
with open(data_dir+'tune_val/dataset.pkl', 'rb') as f:  # val_set
    tune_set = pickle.load(f)
# Data shapes
train_num_encoder_tokens, train_num_decoder_tokens, train_max_encoder_seq_length, \
train_max_decoder_seq_length, train_n_input_samples = data_shapes(cv_set)
val_num_encoder_tokens, val_num_decoder_tokens, val_max_encoder_seq_length, \
val_max_decoder_seq_length, val_n_input_samples = data_shapes(tune_set)
# Print shape info
print("================\nTraining set info:-")
shape_info(train_n_input_samples, train_num_encoder_tokens, train_num_decoder_tokens,
           train_max_encoder_seq_length, train_max_decoder_seq_length)
print("================\nValidation set info:-")
shape_info(val_n_input_samples, val_num_encoder_tokens, val_num_decoder_tokens,
           val_max_encoder_seq_length, val_max_decoder_seq_length)
print("================")
start_time = datetime.datetime.now().replace(microsecond=0)

# Stratified 10-fold cross-validation
skf = StratifiedKFold(n_splits=10)  # Number of folds
fold = 1
precisions, recalls, f1_scores, accs = [], [], [], []
for train_index, test_index in skf.split(cv_set.input_lists, cv_set.labels):
    print("Fold " + str(fold) + ":")
    # Split
    X_train, X_test = cv_set.input_lists[train_index], cv_set.input_lists[test_index]
    y_train, y_test = cv_set.labels[train_index], cv_set.labels[test_index]
    # Add the tuning set to the training set
    X_train = np.concatenate((X_train, tune_set.input_lists))
    y_train = np.concatenate((y_train, tune_set.labels))

    # Feature extraction
    bow = CountVectorizer(analyzer='word', tokenizer=dummy_fun, preprocessor=dummy_fun, token_pattern=None)
    X_train = bow.fit_transform(X_train)
    tfidf = TfidfTransformer()
    X_train = tfidf.fit_transform(X_train)
    X_test = bow.transform(X_test)
    X_test = tfidf.transform(X_test)

    # Model training
    # clf = MultinomialNB().fit(X_train, y_train)
    # clf = SGDClassifier(loss='hinge', penalty='l2', alpha=1e-3, random_state=42, max_iter=5, tol=None).fit(X_train, y_train)
    clf = svm.LinearSVC().fit(X_train, y_train)

    # Model testing
    predictions = clf.predict(X_test)

    # Model evaluation
    tp, tn, fp, fn, p, r, f1, acc = results_baseline(predictions, y_test)  # Calculate scores
    precisions.append(p)
    recalls.append(r)
    f1_scores.append(f1)
    accs.append(acc)
    fold += 1
    print("================")

end_time = datetime.datetime.now().replace(microsecond=0)
print("Training completed at:", end_time)
print("Training took (h:m:s)", end_time - start_time)
# Show average scores
print("================")
print("Average Precision:", "%.3f" % (sum(precisions)/len(precisions)))
print("Average Recall:", "%.3f" % (sum(recalls)/len(recalls)))
print("Average F1-score:", "%.3f" % (sum(f1_scores)/len(f1_scores)))
print("Average Accuracy:", "%.3f" % (sum(accs)/len(accs)))




# print(metrics.classification_report(val_set.labels, predictions))
# print("================")
# print(pd.DataFrame(metrics.confusion_matrix(val_set.labels, predictions, labels=[1, 0]),
#                                             index=['Actual:TD', 'Actual:Non-TD'], columns=['Pred:TD', 'Pred:Non-TD']))
# print("================")
# print("Accuracy:", "%.3f" % np.mean(predictions == val_set.labels))

