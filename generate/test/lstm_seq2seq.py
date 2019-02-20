from keras.models import load_model
from support_functions import DataObject, data_shapes, shape_info, token_integer_mapping, decode_sequence
import numpy as np
from tqdm import tqdm
import pickle


# Get training data
with open('/home/aziz/experiments/data/td/v2/train/data_object.pkl', 'rb') as f:
    train_do = pickle.load(f)
# Get testing data
with open('/home/aziz/experiments/data/td/v2/test/data_object.pkl', 'rb') as f:
    test_do = pickle.load(f)
# Data shapes
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

# Replace unseen-before tokens with: <unknown>
# Find
###i, j = 0, 0
unseen_tokens = []
for token in test_do.input_tokens:
    ###i += 1
    if token not in train_do.input_tokens:
        ###j += 1
        unseen_tokens.append(token)
###print("================")
###print(i, j, str(j/i*100)+"%")
# Replace
for i in range(len(test_do.input_lists)):
    for j in range(len(test_do.input_lists[i])):
        if test_do.input_lists[i][j] in unseen_tokens:
            test_do.input_lists[i][j] = "<unknown>"

# Converting tokens to integers (Neural Networks accept only integers as inputs), and
# reverse-lookup token index to decode sequences back to something readable.
###input_token_index, _, reverse_input_token_index, _ = token_integer_mapping(test_do)
input_token_index, target_token_index, reverse_input_token_index, reverse_target_token_index = \
    token_integer_mapping(train_do.input_tokens, train_do.target_tokens)
    ###token_integer_mapping(test_do.input_tokens, test_do.target_tokens)


# Load the trained model
###model_path = '/home/aa043/sea/trained_models/td/generate/td_att_seq_2048-24.hdf5'
model_path = '/home/aziz/experiments/trained_models/td/generate/v2/td_att_seq_dim2048_b16-20.hdf5'
print("model path:", model_path)
model = load_model(model_path)
model.summary()
print("================")

###sample_limit = 10
sample_limit = n_input_samples_test
# Prepare input samples to be decoded
encoder_input_data = np.zeros((sample_limit, max_encoder_seq_length_test), dtype='int32')
# Fill up encoder_input_data with testing data
j = 0
for i, input_list in enumerate(test_do.input_lists):
    j += 1
    if j > sample_limit:
        break
    for t, token in enumerate(input_list):
        encoder_input_data[i, t] = input_token_index[token]

# Test samples from the beginning of the testing dataset
###for seq_index in range(n_input_samples_train):
c = 1
predicted_lists = []

for seq_index in tqdm(range(sample_limit)):
    # Take one sequence (part of the testing set) for trying out decoding.
    input_seq = encoder_input_data[seq_index:seq_index+1]
    decoded_sentence = decode_sequence(input_seq, model, max_decoder_seq_length_test, target_token_index, reverse_target_token_index)
    predicted_lists.append(decoded_sentence)
    print_deocded = ''
    for token in decoded_sentence:
        print_deocded += token + ' '
    print_target = ''
    for i, token in enumerate(test_do.target_lists[seq_index]):
        if 0 < i and i < len(test_do.target_lists[seq_index])-1:  # Don't print "<sos>" and "<eos>"
            print_target += token + ' '
    # Write output to file
    ###with open("/home/aa043/sea/output/td/generate/testing_output.txt", "a", encoding='utf-8') as f:
    with open("/home/aziz/experiments/output/td/generate/v2/test/testing_output_dim2048_b16_e20.txt", "a", encoding='utf-8') as f:
        ###f.write(str(c) + '.a) Input sentence:   ' + test_do.input_texts[seq_index] + "\n")
        f.write(str(c) + '. Target sentence:  ' + print_target + "\n")
        f.write(str(c) + '. Decoded sentence: ' + print_deocded + "\n-\n")
    c += 1

# Save predicted lists to disk for result evaluation
###with open('/home/aa043/sea/output/td/generate/predicted_lists.pkl', 'wb') as f:
with open('/home/aziz/experiments/output/td/generate/v2/test/predicted_lists_dim2048_b16_e20.pkl', 'wb') as f:
    pickle.dump(predicted_lists, f)
print("Predicted lists saved to disk in binary mode")

