import pickle
import numpy as np
from collections import Counter
import random
from scipy import spatial
import sys
from keras.models import Sequential
from keras.layers import Dense, LSTM, Embedding, GlobalAveragePooling1D, GlobalMaxPooling1D
import datetime
from tqdm import tqdm
from keras.utils import to_categorical
from pathlib import Path


def retrieve_data(data_path, max_len):
    with open(data_path, 'rb') as f:
        dataset = pickle.load(f)
    print('Average AST sequence length:', sum([len(x) for x in dataset.input_lists])//len(dataset.input_lists))
    print('# AST sequences before cleaning:', len(dataset.input_lists))
    print("# AST tokens before cleaning:", sum([len(seq) for seq in dataset.input_lists]))
    print('Remove AST sequences longer than', max_len, 'tokens')
    ast_seqs = [seq for seq in dataset.input_lists if len(seq) <= max_len]  # Apply max_length
    print('# AST sequences after cleaning:', len(ast_seqs))
    print("# AST tokens after cleaning:", sum([len(seq) for seq in ast_seqs]))

    return ast_seqs


# def token_integer_mapping(data_seqs):
#     flat_seq = [seq for subseq in data_seqs for seq in subseq]
#     word_c = Counter(flat_seq)
    # # sorting the words from most to least frequent in text occurrence
    # sorted_vocab = sorted(word_c, key=word_c.get, reverse=True)
    # int_to_vocab = {j+1: word for j, word in enumerate(sorted_vocab)}
    # int_to_vocab[0] = '<UNKN/PAD>'
    # vocab_to_int = {word: j for j, word in int_to_vocab.items()}
    #
    # return vocab_to_int, int_to_vocab


def create_dataset(int_seqs, v_size):
    print('Creating input and target lists...')
    inputs = [seq[:-1] for seq in int_seqs]
    targets = [seq[1:] for seq in int_seqs]
    # print(max([len(x) for x in inputs]), max([len(x) for x in targets]))
    print('Flattening lists...')
    features = [x for xx in inputs for x in xx]
    labels = [y for yy in targets for y in yy]
    print('Create feature-target pairs:')
    pairs = [(x, y) for x, y in tqdm(zip(features, labels), total=len(features))]
    pairs = np.array(list(set(pairs)))
    print('Creating features and labels...')
    features, labels = pairs[:, 0], pairs[:, 1]

    return features, to_categorical(labels, num_classes=v_size)


def retrieve_framework_ready_data(data_directory, max_len, tokens_to_ints, tokens, vocab_size):
    x_path = Path(data_directory + "temp/X.pkl")
    y_path = Path(data_directory + "temp/Y.pkl")
    if x_path.is_file() and y_path.is_file():
        with open(x_path, 'rb') as f:
            xs = pickle.load(f)
        with open(y_path, 'rb') as f:
            ys = pickle.load(f)
    else:
        pre_tr_seqs = retrieve_data(data_directory+'pre_tr_set.pkl', max_len)
        print('Encoding tokens to integers...')
        int_seqs = []
        for seq in tqdm(pre_tr_seqs):
            int_seq = [tokens_to_ints[word] if word in tokens else 0 for word in seq]
            int_seqs.append(int_seq)
        print('Creating dataset...')
        xs, ys = create_dataset(int_seqs, vocab_size)
        with open(x_path, 'wb') as f:
            pickle.dump(xs, f)
        with open(y_path, 'wb') as f:
            pickle.dump(ys, f, protocol=4)

    return xs, ys

def build_model(latent_dim, v_size, num_layers):
    if num_layers not in [1, 2, 3]:
        sys.exit("Error: Number of model layers must be 1, 2, or 3")
    model = Sequential()
    model.add(Embedding(v_size, latent_dim))
    if num_layers == 1:
        model.add(LSTM(latent_dim, return_sequences=True, dropout=0.2, recurrent_dropout=0.2))
    elif num_layers == 2:
        model.add(LSTM(latent_dim, return_sequences=True, dropout=0.2, recurrent_dropout=0.2))
        model.add(LSTM(latent_dim, return_sequences=True, dropout=0.2, recurrent_dropout=0.2))
    else:
        model.add(LSTM(latent_dim*2, return_sequences=True, dropout=0.2, recurrent_dropout=0.2))
        model.add(LSTM(latent_dim, return_sequences=True, dropout=0.2, recurrent_dropout=0.2))
        model.add(LSTM(latent_dim//2, return_sequences=True, dropout=0.2, recurrent_dropout=0.2))
    model.add(GlobalAveragePooling1D())
    model.add(Dense(v_size, activation='softmax'))
    model.compile(loss='categorical_crossentropy', optimizer='adam', metrics=['accuracy'])

    return model


def cosine_similarity(embedding, valid_size=16, valid_window=100):
    """ Returns the cosine similarity of validation words with words in the embedding matrix.
        Here, embedding should be a PyTorch embedding module.
    """
    embed_vectors = embedding

    # pick N words from our ranges (0,window) and (1000,1000+window). lower id implies more frequent
    valid_examples = np.array(random.sample(range(valid_window), valid_size // 2))
    valid_examples = np.append(valid_examples, random.sample(range(800, 800 + valid_window), valid_size // 2))
    valid_examples = valid_examples + 1  # When indexing starts from 1

    valid_vectors = embed_vectors[valid_examples]

    similarities = 1 - spatial.distance.cdist(valid_vectors, embed_vectors, 'cosine')

    return valid_examples, similarities


def train_model(rnn_m, inputs, outputs, int_token_map, model_dir, output_dir, hps):
    n_ep, b_size, latent_dim, num_layers, le = hps[0], hps[1], hps[2], hps[3], hps[-1]
    dps, vocab = hps[4], hps[5]
    start_time = datetime.datetime.now().replace(microsecond=0)
    print("Training started at:", start_time)
    print("================")
    model_name = 'dp' + str(dps) + '_v' + str(vocab) + '_' + str(num_layers) \
                 + 'lay_lat' + str(latent_dim) + '_b' + str(b_size)
    for e in range(1+le, n_ep+1+le):
        print("Epoch " + str(e) + ":-")
        history = rnn_m.fit(inputs, outputs, verbose=1, batch_size=b_size)
        # with open(output_dir + model_name + '_losses.txt', 'a', encoding='utf-8') as f:
        #     f.write(str(history.history['loss'][0]) + '\n')
        # Save checkpoint, and
        # Print 16 random words and the 5 most similar words to each of them
        if e % 1000 == 0:
            rnn_m.save(model_dir + model_name + '_ep' + str(e) + '.h5')
            embeddings = rnn_m.layers[0].get_weights()[0]
            valid_examples, valid_similarities = cosine_similarity(embeddings)
            closest_idxs = (-valid_similarities).argsort()[:, :6]
            # closest_idxs[closest_idxs == 0] = 1  # To make sure no 0 indices are there (1 is arbitrary)
            for ii, valid_idx in enumerate(valid_examples):
                closest_words = [int_token_map[idx.item()] for idx in closest_idxs[ii]][1:]
                print(int_token_map[valid_idx.item()] + " | " + ', '.join(closest_words))
    print("================")
    end_time = datetime.datetime.now().replace(microsecond=0)
    print("Training completed at:", end_time)
    print("Training took (h:m:s)", end_time - start_time)
