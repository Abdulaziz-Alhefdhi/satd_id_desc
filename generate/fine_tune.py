from keras.callbacks import ModelCheckpoint
from keras.backend import clear_session
import numpy as np
import datetime
import pickle
import os
import sys
sys.path.append('/home/aa043/sea/problems/tech_debt/')
from support_functions import DataObject, data_shapes, shape_info, token_integer_mapping, \
    prepare_model_data, replace_unseen, build_generator, results, send_email, translate


batch_size = [16]   # Batch size for training.
epochs = 30       # Number of epochs to train for.
num_layers = [1]    # Number of model layers
latent_dim = [1024]   # Latent dimensionality of the encoding space.

# Final experimental settings
exp_sets = [(64, 256, 1), (32, 256, 2), (32, 256, 3), (8, 16, 2), (8, 16, 3), (16, 64, 2), (16, 64, 3)]

data_dir    = '/home/aa043/sea/gpu/experiments/data/td/CT/'
results_dir = '/home/aa043/sea/gpu/experiments/output/td/generate/tune/'
trained_models_dir = "/home/aa043/sea/gpu/experiments/trained_models/td/generate/CT/tune/"

# Get data
with open(data_dir+'dataset.pkl', 'rb') as f:  # train_set
    train_set = pickle.load(f)
with open(data_dir+'tune_val/dataset.pkl', 'rb') as f:  # val_set
    val_set = pickle.load(f)

# Data shapes
train_num_encoder_tokens, train_num_decoder_tokens, train_max_encoder_seq_length, \
train_max_decoder_seq_length, train_n_input_samples = data_shapes(train_set)
val_num_encoder_tokens, val_num_decoder_tokens, val_max_encoder_seq_length, \
val_max_decoder_seq_length, val_n_input_samples = data_shapes(val_set)
# Print shape info
print("================\nTraining set info:-")
shape_info(train_n_input_samples, train_num_encoder_tokens, train_num_decoder_tokens,
           train_max_encoder_seq_length, train_max_decoder_seq_length)
print("================\nValidation set info:-")
shape_info(val_n_input_samples, val_num_encoder_tokens, val_num_decoder_tokens,
           val_max_encoder_seq_length, val_max_decoder_seq_length)

# Convert tokens to integers since the DL model accepts only integers
input_token_index, target_token_index, reverse_input_token_index, reverse_target_token_index = \
    token_integer_mapping(train_set.input_vocab, train_set.comment_vocab)

# Prepare model training data
encoder_input_data, decoder_input_data, decoder_target_data = prepare_model_data(
    train_set.input_lists, train_set.comment_lists, input_token_index, target_token_index, train_max_encoder_seq_length, train_max_decoder_seq_length)

# Prepare model validation data
val_input_data = replace_unseen(val_set.input_vocab, train_set.input_vocab, val_set.input_lists)
val_model_inputs = prepare_model_data(val_input_data, input_token_index, val_max_encoder_seq_length, test=True)

print(len(val_model_inputs), val_n_input_samples)
sys.exit()

# Training nested loops
for dim in latent_dim:
    for nl in num_layers:
        for b in batch_size:
# for setting in exp_sets:
#     dim = setting[0]
#     b = setting[1]
#     nl = setting[2]
    # Print hyper-parameter info
            print("================\nBatch size:", b)
            print("Number of model layers:", nl)
            print("Embedding dimensionality:", dim)
            print("================")

            # Build, train, and validate the model
            model = build_generator(dim, train_num_encoder_tokens, train_num_decoder_tokens, nl)
            model.summary()

            start_time = datetime.datetime.now().replace(microsecond=0)
            print("================")
            print("Training started at:", start_time)
            print("================")

            # Make trained-models directory
            name_info = "emb"+str(dim)+"_b"+str(b)+"_"+str(nl)+"l"
            # if not os.path.exists(trained_models_dir+name_info):
            #     os.makedirs(trained_models_dir+name_info+"/")

            # Train the model by going through the data 'epochs' times
            epoch_scores, f1s = {}, []
            for i in range(1, epochs+1):
                print("Epoch", i, "of", str(epochs)+":")
                # model_name = "td_pred_ft_"+name_info+"_e"+str(i)+".hdf5"
                # checkpoint = ModelCheckpoint(filepath=trained_models_dir+name_info+"/"+model_name, verbose=1)
                model.fit([encoder_input_data, decoder_input_data], decoder_target_data, batch_size=b)
                print("================\nValidation step:-")
                predicted_lists = translate(val_n_input_samples)
                epoch_scores[i] = (p, r, f1, acc)
                f1s.append(f1)

            print("Highest 3 F1-scores:-")
            to_email = "Highest 3 F1-scores:-\n"
            max_3_f1s = sorted(f1s, reverse=True)[:3]
            for f1 in max_3_f1s:
                for key, value in epoch_scores.items():
                    if value[2] == f1:
                        to_print = "Epoch '"+str(key)+"' has the following scores:-\nP: %.3f"%value[0]+" R: %.3f"%value[1]+" F1: %.3f"%value[2]+" Acc: %.3f"%value[3]
                        print(to_print)
                        to_email += to_print+'\n'

            end_time = datetime.datetime.now().replace(microsecond=0)
            print("================")
            print("Training completed at:", end_time)
            print("Training took (h:m:s)", end_time-start_time)
            print("================")

            send_email(name_info+" TRAINING DONE!", to_email)
            clear_session()

