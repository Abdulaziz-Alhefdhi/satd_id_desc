import json
import re
from tqdm import tqdm
from random import sample


# Retrieve data from disk
print("Loading code fragments and comments from disk...")
with open('/home/aa043/sea/data/td/ours/neg.json', 'r') as f:
    tds = json.load(f)

# Extract comments and code fragments
codes, comments = [], []
print("Separating codes and comments...")
for i in tqdm(range(len(tds))):
    if i % 2 == 0:  # If a comment
        if len(tds[i]) == 1:  # If not a multiple comment
            comments.append("".join(tds[i][0]))
            codes.append(" ".join(tds[i+1]))

# Ignore defected code's pairs
clean_codes, coms_v1 = [], []
print("Removing defected code...")
c = 0
for code, comment in zip(codes, comments):
    flag = False
    for i in range(len(code)):
        if code[i] == '<' and code[i+1] == ' ' and code[i+2] == '<':
            flag = True
            break
        if code[i] == '>' and code[i+1] == ' ' and code[i+2] == '>':
            flag = True
            break
    if not flag:
        clean_codes.append(code)
        coms_v1.append(comment)
    c += 1
    if c % 100000 == 0:
        print(c, "out of", len(codes), "pairs processed...")

# Remove whitespaces
coms_v2 = []
print("Removing white spaces...")
for comment in tqdm(coms_v1):
    coms_v2.append(" ".join(re.findall(r'\S+|\n', comment)).replace(' \n ', '\n'))

# Remove commenting characters
coms_v3 = []
print("Removing commenting symbols...")
for comment in tqdm(coms_v2):
    temp_list = comment.split("\n")  # Every line in a separate item of the list
    temp_list2 = []
    for item in temp_list:
        stripped = item.lstrip("//")
        stripped = stripped.lstrip("/**")
        stripped = stripped.lstrip("/*")
        stripped = stripped.rstrip("*/")
        stripped = stripped.lstrip("*")
        temp_list2.append(stripped + "\n")  # Append clean line to the new list
    coms_v3.append(" ".join(temp_list2))

# Shuffle and cut data
comb_list = []
print("Combining data for shuffling...")
c = 0
for comment, code in zip(coms_v3, clean_codes):
    comb_list.append([comment, code])
    c += 1
    if c % 100000 == 0:
        print(c, "out of", len(clean_codes), "pairs processed...")
print("Randomizing sample order...")
shuf_comb_list = sample(comb_list, k=len(comb_list))
print("Keep 15K samples of negative data")
shuf_comb_list = shuf_comb_list[:15000]
coms_v3, clean_codes = [], []
print("Separating code fragments from comments after shuffling...")
for item in tqdm(shuf_comb_list):
    coms_v3.append(item[0])
    clean_codes.append(item[1])

# Write comments to file
print("Writing comments to file...")
with open("/home/aa043/sea/data/td/ours/processing/neg_comments.txt", "w", encoding='utf-8') as f:
    count = 0
    for comment in coms_v3:
        f.write(comment + '+++\n')
        count += 1
print(str(count) + " comments written to file.")

# Write code fragments to file for JavaParser to parse
print("Writing code fragments to file...")
with open("/home/aa043/sea/data/td/ours/processing/neg_code/NegCodes.java", "w", encoding='utf-8') as f:  # write codes file
    f.write("/**\n * Dummy JavaDoc\n */\npublic class NegCodes {\n")
    count = 1  # To number the methods
    for code in clean_codes:
        f.write("/**\n * Dummy JavaDoc\n */\npublic void coverMethod" + str(count) + "() {\n\t" + code + "\n}\n\n")
        count += 1
    f.write("}\n")
print(str(count-1) + " code fragments written to file.")





# print("# all pairs =", len(codes))
# print("# clean pairs =", len(clean_codes))
# print("# removed pairs =", len(codes) - len(clean_codes))
# clean_comments = []
# for comment in coms_v1:
#     clean_comments.append(" ".join(comment.split()))
# print(len(clean_codes))
# print(len(sub_clean_comments))
# with open("/home/aa043/sea/data/td/ours/processing/Comments.java", "w", encoding='utf-8') as f:  # write codes file
#     f.write("public class Comments {\n")
#     count = 1
#     for code, comment in zip(clean_codes, sub_clean_comments):
#         f.write(comment + "\npublic void coverMethod" + str(count) + "() {\n\t" + code + "\n}\n\n")
#         count += 1
#     f.write("}\n")
#
# com_list = comment_parser.extract_comments('/home/aa043/sea/data/td/ours/processing/Comments.java', 'text/x-java-source')
# print(len(com_list))
# for com in com_list:
#     print(com.text())
#     print("==================================")
###with open("/home/aa043/sea/data/td/ours/processing/dirty_comments1.txt", "w", encoding='utf-8') as f:
   ### for comment in coms_v1:
      ###  f.write(comment + '\n+++\n')