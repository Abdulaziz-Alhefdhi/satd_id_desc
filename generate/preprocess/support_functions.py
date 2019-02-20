def prepare_texts(data_path, num_samples):
    # Variable declarations
    input_texts, target_texts, input_tokens, target_tokens = [], [], set(), set()
    # Retrieve dat from files
    with open(data_path + 'inputs.txt', 'r', encoding='utf-8') as f:
        input_lines = f.read().split('\n')
    with open(data_path + 'targets.txt', 'r', encoding='utf-8') as f:
        target_lines = f.read().split('\n')
    # Keep only num_samples
    input_lines = input_lines[: min(num_samples, len(input_lines) - 1)]
    target_lines = target_lines[: min(num_samples, len(target_lines) - 1)]

    for input_text, target_text in zip(input_lines, target_lines):
        # Throwing out long texts
        # if len(input_text) > max_input_length or len(target_text) > max_target_length:
        #     continue
        # Replace problematic characters that're basically spaces!
        for char in ['\u2009', '\u202f', '\xa0']:
            target_text = target_text.replace(char, ' ')
        input_texts.append(input_text)
        target_texts.append(target_text)

    # Return desired data, with tokens being sorted and converted to lists
    return input_texts, target_texts


# Prepare for inputting to model
def list_texts(texts):
    lists = []
    # Loop through all the texts
    for txt in texts:
        a_list, word = [], ''
        for i, char in enumerate(txt):
            # Deal with words of multiple characters as one token
            if char.isalpha():
                word += char
                if (i == len(txt)-1) or (not txt[i+1].isalpha()):
                    a_list.append(word.lower())
            # Deal with non-alphabetic characters
            else:
                if char != ' ':
                    a_list.append(char)
                word = ''
        lists.append(a_list)
    return lists


# Get data
def retrieve_data(data_path, num_samples, max_input_length, max_target_length):
    draft_input_texts, draft_target_texts = prepare_texts(data_path, num_samples)
    # Special treatment for input code sequences
    draft_input_lists = []
    for txt in draft_input_texts:
        txt = txt.replace("(", " ( ")
        txt = txt.replace(")", " ) ")
        txt = txt.replace("_", " _ ")
        draft_input_lists.append(txt.split())
    draft_target_lists = list_texts(draft_target_texts)
    # Add start and end symbols to target lists
    for i in range(len(draft_target_lists)):
        draft_target_lists[i] = ["<sos>"] + draft_target_lists[i] + ["<eos>"]
    input_texts, target_texts, input_lists, target_lists = [], [], [], []
    for it, tt, il, tl in zip(draft_input_texts, draft_target_texts, draft_input_lists, draft_target_lists):
        if len(il) <= max_input_length and len(tl) <= max_target_length:
            input_texts.append(it)
            target_texts.append(tt)
            input_lists.append(il)
            target_lists.append(tl)

    return input_texts, target_texts, input_lists, target_lists


class DataObject:
    def __init__(self, input_texts, target_texts, input_lists, target_lists, input_tokens, target_tokens):
        self.input_texts = input_texts
        self.target_texts = target_texts
        self.input_lists = input_lists
        self.target_lists = target_lists
        self.input_tokens = input_tokens
        self.target_tokens = target_tokens


def fetch_corrisponding(texts, comb_pairs, input_texts, target_texts, input_lists, target_lists):
    its, tts, ils, tls = [], [], [], []
    for pair in texts:
        for i, all_pair in enumerate(comb_pairs):
            if pair == all_pair:
                its.append(input_texts[i])
                tts.append(target_texts[i])
                ils.append(input_lists[i])
                tls.append(target_lists[i])
                break
    return its, tts, ils, tls


def tokenize_data(ils, tls):
    input_tokens, target_tokens = set(), set()
    for input_list, target_list in zip(ils, tls):
        for token in input_list:
            input_tokens.add(token)
        for token in target_list:
            target_tokens.add(token)
    return sorted(list(input_tokens))+["<unknown>"], sorted(list(target_tokens))+["<unknown>"]


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
