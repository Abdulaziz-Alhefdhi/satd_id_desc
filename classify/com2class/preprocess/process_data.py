from random import sample
import sys
import os


# Generate K-fold
def fold(a, n):
    if len(a) < n:
        sys.exit("Error: number of folds is bigger than the number of the actual items\nTerminating execution...")
    k, m = divmod(len(a), n)
    return list((a[i * k + min(i, m):(i + 1) * k + min(i + 1, m)] for i in range(n)))


def data_by_project(project_name, comments, projects, labels, k=10):
    # Separate positive and negative data
    neg_data, pos_data = [], []
    for comment, project, label in zip(comments, projects, labels):
        if project == project_name:
            if label == "WITHOUT_CLASSIFICATION":
                neg_data.append([comment, 0, project])
            else:
                pos_data.append([comment, 1, project])

    # Randomize data
    shuf_pos_data = sample(pos_data, k=len(pos_data))
    shuf_neg_data = sample(neg_data, k=len(neg_data))

    # K-folds
    pos_10_folded = fold(shuf_pos_data, k)
    neg_10_folded = fold(shuf_neg_data, k)

    # Separate comments and labels
    comments_folded, labels_folded = [], []
    # Loop folds
    for pos_fold, neg_fold in zip(pos_10_folded, neg_10_folded):
        pos_comments, pos_labels, neg_comments, neg_labels = [], [], [], []
        # Loop positive samples
        for item in pos_fold:
            pos_comments.append(item[0])
            pos_labels.append(item[1])
        # Loop negative samples
        for item in neg_fold:
            neg_comments.append(item[0])
            neg_labels.append(item[1])
        comments_folded.append(pos_comments + neg_comments)
        labels_folded.append(pos_labels + neg_labels)

    # Write comments and labels to files
    # Loop folds
    for i in range(k):
        train_path = "/home/aa043/sea/gpu/experiments/data/td/com2class/"+project_name+"/"+str(i+1)+"/train"
        test_path  = "/home/aa043/sea/gpu/experiments/data/td/com2class/"+project_name+"/"+str(i+1)+"/test"
        os.makedirs(train_path, exist_ok=True)
        os.makedirs(test_path, exist_ok=True)
        # Write validation fold
        with open(test_path+"/comments.txt", 'w', encoding='utf-8') as f:
            # Loop the comments of the validation fold
            for comment in comments_folded[i]:
                f.write(comment+"\n")
        with open(test_path+"/labels.txt", 'w', encoding='utf-8') as f:
            # Loop the labels of the validation fold
            for lbl in labels_folded[i]:
                f.write(str(lbl)+"\n")
        # Write training folds
        with open(train_path+"/comments.txt", 'w', encoding='utf-8') as f:
            conc_train_comms = []
            if 0 < i < k-1:
                conc_train_comms = comments_folded[:i] + comments_folded[i+1:]
            if i == 0:
                conc_train_comms = comments_folded[i+1:]
            if i == k-1:
                conc_train_comms = comments_folded[:i]
            # Loop the comments of all the training folds
            for a_fold in conc_train_comms:
                for comment in a_fold:
                    f.write(comment+"\n")
        with open(train_path+"/labels.txt", 'w', encoding='utf-8') as f:
            conc_train_lbls = []
            if 0 < i < k-1:
                conc_train_lbls = labels_folded[:i] + labels_folded[i + 1:]
            if i == 0:
                conc_train_lbls = labels_folded[i+1:]
            if i == k-1:
                conc_train_lbls = labels_folded[:i]
            # Loop the labels of all the training folds
            for a_fold in conc_train_lbls:
                for lbl in a_fold:
                    f.write(str(lbl)+"\n")

    print(project_name, "data have been written to disk.")


# Read from files
with open('/home/aa043/sea/gpu/experiments/data/td/com2class/comments.txt', 'r', encoding='utf-8') as f:
    comments = f.read().split("\n")
comments = comments[:-1]  # Remove last (empty) item
with open('/home/aa043/sea/gpu/experiments/data/td/com2class/projects.txt', 'r', encoding='utf-8') as f:
    projects = f.read().split("\n")
projects = projects[:-1]  # Remove last (empty) item
with open('/home/aa043/sea/gpu/experiments/data/td/com2class/labels.txt', 'r', encoding='utf-8') as f:
    labels = f.read().split("\n")
labels = labels[:-1]  # Remove last (empty) item

# Separate project data
data_by_project("argouml", comments, projects, labels)
data_by_project("columba-1.4-src", comments, projects, labels)
data_by_project("hibernate-distribution-3.3.2.GA", comments, projects, labels)
data_by_project("jEdit-4.2", comments, projects, labels)
data_by_project("jfreechart-1.0.19", comments, projects, labels)
data_by_project("apache-jmeter-2.10", comments, projects, labels)
data_by_project("jruby-1.4.0", comments, projects, labels)
data_by_project("sql12", comments, projects, labels)

#print(len(argouml_data), len(columba_data), len(hibernate_data), len(jedit_data), len(jfreechart_data), len(jmeter_data), len(jruby_data), len(sql_data))
#print(len(argouml_data)+len(columba_data)+len(hibernate_data)+len(jedit_data)+len(jfreechart_data)+len(jmeter_data)+len(jruby_data)+len(sql_data))
