from support_functions import DataObject
import pickle
from nltk.translate.bleu_score import corpus_bleu
from collections import defaultdict


path_to_predicted_lists = '/home/aziz/experiments/output/td/generate/v2/test/'

with open('/home/aziz/experiments/data/td/v2/test/data_object.pkl', 'rb') as f:
    test_do = pickle.load(f)

# Prepare references
# Cut out <sos> and <eos>
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
with open(path_to_predicted_lists+'predicted_lists_dim2048_b16_e20.pkl', 'rb') as f:
    predicted_lists = pickle.load(f)

# Calculate and print BLEU score
print("Bleu-1 score:", corpus_bleu(refs, predicted_lists, weights=(1., 0., 0., 0.)))
print("Bleu-2 score:", corpus_bleu(refs, predicted_lists, weights=(0.5, 0.5, 0., 0.)))
print("Bleu-3 score:", corpus_bleu(refs, predicted_lists, weights=(0.33, 0.33, 0.33, 0.)))
print("Bleu-4 score:", corpus_bleu(refs, predicted_lists))
