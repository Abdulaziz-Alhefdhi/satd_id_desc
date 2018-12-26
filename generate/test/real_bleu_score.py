from utils import retrieve_texts, DataObject, data_shapes#, shape_info, token_integer_mapping, decode_sequence
import pickle
from nltk.translate.bleu_score import corpus_bleu
from collections import defaultdict


num_samples = 1000000  # Number of samples to train on.
max_input_length = 6000  # Number of largest acceptable input length
max_target_length = 1100  # Number of largest acceptable target length

path_to_test_data = '/home/aziz/experiments/data/td/test/'
path_to_predicted_lists = '/home/aziz/experiments/output/td/generate/test/'

# Get test data
input_texts, target_texts, input_lists, target_lists, input_tokens, target_tokens = \
    retrieve_texts(path_to_test_data, num_samples, max_input_length, max_target_length)
test_do = DataObject(input_texts, target_texts, input_lists, target_lists, input_tokens, target_tokens)
num_encoder_tokens_test, num_decoder_tokens_test, max_encoder_seq_length_test, \
max_decoder_seq_length_test, n_input_samples_test = data_shapes(test_do)

# Prepare references
# Cut out <sop> and <eop>
references = []
for a_list in test_do.target_lists:
    references.append(a_list[1:-1])
# Put the references of the same thing together
ref_dict = defaultdict(list)
for i, a_list in enumerate(test_do.input_lists):
    ref_dict[tuple(a_list)].append(references[i])
# Make them in same number as candidates to compare against each candidate
refs = []
for item in test_do.input_lists:
    refs.append(ref_dict[tuple(item)])

# Prepare candidates
with open(path_to_predicted_lists+'predicted_lists.pkl', 'rb') as f:
    predicted_lists = pickle.load(f)

# Calculate and print BLEU score
print("Bleu-1 score:", corpus_bleu(refs, predicted_lists, weights=(1., 0., 0., 0.)))
print("Bleu-2 score:", corpus_bleu(refs, predicted_lists, weights=(0.5, 0.5, 0., 0.)))
print("Bleu-3 score:", corpus_bleu(refs, predicted_lists, weights=(0.33, 0.33, 0.33, 0.)))
print("Bleu-4 score:", corpus_bleu(refs, predicted_lists))
