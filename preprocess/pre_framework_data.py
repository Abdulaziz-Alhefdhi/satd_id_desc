import sys
sys.path.append('/home/aziz/experiments/problems/tech_debt/')
from support_functions import retrieve_data, combine_data, token_integer_mapping, DataObject, data_shapes, shape_info, write_to_disk
from sklearn.model_selection import StratifiedKFold
from tqdm import tqdm
from collections import Counter
from random import sample, seed
import numpy as np


seed(30)  # To generate the same randomized data every time we run this code
data_path = "/home/aziz/experiments/data/td/v3/"  # Path to the data txt files on disk.
num_samples = 1000000  # Number of samples to train on.
# num_samples = 5000  # Number of samples to train on.
max_input_length = 1500  # Number of largest acceptable input length
max_comment_length = 150  # Number of largest acceptable target length
# max_input_length  = 1000000
# max_comment_length = 1000000

# Get data
input_lists, labels, comment_lists, code_lines = \
    retrieve_data(data_path, num_samples, max_input_length, max_comment_length)

print("Combining data to remove further duplicates caused by data formatting...")
full_set = combine_data(input_lists, labels, comment_lists, code_lines)
print("Removing duplicates...")
full_set = list(set(full_set))

# Convert tuples (AST seqs and comments) back to lists
# full_set = [(list(item[0]), item[1], list(item[2]), item[3]) for item in raw_set]
print("Separating positive and negative data...")
pos_data, neg_data = [], []
for item in full_set:
    if item[1] == 1:
        pos_data.append(item)
    else:
        neg_data.append(item)
# Shuffle negative data
neg_data = sample(neg_data, k=len(neg_data))
# Negative size similar to positive (for CT). The rest is for pre-training set
neg_ct, pre_tr_set = neg_data[:len(pos_data)], neg_data[len(pos_data):]

print("Building cross-testing set and shuffling to avoid potential order biases...")
ct_set = pos_data + neg_ct
ct_set = sample(ct_set, k=len(ct_set))

print("Preparing for separating CV & tune sets...")
inputs_array =   np.array([item[0] for item in ct_set])
labels_array =   np.array([item[1] for item in ct_set])
comments_array = np.array([item[2] for item in ct_set])
codes_array =    np.array([item[3] for item in ct_set])

print("Preparing for the pre-training data object...")
inputs_array_Pre_tr =   np.array([item[0] for item in pre_tr_set])
labels_array_Pre_tr =   np.array([item[1] for item in pre_tr_set])
comments_array_Pre_tr = np.array([item[2] for item in pre_tr_set])
codes_array_Pre_tr =    np.array([item[3] for item in pre_tr_set])

print('Creating vocab-integer mapping for ASTs and comments...')
ast_tokens_to_ints, ast_ints_to_tokens = token_integer_mapping(inputs_array)
comment_words_to_ints, comment_ints_to_words = token_integer_mapping(comments_array)
print("AST vocabulary size:", len(ast_ints_to_tokens))
print("Comment vocabulary size:", len(comment_ints_to_words))

for i in range(20):
    print('==========')
    print(ast_ints_to_tokens[i])
    print(comment_ints_to_words[i])

sys.exit()

print("Separating CV & tuning sets...")
skf = StratifiedKFold(n_splits=10)  # ~10% of the data as the tuning set
for cv_index, tune_index in skf.split(inputs_array, labels_array):
    inputs_cv, inputs_tune = inputs_array[cv_index], inputs_array[tune_index]
    labels_cv, labels_tune = labels_array[cv_index], labels_array[tune_index]
    comments_cv, comments_tune = comments_array[cv_index], comments_array[tune_index]
    codes_cv, codes_tune = codes_array[cv_index], codes_array[tune_index]
    break

# Data tokenization
# input_cv_vocab, comment_cv_vocab = tokenize(inputs_cv), tokenize(comments_cv)
# input_tune_vocab, comment_tune_vocab = tokenize(inputs_tune), tokenize(comments_tune)

# Make dataset objects (tuning and rest) to save to disk
# cv_set = DataObject(inputs_cv, labels_cv, comments_cv, codes_cv, input_cv_vocab, comment_cv_vocab)
# tune_set = DataObject(inputs_tune, labels_tune, comments_tune, codes_tune, input_tune_vocab, comment_tune_vocab)

# Get data shapes
# cv_n_encoder_tokens, cv_n_decoder_tokens, cv_max_encoder_seq_length, \
# cv_max_decoder_seq_length, cv_n_samples = data_shapes(cv_set)
# tune_n_encoder_tokens, tune_n_decoder_tokens, tune_max_encoder_seq_length, \
# tune_max_decoder_seq_length, tune_n_samples = data_shapes(tune_set)
# Print shape info
# print("================\nCV set info:-")
# shape_info(cv_n_samples, cv_n_encoder_tokens, cv_n_decoder_tokens, cv_max_encoder_seq_length, cv_max_decoder_seq_length)
# print("================\nTuning set info:-")
# shape_info(tune_n_samples, tune_n_encoder_tokens, tune_n_decoder_tokens, tune_max_encoder_seq_length, tune_max_decoder_seq_length)
# print("================\nWriting framework-ready data to disk...")

import sys
sys.exit()

# Save data to disk
write_to_disk(data_path+"framework_ready/", cv_set)  # cv_set
write_to_disk(data_path+"framework_ready/tune_val/", tune_set)  # tune_set
