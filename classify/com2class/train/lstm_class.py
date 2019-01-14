from utils import retrieve_texts, data_shapes, shape_info, DataObject, token_integer_mapping, retrieve_data, build_model, train_model, test_model, project_info, average_info
import numpy as np
from keras import backend as kk



epochs = 10          # Number of epochs to train for.
latent_dim = 256     # Latent dimensionality of the encoding space.
batch_size = latent_dim*2
num_samples = 1000000  # Number of samples to train on.
max_input_length = 5000
project_names = ["argouml", "columba-1.4-src", "hibernate-distribution-3.3.2.GA", "jEdit-4.2", "jfreechart-1.0.19", "apache-jmeter-2.10", "jruby-1.4.0", "sql12"]


all_precisions, all_recalls, all_f1scores = [], [], []
# Loop through the 8 projects
for project in project_names:

    precisions, recalls, f1scores = [], [], []
    # 10-fold cross-validation
    for k in range(1, 11):

        # Prepare training and testing data
        num_input_tokens, model_inputs, model_outputs, test_model_inputs, target_labels = \
            retrieve_data(project, k, num_samples, max_input_length, batch_size, latent_dim)

        # Build model
        model = build_model(latent_dim, num_input_tokens)
        model.summary()

        # Train model
        train_model(model, model_inputs, model_outputs, batch_size, epochs)

        # Test model
        p, r, f1 = test_model(model, test_model_inputs, target_labels)

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

