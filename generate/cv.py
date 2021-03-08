from keras.callbacks import ModelCheckpoint
from keras.models import Model, load_model
from keras.backend import clear_session
import numpy as np
import datetime
import pickle
import os
from sklearn.model_selection import KFold
import sys
sys.path.append('/home/aziz/experiments/problems/tech_debt/')
from support_functions import DataObject, data_shapes, shape_info, token_integer_mapping, prepare_model_data, \
    replace_unseen, build_generator, results, send_email, translate_corpus, calculate_bleu, positive_only, tokenize



batch_size = 90    # Batch size for training.
epochs = 50        # Number of epochs to train for.
num_layers = 2     # Number of model layers
latent_dim = 512  # Latent dimensionality of the encoding space.

data_dir = '/home/aziz/experiments/gpu_data_packup/data/satd/comgen_bm/bm_exp_ready/'
results_dir = '/home/aziz/experiments/gpu_data_packup/output/satd/bm_exp/'
trained_models_dir = '/home/aziz/experiments/gpu_data_packup/trained_models/satd/bm_exp/'

# Get data
with open(data_dir+'dataset.pkl', 'rb') as f:  # train_set
    pos_neg_cv_set = pickle.load(f)
with open(data_dir+'tune_val/dataset.pkl', 'rb') as f:  # val_set
    pos_neg_tune_set = pickle.load(f)

# Train only on TD data
cv_set = positive_only(pos_neg_cv_set)
tune_set = positive_only(pos_neg_tune_set)

num_encoder_tokens_cv, num_decoder_tokens_cv, max_encoder_seq_length_cv, max_decoder_seq_length_cv, n_input_samples_cv = \
    data_shapes(cv_set)
num_encoder_tokens_tune, num_decoder_tokens_tune, max_encoder_seq_length_tune, max_decoder_seq_length_tune, n_input_samples_tune = \
    data_shapes(tune_set)
print("================")
print("CV set info:-")
shape_info(n_input_samples_cv, num_encoder_tokens_cv, num_decoder_tokens_cv, max_encoder_seq_length_cv, max_decoder_seq_length_cv)
print("================")
print("Tune set info:-")
shape_info(n_input_samples_tune, num_encoder_tokens_tune, num_decoder_tokens_tune, max_encoder_seq_length_tune, max_decoder_seq_length_tune)

print("================")
print("Batch size:", batch_size)
print("Number of model layers:", num_layers)
print("Embedding dimensionality:", latent_dim)

# print("================")
# print("Real # unique input tokens:", len(set(tokenize(cv_set.input_lists) + tokenize(tune_set.input_lists))))
# print("Real # unique comment words:", len(set(tokenize(cv_set.comment_lists) + tokenize(tune_set.comment_lists))))

# sys.exit()

name_info = "emb" + str(latent_dim) + "_b" + str(batch_size) + "_" + str(num_layers) + "l"  # Model name to be saved
# Make train-models directories
# if not os.path.exists(trained_models_dir+name_info):
    # for i in range(1, 11):
    #     os.makedirs(trained_models_dir+name_info+"/fold"+str(i))

# if not os.path.exists(trained_models_dir):
#     os.makedirs(trained_models_dir)

start_time = datetime.datetime.now().replace(microsecond=0)
print("================")
print("Training started at:", start_time)

kf = KFold(n_splits=10)  # Number of folds
fold = 1
b1s, b2s, b3s, b4s, bs = [], [], [], [], []
for train_index, test_index in kf.split(cv_set.input_lists):
    print("================")
    print("Fold " + str(fold) + ":")
    # Split
    x_train, x_test = cv_set.input_lists[train_index], cv_set.input_lists[test_index]
    y_train, y_test = cv_set.comment_lists[train_index], cv_set.comment_lists[test_index]
    # Add the tuning set to the training set
    x_train = np.concatenate((x_train, tune_set.input_lists))
    y_train = np.concatenate((y_train, tune_set.comment_lists))
    # Tokenization
    train_input_vocab = tokenize(x_train)
    train_output_vocab = tokenize(y_train)
    test_input_vocab = tokenize(x_test)
    test_output_vocab = tokenize(y_test)
    # Convert tokens to integers since the DL model accepts only integers
    input_token_index, target_token_index, reverse_input_token_index, reverse_target_token_index = \
        token_integer_mapping(train_input_vocab, train_output_vocab)
    # Prepare model training data
    train_max_encoder_seq_length = max([len(txt) for txt in x_train])
    train_max_decoder_seq_length = max([len(txt) for txt in y_train])
    encoder_input_train, decoder_input_train, decoder_target_train = prepare_model_data(
        x_train, y_train, input_token_index, target_token_index,
        train_max_encoder_seq_length, train_max_decoder_seq_length, True)
    # Prepare model validation data
    val_input_data = replace_unseen(test_input_vocab, train_input_vocab, x_test)
    val_target_data = replace_unseen(test_output_vocab, train_output_vocab, y_test)
    val_max_encoder_seq_length = max([len(txt) for txt in x_test])
    val_max_decoder_seq_length = max([len(txt) for txt in y_test])
    encoder_input_val, decoder_input_val, decoder_target_val = prepare_model_data(
        val_input_data, val_target_data, input_token_index, target_token_index, val_max_encoder_seq_length,
        val_max_decoder_seq_length, True)
    # Build the model
    encoder_inputs, decoder_inputs, decoder_outputs = build_generator(latent_dim, len(train_input_vocab),
                                                                      len(train_output_vocab), num_layers)
    model = Model([encoder_inputs, decoder_inputs], decoder_outputs)
    model.compile(optimizer='rmsprop', loss='categorical_crossentropy')
    model.summary()

    # Train
    start_time = datetime.datetime.now().replace(microsecond=0)
    print("================")
    print("Training of fold "+str(fold)+" started at:", start_time)
    print("================")
    model_name = "td_gen_cv_" + name_info + "_f" + str(fold)
    model.fit([encoder_input_train, decoder_input_train], decoder_target_train, batch_size=batch_size,
              validation_data=([encoder_input_val, decoder_input_val], decoder_target_val), epochs=epochs)
    # model.save(trained_models_dir + model_name + '.h5')
    end_time = datetime.datetime.now().replace(microsecond=0)
    print("================")
    print("Training of fold "+str(fold)+" completed at:", end_time)
    print("Training of fold "+str(fold)+" took (h:m:s)", end_time - start_time)
    print("================")
    # send_email(model_name + " TRAINING DONE!")

    # Validate
    print("================")
    predicted_lists = translate_corpus(model, encoder_input_val, y_test, val_max_decoder_seq_length,
                                       target_token_index, reverse_target_token_index, results_dir, model_name)
    bleu1, bleu2, bleu3, bleu4, bleu = calculate_bleu(y_test, predicted_lists)
    b1s.append(bleu1)
    b2s.append(bleu2)
    b3s.append(bleu3)
    b4s.append(bleu4)
    bs.append(bleu)
    to_email = "Bleu-1 Score: %.3f" % bleu1 + "\nBleu-2 Score: %.3f" % bleu2 + "\nBleu-3 Score: %.3f" % bleu3 + \
               "\nBleu-4 Score: %.3f" % bleu4 + "\nBleu Score: %.3f" % bleu
    # send_email(model_name + " TESTING DONE!", to_email)

    clear_session()
    fold += 1

# Show average scores
print("================")
print("Average BLEU-1 Score:", "%.3f" % (sum(b1s)/len(b1s)))
print("Average BLEU-2 Score:", "%.3f" % (sum(b2s)/len(b2s)))
print("Average BLEU-3 Score:", "%.3f" % (sum(b3s)/len(b3s)))
print("Average BLEU-4 Score:", "%.3f" % (sum(b4s)/len(b4s)))
print("Average BLEU Score:  ", "%.3f" % (sum(bs)/len(bs)))

