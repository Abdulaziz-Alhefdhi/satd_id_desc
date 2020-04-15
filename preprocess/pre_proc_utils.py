import json
import re


def retrieve_data(directory):
    with open(directory + 'pos.json', 'r') as f:
        td_codes_comments = json.load(f)
    with open(directory + 'neg.json', 'r') as f:
        non_td_codes_comments = json.load(f)

    return td_codes_comments, non_td_codes_comments


def extract_codes_and_comments(data):
    code_comment_pairs = []
    for i in range(len(data)):
        if i % 2 == 0:  # If a comment
            code = " ".join(data[i + 1])
            comment = "".join(data[i][0])
            code_comment_pairs.append((code, comment))

    return code_comment_pairs


def remove_unparsable_codes(pairs):
    parsable_pairs = []
    for pair in pairs:
        flag = False
        tokens = pair[0].split()
        for i, token in enumerate(tokens):
            if token == '<' and tokens[i + 1] == '<':
                flag = True
                break
            if token == '>' and tokens[i + 1] == '>':
                flag = True
                break
            if token == 'Enumeration' and tokens[i + 1] == 'enum':
                flag = True
                break
            if token == '\\' and tokens[i + 1] == b'\xef\xbf\xbd'.decode("utf-8", "strict"):
                flag = True
                break
        if not flag:
            parsable_pairs.append(pair)

    return parsable_pairs


def process_comments(pairs):
    # Remove strange whitespaces
    pairs_no_spaces = []
    for pair in pairs:
        pairs_no_spaces.append((pair[0], " ".join(re.findall(r'\S+|\n', pair[1])).replace(' \n ', '\n')))

    # Remove commenting characters
    pairs_no_comm_chars = []
    for pair in pairs_no_spaces:
        temp_list = pair[1].split("\n")  # Every line in a separate item of the list
        temp_list2 = []
        for item in temp_list:
            stripped = item.lstrip("//")
            stripped = stripped.lstrip("/**")
            stripped = stripped.lstrip("/*")
            stripped = stripped.rstrip("*/")
            stripped = stripped.lstrip("*")
            stripped = stripped.strip()
            temp_list2.append(stripped)  # Append clean line to the new list
        pairs_no_comm_chars.append((pair[0], "\n".join(temp_list2)))  # Join lines

    # Make every comment a one-liner
    clean_pairs = []
    clean_pairs_w_multi = []
    for pair in pairs_no_comm_chars:
        clean_pairs.append((pair[0], " ".join(pair[1].split())))
        clean_pairs_w_multi.append((pair[0], " ".join(pair[1].split()), pair[1]))

    # Return comments as one-liners and as multi-liners
    return clean_pairs, clean_pairs_w_multi


def write_to_file(path, file_name, a_list):
    with open(path + file_name, "w", encoding='utf-8') as file:
        for item in a_list:
            file.write(str(item) + '\n')
