# comments_path = "/home/aziz/dsl/cpu/sea/gpu/experiments/gpu_data_packup/data/satd/comgen_bm/parsable/comments_multiline.txt"
#
# with open(comments_path, 'r', encoding='utf-8') as ff:
#     comments = ff.read().split("\n+++\n")[:-1]
#
# num_dps_each = 100
#
# for comment in list(reversed(comments))[:num_dps_each]:
#     print(comment)
#     print("==================")


comments_path = "/home/aziz/dsl/cpu/sea/gpu/experiments/gpu_data_packup/data/satd/comgen_bm/framework_ready/comments.txt"

with open(comments_path, 'r', encoding='utf-8') as ff:
    comments = ff.read().split("\n")[:-1]

satd_comments, non_satd_comments = comments[:2719], comments[2719:]

print(len(satd_comments), len(non_satd_comments))
print(satd_comments[0])
print(non_satd_comments[0])

satd_lists = [x.split(" ")[1:-1] for x in satd_comments]
non_satd_lists = [x.split(" ")[1:-1] for x in non_satd_comments]

satd_num_words = sum([len(x) for x in satd_lists])
non_satd_num_words = sum([len(x) for x in non_satd_lists])

print(satd_num_words, non_satd_num_words)

print("avg satd:", satd_num_words/len(satd_lists))
print("avg non_satd:", non_satd_num_words/len(non_satd_lists))
