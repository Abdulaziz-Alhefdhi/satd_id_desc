data_dir = "/home/aa043/sea/data/td/ours/v2/classify/"

# Retrieve if-statements from disk
with open(data_dir+"plain_neg_codes.txt", 'r', encoding='utf-8') as f:  # Retrieve neg codes
    neg_codes = f.read().split("\n")
neg_codes = neg_codes[:-1]  # Remove last (empty) item
with open(data_dir+"plain_pos_codes.txt", 'r', encoding='utf-8') as f:  # Retrieve pos codes
    pos_codes = f.read().split("\n")
pos_codes = pos_codes[:-1]  # Remove last (empty) item

# Create labels
pos_labels, neg_labels = [], []
for i in range(len(pos_codes)):
    pos_labels.append(1)
for i in range(len(neg_codes)):
    neg_labels.append(0)

# Combine pos. and neg. codes in one list, and same for the labels
features = pos_codes + neg_codes
labels = pos_labels + neg_labels

# Write all features and labels to disk
with open(data_dir+'plain_features.txt', 'w', encoding='utf-8') as f:
    for line in features:
        f.write(line + '\n')
with open(data_dir+'plain_labels.txt', 'w', encoding='utf-8') as f:
    for line in labels:
        f.write(str(line) + '\n')
