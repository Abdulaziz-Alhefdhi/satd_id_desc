# Clean AST sequences
# Read from ast_seqs file
with open('/home/aa043/sea/data/td/ours/processing/neg_ast_seqs.txt', 'r', encoding='utf-8') as f:
    ast_seqs = f.read().split("\n")
ast_seqs = ast_seqs[:-1]  # Remove last (empty) item
# Clean prefixes
sub_clean_seqs = []
for seq in ast_seqs:
    sub_clean_seqs.append(seq.split("(BlockStmt ", 1)[1])
# Clean suffixes
clean_seqs = []
for seq in sub_clean_seqs:
    clean_seqs.append(seq.rsplit(" )BlockStmt", 1)[0])
# Write clean AST sequences to file
with open('/home/aa043/sea/data/td/ours/processing/neg_clean_ast_seqs.txt', 'w', encoding='utf-8') as f:
    for seq in clean_seqs:
        f.write(seq + '\n')
print("Full neg_ast_seqs has been written to file")

# Clean comments
# Read from comments file
with open("/home/aa043/sea/data/td/ours/processing/neg_comments.txt", "r", encoding='utf-8') as f:
    file_comms = f.read().split('\n+++\n')
file_comms = file_comms[:-1]  # Remove last (empty) item
clean_comms = []
for comm in file_comms:
    clean_comms.append(" ".join(comm.split()))
# Write clean comments to file
with open('/home/aa043/sea/data/td/ours/processing/neg_clean_comments.txt', 'w', encoding='utf-8') as f:
    for comm in clean_comms:
        f.write(comm + '\n')
print("Full neg_comms has been written to file")

# Separate training and testing data
clean_seqs_training  = clean_seqs[:int(len(clean_seqs)*0.9)]
clean_seqs_testing   = clean_seqs[int(len(clean_seqs)*0.9):]
clean_comms_training = clean_comms[:int(len(clean_comms)*0.9)]
clean_comms_testing  = clean_comms[int(len(clean_comms)*0.9):]
# Write training and testing files
with open('/home/aa043/sea/data/td/ours/processing/train/neg_clean_ast_seqs.txt', 'w', encoding='utf-8') as f:
    for line in clean_seqs_training:
        f.write(line + '\n')
with open('/home/aa043/sea/data/td/ours/processing/test/neg_clean_ast_seqs.txt', 'w', encoding='utf-8') as f:
    for line in clean_seqs_testing:
        f.write(line + '\n')
print("training and testing files for neg_ast_seqs have been written to file")
with open('/home/aa043/sea/data/td/ours/processing/train/neg_clean_comments.txt', 'w', encoding='utf-8') as f:
    for line in clean_comms_training:
        f.write(line + '\n')
with open('/home/aa043/sea/data/td/ours/processing/test/neg_clean_comments.txt', 'w', encoding='utf-8') as f:
    for line in clean_comms_testing:
        f.write(line + '\n')
print("training and testing files for neg_comms have been written to file")