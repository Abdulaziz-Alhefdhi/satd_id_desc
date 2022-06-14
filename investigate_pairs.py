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



batch_size = 64    # Batch size for training.
epochs = 40        # Number of epochs to train for.
num_layers = 1     # Number of model layers
latent_dim = 1024  # Latent dimensionality of the encoding space.
num_cands = 10      # Number of candidate comments to generate for every testing code

data_dir = '/home/aziz/experiments/gpu_data_packup/data/satd/comgen_bm/framework_ready/'
results_dir = '/home/aziz/experiments/gpu_data_packup/output/satd/beam_exps/beam10_engdict/'
trained_models_dir = '/home/aziz/experiments/gpu_data_packup/trained_models/satd/comgen_bm/'

# Get data
with open(data_dir+'dataset.pkl', 'rb') as f:  # train_set
    pos_neg_cv_set = pickle.load(f)
with open(data_dir+'tune_val/dataset.pkl', 'rb') as f:  # val_set
    pos_neg_tune_set = pickle.load(f)

# Train only on TD data
cv_set = positive_only(pos_neg_cv_set)
tune_set = positive_only(pos_neg_tune_set)

print(len(cv_set.code_lines), len(cv_set.comment_lists))
print(len(tune_set.code_lines), len(tune_set.comment_lists))
print(len(cv_set.code_lines)+len(tune_set.code_lines), len(cv_set.comment_lists)+len(tune_set.comment_lists))

codes = [code for code in cv_set.code_lines] + [code for code in tune_set.code_lines]
comments = [comment for comment in cv_set.comment_lists] + [comment for comment in tune_set.comment_lists]
sequences = [seq for seq in cv_set.input_lists] + [seq for seq in tune_set.input_lists]

print(len(codes), len(comments))

print("=================")
print("=================")
for seq, comment, code in zip(sequences, comments, codes):
    if "quick" in comment and "dirty" in comment:
        print(" ".join(comment[1:-1]))
        print('---')
        print(code)
        print('---')
        print(" ".join(seq))
        print("=================")
        print("=================")
