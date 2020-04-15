import sys
import datetime
from pre_proc_utils import retrieve_data, extract_codes_and_comments, remove_unparsable_codes, process_comments


data_dir = "/home/aziz/experiments/data/td/v3/"

start_time = datetime.datetime.now().replace(microsecond=0)

print("Retrieving data from disk...")
tds, non_tds = retrieve_data(data_dir)

print("Extracting comments and code fragments...")
td_cod_com_pairs = extract_codes_and_comments(tds)
non_td_cod_com_pairs = extract_codes_and_comments(non_tds)
print(len(td_cod_com_pairs), "TD observations extracted")
print(len(non_td_cod_com_pairs), "non-TD observations extracted")

print("Removing pairs with unparsable code fragments...")
parsable_td_pairs = remove_unparsable_codes(td_cod_com_pairs)
parsable_non_td_pairs = remove_unparsable_codes(non_td_cod_com_pairs)
print("There are", len(parsable_td_pairs), "parsable TD observations")
print("There are", len(parsable_non_td_pairs), "parsable non-TD observations")

print("Processing comments...")
clean_td_pairs, clean_td_pairs_w_multi = process_comments(parsable_td_pairs)
clean_non_td_pairs, clean_non_td_pairs_w_multi = process_comments(parsable_non_td_pairs)

end_time = datetime.datetime.now().replace(microsecond=0)
print("Running took (h:m:s)", end_time - start_time)

sys.exit()

refined_td_pairs = sorted(list(set(clean_td_pairs)))
refined_non_td_pairs = sorted(list(set(clean_non_td_pairs)))

print("Creating labels (0 for non-TD and 1 for TD)...")
positive_labels = [1 for x in positive_pairs_reduced]
negative_labels = [0 for y in negative_pairs_reduced]

print("Separating code-comment pairs...")
positive_codes = [x[0] for x in positive_pairs_reduced]
positive_comments = [x[1] for x in positive_pairs_reduced]
negative_codes = [x[0] for x in negative_pairs_reduced]
negative_comments = [x[1] for x in negative_pairs_reduced]

print("Aggregating pos. and neg. data together...")
draft_codes = positive_codes + negative_codes
draft_comments = positive_comments + negative_comments

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

sys.exit()

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






'''

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



# data_path = "/home/aa043/sea/data/td/ours/v2/CT/"
data_path = "/home/aziz/experiments/data/td/v3/"

# Retrieve data from disk
print("Extracting data...")
with open(data_path+'pos.json', 'r') as f:
    tds = json.load(f)
print(len(tds)//2, "TD observations extracted")
# with open(data_path+'neg.json', 'r') as f:
#     non_tds = json.load(f)
# print(len(non_tds)//2, "non-TD observations extracted")

print('============')
print(type(tds), type(tds[0]), type(tds[0][0][0]))
print('============')
print(tds[0][0])
print(tds[1])
sys.exit()

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

print('=================')
print(all_clean_codes[0])
print('=================')
print(all_clean_coms[0])
print('=================')
print(all_lbls[0])

sys.exit()

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
'''