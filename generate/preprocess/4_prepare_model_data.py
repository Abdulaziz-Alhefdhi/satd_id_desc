from collections import Counter
from random import shuffle
from support_functions import retrieve_data, fetch_corrisponding, tokenize_data, DataObject, data_shapes, shape_info
import pickle


data_path = '/home/aziz/experiments/data/td/v2/'  # Path to the data txt files on disk.
num_samples = 1000000  # Number of samples to train on.
# num_samples = 20000  # Number of samples to train on.
max_input_length = 2000  # Number of largest acceptibale input length
max_target_length = 300  # Number of largest acceptibale target length
# max_input_length  = 1000000
# max_target_length = 1000000

# Get data
input_texts, target_texts, input_lists, target_lists = retrieve_data(data_path, num_samples, max_input_length, max_target_length)

# Count data points to avoid leakage in testing dataset
# pair corresponding inputs and targets
comb_pairs = []
for input_text, target_text in zip(input_texts, target_texts):
    comb_pairs.append((input_text, target_text))
# Count
pair_count = Counter(comb_pairs)

# Separate train and test data
one_tenth = int(round(len(input_lists) * 10 / 100))  # 10% for testing
test_full = False
# Put data points appearing only once in testing data until it is full (10% each)
# and put the rest in training
single_train_texts, multi_train_texts, test_texts = [], [], []
for key, value in pair_count.items():
    if value == 1:
        if not test_full:
            test_texts.append(key)
            if len(test_texts) == one_tenth:
                test_full = True
        else:
            single_train_texts.append(key)
    else:
        for i in range(value):
            multi_train_texts.append(key)

# Because the Counter object puts some sort of order to the data, we want to shuffle it again
shuffle(single_train_texts)
shuffle(multi_train_texts)
shuffle(test_texts)
# Combine single and multi train texts together
train_texts = multi_train_texts + single_train_texts

# Prepare train and test data
train_its, train_tts, train_ils, train_tls = \
    fetch_corrisponding(train_texts, comb_pairs, input_texts, target_texts, input_lists, target_lists)
test_its, test_tts, test_ils, test_tls = \
    fetch_corrisponding(test_texts, comb_pairs, input_texts, target_texts, input_lists, target_lists)

# Tokenization
train_input_tokens, train_target_tokens = tokenize_data(train_ils, train_tls)
test_input_tokens, test_target_tokens = tokenize_data(test_ils, test_tls)

# Make train and test data objects
train_do = DataObject(train_its, train_tts, train_ils, train_tls, train_input_tokens, train_target_tokens)
test_do = DataObject(test_its, test_tts, test_ils, test_tls, test_input_tokens, test_target_tokens)

# Get data shapes
num_encoder_tokens_train, num_decoder_tokens_train, max_encoder_seq_length_train, \
max_decoder_seq_length_train, n_input_samples_train = data_shapes(train_do)
num_encoder_tokens_test, num_decoder_tokens_test, max_encoder_seq_length_test, \
max_decoder_seq_length_test, n_input_samples_test = data_shapes(test_do)
# Print shape info
print("================\nTraining data info:-")
shape_info(n_input_samples_train, num_encoder_tokens_train, num_decoder_tokens_train, max_encoder_seq_length_train, max_decoder_seq_length_train)
print("================\nTesting data info:-")
shape_info(n_input_samples_test, num_encoder_tokens_test, num_decoder_tokens_test, max_encoder_seq_length_test, max_decoder_seq_length_test)
print("================")

# Save dataset to disk
# Training data
# input_texts
with open('/home/aziz/experiments/data/td/v2/train/input_texts.txt', 'w', encoding='utf-8') as f:
    for line in train_do.input_texts:
        f.write(line + '\n')
# target_texts
with open('/home/aziz/experiments/data/td/v2/train/target_texts.txt', 'w', encoding='utf-8') as f:
    for line in train_do.target_texts:
        f.write(line + '\n')
# Save the training object
with open('/home/aziz/experiments/data/td/v2/train/data_object.pkl', 'wb') as f:
    pickle.dump(train_do, f)
# Testing data
# input_texts
with open('/home/aziz/experiments/data/td/v2/test/input_texts.txt', 'w', encoding='utf-8') as f:
    for line in test_do.input_texts:
        f.write(line + '\n')
# target_texts
with open('/home/aziz/experiments/data/td/v2/test/target_texts.txt', 'w', encoding='utf-8') as f:
    for line in test_do.target_texts:
        f.write(line + '\n')
# Save the testing object
with open('/home/aziz/experiments/data/td/v2/test/data_object.pkl', 'wb') as f:
    pickle.dump(test_do, f)
print("Training and testing data have been written to disk.")


# Data shapes
# num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length, n_input_samples = data_shapes(do)
# # Print shape info
# print("================\nTraining data info:-")
# shape_info(n_input_samples, num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length)
# print("Batch size:", batch_size)
# print("Embedding dimensionality:", latent_dim)
# print("================")

# Replace unseen-before testing tokens with '<unknown>'
# Find
# unseen_tokens = []
# for token in test_input_tokens:
#     if token not in train_input_tokens:
#         unseen_tokens.append(token)
# # Replace
# for i in range(len(test_ils)):
#     for j in range(len(test_ils[i])):
#         if test_ils[i][j] in unseen_tokens:
#             test_ils[i][j] = "<unknown>"

# c1, c2 = 0, 0
# for a_list in test_do.input_lists:
#     for token in a_list:
#         c1 += 1
#         if token == "<unknown>":
#             c2 += 1
# percentage = c2*100/c1
# print(c1, c2, "%.2f" % percentage+"%")
