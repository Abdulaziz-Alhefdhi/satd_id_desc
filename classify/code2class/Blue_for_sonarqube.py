def calculate_metrics(predictions, y_test):
    tp, tn, fp, fn = 0, 0, 0, 0
    for pred, lbl in zip(predictions, y_test):
        if lbl == 1 and pred == 1:
            tp += 1
        if lbl == 0 and pred == 0:
            tn += 1
        if lbl == 0 and pred == 1:
            fp += 1
        if lbl == 1 and pred == 0:
            fn += 1
    print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
    p, r, f1, acc = 0, 0, 0, 0
    if tp + fp > 0 and tp + fn > 0:
        p, r = tp / (tp + fp), tp / (tp + fn)
    elif tp + fp > 0:
        p = tp / (tp + fp)
    elif tp + fn > 0:
        r = tp / (tp + fn)
    if (p + r) > 0:
        f1 = 2 * p * r / (p + r)
    acc = (tp+tn)/(tp+tn+fp+fn)
    print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Score =", "%.3f" % f1, "- Accuracy =", "%.3f" % acc)

    return tp, tn, fp, fn, p, r, f1, acc


gt_satd = [1 for x in range(2715)]
gt_satd_sonar_satd = [1 for x in range(252)]
gt_satd_sonar_non_satd = [0 for x in range(len(gt_satd)-252)]
print(len(gt_satd_sonar_satd), len(gt_satd_sonar_non_satd), len(gt_satd_sonar_satd)+len(gt_satd_sonar_non_satd))

gt_non_satd = [0 for x in range(2719)]
gt_non_satd_sonar_satd = [1 for x in range(212)]
gt_non_satd_sonar_non_satd = [0 for x in range(len(gt_non_satd)-212)]

print(len(gt_non_satd_sonar_satd), len(gt_non_satd_sonar_non_satd), len(gt_non_satd_sonar_satd)+len(gt_non_satd_sonar_non_satd))
gt = gt_satd + gt_non_satd
sonar = gt_satd_sonar_satd + gt_satd_sonar_non_satd + gt_non_satd_sonar_satd + gt_non_satd_sonar_non_satd

print(len(gt), len(sonar))

tp, tn, fp, fn, p, r, f1, acc = calculate_metrics(sonar, gt)
