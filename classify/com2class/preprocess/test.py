from sklearn.model_selection import KFold
import numpy as np
x = np.array([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19])
kf = KFold(n_splits=10)
x_train, x_test = [], []
for train_index, test_index in kf.split(x):
    x_train.append(x[train_index])
    x_test.append(x[test_index])
for i1, i2 in zip(x_train, x_test):
    print("============")
    print(type(i1.tolist()))
    print(type(i2.tolist()))