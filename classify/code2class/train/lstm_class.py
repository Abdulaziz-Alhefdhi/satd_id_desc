from utils import DataObject, data_shapes, shape_info, token_integer_mapping, build_model
from keras.callbacks import ModelCheckpoint
import numpy as np
import datetime
import pickle


batch_size = 64   # Batch size for training.
epochs = 15       # Number of epochs to train for.
# epochs = 4
latent_dim = 512  # Latent dimensionality of the encoding space.

# Get data
with open('/home/aziz/experiments/data/td/code2class/v2/train/data_object.pkl', 'rb') as f:
    train_do = pickle.load(f)
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
checkpointer = ModelCheckpoint(filepath= '/home/aziz/experiments/trained_models/td/classify/v2/td_pred_512_b64_no_valid-{epoch:02d}.hdf5', verbose=1)
model.fit(model_inputs, model_outputs, batch_size=batch_size, epochs=epochs, callbacks=[checkpointer])
###model.save('/home/aziz/experiments/trained_models/td/classify/v2/td_pred_dim256_b256.h5')
print("================")
print("Training completed at:", datetime.datetime.now())
