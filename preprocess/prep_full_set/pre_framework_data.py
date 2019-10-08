import sys
sys.path.append('/home/aziz/experiments/problems/tech_debt/prep_full_set/')
from support_functions import retrieve_data, tokenize, DataObject, data_shapes, shape_info, write_to_disk
from sklearn.model_selection import StratifiedKFold


data_path = '/home/aziz/experiments/data/td/CT/'  # Path to the data txt files on disk.
num_samples = 1000000  # Number of samples to train on.
# num_samples = 5000  # Number of samples to train on.
max_input_length = 1500  # Number of largest acceptibale input length
max_comment_length = 150  # Number of largest acceptibale target length
# max_input_length  = 1000000
# max_comment_length = 1000000

# Get data
inputs_array, labels_array, comments_array, codes_array = \
    retrieve_data(data_path+'raw/', num_samples, max_input_length, max_comment_length)

# Separate tuning set
# skf = StratifiedKFold(n_splits=10)  # ~10% of the data as the tuning set
# for cv_index, tune_index in skf.split(inputs_array, labels_array):
#     inputs_cv, inputs_tune = inputs_array[cv_index], inputs_array[tune_index]
#     labels_cv, labels_tune = labels_array[cv_index], labels_array[tune_index]
#     comments_cv, comments_tune = comments_array[cv_index], comments_array[tune_index]
#     codes_cv, codes_tune = codes_array[cv_index], codes_array[tune_index]
#     break

# Data tokenization
# input_cv_vocab, comment_cv_vocab = tokenize(inputs_cv), tokenize(comments_cv)
# input_tune_vocab, comment_tune_vocab = tokenize(inputs_tune), tokenize(comments_tune)
input_full_vocab, comment_full_vocab = tokenize(inputs_array), tokenize(comments_array)

# Make dataset objects (tuning and rest) to save to disk
# cv_set = DataObject(inputs_cv, labels_cv, comments_cv, codes_cv, input_cv_vocab, comment_cv_vocab)
# tune_set = DataObject(inputs_tune, labels_tune, comments_tune, codes_tune, input_tune_vocab, comment_tune_vocab)
full_set = DataObject(inputs_array, labels_array, comments_array, codes_array, input_full_vocab, comment_full_vocab)

# Get data shapes
# cv_n_encoder_tokens, cv_n_decoder_tokens, cv_max_encoder_seq_length, \
# cv_max_decoder_seq_length, cv_n_samples = data_shapes(cv_set)
# tune_n_encoder_tokens, tune_n_decoder_tokens, tune_max_encoder_seq_length, \
# tune_max_decoder_seq_length, tune_n_samples = data_shapes(tune_set)
full_n_encoder_tokens, full_n_decoder_tokens, full_max_encoder_seq_length, \
full_max_decoder_seq_length, full_n_samples = data_shapes(full_set)
# Print shape info
# print("================\nCV set info:-")
# shape_info(cv_n_samples, cv_n_encoder_tokens, cv_n_decoder_tokens, cv_max_encoder_seq_length, cv_max_decoder_seq_length)
# print("================\nTuning set info:-")
# shape_info(tune_n_samples, tune_n_encoder_tokens, tune_n_decoder_tokens, tune_max_encoder_seq_length, tune_max_decoder_seq_length)
# print("================\nWriting framework-ready data to disk...")
print("================\nFull dataset info:-")
shape_info(full_n_samples, full_n_encoder_tokens, full_n_decoder_tokens,
           full_max_encoder_seq_length, full_max_decoder_seq_length)

# Save data to disk
print("Writing data to disk...")
# write_to_disk(data_path+"framework_ready/", cv_set)  # cv_set
# write_to_disk(data_path+"framework_ready/tune_val/", tune_set)  # tune_set
write_to_disk(data_path, full_set)  # the full dataset
