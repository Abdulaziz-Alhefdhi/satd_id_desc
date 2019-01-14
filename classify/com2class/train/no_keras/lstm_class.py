from utils import retrieve_texts, data_shapes, shape_info, DataObject, token_integer_mapping, retrieve_data, build_model, train_model, test_model, project_info, average_info
import pickle


# epochs = 10          # Number of epochs to train for.
# latent_dim = 256     # Latent dimensionality of the encoding space.
# batch_size = latent_dim*2
# num_samples = 1000000  # Number of samples to train on.
# max_input_length = 5000

# Parameter tuning
embed_size = 128
lstm_size = 64
batch_size = 64
learning_rate = 0.001
epochs = 5
drop_prob = 0.5
num_samples = 1000000  # Number of samples to train on.
max_input_length = 5000

###project_names = ["argouml", "columba-1.4-src", "hibernate-distribution-3.3.2.GA", "jEdit-4.2", "jfreechart-1.0.19", "apache-jmeter-2.10", "jruby-1.4.0", "sql12"]
project_names = ["argouml"]


all_precisions, all_recalls, all_f1scores = [], [], []
# Loop through the 8 projects
for project in project_names:

    precisions, recalls, f1scores = [], [], []
    # 10-fold cross-validation
    for k in range(1, 11):

        # Prepare training and testing data
        num_input_tokens, model_inputs, model_outputs, test_model_inputs, test_model_outputs = \
            retrieve_data(project, k, num_samples, max_input_length, batch_size, embed_size, lstm_size)

        # Build model
        graph, initial_state, inputs_, labels_, keep_prob, accuracy, cost, final_state, optimizer, lstm_net, correct_pred, saver = \
            build_model(embed_size, lstm_size, num_input_tokens, batch_size, learning_rate)

        # Train model
        graph, inputs_, labels_, keep_prob, initial_state, accuracy, final_state, saver = \
            train_model(graph, initial_state, model_inputs, model_outputs, batch_size, epochs,
                    inputs_, labels_, keep_prob, drop_prob, accuracy, cost, final_state, optimizer, saver)

        # Test model
        predictions = test_model(graph, saver, lstm_net, batch_size, test_model_inputs, test_model_outputs, inputs_, labels_,
                   keep_prob, initial_state, correct_pred, accuracy, final_state)

        # Metrics
        all_preds = []
        for i in range(len(predictions)):
            for pred in predictions[i]:
                all_preds.append(True) if pred[0] == True else all_preds.append(False)
        tp, tn, fp, fn = 0, 0, 0, 0
        for pred, lbl in zip(all_preds, test_model_outputs):
            if pred == True:
                if lbl == 1:
                    tp += 1
                else:
                    tn += 1
            else:
                if lbl == 1:
                    fn += 1
                else:
                    fp += 1
        print("================")
        print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
        print("man. acc.", (tp + tn) / len(all_preds))
        p, r = tp / (tp + fp), tp / (tp + fn)
        f1 = 2 * p * r / (p + r)
        print("Precision:", p)
        print("Recall:", r)
        print("F1 Score:", f1)

        continue

        import sys
        sys.exit()

        # For calculating project metrics
        precisions.append(p)
        recalls.append(r)
        f1scores.append(f1)

        # Clear memory
        del model
        kk.clear_session()

    # Project metrics
    project_precision, project_recall, project_f1_score = project_info(precisions, recalls, f1scores)

    # For calculating average metrics
    all_precisions.append(project_precision)
    all_recalls.append(project_recall)
    all_f1scores.append(project_f1_score)


# Overall average metrics
average_info(all_precisions, all_recalls, all_f1scores)

