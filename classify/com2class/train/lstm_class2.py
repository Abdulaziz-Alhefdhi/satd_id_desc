from random import seed, sample
import datetime
import numpy as np
import sys
sys.path.append('/home/aa043/sea/problems/tech_debt/classify/com2class/')
from com2class_utils import retrieve_dataset, model_ready_data, build_model, results


seed(30)
data_dir = '/home/aa043/sea/gpu/experiments/data/td/com2class/data_objects/'
n_layers = 1      # Number of RNN layers
latent = 1024       # Dimensionality for embedding and model layers
batch_size = 512  # How many data points to train in every batch
epochs = 50
test_project = 'argouml'  # The name of the target project for testing
# class_weight = {1: 0.9, 0: 0.1}

# Retrieve dataset from disk
argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql, words_to_ints, ints_to_words = \
    retrieve_dataset(data_dir)
vocab_size = len(words_to_ints)
project_list = [argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql]
print("Batch size:", batch_size)
print("Number of model layers:", n_layers)
print("Latent dimensionality:", latent)

# Prepare model training and testing data
pre_X_train, pre_y_train, X_test, y_test = model_ready_data(project_list, test_project, words_to_ints)

# for i, item in enumerate(y_train):
#     if item == 1:
#         to_print = ''
#         for integer in X_train[i]:
#             to_print += ints_to_words[integer] + ' '
#         print(to_print)
#         print('=========')

# Under-sampling
pos_data, neg_data = [], []
for seq, lbl in zip(pre_X_train, pre_y_train):
    if lbl == 1:
        pos_data.append([seq, lbl])
    else:
        neg_data.append([seq, lbl])
neg_data = neg_data[:len(pos_data)]
combined = pos_data + neg_data
comb_shuf = sample(combined, k=len(combined))
X_train = np.array([x[0] for x in comb_shuf])
y_train = np.array([x[1] for x in comb_shuf])

# Prepare model-ready data
train_max_seq_length = max([len(seq) for seq in X_train])
test_max_seq_length = max([len(seq) for seq in X_test])
train_model_inputs = np.zeros((len(X_train), train_max_seq_length), dtype='int64')
test_model_inputs = np.zeros((len(X_test), test_max_seq_length), dtype='int64')
for i, seq in enumerate(X_train):
    train_model_inputs[i, :len(seq)] = seq
for i, seq in enumerate(X_test):
    test_model_inputs[i, :len(seq)] = seq

# Start training and testing
start_time = datetime.datetime.now().replace(microsecond=0)
print("================")
print("Training started at:", start_time)
model = build_model(latent, vocab_size, n_layers)
model.summary()
for e in range(epochs):
    print('epoch', e+1, 'of', str(epochs)+':')
    model.fit(train_model_inputs, y_train, batch_size=batch_size)  # Train
    # predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=len(y_test//4))  # Test
    # tp, tn, fp, fn, p, r, f1, acc = results(predictions, y_test)  # Calculate scores
print("================")
end_time = datetime.datetime.now().replace(microsecond=0)
print("Training completed at:", end_time)
print("Training took (h:m:s)", end_time - start_time)
