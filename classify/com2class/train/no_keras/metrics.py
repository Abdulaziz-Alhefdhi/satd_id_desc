# import numpy as np
# import tensorflow as tf
# from string import punctuation
# from collections import Counter
import pickle


# Parameter tuning
# lstm_size = 256
# lstm_layers = 1
# batch_size = 500
# learning_rate = 0.001
# embed_size = 300
# epochs = 3
# drop_prob = 0.5
#
# # For periodic performance logging
# loss_printer = 5
# val_acc_printer = 25
#
# def get_batches(x, y, batch_size):
#     n_batches = len(x) // batch_size
#     x, y = x[:n_batches*batch_size], y[:n_batches*batch_size]
#     for i in range(0, len(x), batch_size):
#         yield x[i:i+batch_size], y[i:i+batch_size]
#
#
# # Retrieve data
# with open('./sentiment-network/reviews.txt', 'r') as f:
#     reviews = f.read()
# with open('./sentiment-network/labels.txt', 'r') as f:
#     labels = f.read()
#
# # Pre-process reviews
# all_text = ''.join([c for c in reviews if c not in punctuation])  # Remove punctuation
# reviews = all_text.split('\n')
# all_text = ' '.join(reviews)
# words = all_text.split()
#
# # Vocab-integer mapping
# counts = Counter(words)
# vocab = sorted(counts, key=counts.get, reverse=True)
# vocab_to_int = {word: ii for ii, word in enumerate(vocab, 1)}
# reviews_ints = []
# for each in reviews:
#     reviews_ints.append([vocab_to_int[word] for word in each.split()])
#
# # Change labels from positive/negative to 1/0
# labels = labels.split('\n')
# labels = np.array([1 if each == 'positive' else 0 for each in labels])
#
# # Remove reviews with length 0 and truncate too long reviews to 200-length
# # 0-length reviews
# non_zero_idx = [ii for ii, review in enumerate(reviews_ints) if len(review) != 0]
# reviews_ints = [reviews_ints[ii] for ii in non_zero_idx]
# labels = np.array([labels[ii] for ii in non_zero_idx])
# # Fill out features without exceeding the length 200
# seq_len = 200
# features = np.zeros((len(reviews_ints), seq_len), dtype=int)
# for i, row in enumerate(reviews_ints):
#     features[i, -len(row):] = np.array(row)[:seq_len]
#
# # Split data to train, validate, and test sets
# split_frac = 0.8
# split_idx = int(len(features) * split_frac)
# train_x, val_x = features[:split_idx], features[split_idx:]
# train_y, val_y = labels[:split_idx], labels[split_idx:]
# test_idx = int(len(val_x)*0.5)
# val_x, test_x = val_x[:test_idx], val_x[test_idx:]
# val_y, test_y = val_y[:test_idx], val_y[test_idx:]

with open('predicted_outputs.pkl', 'rb') as f:
    test_preds = pickle.load(f)

print(len(test_preds))
print(len(test_preds[0]))
print(type(test_preds[0][0,0]))

import sys
sys.exit()

all_preds = []
for i in range(5):
    for pred in test_preds[i]:
        all_preds.append(True) if pred[0] == True else all_preds.append(False)

tp, tn, fp, fn = 0, 0, 0, 0
for pred, lbl in zip(all_preds, test_y):
    if pred == True:
        if lbl == 1: tp += 1
        else: tn += 1
    else:
        if lbl == 1: fn += 1
        else: fp += 1
p, r = tp/(tp+fp), tp/(tp+fn)
f1 = 2*p*r/(p+r)
print("Precision:", p)
print("Recall:", r)
print("F1 Score:", f1)
