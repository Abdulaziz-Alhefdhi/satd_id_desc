import pandas as pd
from sklearn.model_selection import StratifiedKFold
import datetime
import numpy as np
from sklearn.ensemble import RandomForestClassifier
from sklearn.naive_bayes import MultinomialNB
from sklearn import svm
from sklearn.linear_model import SGDClassifier
from support_functions import results_baseline


# pd.set_option('display.max_columns', None)

# Retrieve and prepare data
cv_data = pd.read_csv("/home/aa043/sea/data/td/ours/v2/CT/framework_ready/bm_data.csv")
tune_data = pd.read_csv("/home/aa043/sea/data/td/ours/v2/CT/framework_ready/tune_val/bm_data.csv")
X_cv = cv_data.loc[:, :'read'].astype('float64')
y_cv = cv_data['label'].to_numpy()
X_tune = tune_data.loc[:, :'read'].astype('float64')
X_tune.drop(inplace=True, columns=list(set(X_tune.columns) - set(X_cv.columns)))  # Drop extra columns
X_tune = pd.concat([pd.DataFrame(columns=X_cv.columns), X_tune], sort=False).fillna(0.0).to_numpy()  # Reshape to match X_cv
y_tune = tune_data['label'].to_numpy()
X_cv = X_cv.to_numpy()

# Stratified 10-fold cross-validation
skf = StratifiedKFold(n_splits=10)  # Number of folds
fold = 1
precisions, recalls, f1_scores, accs = [], [], [], []
start_time = datetime.datetime.now().replace(microsecond=0)
for train_index, test_index in skf.split(X_cv, y_cv):
    print("Fold " + str(fold) + ":")
    # Split
    X_train, X_test = X_cv[train_index], X_cv[test_index]
    y_train, y_test = y_cv[train_index], y_cv[test_index]
    # Add the tuning set to the training set
    X_train = np.concatenate((X_train, X_tune))
    y_train = np.concatenate((y_train, y_tune))

    # Model training
    clf = RandomForestClassifier(n_estimators=100, max_depth=2, random_state=0).fit(X_train, y_train)
    # clf = RandomForestClassifier(n_estimators=100).fit(X_train, y_train)
    # clf = RandomForestClassifier().fit(X_train, y_train)
    # clf = MultinomialNB().fit(X_train, y_train)
    # clf = svm.LinearSVC().fit(X_train, y_train)
    # clf = SGDClassifier(loss='hinge', penalty='l2', alpha=1e-3, random_state=42, max_iter=5, tol=None).fit(X_train, y_train)
    # clf = SGDClassifier().fit(X_train, y_train)
    # print(clf.feature_importances_.argsort())
    # continue
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

