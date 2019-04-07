import json
import re



def extract_codes_and_comments(data):
    # Deal with codes
    print("Extracting comments and code fragments...")
    codes, comments = [], []
    for i in range(len(data)):
        if i % 2 == 0:  # If a comment
            if len(data[i]) == 1:  # If not a multiple comment
                comments.append("".join(data[i][0]))
                codes.append(" ".join(data[i+1]))
    print("Ignoring defected code's pairs...")
    clean_codes, coms_v1 = [], []
    for code, comment in zip(codes, comments):
        flag = False
        tokens = code.split()
        for i, token in enumerate(tokens):
            if token == '<' and tokens[i+1] == '<':
                flag = True
                break
            if token == '>' and tokens[i+1] == '>':
                flag = True
                break
            if token == 'Enumeration' and tokens[i+1] == 'enum':
                flag = True
                break
            if token == '\\' and tokens[i+1] == b'\xef\xbf\xbd'.decode("utf-8", "strict"):
                flag = True
                break
        if not flag:
            clean_codes.append(code)
            coms_v1.append(comment)

    # Deal with comments
    print("Removing whitespaces...")
    coms_v2 = []
    for comment in coms_v1:
        coms_v2.append(" ".join(re.findall(r'\S+|\n', comment)).replace(' \n ', '\n'))
    print("Removing commenting characters...")
    coms_multiline = []
    for comment in coms_v2:
        temp_list = comment.split("\n")  # Every line in a separate item of the list
        temp_list2 = []
        for item in temp_list:
            stripped = item.lstrip("//")
            stripped = stripped.lstrip("/**")
            stripped = stripped.lstrip("/*")
            stripped = stripped.rstrip("*/")
            stripped = stripped.lstrip("*")
            temp_list2.append(stripped + "\n")  # Append clean line to the new list
        coms_multiline.append(" ".join(temp_list2))
    print("Making every comment a one-liner...")
    clean_coms = []
    for comment in coms_multiline:
        clean_coms.append(" ".join(comment.split()))

    return clean_codes, clean_coms, coms_multiline



def write_to_file(path, file_name, a_list):
    with open(path + file_name, "w", encoding='utf-8') as file:
        for item in a_list:
            file.write(str(item) + '\n')



data_path = "/home/aa043/sea/data/td/ours/v2/CT/"

# Retrieve data from disk
print("Extracting data...")
with open('/home/aa043/sea/data/td/ours/v2/pos.json', 'r') as f:
    tds = json.load(f)
print(len(tds)//2, "TD observations extracted")
with open('/home/aa043/sea/data/td/ours/v2/neg.json', 'r') as f:
    non_tds = json.load(f)
print(len(non_tds)//2, "non-TD observations extracted")

# Prepare 1st draft of data
print("Processing TD data...")
pos_clean_codes, pos_clean_coms, pos_coms_multiline = extract_codes_and_comments(tds)
print("Processing non-TD data...")
neg_clean_codes, neg_clean_coms, neg_coms_multiline = extract_codes_and_comments(non_tds)
# neg_clean_codes, neg_clean_coms, neg_coms_multiline = extract_codes_and_comments(non_tds)

print("Creating labels...")
pos_lbls = []
for i in range(len(pos_clean_codes)):
    pos_lbls.append(1)
neg_lbls = []
for i in range(len(neg_clean_codes)):
    neg_lbls.append(0)

print("Aggregating data...")
all_clean_codes = pos_clean_codes + neg_clean_codes
all_clean_coms = pos_clean_coms + neg_clean_coms
all_coms_multiline = pos_coms_multiline + neg_coms_multiline
all_lbls = pos_lbls + neg_lbls

# Prepare for writing multiline comments to disk
to_write_multi = []
for comment in all_coms_multiline:
    to_write_multi.append(comment + '+++')
# Creating multiple files for JavaParser because of memory (heap) issues
sliced_codes = [all_clean_codes[i:i+100000] for i in range(0, len(all_clean_codes), 100000)]

# Writing to disk
print("Writing the codes file...")
write_to_file(data_path, "codes.txt", all_clean_codes)
print("Writing the comments file...")
write_to_file(data_path, "comments.txt", all_clean_coms)
print("Writing the multiline comments file...")
write_to_file(data_path, "comments_multiline.txt", to_write_multi)
print("Writing the labels file...")
write_to_file(data_path, "labels.txt", all_lbls)
print("Writing the code file for JavaParser...")
method_count = 1
for i, slice in enumerate(sliced_codes, 1):
    with open(data_path+"parser_processing/"+str(i)+"/Codes"+str(i)+".java", "w", encoding='utf-8') as f:  # write codes file
        f.write("/**\n * Dummy JavaDoc\n */\npublic class Codes"+str(i)+" {\n\n")
        for code in slice:
            f.write("/**\n * Dummy JavaDoc\n */\npublic void coverMethod" + str(method_count) + "() {\n\t" + str(code) + "\n}\n\n")
            method_count += 1
        f.write("}\n")
    print(".java file", i, "has been written to disk")
print(str(method_count - 1) + " conditional statements have been written to file.")

