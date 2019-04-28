from support_functions import data_shapes, shape_info, DataObject, token_integer_mapping, build_model
from keras.models import Model
from keras.callbacks import ModelCheckpoint
import numpy as np
import datetime
import pickle


batch_size = 16      # Batch size for training.
epochs = 30          # Number of epochs to train for.
# epochs = 4
latent_dim = 1024     # Latent dimensionality of the encoding space.

# Get data
with open('/home/aziz/experiments/data/td/v2/train/data_object.pkl', 'rb') as f:
    do = pickle.load(f)

# Data shapes
num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length, n_input_samples = data_shapes(do)
# Print shape info
print("================\nTraining data info:-")
shape_info(n_input_samples, num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length)
print("Batch size:", batch_size)
print("Embedding dimensionality:", latent_dim)
print("================")

# Converting tokens to integers (Neural Networks accept only integers as inputs), and
# reverse-lookup token index to decode sequences back to something readable.
input_token_index, target_token_index, reverse_input_token_index, reverse_target_token_index = \
    token_integer_mapping(do.input_tokens, do.target_tokens)

# Define model's input & output data and initialize them with zeros
encoder_input_data = np.zeros((n_input_samples, max_encoder_seq_length), dtype='int32')
decoder_input_data = np.zeros((n_input_samples, max_decoder_seq_length), dtype='int32')
decoder_target_data = np.zeros((n_input_samples, max_decoder_seq_length, num_decoder_tokens), dtype='float32')

# fill input data & one-hot encode targets
# Loop samples
for i, (input_list, target_list) in enumerate(zip(do.input_lists, do.target_lists)):
    # Loop input sequences
    for t, token in enumerate(input_list):
        encoder_input_data[i, t] = input_token_index[token]
    # Loop target sequences
    for t, token in enumerate(target_list):
        # decoder_target_data is ahead of decoder_input_data by one time step
        decoder_input_data[i, t] = target_token_index[token]
        if t > 0:
            # decoder_target_data will be ahead by one time step and will not include the start character. Initial value altered.
            decoder_target_data[i, t-1, target_token_index[token]] = 1.

# Build the encoder-decoder model
encoder_inputs, decoder_inputs, decoder_outputs = build_model(latent_dim, num_encoder_tokens, num_decoder_tokens)
model = Model([encoder_inputs, decoder_inputs], decoder_outputs)
###model_name = 'td_att_seq_2048-26.hdf5'
###model = load_model('/home/aziz/experiments/trained_models/td/generate/checkpoints/'+model_name)
###print("model name:", model_name)
# Compile & run training
model.compile(optimizer='rmsprop', loss='categorical_crossentropy', metrics=['acc'])
# Save model after each epoch
checkpointer = ModelCheckpoint(filepath= '/home/aziz/experiments/trained_models/td/generate/v2/td_att_seq_dim2048_b16-{epoch:02d}.hdf5', verbose=1)
###checkpointer = ModelCheckpoint(filepath= '/home/aziz/experiments/trained_models/td/generate/checkpoints/td_att_seq_2048-26+{epoch:02d}.hdf5', verbose=1)
summary = model.summary()
print("Training started at:", datetime.datetime.now())
print("================")
# Note that 'decoder_target_data' needs to be one-hot encoded, rather than sequences of integers like 'decoder_input_data'!
model.fit([encoder_input_data, decoder_input_data], decoder_target_data, batch_size=batch_size, epochs=epochs,
          callbacks=[checkpointer], validation_split=0.1)
###model.fit([encoder_input_data, decoder_input_data], decoder_target_data, batch_size=batch_size, epochs=epochs, callbacks=[checkpointer])
# Save model
###model.save('/home/aziz/experiments/trained_models/td/generate/td_att_seq_2048.h5')
###model.save('/home/aa043/sea/trained_models/code2pseudo/reduced_surface/c2p_att_redsurf.h5')
print("================")
print("Training completed at:", datetime.datetime.now())

