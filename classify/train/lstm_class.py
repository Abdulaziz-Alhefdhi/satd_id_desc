from utils import retrieve_texts, data_shapes, shape_info, DataObject, token_integer_mapping, build_model
from keras.models import Model
###from keras import optimizers
from keras.callbacks import ModelCheckpoint
import numpy as np
import datetime
from keras.models import load_model


batch_size = 256      # Batch size for training.
epochs = 10          # Number of epochs to train for.
latent_dim = 1024     # Latent dimensionality of the encoding space.
num_samples = 1000000  # Number of samples to train on.
train_path = '/home/aziz/experiments/data/td/processing/train/'  # Path to the data txt files on disk.
test_path = '/home/aziz/experiments/data/td/processing/test/'
###max_input_length = 1000000
###epochs = 4
###num_samples = 20000  # Number of samples to train on.
###data_path = '/home/aa043/sea/gpu/experiments/data/td/train/'  # Path to the data txt files on disk.
# Maximum length for inputs and outputs (in terms of characters, not tokens)
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

# Build, train, and test the model
model = build_model(latent_dim, num_input_tokens)
model.summary()
print("Training started at:", datetime.datetime.now())
print("================")
checkpointer = ModelCheckpoint(filepath= '/home/aziz/experiments/trained_models/td/classify/dim1024_b256/td_pred_512-{epoch:02d}.hdf5', verbose=1)
model.fit(model_inputs, model_outputs, batch_size=batch_size, epochs=epochs, callbacks=[checkpointer], validation_split=0.1)
model.save('/home/aziz/experiments/trained_models/td/classify/td_pred_512.h5')
print("================")
print("Training completed at:", datetime.datetime.now())




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

