import sys
# sys.path.append('/home/aa043/sea/gpu/experiments/problems/tech_debt/')
# sys.path.append('/home/aa043/sea/gpu/experiments/problems/tech_debt/classify/code2class/')
from support_functions import DataObject
# from utils import build_model, train_model
from tqdm import tqdm
from keras.models import load_model
import datetime
from sklearn.model_selection import StratifiedKFold
import numpy as np
from keras.models import Sequential
from keras.layers import Dense, LSTM, Embedding, GlobalAveragePooling1D, GlobalMaxPooling1D
from keras.backend import clear_session
from cv_utils import retrieve_dataset, encode_integers


def build_model(latent_dim, v_size, num_layers, pooling=None, drop_prob=0.2):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    new_model = Sequential()
    new_model.add(Embedding(v_size, latent_dim))
    if num_layers == 1:
        if pooling is None:
            new_model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
        else:
            new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    elif num_layers == 2:
        new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        if pooling is None:
            new_model.add(LSTM(latent_dim, dropout=drop_prob, recurrent_dropout=drop_prob))
        else:
            new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    else:
        new_model.add(LSTM(latent_dim*2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        new_model.add(LSTM(latent_dim, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
        if pooling is None:
            new_model.add(LSTM(latent_dim//2, dropout=drop_prob, recurrent_dropout=drop_prob))
        else:
            new_model.add(LSTM(latent_dim//2, return_sequences=True, dropout=drop_prob, recurrent_dropout=drop_prob))
    # old_model = load_model('/home/aa043/sea/gpu/experiments/trained_models/td/pretrain/dp50311_v27359_ep15_1lay_lat32_b2048.h5')
    # new_model = Sequential()
    # new_model.add(old_model.layers[0])
    # new_model.add(old_model.layers[1])
    if pooling is not None:
        if pooling == 'max':
            new_model.add(GlobalMaxPooling1D())
        else:
            new_model.add(GlobalAveragePooling1D())
    new_model.add(Dense(1, activation='sigmoid'))
    new_model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

    return new_model


def results(predictions, y_test):
    tp, tn, fp, fn = 0, 0, 0, 0
    for pred, lbl in zip(predictions, y_test):
        if lbl == 1 and pred[0] == 1:
            tp += 1
        if lbl == 0 and pred[0] == 0:
            tn += 1
        if lbl == 0 and pred[0] == 1:
            fp += 1
        if lbl == 1 and pred[0] == 0:
            fn += 1
    print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
    p, r, f1, acc = 0, 0, 0, 0
    if tp + fp > 0 and tp + fn > 0:
        p, r = tp / (tp + fp), tp / (tp + fn)
    elif tp + fp > 0:
        p = tp / (tp + fp)
    elif tp + fn > 0:
        r = tp / (tp + fn)
    if (p + r) > 0:
        f1 = 2 * p * r / (p + r)
    acc = (tp+tn)/(tp+tn+fp+fn)
    print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1, "- Accuracy =", "%.3f" % acc)

    return tp, tn, fp, fn, p, r, f1, acc


# data_dir = '/home/aa043/sea/gpu/experiments/data/td/CT/data_objects/'
data_dir = '/home/aziz/dsl/gpu_data/Aziz/data/satd/'
# cp_dir = '/home/aziz/experiments/trained_models/td/pretrain/'
# max_seq_length = 1000000  # To reduce the huge size of the dataset
n_layers = 2              # Number of RNN layers
latent = 32               # Dimensionality for embedding and model layers
batch_size = 256         # How many data points to train in every batch
epochs = 20
pool = 'mean'

print("================\nRetrieving dataset...")
cv_set, tune_set, tokens_to_ints, ints_to_tokens = retrieve_dataset(data_dir)
vocab_size = len(tokens_to_ints)
print('================')


print("Batch size:", batch_size)
print("Number of model layers:", n_layers)
print("Latent dimensionality:", latent)
print('Pooling:', 'none' if pool is None else pool)
print('================')

print(len(cv_set.input_lists), len(cv_set.labels))

satd_codes, non_satd_codes = [], []
for code, label in zip(cv_set.code_lines, cv_set.labels):
    if label == 1:
        satd_codes.append(code)
    if label == 0:
        non_satd_codes.append(code)

print(len(satd_codes), len(non_satd_codes), len(satd_codes)+len(non_satd_codes))

sys.exit()

print("Writing SonarQube-ready files...")

def write_sonarqube_ready(code_lines, satd_flag):
    name = "SATD" if satd_flag else "NonSATD"
    with open(data_dir+"sonarqube/"+name+".java", "w", encoding='utf-8') as f:  # write codes file
        f.write("public class "+name+" {\n\n")
        f.write("\tpublic void WrapperMethod() {\n\n")
        for line in code_lines:
            f.write("\t\t" + line + "\n\n")
        f.write("\t}\n\n}\n")


write_sonarqube_ready(satd_codes, True)
write_sonarqube_ready(non_satd_codes, False)

print("Writing done!")


