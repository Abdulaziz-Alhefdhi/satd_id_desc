from random import sample

# Variable declarations
input_texts, target_texts, input_tokens, target_tokens = [], [], set(), set()
# Retrieve dat from files
with open('clean_ast_seqs.txt', 'r', encoding='utf-8') as f:
    input_lines = f.read().split('\n')
with open('clean_comments.txt', 'r', encoding='utf-8') as f:
    target_lines = f.read().split('\n')
# Remove last (empty) items
input_lines = input_lines[:-1]
target_lines = target_lines[:-1]
# Randomize data
comb_list = []
for il, tl in zip(input_lines, target_lines):
    comb_list.append([il, tl])
shuf_comb_list = sample(comb_list, k=len(comb_list))
# Separate input and target lines
input_lines, target_lines = [], []
for item in shuf_comb_list:
    input_lines.append(item[0])
    target_lines.append(item[1])
# Separate training and testing data
input_lines_training  = input_lines[:int(len(input_lines)*0.9)]
input_lines_testing   = input_lines[int(len(input_lines)*0.9):]
target_lines_training = target_lines[:int(len(target_lines)*0.9)]
target_lines_testing  = target_lines[int(len(target_lines)*0.9):]
# Write training and testing files
with open('train/clean_ast_seqs.txt', 'w', encoding='utf-8') as f:
    for line in input_lines_training:
        f.write(line + '\n')
with open('test/clean_ast_seqs.txt', 'w', encoding='utf-8') as f:
    for line in input_lines_testing:
        f.write(line + '\n')
with open('train/clean_comments.txt', 'w', encoding='utf-8') as f:
    for line in target_lines_training:
        f.write(line + '\n')
with open('test/clean_comments.txt', 'w', encoding='utf-8') as f:
    for line in target_lines_testing:
        f.write(line + '\n')

