from random import sample


# Read ast_seqs and create labels
with open('/home/aa043/sea/data/td/ours/processing/clean_ast_seqs.txt', 'r', encoding='utf-8') as f:
    pos_lines = f.read().split("\n")
    pos_lines = pos_lines[:-1]
with open('/home/aa043/sea/data/td/ours/processing/neg_clean_ast_seqs.txt', 'r', encoding='utf-8') as f:
    neg_lines = f.read().split("\n")
    neg_lines = neg_lines[:-1]
pos_labels, neg_labels = [], []
for i in range(len(pos_lines)):
    pos_labels.append(1)
for i in range(len(neg_lines)):
    neg_labels.append(0)

# Randomize
comb_list = []
for seq, label in zip(pos_lines, pos_labels):
    comb_list.append([seq, label])
for seq, label in zip(neg_lines, neg_labels):
    comb_list.append([seq, label])
shuf_comb_list = sample(comb_list, k=len(comb_list))
seqs, labels = [], []
for item in shuf_comb_list:
    seqs.append(item[0])
    labels.append(item[1])

# Separate training and testing data
seqs_training   = seqs[:int(len(seqs)*0.9)]
seqs_testing    = seqs[int(len(seqs)*0.9):]
labels_training = labels[:int(len(labels)*0.9)]
labels_testing  = labels[int(len(labels)*0.9):]
# Write files
with open('/home/aa043/sea/data/td/ours/processing/features.txt', 'w', encoding='utf-8') as f:
    for line in seqs:
        f.write(line + '\n')
with open('/home/aa043/sea/data/td/ours/processing/labels.txt', 'w', encoding='utf-8') as f:
    for line in labels:
        f.write(str(line) + '\n')
with open('/home/aa043/sea/data/td/ours/processing/train/features.txt', 'w', encoding='utf-8') as f:
    for line in seqs_training:
        f.write(line + '\n')
with open('/home/aa043/sea/data/td/ours/processing/test/features.txt', 'w', encoding='utf-8') as f:
    for line in seqs_testing:
        f.write(line + '\n')
with open('/home/aa043/sea/data/td/ours/processing/train/labels.txt', 'w', encoding='utf-8') as f:
    for line in labels_training:
        f.write(str(line) + '\n')
with open('/home/aa043/sea/data/td/ours/processing/test/labels.txt', 'w', encoding='utf-8') as f:
    for line in labels_testing:
        f.write(str(line) + '\n')
