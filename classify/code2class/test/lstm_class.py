from utils import retrieve_texts, data_shapes, shape_info, DataObject, token_integer_mapping, build_model
from keras.models import load_model
import numpy as np
import pickle

batch_size = 64      # Batch size for training.
latent_dim = 128     # Latent dimensionality of the encoding space.
num_samples = 1000000  # Number of samples to train on.
###train_path = '/home/aziz/experiments/data/td/code2class/v2/train/'  # Path to the data txt files on disk.
###test_path = '/home/aziz/experiments/data/td/code2class/v2/test/'
train_path = '/home/aa043/sea/gpu/experiments/data/td/code2class/v2/train/'  # Path to the data txt files on disk.
test_path = '/home/aa043/sea/gpu/experiments/data/td/code2class/v2/test/'
max_input_length = 6000 # Number of largest acceptibale input length

# Get data
seqs, features, vocab, labels = retrieve_texts(train_path, num_samples, max_input_length)
train_do = DataObject(seqs, features, vocab, labels)
# Data shapes
num_input_tokens, max_input_seq_length, n_input_samples = data_shapes(train_do)
# Print shape info
print("================\nTraining data info:-")
shape_info(n_input_samples, num_input_tokens, max_input_seq_length)
print("Batch size:", batch_size)
print("Embedding dimensionality:", latent_dim)
print("================")
seqs, features, vocab, labels = retrieve_texts(test_path, num_samples, max_input_length)
test_do = DataObject(seqs, features, vocab, labels)
test_num_input_tokens, test_max_input_seq_length, test_n_input_samples = data_shapes(test_do)
print("Testing data info:-")
shape_info(test_n_input_samples, test_num_input_tokens, test_max_input_seq_length)
print("================")

# Replace unseen-before tokens with: <unknown>
# Find
print('Finding unseen-before test tokens...')
unseen_tokens = []
for token in test_do.vocab:
    if token not in train_do.vocab:
        unseen_tokens.append(token)
# Replace
print('Replacing them with "<unknown>"...')
for i in range(len(test_do.features)):
    for j in range(len(test_do.features[i])):
        if test_do.features[i][j] in unseen_tokens:
            test_do.features[i][j] = "<unknown>"
# Or, retrieve already-processed features from disk to save time
# print("Retrieving features from disk...")
# with open(test_path+'features.pkl', 'rb') as f:
#     test_do.features = pickle.load(f)
# Convert labels to integers
print("Converting labels from strings to integers...")
for i in range(len(test_do.labels)):
    test_do.labels[i] = int(test_do.labels[i])

# Converting tokens to integers (Neural Networks accept only integers as inputs), and
# reverse-lookup token index to decode sequences back to something readable.
input_token_index, reverse_input_token_index = token_integer_mapping(train_do.vocab)
# Define model's input/output training/testing data
# Training data
model_inputs = np.zeros((n_input_samples, max_input_seq_length), dtype='int32')
model_outputs = np.array(train_do.labels, dtype='int32')
for i, feature in enumerate(train_do.features):
    for t, token in enumerate(feature):
        model_inputs[i, t] = input_token_index[token]
# Testing data
test_model_inputs = np.zeros((test_n_input_samples, test_max_input_seq_length), dtype='int32')
test_model_outputs = np.array(test_do.labels, dtype='int32')
for i, feature in enumerate(test_do.features):
    for t, token in enumerate(feature):
        test_model_inputs[i, t] = input_token_index[token]
# Test the model
model_name = 'td_pred-10.hdf5'
model = load_model('/home/aa043/sea/gpu/experiments/trained_models/td/classify/v2/dim128_b64/'+model_name)
###model = load_model('/home/aziz/experiments/trained_models/td/classify/v2/dim128_b64/'+model_name)
print("model name:", model_name)
model.summary()
predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=batch_size)
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



###model_name = 'td_att_seq_2048-26.hdf5'
###model = load_model('/home/aziz/experiments/trained_models/td/generate/checkpoints/'+model_name)
###print("model name:", model_name)
###checkpointer = ModelCheckpoint(filepath= '/home/aziz/experiments/trained_models/td/generate/checkpoints/td_att_seq_2048-26+{epoch:02d}.hdf5', verbose=1)
###model.save('/home/aa043/sea/trained_models/code2pseudo/reduced_surface/c2p_att_redsurf.h5')
"""
# Print longest input sample
for i in range(len(do.input_lists)):
    if len(do.input_lists[i]) == max_encoder_seq_length:
        print(do.input_texts[i])
        print(len(do.input_texts[i]))
        print(len(do.input_lists[i]))
# Print longest target sample
for i in range(len(do.target_lists)):
    if len(do.target_lists[i]) == max_decoder_seq_length:
        print(do.target_texts[i])
        print(len(do.target_texts[i]))
        print(len(do.target_lists[i]))

# Print percentage of removed data
i = 0
for input_text in do.input_texts:
	if len(input_text) > 6000:
		i += 1
print(i, len(do.input_texts), '%.2f' % (i/len(do.input_texts)*100))

i = 0
for target in do.target_texts:
	if len(target) > 220:
		i += 1
print(i, len(do.target_texts), '%.2f' % (i/len(do.target_texts)*100))
"""

