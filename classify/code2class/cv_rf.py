from keras.models import load_model
from cv_utils import retrieve_dataset, encode_integers, create_features, results
import numpy as np
import datetime
from sklearn.model_selection import StratifiedKFold
from sklearn.ensemble import RandomForestClassifier
from sklearn.naive_bayes import MultinomialNB
from sklearn import svm
from sklearn.tree import DecisionTreeClassifier
from sklearn.linear_model import SGDClassifier


# data_dir = '/home/aa043/sea/gpu_data/data/td/CT/data_objects/'
data_dir = '/home/aa043/sea/gpu_data/data/td/CT/data_objects/'
# cp_num = 21500
cp_num = 30000
# cp_path = '/home/aa043/sea/gpu/experiments/trained_models/td/pretrain/dp50311_v27359_1lay_lat32_b2048_ep' \
#           + str(cp_num) + '.h5'
cp_path = '/home/aa043/sea/trained_models/td/pretrain/dp50311_v27359_1lay_lat32_b2048/dp50311_v27359_1lay_lat32_b2048_ep' \
          + str(cp_num) + '.h5'

print("================\nRetrieving dataset...")
cv_set, tune_set, tokens_to_ints, ints_to_tokens = retrieve_dataset(data_dir)
vocab_size = len(tokens_to_ints)
print("================\nRetrieving embeddings...")
trained_model = load_model(cp_path)
embeddings = trained_model.layers[0].get_weights()[0]
# trained_model.summary()

cv_ints = encode_integers(cv_set.input_lists, tokens_to_ints)
tune_ints = encode_integers(tune_set.input_lists, tokens_to_ints)
cv_labels = np.array(cv_set.labels)
tune_labels = np.array(tune_set.labels)
# Create feature by applying a pooling technique (average on the length of 1500)
cv_features = create_features(cv_ints, embeddings)
tune_features = create_features(tune_ints, embeddings)

start_time = datetime.datetime.now().replace(microsecond=0)
print("================")
print("Training started at:", start_time)

# Stratified 10-fold cross-validation
skf = StratifiedKFold(n_splits=10)  # Number of folds
fold = 1
precisions, recalls, f1_scores, accs = [], [], [], []
for train_index, test_index in skf.split(cv_features, cv_labels):
    print("================")
    print("Fold " + str(fold) + ":")
    # Split
    X_train, X_test = cv_features[train_index], cv_features[test_index]
    y_train, y_test = cv_labels[train_index], cv_labels[test_index]
    # Add the tuning set to the training set
    X_train = np.concatenate((X_train, tune_features))
    y_train = np.concatenate((y_train, tune_labels))

    # Build, train, and test the model
    # clf = RandomForestClassifier(n_estimators=100, max_depth=2, random_state=0).fit(X_train, y_train)
    # clf = RandomForestClassifier(n_estimators=100).fit(X_train, y_train)
    # clf = RandomForestClassifier().fit(X_train, y_train)
    # clf = MultinomialNB().fit(X_train, y_train)
    clf = svm.LinearSVC().fit(X_train, y_train)
    # clf = SGDClassifier(loss='hinge', penalty='l2', alpha=1e-3, random_state=42, max_iter=5, tol=None).fit(X_train, y_train)
    # clf = SGDClassifier().fit(X_train, y_train)
    # clf = DecisionTreeClassifier(random_state=0, max_depth=2).fit(X_train, y_train)

    # print(clf.feature_importances_.argsort())
    predictions = clf.predict(X_test)
    tp, tn, fp, fn, p, r, f1, acc = results(predictions, y_test)  # Calculate scores
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
print("Average Precision:", "%.3f" % (sum(precisions) / len(precisions)))
print("Average Recall:", "%.3f" % (sum(recalls) / len(recalls)))
print("Average F1-score:", "%.3f" % (sum(f1_scores) / len(f1_scores)))
print("Average Accuracy:", "%.3f" % (sum(accs) / len(accs)))
