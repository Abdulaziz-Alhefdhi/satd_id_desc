import numpy as np
from keras.models import Model
from keras.layers import Input, LSTM, Dense, Embedding, Activation, dot, concatenate, TimeDistributed


def tokenize(lines, max_input_length):
    texts, tokens = [], set()
    for line in lines:
        # Throwing out long texts
        if len(line) > max_input_length:
            continue
        texts.append(line)
        # Dealing with ast-sequence-specific characters
        line = line.replace("(", " ( ")
        line = line.replace(")", " ) ")
        line = line.replace("_", " _ ")
        # Tokenize inputs
        for token in line.split():
            tokens.add(token)
    return tokens, texts


# Preprocess and tokenize the data.
def preprocess(data_path, num_samples, max_input_length):
    # Variable declarations
    input_texts, input_tokens = [], set()
    # Retrieve dat from files
    with open(data_path + 'clean_ast_seqs.txt', 'r', encoding='utf-8') as f:
        pos_lines = f.read().split('\n')
    with open(data_path + 'neg_clean_ast_seqs.txt', 'r', encoding='utf-8') as f:
        neg_lines = f.read().split('\n')
    # Keep only num_samples
    pos_lines = pos_lines[: min(num_samples, len(pos_lines) - 1)]
    neg_lines = neg_lines[: min(num_samples, len(neg_lines) - 1)]

    # tokenize data
    pos_tokens, pos_texts = tokenize(pos_lines, max_input_length)
    neg_tokens, neg_texts = tokenize(neg_lines, max_input_length)
    all_tokens = set()
    for token in pos_tokens:
        all_tokens.add(token)
    for token in neg_tokens:
        all_tokens.add(token)

    # All_texts
    all_texts = []
    for text in pos_texts:
        all_texts.append(text)
    for text in neg_texts:
        all_texts.append(text)
    # Label data
    labels = []
    for i in range(len(pos_texts)):
        labels.append(1)
    for i in range(len(neg_texts)):
        labels.append(0)

    # Return desired data, with tokens being sorted and converted to lists
    return sorted(list(all_tokens)), all_texts, labels


# Get data
def retrieve_texts(data_path, num_samples, max_input_length):
    tokens, texts, labels = preprocess(data_path, num_samples, max_input_length)
    # Special treatment for input code sequences
    input_lists = []
    for txt in texts:
        txt = txt.replace("(", " ( ")
        txt = txt.replace(")", " ) ")
        txt = txt.replace("_", " _ ")
        input_lists.append(txt.split())
    # add "<unknown>" token for unknown words during testing
    input_tokens = tokens + ["<unknown>"]

    return features, input_lists, target_lists, input_tokens, target_tokens



class DataObject:
    def __init__(self, input_texts, target_texts, input_lists, target_lists, input_tokens, target_tokens):
        self.input_texts = input_texts
        self.target_texts = target_texts
        self.input_lists = input_lists
        self.target_lists = target_lists
        self.input_tokens = input_tokens
        self.target_tokens = target_tokens
        # this will track the progress of the batches sequentially through the data set - once the data reaches the
        # end of the data set it will reset back to zero
        self.current_idx = 0
    def generate(self, batch_size, max_encoder_seq_length, max_decoder_seq_length, num_decoder_tokens,
                 input_token_index, target_token_index):
        # Define input & output data and initialize them with zeros
        encoder_input_data = np.zeros((batch_size, max_encoder_seq_length), dtype='int32')
        decoder_input_data = np.zeros((batch_size, max_decoder_seq_length), dtype='int32')
        decoder_target_data = np.zeros((batch_size, max_decoder_seq_length, num_decoder_tokens), dtype='float32')
        # Special initialization procedure for decoder_target_data
        for sample in decoder_target_data:
            for token in sample:
                token[0] = 1.
        while True:
            # fill input data & one-hot encode targets
            # Loop samples
            for i in range(batch_size):
                if (self.current_idx + i) >= len(self.input_lists):
                    print("\nA full iteration through the dataset has been completed. Last target sample # = " + str(
                        self.current_idx + i))
                    ###print("Last Target Sequence: " + str(self.target_lists[self.current_idx+i-1]))
                    self.current_idx = -i
                if (self.current_idx + i) % 2000 == 0:
                    if self.current_idx + i == 0:
                        print("\nBeginning of dataset..")
                    ###print("\nCurrent target sample # = " + str(self.current_idx + i))
                    ###print("Current Target Sequence: " + str(self.target_lists[self.current_idx + i]))
                # Loop input sequences
                for t, token in enumerate(self.input_lists[self.current_idx + i]):
                    encoder_input_data[i, t] = input_token_index[token]
                # Loop target sequences
                for t, token in enumerate(self.target_lists[self.current_idx + i]):
                    # decoder_target_data is ahead of decoder_input_data by one timestep
                    decoder_input_data[i, t] = target_token_index[token]
                    if t > 0:
                        # decoder_target_data will be ahead by one timestep and will not include the start character. Initial value altered.
                        decoder_target_data[i, t - 1, 0] = 0.
                        decoder_target_data[i, t - 1, target_token_index[token]] = 1.
            self.current_idx += batch_size
            yield ([encoder_input_data, decoder_input_data], decoder_target_data)


def data_shapes(do):
    num_encoder_tokens = len(do.input_tokens)
    num_decoder_tokens = len(do.target_tokens)
    max_encoder_seq_length = max([len(txt) for txt in do.input_lists])
    max_decoder_seq_length = max([len(txt) for txt in do.target_lists])
    n_input_samples = len(do.input_lists)

    return num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length, n_input_samples


def shape_info(n_input_samples, num_encoder_tokens, num_decoder_tokens, max_encoder_seq_length, max_decoder_seq_length):
    print('Number of samples:', n_input_samples)
    print('Number of unique input tokens:', num_encoder_tokens)
    print('Number of unique output tokens:', num_decoder_tokens)
    print('Max sequence length for inputs:', max_encoder_seq_length)
    print('Max sequence length for outputs:', max_decoder_seq_length)


def token_integer_mapping(input_tokens, target_tokens):
    input_token_index = dict([(token, i+1) for i, token in enumerate(input_tokens)])
    target_token_index = dict([(token, i+1) for i, token in enumerate(target_tokens)])
    reverse_input_token_index = dict((i, token) for token, i in input_token_index.items())
    reverse_target_token_index = dict((i, token) for token, i in target_token_index.items())
    return input_token_index, target_token_index, reverse_input_token_index, reverse_target_token_index


def build_model(latent_dim, num_encoder_tokens, num_decoder_tokens):
    # Encoder
    encoder_inputs = Input(shape=(None,))
    en_x = Embedding(num_encoder_tokens+1, latent_dim, mask_zero=True)(encoder_inputs)
    encoder_outputs, state_h, state_c = LSTM(latent_dim, return_sequences=True, return_state=True)(en_x)
    # Decoder
    decoder_inputs = Input(shape=(None,))
    de_x = Embedding(num_decoder_tokens+1, latent_dim, mask_zero=True)(decoder_inputs)
    decoder_outputs = LSTM(latent_dim, return_sequences=True)(de_x, initial_state=[state_h, state_c])
    # Attention Mechanism
    attention = dot([decoder_outputs, encoder_outputs], axes=[2, 2])
    attention = Activation('softmax', name='attention')(attention)
    context = dot([attention, encoder_outputs], axes=[2, 1])
    decoder_combined_context = concatenate([context, decoder_outputs])
    attention_context_output = Dense(latent_dim, activation="tanh")(decoder_combined_context)
    model_output = Dense(num_decoder_tokens, activation="softmax")(attention_context_output)

    return encoder_inputs, decoder_inputs, model_output

