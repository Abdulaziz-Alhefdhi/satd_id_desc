import os


data_path = "/home/aa043/sea/data/td/ours/v2/CT/"

# Collect file paths in preparation to read from them
file_paths = []
for root, dirs, files in os.walk(data_path+"parser_processing"):
    for name in files:
        if name.endswith(".txt"):
            file_paths.append(os.path.join(root, name))
file_paths = sorted(file_paths)  # Order is important because the first portion of the data is positive TD

print("Reading ast_seqs files contents...")
aggregated = []  # Aggregate all the contents in one big list
for file in file_paths:
    with open(file, 'r', encoding='utf-8') as f:
        ast_seqs = f.read().split("\n")
    ast_seqs = ast_seqs[:-1]  # Remove last (empty) item
    aggregated = aggregated + ast_seqs

# Clean AST sequences
print("Cleaning prefixes...")
sub_clean_seqs = []
for seq in aggregated:
    sub_clean_seqs.append(seq.split("(BlockStmt ", 1)[1])
print("Cleaning suffixes...")
clean_seqs = []
for seq in sub_clean_seqs:
    clean_seqs.append(seq.rsplit(" )BlockStmt", 1)[0])

print("Writing clean AST sequences to file...")
with open(data_path+'ast_seqs.txt', 'w', encoding='utf-8') as f:
    for seq in clean_seqs:
        f.write(seq + '\n')
print(len(clean_seqs), "AST sequences have been written to disk.")

