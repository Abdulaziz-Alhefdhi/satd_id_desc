from nltk.translate.bleu_score import corpus_bleu


def calculate_bleu(target_lists, predicted_lists):
    references = []
    for a_list in target_lists:
        references.append([a_list])

    bleu1 = corpus_bleu(references, predicted_lists, weights=(1/1, 0., 0., 0.))
    bleu2 = corpus_bleu(references, predicted_lists, weights=(1/2, 1/2, 0., 0.))
    bleu3 = corpus_bleu(references, predicted_lists, weights=(1/3, 1/3, 1/3, 0.))
    bleu4 = corpus_bleu(references, predicted_lists, weights=(1/4, 1/4, 1/4, 1/4))
    print("Bleu-1 Score: %.3f" % bleu1, " Bleu-2 Score: %.3f" % bleu2, " Bleu-3 Score: %.3f" % bleu3, " Bleu-4 Score: %.3f" % bleu4)

    return bleu1, bleu2, bleu3, bleu4


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


data_dir = "/home/aa043/sea/gpu/experiments/output/td/generate/CT/cv/emb1024_b64_1l_e40/"

b1s, b2s, b3s, b4s = [], [], [], []
for fold in range(1, 11):
    y_test, predicted_lists = extract_refs_cands(data_dir+'td_gen_cv_emb1024_b64_1l_f'+str(fold)+'.txt')
    bleu1, bleu2, bleu3, bleu4 = calculate_bleu(y_test, predicted_lists)
    b1s.append(bleu1)
    b2s.append(bleu2)
    b3s.append(bleu3)
    b4s.append(bleu4)

print("================")
print("Average BLEU-1 Score:", "%.3f" % (sum(b1s)/len(b1s)))
print("Average BLEU-2 Score:", "%.3f" % (sum(b2s)/len(b2s)))
print("Average BLEU-3 Score:", "%.3f" % (sum(b3s)/len(b3s)))
print("Average BLEU-4 Score:", "%.3f" % (sum(b4s)/len(b4s)))
