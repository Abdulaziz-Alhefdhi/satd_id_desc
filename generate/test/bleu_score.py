from support_functions import DataObject
import pickle
from nltk.translate.bleu_score import corpus_bleu, sentence_bleu, SmoothingFunction
from collections import defaultdict, Counter


path_to_predicted_lists = '/home/aziz/experiments/output/td/generate/v2/test/'

with open('/home/aziz/experiments/data/td/v2/test/data_object.pkl', 'rb') as f:
    test_do = pickle.load(f)

with open('/home/aziz/experiments/data/td/v2/train/data_object.pkl', 'rb') as f:
    train_do = pickle.load(f)

# Cut out <sos> and <eos>
references = []
for a_list in test_do.target_lists:
    references.append([a_list[1:-1]])

with open(path_to_predicted_lists+'predicted_lists_dim1024_b16_e20.pkl', 'rb') as f:
    predicted_lists = pickle.load(f)

score = corpus_bleu(references, predicted_lists)
print("Bleu-4 score:", score)

# To arrange pairs from best to worst
# Combine pairs with similar scores
bleu_pairs = defaultdict(list)
scores = []
for target, predicted in zip(references, predicted_lists):
    score = sentence_bleu(target, predicted, smoothing_function=SmoothingFunction().method1) * 100
    scores.append(score)
    bleu_pairs[score].append((target[0], predicted))
# Sort scores
bleu_scores = []
for key, value in bleu_pairs.items():
    bleu_scores.append(key)
sorted_scores = sorted(bleu_scores, reverse=True)
sorted_pairs = []
for score in sorted_scores:
    sorted_pairs.append(bleu_pairs[score])

c = 0
for score in sorted_scores:
    print(score, ":", Counter(scores)[score])
    c += Counter(scores)[score]
print(c)

# c = 0
# for pair in sorted_pairs:
#     for item in pair:
#         print(' '.join(map(str, item[0])))
#         print("--------------")
#         print(' '.join(map(str, item[1])))
#         print("==============")
#         print("==============")
#         c += 1
# print(c)

identical = bleu_pairs[100]
perfect_preds = []
for item in identical:
    perfect_preds.append(["<sos>"]+item[0]+["<eos>"])

c = 0
for pred in perfect_preds:
    for i, train_target in enumerate(train_do.target_lists):
        if pred == train_target:
            print("From training:")
            print(train_do.input_lists[i])
            c += 1
            break
    for i, test_target in enumerate(test_do.target_lists):
        if pred == test_target:
            print("From testing:")
            print(test_do.input_lists[i])
            break
    print("===================")
print(c)