import json
import re


# Retrieve data from disk
with open('/home/aa043/sea/data/td/ours/pos.json', 'r') as f:
    tds = json.load(f)

# Extract comments and code fragments
codes, comments = [], []
for i in range(len(tds)):
    if i % 2 == 0:  # If a comment
        if len(tds[i]) == 1:  # If not a multiple comment
            comments.append("".join(tds[i][0]))
            codes.append(" ".join(tds[i+1]))

# Ignore defected code's pairs
clean_codes, coms_v1 = [], []
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

# Write 1st version of comments to file
with open("/home/aa043/sea/data/td/ours/processing/dirty_comments1.txt", "w", encoding='utf-8') as f:
    for comment in coms_v1:
        f.write(comment + '\n+++\n')

# Write 2nd version of comments to file (remove whitespaces)
coms_v2 = []
for comment in coms_v1:
    coms_v2.append(" ".join(re.findall(r'\S+|\n', comment)).replace(' \n ', '\n'))
with open("/home/aa043/sea/data/td/ours/processing/dirty_comments2.txt", "w", encoding='utf-8') as f:
    for comment in coms_v2:
        f.write(comment + '\n+++\n')

# Write 3rd version of comments to file (remove commenting characters)
coms_v3 = []
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
    coms_v3.append(" ".join(temp_list2))
with open("/home/aa043/sea/data/td/ours/processing/comments.txt", "w", encoding='utf-8') as f:
    for comment in coms_v3:
        f.write(comment + '+++\n')

# Write code fragments to file for JavaParser to parse
with open("/home/aa043/sea/data/td/ours/processing/Codes.java", "w", encoding='utf-8') as f:  # write codes file
    f.write("/**\n * Dummy JavaDoc\n */\npublic class Codes {\n")
    count = 1
    for code in clean_codes:
        f.write("/**\n * Dummy JavaDoc\n */\npublic void coverMethod" + str(count) + "() {\n\t" + code + "\n}\n\n")
        count += 1
    f.write("}\n")
print(str(count) + " code fragments written to file.")





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