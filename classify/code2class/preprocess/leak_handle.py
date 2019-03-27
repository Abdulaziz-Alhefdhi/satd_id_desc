from utils import retrieve_texts, fetch_corrisponding, tokenize_data, data_shapes, shape_info, DataObject
from collections import Counter
from random import shuffle
import pickle


max_num_samples = 1000000  # Number of samples to train on.
###max_num_samples = 20000  # Number of samples to train on.
# data_dir = '/home/aziz/experiments/data/td/code2class/v2/train/'  # Path to the data txt files on disk.
data_dir = '/home/aziz/experiments/data/td/code2class/v2/'  # Path to the data txt files on disk.
###max_input_length = 1000000
max_input_length = 1196  # Number of largest acceptable input length

# Get data
seqs, features, labels = retrieve_texts(data_dir, max_num_samples, max_input_length)

# Count data points to avoid leakage in testing dataset
# pair corresponding inputs and targets
comb_pairs = []
for s, l in zip(seqs, labels):
    comb_pairs.append((s, l))
# Count
pair_count = Counter(comb_pairs)
# Separate train and test data
# Put data points appearing only once in testing data until it is full (10% each)
# and put the rest in training
one_tenth = int(round(len(comb_pairs) * 10 / 100))  # 10% for testing
test_full = False
single_train_points, multi_train_points, test_points = [], [], []
for key, value in pair_count.items():
    if value == 1:
        if not test_full:
            test_points.append(key)
            if len(test_points) == one_tenth:
                test_full = True
        else:
            single_train_points.append(key)
    else:
        for i in range(value):
            multi_train_points.append(key)
# Because the Counter object puts some sort of order to the data, we want to shuffle it again
shuffle(single_train_points)
shuffle(multi_train_points)
shuffle(test_points)
# Combine single and multi train texts together
train_points = multi_train_points + single_train_points

# Prepare train and test data
train_seqs, train_features, train_labels = fetch_corrisponding(train_points, comb_pairs, seqs, features, labels)
test_seqs, test_features, test_labels = fetch_corrisponding(test_points, comb_pairs, seqs, features, labels)

# Tokenization
train_vocab = tokenize_data(train_features)
test_vocab = tokenize_data(test_features)

# Create training and testing data objects
train_do = DataObject(train_seqs, train_features, train_vocab, train_labels)
test_do = DataObject(test_seqs, test_features, test_vocab, test_labels)
# Data shapes
num_input_tokens_train, max_input_seq_length_train, n_input_samples_train = data_shapes(train_do)
num_input_tokens_test, max_input_seq_length_test, n_input_samples_test = data_shapes(test_do)
# Print shape info
print("================\nTraining data info:-")
shape_info(n_input_samples_train, num_input_tokens_train, max_input_seq_length_train)
print("================\nTesting data info:-")
shape_info(n_input_samples_test, num_input_tokens_test, max_input_seq_length_test)
print("================")

# Count test tokens that are not in train tokens
# count = 0
# for token in test_do.vocab:
#     if token not in train_do.vocab:
#         count += 1
# print(count)

import sys
sys.exit()

# Save dataset to disk
# Training data
# input sequences
with open('/home/aa043/sea/gpu/experiments/data/td/code2class/v2/train/seqs.txt', 'w', encoding='utf-8') as f:
    for line in train_do.seqs:
        f.write(line + '\n')
# labels
with open('/home/aa043/sea/gpu/experiments/data/td/code2class/v2/train/labels.txt', 'w', encoding='utf-8') as f:
    for line in train_do.labels:
        f.write(str(line) + '\n')
# Save the training object
with open('/home/aa043/sea/gpu/experiments/data/td/code2class/v2/train/data_object.pkl', 'wb') as f:
    pickle.dump(train_do, f)
# Testing data
# input sequences
with open('/home/aa043/sea/gpu/experiments/data/td/code2class/v2/test/seqs.txt', 'w', encoding='utf-8') as f:
    for line in test_do.seqs:
        f.write(line + '\n')
# labels
with open('/home/aa043/sea/gpu/experiments/data/td/code2class/v2/test/labels.txt', 'w', encoding='utf-8') as f:
    for line in test_do.labels:
        f.write(str(line) + '\n')
# Save the testing object
with open('/home/aa043/sea/gpu/experiments/data/td/code2class/v2/test/data_object.pkl', 'wb') as f:
    pickle.dump(test_do, f)
print("Training and testing data have been written to disk.")
