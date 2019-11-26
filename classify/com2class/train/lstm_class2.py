from random import seed, sample
import datetime
import numpy as np
import sys
# sys.path.append('/home/aa043/sea/problems/tech_debt/classify/com2class/')
sys.path.append('/home/aziz/experiments/problems/tech_debt/classify/com2class/')
from com2class_utils import retrieve_dataset, model_ready_data, build_model, results, dummy_fun
from keras.backend import clear_session
from sklearn.feature_extraction.text import CountVectorizer, TfidfTransformer
from sklearn.naive_bayes import MultinomialNB
from sklearn.linear_model import SGDClassifier
from sklearn import svm
from sklearn.ensemble import RandomForestClassifier


random_seed = 30
seed(random_seed)
# data_dir = '/home/aa043/sea/gpu/experiments/data/td/com2class/data_objects/'
data_dir = '/home/aziz/experiments/data/td/com2class/data_objects/'


# Retrieve dataset from disk
argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql, words_to_ints, ints_to_words = \
    retrieve_dataset(data_dir)
vocab_size = len(words_to_ints)
print("================")

project_list = [argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql]


'''
# Start training and testing
start_time = datetime.datetime.now().replace(microsecond=0)
ps, rs, f1s = [], [], []
for proj in project_list:
    print('Project under testing:', proj.pname)
    # Prepare model training and testing data
    pre_X_train, pre_y_train, X_test, y_test = model_ready_data(project_list, proj.pname, words_to_ints)

    # Over-sampling
    pos_data, neg_data = [], []
    for seq, lbl in zip(pre_X_train, pre_y_train):
        if lbl == 1:
            pos_data.append([seq, lbl])
        else:
            neg_data.append([seq, lbl])
    # neg_data = neg_data[:len(pos_data)]
    pos_data = pos_data + pos_data + pos_data + pos_data
    combined = pos_data + neg_data
    comb_shuf = sample(combined, k=len(combined))
    X_train = np.array([x[0] for x in comb_shuf])
    y_train = np.array([x[1] for x in comb_shuf])

    # Feature extraction
    bow = CountVectorizer(analyzer='word', tokenizer=dummy_fun, preprocessor=dummy_fun, token_pattern=None)
    X_train = bow.fit_transform(X_train)
    # tfidf = TfidfTransformer()
    # X_train = tfidf.fit_transform(X_train)
    X_test = bow.transform(X_test)
    # X_test = tfidf.transform(X_test)

    # Model training
    # clf = MultinomialNB().fit(X_train, y_train)
    clf = SGDClassifier(loss='hinge', penalty='l2', alpha=1e-3, random_state=42, max_iter=900, tol=None).fit(X_train, y_train)
    # clf = SGDClassifier(loss='hinge', penalty='l2', alpha=1e-3, random_state=42, tol=None).fit(X_train, y_train)
    # clf = svm.LinearSVC().fit(X_train, y_train)
    # clf = RandomForestClassifier(n_estimators=100, max_depth=2, random_state=0).fit(X_train, y_train)
    # clf = RandomForestClassifier(n_estimators=100).fit(X_train, y_train)
    # clf = RandomForestClassifier().fit(X_train, y_train)

    # Model testing
    predictions = clf.predict(X_test)
    tp, tn, fp, fn, p, r, f1, acc = results(predictions, y_test, True)  # Calculate scores
    ps.append(p)
    rs.append(r)
    f1s.append(f1)
    print("================")

print("================")
end_time = datetime.datetime.now().replace(microsecond=0)
print("Training completed at:", end_time)
print("Training took (h:m:s)", end_time - start_time)
print("================")
print('Average Precision:', '%.3f' % (sum(ps)/len(ps)))
print('Average Recall:   ',    '%.3f' % (sum(rs)/len(rs)))
print('Average F1 score: ',  '%.3f' % (sum(f1s)/len(f1s)))


'''
n_layers = 1      # Number of RNN layers
latent = 32       # Dimensionality for embedding and model layers
batch_size = 512  # How many data points to train in every batch
epochs = 20
class_weight = {1: 0.75, 0: 0.25}

print("Batch size:", batch_size)
print("Number of model layers:", n_layers)
print("Latent dimensionality:", latent)

# Start training and testing
start_time = datetime.datetime.now().replace(microsecond=0)
print("================")
print("Training started at:", start_time)

ps, rs, f1s, accs = [], [], [], []
for i, proj in enumerate(project_list):
    # if i > 1:
    #     break
    print("================")
    print('Project under testing:', proj.pname)
    print("================")
    X_train, y_train, X_test, y_test = model_ready_data(project_list, proj.pname, words_to_ints)


    # Over-sampling
    pos_data, neg_data = [], []
    for seq, lbl in zip(X_train, y_train):
        if lbl == 1:
            pos_data.append([seq, lbl])
        else:
            neg_data.append([seq, lbl])
    # neg_data = neg_data[:len(pos_data)]
    # pos_data = pos_data + pos_data + pos_data + pos_data
    combined = pos_data + neg_data
    comb_shuf = sample(combined, k=len(combined))
    X_train = np.array([x[0] for x in comb_shuf])
    y_train = np.array([x[1] for x in comb_shuf])

    # poss, negs = 0, 0
    # for i, y in enumerate(y_train):
    #     if y == 1:
    #         poss += 1
    #     if y == 0:
    #         negs += 1
    # print(poss, negs)
    # sys.exit()

    # Prepare model-ready data
    train_max_seq_length = max([len(seq) for seq in X_train])
    test_max_seq_length = max([len(seq) for seq in X_test])
    train_model_inputs = np.zeros((len(X_train), train_max_seq_length), dtype='int64')
    test_model_inputs = np.zeros((len(X_test), test_max_seq_length), dtype='int64')
    for i, seq in enumerate(X_train):
        train_model_inputs[i, :len(seq)] = seq
    for i, seq in enumerate(X_test):
        test_model_inputs[i, :len(seq)] = seq

    # c = 0
    # for i, (x, y) in enumerate(zip(train_model_inputs, y_train)):
    #     if y == 1:
    #         c += 1
    #         print(c, y)
    #         to_print = ''
    #         for item in x:
    #             if item == 0:
    #                 break
    #             to_print += ints_to_words[item] + ' '
    #         print(to_print)
    #         print("================")
    #
    # from collections import Counter
    # print(Counter(y_train))


    model = build_model(latent, vocab_size, n_layers)
    model.summary()

    from collections import Counter
    print(Counter(y_train))

    proj_ps, proj_rs, proj_f1s, proj_accs = [], [], [], []
    for e in range(epochs):
        print('epoch', e+1, 'of', str(epochs)+':')
        # model.fit(train_model_inputs, y_train, batch_size=batch_size)  # Train
        model.fit(train_model_inputs, y_train, batch_size=batch_size, class_weight=class_weight)  # Train
        predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=len(y_test))  # Test
        # predictions = model.predict_classes(test_model_inputs, verbose=1)  # Test
        tp, tn, fp, fn, p, r, f1, acc = results(predictions, y_test)  # Calculate scores
        proj_ps.append(p)
        proj_rs.append(r)
        proj_f1s.append(f1)
        proj_accs.append(acc)

    print("================")
    print("Best scores of project", proj.pname, "with regards to F1 score:")
    idx_best_f1 = max((x, i) for i, x in enumerate(proj_f1s))[1]
    print("Precision:", "%.3f" % proj_ps[idx_best_f1], ". Recall:", "%.3f" % proj_rs[idx_best_f1], ". F1 Score:",
          "%.3f" % proj_f1s[idx_best_f1], ". Accuracy:", "%.3f" % proj_accs[idx_best_f1])
    ps.append(proj_ps)
    rs.append(proj_rs)
    f1s.append(proj_f1s)
    accs.append(proj_accs)

    clear_session()

print("================")
end_time = datetime.datetime.now().replace(microsecond=0)
print("Training completed at:", end_time)
print("Training took (h:m:s)", end_time - start_time)

# Show average scores
idx_best_f1s = []
for fold in f1s:
    idx_best_f1s.append(max((x, i) for i, x in enumerate(fold))[1])
best_ps = []
for i, fold in enumerate(ps):
    best_ps.append(fold[idx_best_f1s[i]])
best_rs = []
for i, fold in enumerate(rs):
    best_rs.append(fold[idx_best_f1s[i]])
best_f1s = []
for i, fold in enumerate(f1s):
    best_f1s.append(fold[idx_best_f1s[i]])
best_accs = []
for i, fold in enumerate(accs):
    best_accs.append(fold[idx_best_f1s[i]])
print("================")
print('Best Precisions:', best_ps)
print('Best Recalls:', best_rs)
print('Best F1-scores:', best_f1s)
print('Best Accuracy:', best_accs)
print("================")
print("Average Precision:", "%.3f" % (sum(best_ps) / len(best_ps)))
print("Average Recall:   ", "%.3f" % (sum(best_rs) / len(best_rs)))
print("Average F1-score: ", "%.3f" % (sum(best_f1s)/len(best_f1s)))
print("Average Accuracy: ", "%.3f" % (sum(best_accs)/len(best_accs)))
