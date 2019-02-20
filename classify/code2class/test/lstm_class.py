from utils import DataObject, data_shapes, shape_info, token_integer_mapping
from keras.models import load_model
import numpy as np
import pickle


# Get training data
with open('/home/aziz/experiments/data/td/code2class/v2/train/data_object.pkl', 'rb') as f:
    train_do = pickle.load(f)
# Get testing data
with open('/home/aziz/experiments/data/td/code2class/v2/test/data_object.pkl', 'rb') as f:
    test_do = pickle.load(f)

# Data shapes
num_input_tokens_train, max_input_seq_length_train, n_input_samples_train = data_shapes(train_do)
# Print shape info
print("================\nTraining data info:-")
shape_info(n_input_samples_train, num_input_tokens_train, max_input_seq_length_train)
print("================")
num_input_tokens_test, max_input_seq_length_test, n_input_samples_test = data_shapes(test_do)
print("Testing data info:-")
shape_info(n_input_samples_test, num_input_tokens_test, max_input_seq_length_test)
print("================")

# Count pos & neg samples on both training and testing data
# train_neg_count, test_neg_count, train_pos_count, test_pos_count = 0, 0, 0, 0
# for item in train_do.labels:
#     if item == 0:
#         train_neg_count += 1
#     else:
#         train_pos_count += 1
# for item in test_do.labels:
#     if item == 0:
#         test_neg_count += 1
#     else:
#         test_pos_count += 1

# print("Train Neg # =", train_neg_count)
# print("Train Pos # =", train_pos_count)
# print("Test Neg # =", test_neg_count)
# print("Test Pos # =", test_pos_count)

# import sys
# sys.exit()

# Replace unseen-before tokens with: <unknown>
# # Find
# print('Finding unseen-before test tokens...')
# unseen_tokens = []
# for token in test_do.vocab:
#     if token not in train_do.vocab:
#         unseen_tokens.append(token)
# # Replace
# print('Replacing them with "<unknown>"...')
# for i in range(len(test_do.features)):
#     for j in range(len(test_do.features[i])):
#         if test_do.features[i][j] in unseen_tokens:
#             test_do.features[i][j] = "<unknown>"

# Saving features after replacing unseen tokens with "<unknown>"
# with open('/home/aziz/experiments/data/td/code2class/v2/test/feats_w_unkn.pkl', 'wb') as f:
#     pickle.dump(test_do.features, f)
# print("features with '<unknown>' tokens saved")

# Or, retrieve already-processed features from disk to save time
print("Retrieving features with unseen tokens replaced with '<unknown>' from disk...")
with open('/home/aziz/experiments/data/td/code2class/v2/test/feats_w_unkn.pkl', 'rb') as f:
    test_do.features = pickle.load(f)

# Converting tokens to integers (Neural Networks accept only integers as inputs), and
# reverse-lookup token index to decode sequences back to something readable.
input_token_index, reverse_input_token_index = token_integer_mapping(train_do.vocab)
# Define model's input/output training/testing data
# Training data
# train_model_inputs = np.zeros((n_input_samples_train, max_input_seq_length_train), dtype='int32')
# train_model_outputs = np.array(train_do.labels, dtype='int32')
# for i, feature in enumerate(train_do.features):
#     for t, token in enumerate(feature):
#         train_model_inputs[i, t] = input_token_index[token]
# Testing data
test_model_inputs = np.zeros((n_input_samples_test, max_input_seq_length_test), dtype='int32')
# test_model_outputs = np.array(test_do.labels, dtype='int32')
for i, feature in enumerate(test_do.features):
    for t, token in enumerate(feature):
        test_model_inputs[i, t] = input_token_index[token]
# Test the model
model_name = 'td_pred_512_b64_no_valid-09.hdf5'
model = load_model('/home/aziz/experiments/trained_models/td/classify/v2/'+model_name)
###model = load_model('/home/aziz/experiments/trained_models/td/classify/v2/dim128_b64/'+model_name)
print("model name:", model_name)
model.summary()
predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=len(test_do.labels))
tp, tn, fp, fn = 0, 0, 0, 0
for pred, lbl in zip(predictions, test_do.labels):
    if lbl == 1 and pred[0] == 1:
        tp += 1
    if lbl == 0 and pred[0] == 0:
        tn += 1
    if lbl == 0 and pred[0] == 1:
        fp += 1
    if lbl == 1 and pred[0] == 0:
        fn += 1
print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp+tn+fp+fn)
p, r = tp/(tp+fp), tp/(tp+fn)
f1 = 2*p*r/(p+r)
print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1)
