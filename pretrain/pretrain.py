from utils import retrieve_framework_ready_data, build_model, train_model
import sys
sys.path.append('/home/aziz/experiments/problems/tech_debt/')
from support_functions import DataObject
from tqdm import tqdm
import pickle
from keras.models import load_model


# data_dir = '/home/aziz/experiments/data/td/CT/data_objects/'
data_dir = '/media/aziz/Data/Aziz/data/td/CT/data_objects/'
# cp_dir = '/home/aziz/experiments/output/td/pretrain/'
cp_dir = '/media/aziz/Data/Aziz/trained_models/td/pretrain/'
output_dir = ''
max_seq_length = 1000000  # To reduce the huge size of the dataset
n_layers = 2              # Number of RNN layers
latent = 32               # Dimensionality for embedding and model layers
batch_size = 2048         # How many data points to train in every batch
epochs = 30000

print("================")
with open(data_dir+'ast_tokens_to_ints.pkl', 'rb') as f:
    tokens_to_ints = pickle.load(f)
with open(data_dir+'ast_ints_to_tokens.pkl', 'rb') as f:
    ints_to_tokens = pickle.load(f)
tokens = set(tokens_to_ints.keys())
vocab_size = len(tokens)
print("Vocabulary size:", vocab_size)
print("================\nRetrieving pre-training set...")
X, Y = retrieve_framework_ready_data(data_dir, max_seq_length, tokens_to_ints, tokens, vocab_size)
n_samples = len(X)
print("# data points:", n_samples)
print("================")

model = build_model(latent, vocab_size, n_layers)
last_epoch = 0
# model = load_model(cp_dir+'dp50311_v27359_1lay_lat32_b2048_ep'+str(last_epoch)+'.h5')

model.summary()

model_info = [epochs, batch_size, latent, n_layers, n_samples, vocab_size, last_epoch]
train_model(model, X, Y, ints_to_tokens, cp_dir, output_dir, model_info)
