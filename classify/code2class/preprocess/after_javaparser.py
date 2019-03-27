from utils import clean_ast_seqs, DataObject, data_shapes, shape_info
from random import sample
import pickle


data_dir = "/home/aziz/experiments/data/td/code2class/v2/no_dups/"

# Retrieve clean sequences
pos_clean_seqs = clean_ast_seqs(data_dir+"pos_ast_seqs.txt")
neg_clean_seqs = clean_ast_seqs(data_dir+"neg_ast_seqs.txt")

# Create labels
pos_labels, neg_labels = [], []
for i in range(len(pos_clean_seqs)):
    pos_labels.append(1)
for i in range(len(neg_clean_seqs)):
    neg_labels.append(0)

# Remove duplicates
# Combine features and labels
pos_list, neg_list = [], []
for seq, label in zip(pos_clean_seqs, pos_labels):  # Positive data
    pos_list.append((seq, label))
for seq, label in zip(neg_clean_seqs, neg_labels):  # Negative data
    neg_list.append((seq, label))
# Duplicates removal
clean_pos_list = list(set(pos_list))
clean_neg_list = list(set(neg_list))

# Data Randomization
comb_list = clean_pos_list + clean_neg_list
# Shuffle
shuf_comb_list = sample(comb_list, k=len(comb_list))
# Separate code_seqs and labels
inputs, targets = [], []
for item in shuf_comb_list:
    inputs.append(item[0])
    targets.append(item[1])

# Prepare data for the DL model
max_num_samples = 1000000  # Number of samples to train on.
###max_num_samples = 20000  # Number of samples to train on.
# max_input_length = 1000000  # Number of largest acceptable input length
max_input_length = 1000  # Number of largest acceptable input length
# min_input_length = 1  # Number of smallest acceptable input length
min_input_length = 40  # Number of smallest acceptable input length

# Keep only max_num_samples
inputs = inputs[: min(max_num_samples, len(inputs))]
targets = targets[: min(max_num_samples, len(targets))]

# Special treatment for input code sequences
draft_features = []
for seq in inputs:
    seq = seq.replace("(", " ( ")
    seq = seq.replace(")", " ) ")
    seq = seq.replace("_", " _ ")
    draft_features.append(seq.split())

# Remove long & short sequences
seqs, features, labels = [], [], []
for seq, feature, label in zip(inputs, draft_features, targets):
    if len(feature) <= max_input_length and len(feature) >= min_input_length:
        seqs.append(seq)
        features.append(feature)
        labels.append(label)

# Tokenize data
vocab = set()
for f in features:
    for token in f:
        vocab.add(token)
vocab = sorted(list(vocab))+["<unknown>"]

# Create dataset object
do = DataObject(seqs, features, vocab, labels)
# Data shapes
num_input_tokens, max_input_seq_length, n_input_samples = data_shapes(do)
# Print shape info
print("Dataset info:-")
shape_info(n_input_samples, num_input_tokens, max_input_seq_length)

import sys
sys.exit()

# Write data to disk
# All
with open(data_dir+'features.txt', 'w', encoding='utf-8') as f:
    for seq in seqs:
        f.write(seq + '\n')
with open(data_dir+'labels.txt', 'w', encoding='utf-8') as f:
    for lbl in labels:
        f.write(str(lbl) + '\n')
with open(data_dir+'data_object.pkl', 'wb') as f:
    pickle.dump(do, f)
print("==============")
print("Dataset has been written to disk")
