import json
from tqdm import tqdm
from random import sample


data_path = "/home/aa043/sea/data/td/ours/v2/"


# Retrieve data from disk
def retrieve_codes(path):
    print("Loading code fragments and comments from disk...")
    with open(path, 'r') as f:
        lines = json.load(f)
    # Extract code fragments
    codes = []
    print("Extracting code fragments...")
    for i in tqdm(range(len(lines))):
        if i % 2 == 0:  # If a comment
            if len(lines[i]) == 1:  # If not a multiple comment
                codes.append(" ".join(lines[i + 1]))  # Accept this code fragment for now
    # Ignore defected code's pairs
    clean_codes = []
    print("Removing defected code...")
    c = 0
    for code in codes:
        flag = False
        for i in range(len(code)):
            if code[i] == '<' and code[i + 1] == ' ' and code[i + 2] == '<':
                flag = True
                break
            if code[i] == '>' and code[i + 1] == ' ' and code[i + 2] == '>':
                flag = True
                break
        if not flag:
            clean_codes.append(code)
        c += 1
        if c % 100000 == 0:
            print(c, "out of", len(codes), "pairs processed...")

    return clean_codes


def write_to_file(codes, path):
    with open(path + "Codes.java", "w", encoding='utf-8') as f:  # write codes file
        f.write("/**\n * Dummy JavaDoc\n */\npublic class Codes {\n")
        count = 1  # To number the methods
        for code in codes:
            f.write("/**\n * Dummy JavaDoc\n */\npublic void coverMethod" + str(count) + "() {\n\t" + code + "\n}\n\n")
            count += 1
        f.write("}\n")
    print(str(count - 1) + " code fragments written to file.")


print("Retrive code fragments containing TD...")
pos_codes = retrieve_codes(data_path+"pos.json")
print("Retrive code fragments not containing TD for training a classifier...")
neg_codes = retrieve_codes(data_path+"neg.json")

# Shuffle neg samples before taking the 1st 7K samples
shuf_neg_codes = sample(neg_codes, k=len(neg_codes))
# Take the first 7K samples to nearly match the number of positive samples
neg_codes = shuf_neg_codes[:7000]

print("Writing TD code fragments to file...")
write_to_file(pos_codes, data_path+"processing/pos_code/")
print("Writing non-TD code fragments to file...")
write_to_file(neg_codes, data_path+"processing/neg_code/")

