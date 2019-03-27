import pickle


with open('/home/aziz/experiments/output/td/classify/code2class/v2/cv/dim64_b64/tps.pkl', 'rb') as f:
    tps = pickle.load(f)
with open('/home/aziz/experiments/output/td/classify/code2class/v2/cv/dim64_b64/tns.pkl', 'rb') as f:
    tns = pickle.load(f)
with open('/home/aziz/experiments/output/td/classify/code2class/v2/cv/dim64_b64/fps.pkl', 'rb') as f:
    fps = pickle.load(f)
with open('/home/aziz/experiments/output/td/classify/code2class/v2/cv/dim64_b64/fns.pkl', 'rb') as f:
    fns = pickle.load(f)


accs = []
for f_tp, f_tn, f_fp, f_fn in zip(tps, tns, fps, fns):
    f_accs = []
    for e_tp, e_tn, e_fp, e_fn in zip(f_tp, f_tn, f_fp, f_fn):
        f_accs.append((e_tp+e_tn)/(e_tp+e_tn+e_fp+e_fn))
    accs.append(f_accs)

best_accs = []
for f_accs in accs:
    best_accs.append(max(f_accs))

for acc in best_accs:
    print("%.3f"%acc)
print("=============")
print("avg. acc. =", "%.3f"%(sum(best_accs)/len(best_accs)))