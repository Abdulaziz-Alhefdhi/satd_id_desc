from nltk.translate.bleu_score import corpus_bleu
import sys


def calculate_bleu(target_lists, predicted_lists):
    references = []
    for a_list in target_lists:
        references.append([a_list])

    b1 = corpus_bleu(references, predicted_lists, weights=(1/1, 0., 0., 0.))
    b2 = corpus_bleu(references, predicted_lists, weights=(1/2, 1/2, 0., 0.))
    b3 = corpus_bleu(references, predicted_lists, weights=(1/3, 1/3, 1/3, 0.))
    b4 = corpus_bleu(references, predicted_lists, weights=(1/4, 1/4, 1/4, 1/4))

    print("Bleu-1 Score: %.3f" % b1, " Bleu-2 Score: %.3f" % b2, " Bleu-3 Score: %.3f" % b3, " Bleu-4 Score: %.3f" % b4)

    return b1, b2, b3, b4


def extract_refs_cands(file_path):
    with open(file_path, 'r', encoding='utf-8') as ff:
        file_lines = ff.read().split("\n")

    references, candidates = [], []
    for line in file_lines:
        if 'Target sentence:  ' in line:
            references.append(line.split("Target sentence:  ", 1)[1].split())
        if 'Decoded sentence: ' in line:
            candidates.append(line.split("Decoded sentence: ", 1)[1].split())

    return references, candidates

# generation_path = "train_bigfix_test_defects4j/train_bigfix_100_test_defects4j_10.java"
# generation_path = "train_bigfix_test_defects4j/1000_train_dp_generation.java"
# generation_path = "train_bigfix_test_defects4j/iter_20_generation.java"
# generation_path = "train_bigfix_test_defects4j/train_bigfix_test_defects4j_generation.java"

# generation_path = "train_test_defects4j/4_beam/iter_10_generation.java"
# generation_path = "train_test_defects4j/4_beam/iter_20_generation.java"
# generation_path = "train_test_defects4j/4_beam/train_test_defects4j_generation.java"
# k = 5


# k = 50
# generation_path = "train_bigfix_test_defects4j/correct_defects4j_data/encdec_5_abstraction/beam"+str(k)+"/iter_10_generation.java"
# generation_path = "train_bigfix_test_defects4j/correct_defects4j_data/encdec_5_abstraction/beam"+str(k)+"/iter_20_generation.java"
# generation_path = "train_bigfix_test_defects4j/correct_defects4j_data/encdec_5_abstraction/beam"+str(k)+"/train_bigfix_test_defects4j_generation.java"


# generation_path = "train_test_defects4j/6_big_beam/iter_10_generation.java"
# generation_path = "train_test_defects4j/6_big_beam/iter_20_generation.java"
# generation_path = "train_test_defects4j/6_big_beam/train_test_defects4j_generation.java"
# k = 1000


k = 10
# generation_path = "train_bigfix_test_defects4j/correct_defects4j_data/encdec_5_abstraction/beam"+str(k)+"/iter_10_generation.java"
# generation_path = "train_bigfix_test_defects4j/correct_defects4j_data/encdec_5_abstraction/beam"+str(k)+"/iter_20_generation.java"
generation_path = "/home/aziz/dsl/gpu/experiments/gpu_data_packup/output/satd/beam_exps/beam"+str(k)+"/td_gen_cv_emb1024_b64_1l_f4.txt"


refs, all_cands = extract_refs_cands(generation_path)
cands = [all_cands[i:i+k] for i in range(0, len(all_cands), k)]


# for group in cands:
#     print(group)
# print(len(cands))
# sys.exit()

# c = 0
# for group in cands:
#     for cand in group:
#         print(all_cands[c])
#         print(cand)
#         print('==========')
#         c += 1
#         print(c)
#
# sys.exit()


# bleu1, bleu2, bleu3, bleu4 = calculate_bleu(refs, cands)

c = 0
for ref, group in zip(refs, cands):
    for cand in group:
        if ref == cand:
            c += 1
            print(" ".join(ref))
            print(" ".join(cand))
            print('==========')
            break

if len(refs) == len(cands):
    print("# pairs:", len(cands))
else:
    exit("There is something wrong!")

print("# identical pairs:", c)
iden_per = "%.2f" % (c/len(refs)*100)
print("Percentage of identical pairs:", iden_per+"%")
