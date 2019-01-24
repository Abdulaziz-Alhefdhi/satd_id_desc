from random import sample


data_dir = "/home/aa043/sea/data/td/ours/v2/processing/"


def clean_ast_seqs(path):
    # Read from ast_seqs files
    with open(path, 'r', encoding='utf-8') as f:
        ast_seqs = f.read().split("\n")
    ast_seqs = ast_seqs[:-1]  # Remove last (empty) item
    # Clean prefixes
    sub_clean_seqs = []
    for seq in ast_seqs:
        sub_clean_seqs.append(seq.split("(BlockStmt ", 1)[1])
    # Clean suffixes
    clean_seqs = []
    for seq in sub_clean_seqs:
        clean_seqs.append(seq.rsplit(" )BlockStmt", 1)[0])

    return clean_seqs


pos_clean_seqs = clean_ast_seqs(data_dir+"pos_ast_seqs.txt")
neg_clean_seqs = clean_ast_seqs(data_dir+"neg_ast_seqs.txt")

# Create labels
pos_labels, neg_labels = [], []
for i in range(len(pos_clean_seqs)):
    pos_labels.append(1)
for i in range(len(neg_clean_seqs)):
    neg_labels.append(0)

# Data Randomization
# Combine
comb_list = []
for seq, label in zip(pos_clean_seqs, pos_labels):
    comb_list.append([seq, label])
for seq, label in zip(neg_clean_seqs, neg_labels):
    comb_list.append([seq, label])
# Shuffle
shuf_comb_list = sample(comb_list, k=len(comb_list))
# Separate code_seqs and labels
seqs, labels = [], []
for item in shuf_comb_list:
    seqs.append(item[0])
    labels.append(item[1])

# Separate training and testing data
seqs_training   = seqs[:int(len(seqs)*0.9)]
labels_training = labels[:int(len(labels)*0.9)]
seqs_testing    = seqs[int(len(seqs)*0.9):]
labels_testing  = labels[int(len(labels)*0.9):]

# All
with open(data_dir+'features.txt', 'w', encoding='utf-8') as f:
    for line in seqs:
        f.write(line + '\n')
with open(data_dir+'labels.txt', 'w', encoding='utf-8') as f:
    for line in labels:
        f.write(str(line) + '\n')
# Training
with open(data_dir+'train/features.txt', 'w', encoding='utf-8') as f:
    for line in seqs_training:
        f.write(line + '\n')
with open(data_dir+'train/labels.txt', 'w', encoding='utf-8') as f:
    for line in labels_training:
        f.write(str(line) + '\n')
# Testing
with open(data_dir+'test/features.txt', 'w', encoding='utf-8') as f:
    for line in seqs_testing:
        f.write(line + '\n')
with open(data_dir+'test/labels.txt', 'w', encoding='utf-8') as f:
    for line in labels_testing:
        f.write(str(line) + '\n')
