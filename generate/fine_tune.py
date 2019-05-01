from keras.callbacks import ModelCheckpoint
from keras.models import Model, load_model
from keras.backend import clear_session
import numpy as np
import datetime
import pickle
import os
import sys
sys.path.append('/home/aziz/experiments/problems/tech_debt/')
from support_functions import DataObject, data_shapes, shape_info, token_integer_mapping, \
    prepare_model_data, replace_unseen, build_generator, results, send_email, translate_corpus, calculate_bleu



batch_size = [64]   # Batch size for training.
epochs = 30       # Number of epochs to train for.
num_layers = [1]    # Number of model layers
latent_dim = [512]   # Latent dimensionality of the encoding space.
test_es = [28, 21, 16, 5]

# Final experimental settings
exp_sets = [(64, 256, 1), (32, 256, 2), (32, 256, 3), (8, 16, 2), (8, 16, 3), (16, 64, 2), (16, 64, 3)]

data_dir    = '/home/aziz/experiments/data/td/CT/'
# results_dir = '/home/aa043/sea/gpu/experiments/output/td/generate/tune/'
trained_models_dir = "/home/aziz/experiments/trained_models/td/generate/CT/tune/"

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
encoder_input_train, decoder_input_train, decoder_target_train = prepare_model_data(
    train_set.input_lists, train_set.comment_lists, input_token_index, target_token_index, train_max_encoder_seq_length, train_max_decoder_seq_length)

# Prepare model validation data
val_input_data = replace_unseen(val_set.input_vocab, train_set.input_vocab, val_set.input_lists)
val_target_data = replace_unseen(val_set.comment_vocab, train_set.comment_vocab, val_set.comment_lists)
encoder_input_val, decoder_input_val, decoder_target_val = prepare_model_data(
    val_input_data, val_target_data, input_token_index, target_token_index, val_max_encoder_seq_length, val_max_decoder_seq_length)

test = False  # Train or test?
if not test:
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
                encoder_inputs, decoder_inputs, decoder_outputs = build_generator(dim, train_num_encoder_tokens, train_num_decoder_tokens, nl)
                model = Model([encoder_inputs, decoder_inputs], decoder_outputs)
                model.compile(optimizer='rmsprop', loss='categorical_crossentropy')
                model.summary()

                start_time = datetime.datetime.now().replace(microsecond=0)
                print("================")
                print("Training started at:", start_time)
                print("================")

                # Make trained-models directory
                name_info = "emb"+str(dim)+"_b"+str(b)+"_"+str(nl)+"l"
                if not os.path.exists(trained_models_dir+name_info):
                    os.makedirs(trained_models_dir+name_info+"/")

                # Train the model by going through the data 'epochs' times
                model_name = "td_gen_ft_" + name_info
                checkpoint = ModelCheckpoint(filepath=trained_models_dir+name_info+"/"+model_name+"_e{epoch:02d}.hdf5", verbose=1)
                model.fit([encoder_input_train, decoder_input_train], decoder_target_train, batch_size=b, callbacks=[checkpoint],
                          validation_data=([encoder_input_val, decoder_input_val], decoder_target_val), epochs=epochs)

                end_time = datetime.datetime.now().replace(microsecond=0)
                print("================")
                print("Training completed at:", end_time)
                print("Training took (h:m:s)", end_time-start_time)
                print("================")
                send_email(name_info+" TRAINING DONE!")
                clear_session()

else:
    for dim in latent_dim:
        for nl in num_layers:
            for b in batch_size:
                for e in test_es:
                    print("================\nBatch size:", b)
                    print("Number of model layers:", nl)
                    print("Embedding dimensionality:", dim)
                    print("Epoch:", e)
                    print("================")
                    folder_name = "emb"+str(dim)+"_b"+str(b)+"_"+str(nl)+"l"
                    model_name = "td_gen_ft_"+folder_name+"_e"+"%02d" % e+".hdf5"
                    model_path = trained_models_dir + folder_name + "/" + model_name

                    # Load model from disk
                    model = load_model(model_path)
                    model.summary()

                    predicted_lists = translate_corpus(model, encoder_input_val, val_set.comment_lists, val_max_decoder_seq_length,
                                                       target_token_index, reverse_target_token_index, model_name)
                    bleu1, bleu2, bleu3, bleu4, bleu = calculate_bleu(val_set.comment_lists, predicted_lists)

                    to_email = "Bleu-1 Score: %.3f" % bleu1 + "\nBleu-2 Score: %.3f" % bleu2 + \
                               "\nBleu-3 Score: %.3f" % bleu3 + "\nBleu-4 Score: %.3f" % bleu4 + \
                               "\nBleu Score: %.3f" % bleu

                    send_email(model_name + " TESTING DONE!", to_email)

    # epoch_scores[i] = (bleu1, bleu2, bleu3, bleu4, bleu)
    #
    # # Best 3 performing epochs
    # print("Highest 3 Bleu scores:-")
    # to_email = "Highest 3 Bleu scores:-\n"
    # max_3_bleus = sorted(list(epoch_scores.values()), reverse=True)[:3]
    # for score in max_3_bleus:
    #     for key, value in epoch_scores.items():
    #         if value[4] == score:
    #             to_print = "Epoch '"+str(key)+"' has the following scores:-\nBleu-1: %.3f"%value[0]+" Bleu-2: %.3f"%value[1]+" Bleu-3: %.3f"%value[2]+" Bleu-4: %.3f"%value[3]+" Bleu Score: %.3f"%value[4]
    #             print(to_print)
    #             to_email += to_print+'\n'