from random import seed
import sys
sys.path.append('/home/aa043/sea/gpu/experiments/problems/tech_debt/classify/com2class/')
from com2class_utils import process_comments, DataObject, data_by_project, token_integer_mapping, write_data_to_disk

# To generate the same randomized data every time we run this code
seed(30)
data_dir = '/home/aa043/sea/gpu/experiments/data/td/com2class/'
project_names = ("argouml", "columba-1.4-src", "hibernate-distribution-3.3.2.GA", "jEdit-4.2",
                 "jfreechart-1.0.19", "apache-jmeter-2.10", "jruby-1.4.0", "sql12")  # emf-2.4.1 & apache-ant-1.7.0
max_sen_len = 300

# Read from files
with open(data_dir+'comments.txt', 'r', encoding='utf-8') as f:
    comments = f.read().split("\n")
with open(data_dir+'projects.txt', 'r', encoding='utf-8') as f:
    projects = f.read().split("\n")
with open(data_dir+'labels.txt', 'r', encoding='utf-8') as f:
    labels = f.read().split("\n")
# Remove last (empty) item
comments = comments[:-1]
projects = projects[:-1]
labels = labels[:-1]

# Process comments
comment_lists = process_comments(comments, max_sen_len)

# Separate project data
argouml =    data_by_project(project_names[0], comment_lists, comments, projects, labels)
columba =    data_by_project(project_names[1], comment_lists, comments, projects, labels)
hibernate =  data_by_project(project_names[2], comment_lists, comments, projects, labels)
jedit =      data_by_project(project_names[3], comment_lists, comments, projects, labels)
jfreechart = data_by_project(project_names[4], comment_lists, comments, projects, labels)
jmeter =     data_by_project(project_names[5], comment_lists, comments, projects, labels)
jruby =      data_by_project(project_names[6], comment_lists, comments, projects, labels)
sql =        data_by_project(project_names[7], comment_lists, comments, projects, labels)

project_list = [argouml, columba, hibernate, jedit, jfreechart, jmeter, jruby, sql]

# Vocabulary indexing
all_comment_array = [x for proj in project_list for x in proj.comm_lists]
words_to_ints, ints_to_words = token_integer_mapping(all_comment_array)

write_data_to_disk(project_list, words_to_ints, ints_to_words, data_dir+'data_objects/')
print('Dataset has been written to disk')
