import sys
sys.path.append('/home/aa043/sea/gpu/experiments/problems/tech_debt/')
from support_functions import retrieve_data, tokenize, DataObject, data_shapes, shape_info, write_to_disk
from sklearn.model_selection import StratifiedKFold
from pathlib import Path
from collections import Counter
from math import ceil
import numpy as np



# data_path = '/home/aa043/sea/data/td/ours/v2/CT/'  # Path to the data txt files on disk.
data_dir = '/home/aa043/sea/gpu/experiments/gpu_data_packup/data/satd/comgen_bm/'  # Path to the data txt files on disk.
cv_folder_name = "bm_exp_ready"
tune_folder_name = "tune_val"
parsed_folder = "parsable"

num_samples = 1000000  # Number of samples to train on.
# num_samples = 5000  # Number of samples to train on.
max_input_length = 1500  # Number of largest acceptibale input length
max_comment_length = 150  # Number of largest acceptibale target length
# max_input_length  = 1000000
# max_comment_length = 1000000

# Get data
inputs_array, labels_array, comments_array, codes_array = \
    retrieve_data(data_dir+parsed_folder+'/', num_samples, max_input_length, max_comment_length)
    # retrieve_data(data_dir, num_samples, max_input_length, max_comment_length)

print("================")
flattened_input, c = [], 0
for inlist in inputs_array:
    for token in inlist:
        flattened_input.append(token)
        c += 1
token_counts = Counter(flattened_input)
print('length of token counter:', len(token_counts))
token_counts = token_counts.most_common()
print('length of most common:', len(token_counts))
print('length of set of flattened:', len(set(flattened_input)))
# test_count = Counter(['a', 'b', 'b', 'b', 'c', 'c'])
# print(test_count.most_common())
# sys.exit()

print('size of bag of words:', len(flattened_input), c)
print('# input lists:', inputs_array.shape)
print('average length of an input list', c/inputs_array.shape[0])
# sys.exit()

terminal_identifiers, non_terminal_tokens = set(), set()
for input_list in inputs_array:
    for i, token in enumerate(input_list):
        if i == 0:
            terminal_identifiers.add(token)
        else:
            if input_list[i-1] == "_":
                terminal_identifiers.add(input_list[i-1])
                terminal_identifiers.add(token)
                # print(input_list[i], input_list[i+1])
                # if i+1 <= len(input_list):
                #     terminal_identifiers.add(input_list[i+1])
            else:
                if token != "_":
                    non_terminal_tokens.add(token)

# print(len(non_terminal_tokens), len(terminal_identifiers), len(non_terminal_tokens) + len(terminal_identifiers))
# print(terminal_identifiers.intersection(non_terminal_tokens))
# sys.exit()

non_terminal_c, terminal_c = [], []
for pair in token_counts:
    if pair[0] in terminal_identifiers:
        terminal_c.append(pair)
    if pair[0] in non_terminal_tokens:
        non_terminal_c.append(pair)

# print(sum([x[1] for x in terminal_c]), sum([x[1] for x in non_terminal_c]),
#       sum([x[1] for x in terminal_c]) + sum([x[1] for x in non_terminal_c]))
# sys.exit()

# print(list(reversed(non_terminal_c)))

most_common_percent = 3.78/100
num_most_common = ceil(len(terminal_identifiers)*most_common_percent)
print("# unique identifiers (terminal tokens):", len(terminal_identifiers), len(terminal_c))
print("# the most common 3.78% identifiers:",
      num_most_common, len(terminal_c)*most_common_percent)
print("# unique non-terminal tokens:", len(non_terminal_tokens), len(non_terminal_c))
print("# unique tokens vs. # unique term and non-term:", len(token_counts), len(terminal_c)+len(non_terminal_c))
print("differece:", (len(terminal_c)+len(non_terminal_c))-len(token_counts))
print("================")
print("Non-terminal vocab:-\n", non_terminal_c)
print("================")

terminal_c_most_common = terminal_c[:num_most_common]



print("Most common terminal vocab:-\n", terminal_c_most_common)
# print(len(terminal_c_most_common))

terminal_identifiers_most_common = {x[0] for x in terminal_c_most_common}
print("Most common terminal vocab size:", len(terminal_c_most_common), len(terminal_identifiers_most_common))
print("Most common terminal + non-terminal size =", len(terminal_identifiers_most_common.union(non_terminal_tokens)))
print("================")
# print("Most common terminal vocab:-\n", terminal_identifiers_most_common)
# print(len(terminal_identifiers_most_common))
# print("================")
# print(non_terminal_tokens)
# print(len(non_terminal_tokens), type(non_terminal_tokens))

# sys.exit()

input_lists_only_common, c = [], 0
for input_list in inputs_array:
    input_list_only_common = []
    for i, token in enumerate(input_list):
        if i == 0:
            input_list_only_common.append(token)
        else:
            if input_list[i-1] == "_":
                if token in terminal_identifiers_most_common:
                    input_list_only_common.append(input_list[i-1])
                    input_list_only_common.append(token)
                    # terminal_identifiers.add(token)
                # print(input_list[i], input_list[i+1])
                # if i+1 <= len(input_list):
                #     terminal_identifiers.add(input_list[i+1])
            else:
                if token != "_":
                    input_list_only_common.append(token)
    input_lists_only_common.append(input_list_only_common)
    # if input_list != input_list_only_common:
    #     c += 1
    #     print(' '.join(input_list))
    #     print('++++++')
    #     print(' '.join(input_list_only_common))
    #     print(c)
    #     print("================")

# for item1, item2 in zip(input_lists_only_common, inputs_array):
#     if len(item1) == len(item2):
#         print(len(item1), len(item2))
# print(len(input_lists_only_common), inputs_array.shape)

inputs_array = np.array(input_lists_only_common)
# for item1, item2 in zip(inputs_array, input_array):
#     print(' '.join(item1))
#     print('+++++')
#     print(' '.join(item2))
#     print(item1)
    # print(len(item1))
    # print('+++++')
    # print(item2)
    # print(len(item2))
    # print("================")
# print(inputs_array)

# sys.exit()

# Separate tuning set
skf = StratifiedKFold(n_splits=10)  # ~10% of the data as the tuning set
for cv_index, tune_index in skf.split(inputs_array, labels_array):
    inputs_cv, inputs_tune = inputs_array[cv_index], inputs_array[tune_index]
    labels_cv, labels_tune = labels_array[cv_index], labels_array[tune_index]
    comments_cv, comments_tune = comments_array[cv_index], comments_array[tune_index]
    codes_cv, codes_tune = codes_array[cv_index], codes_array[tune_index]
    break

# Data tokenization
input_cv_vocab, comment_cv_vocab = tokenize(inputs_cv), tokenize(comments_cv)
input_tune_vocab, comment_tune_vocab = tokenize(inputs_tune), tokenize(comments_tune)

# Make dataset objects (tuning and rest) to save to disk
cv_set = DataObject(inputs_cv, labels_cv, comments_cv, codes_cv, input_cv_vocab, comment_cv_vocab)
tune_set = DataObject(inputs_tune, labels_tune, comments_tune, codes_tune, input_tune_vocab, comment_tune_vocab)
print("total vocab size with '<unknown>':", len(set(cv_set.input_vocab+tune_set.input_vocab)))
print("cv vocab size (with '<unknown>'):", len(cv_set.input_vocab))
print("tune vocab size (with '<unknown>'):", len(tune_set.input_vocab))
# print(len(token_counts), len(terminal_c), len(non_terminal_c), len(terminal_c)+len(non_terminal_c))
# sys.exit()
# Get data shapes
cv_n_encoder_tokens, cv_n_decoder_tokens, cv_max_encoder_seq_length, \
cv_max_decoder_seq_length, cv_n_samples = data_shapes(cv_set)
tune_n_encoder_tokens, tune_n_decoder_tokens, tune_max_encoder_seq_length, \
tune_max_decoder_seq_length, tune_n_samples = data_shapes(tune_set)
# Print shape info
print("================\nCV set info:-")
shape_info(cv_n_samples, cv_n_encoder_tokens, cv_n_decoder_tokens, cv_max_encoder_seq_length, cv_max_decoder_seq_length)
print("================\nTuning set info:-")
shape_info(tune_n_samples, tune_n_encoder_tokens, tune_n_decoder_tokens, tune_max_encoder_seq_length, tune_max_decoder_seq_length)

# sys.exit()

c = 0
for comment in cv_set.comment_lists:
    if len(comment) == cv_max_decoder_seq_length:
        c += 1
        print(' '.join(comment[1:-1]))
        print("++++++++++")
for comment in tune_set.comment_lists:
    if len(comment) == tune_max_decoder_seq_length:
        c += 1
        print(' '.join(comment[1:-1]))
        print("----------")
print(c)
print("================")

c = 0
for code in cv_set.input_lists:
    if len(code) == cv_max_encoder_seq_length:
        c += 1
        print(" ".join(code))
        print("++++++++++")
for code in tune_set.input_lists:
    if len(code) == tune_max_encoder_seq_length:
        c += 1
        print(" ".join(code))
        print("----------")
print(c)
# sys.exit()

print("================\nWriting framework-ready data to disk...")
# Create Framework-ready data dir
Path(data_dir+cv_folder_name+"/"+tune_folder_name).mkdir(parents=True, exist_ok=True)
# Save data to disk
write_to_disk(data_dir+cv_folder_name+"/", cv_set)  # cv_set
write_to_disk(data_dir+cv_folder_name+"/"+tune_folder_name+"/", tune_set)  # tune_set

print("Data have been written to disk.")
