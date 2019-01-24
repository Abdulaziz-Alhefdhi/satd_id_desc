from utils import retrieve_texts, data_shapes, shape_info, DataObject, token_integer_mapping, build_model, write_to_file
from keras.models import Model
###from keras import optimizers
from keras.callbacks import ModelCheckpoint
import numpy as np
import datetime
from keras.models import load_model


batch_size = 64           # Batch size for training.
epochs = 10                # Number of epochs to train for.
latent_dim = 128           # Latent dimensionality of the encoding space.
max_num_samples = 1000000  # Number of samples to train on.
data_dir = '/home/aziz/experiments/data/td/code2class/v2/train/'  # Path to the data txt files on disk.
###max_input_length = 1000000
###epochs = 4
###max_num_samples = 20000  # Number of samples to train on.
###data_path = '/home/aa043/sea/gpu/experiments/data/td/train/'  # Path to the data txt files on disk.
# Maximum length for inputs and outputs (in terms of characters, not tokens)
max_input_length = 6000  # Number of largest acceptable input length

# Get data
seqs, features, vocab, labels = retrieve_texts(data_dir, max_num_samples, max_input_length)
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
checkpointer = ModelCheckpoint(filepath= '/home/aziz/experiments/trained_models/td/classify/v2/dim128_b64/td_pred-{epoch:02d}.hdf5', verbose=1)
model.fit(model_inputs, model_outputs, batch_size=batch_size, epochs=epochs, callbacks=[checkpointer], validation_split=0.1)
###model.save('/home/aziz/experiments/trained_models/td/classify/v2/td_pred_dim256_b256.h5')
print("================")
print("Training completed at:", datetime.datetime.now())