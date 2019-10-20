import sys
sys.path.append('/home/aziz/experiments/problems/tech_debt/')
from support_functions import DataObject
import pickle
from collections import Counter


def retrieve_data(data_directory):
	with open(data_directory + 'ast_seqs.txt', 'r', encoding='utf-8') as ff:
		ast_seqs = ff.read().split("\n")
	ast_seqs = ast_seqs[:-1]
	with open(data_directory + 'codes.txt', 'r', encoding='utf-8') as ff:
		codes = ff.read().split("\n")
	codes = codes[:-1]
	with open(data_directory + 'comments.txt', 'r', encoding='utf-8') as ff:
		comments = ff.read().split("\n")
	comments = comments[:-1]
	with open(data_directory + 'labels.txt', 'r', encoding='utf-8') as ff:
		labels = ff.read().split("\n")
	labels = labels[:-1]

	return ast_seqs, codes, comments, labels


def combine_data(dataset):
	combined = []
	ast_seqs = [tuple(y) for y in dataset.input_lists]
	comments = [tuple(y) for y in dataset.comment_lists]
	for seq, code, comment, label in zip(ast_seqs, dataset.code_lines, comments, dataset.labels):
		combined.append((seq, code, comment, label))

	return list(set(combined))


def prepare_data_object(combined):
	input_lists = [list(x[0]) for x in combined]
	labels = [int(x[3]) for x in combined]
	comment_lists = [list(x[2]) for x in combined]
	code_lines = [str(x[1]) for x in combined]

	return DataObject(input_lists, labels, comment_lists, code_lines)


def token_integer_mapping(data_seqs):
	flat_seq = [seq for subseq in data_seqs for seq in subseq]
	word_c = Counter(flat_seq)
	# sorting the words from most to least frequent in text occurrence
	sorted_vocab = sorted(word_c, key=word_c.get, reverse=True)
	int_to_vocab = {j+1: word for j, word in enumerate(sorted_vocab)}
	int_to_vocab[0] = '<UNKN/PAD>'
	vocab_to_int = {word: j for j, word in int_to_vocab.items()}

	return vocab_to_int, int_to_vocab


def write_data_to_disk(cv, tune, pre_tr, ast_tokens_ints, ast_ints_tokens,
					   comment_words_ints, comment_ints_words, data_directory):
	with open(data_directory + 'data_objects/cv_set.pkl', 'wb') as f:
		pickle.dump(cv, f)
	with open(data_directory + 'data_objects/tune_set.pkl', 'wb') as f:
		pickle.dump(tune, f)
	with open(data_directory + 'data_objects/pre_tr_set.pkl', 'wb') as f:
		pickle.dump(pre_tr, f)
	with open(data_directory + 'data_objects/ast_tokens_to_ints.pkl', 'wb') as f:
		pickle.dump(ast_tokens_ints, f)
	with open(data_directory + 'data_objects/ast_ints_to_tokens.pkl', 'wb') as f:
		pickle.dump(ast_ints_tokens, f)
	with open(data_directory + 'data_objects/comment_words_to_ints.pkl', 'wb') as f:
		pickle.dump(comment_words_ints, f)
	with open(data_directory + 'data_objects/comment_ints_to_words.pkl', 'wb') as f:
		pickle.dump(comment_ints_words, f)


data_dir = '/home/aziz/experiments/data/td/CT/'

# Get data
print('Retrieving CV set...')
with open(data_dir+'framework_ready/dataset.pkl', 'rb') as f:  # CV set
	cv_set = pickle.load(f)
print('Retrieving tuning set...')
with open(data_dir+'framework_ready/tune_val/dataset.pkl', 'rb') as f:  # Tuning set
	tune_set = pickle.load(f)
print('Retrieving the full dataset...')
with open(data_dir+'dataset.pkl', 'rb') as f:  # The full dataset
	full_set = pickle.load(f)

print("================\nPrepare pre-training set:-")
cv_comb = combine_data(cv_set)
tune_comb = combine_data(tune_set)
full_comb = combine_data(full_set)
print('Correct # data points in the entire dataset:', len(full_comb))
print('Correct # data points in CV sets:', len(cv_comb))
print('Correct # data points in tuning sets:', len(tune_comb))
cv_tune_comb = cv_comb + tune_comb
print('Correct # data points in CV + tuning sets:', len(cv_tune_comb))
pre_tr_comb = list(set(full_comb) - set(cv_tune_comb))
print('Correct # data points in pre-training set:', len(pre_tr_comb))

print('Creating data objects...')
cv_set = prepare_data_object(cv_comb)
tune_set = prepare_data_object(tune_comb)
pre_tr_set = prepare_data_object(pre_tr_comb)
print('Creating vocab-integer mapping for ASTs and comments...')
ast_tokens_to_ints, ast_ints_to_tokens = token_integer_mapping(cv_set.input_lists + tune_set.input_lists)
comment_words_to_ints, comment_ints_to_words = token_integer_mapping(cv_set.comment_lists + tune_set.comment_lists)

print('Saving data objects to disk...')
if write_data_to_disk(cv_set, tune_set, pre_tr_set, ast_tokens_to_ints, ast_ints_to_tokens,
					  comment_words_to_ints, comment_ints_to_words, data_dir):
	print('Data objects have been written to disk!')
