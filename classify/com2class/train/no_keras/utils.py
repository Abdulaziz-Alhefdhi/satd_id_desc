import tensorflow as tf
import numpy as np
import datetime
import pickle


def preprocess(data_path, num_samples, max_input_length):
    # Variable declarations
    vocab, seqs, labels = set(), [], []
    # Retrieve dat from files
    with open(data_path + 'comments.txt', 'r', encoding='utf-8') as f:
        s_lines = f.read().split('\n')
    with open(data_path + 'labels.txt', 'r', encoding='utf-8') as f:
        l_lines = f.read().split('\n')
    # Keep only num_samples
    s_lines = s_lines[: min(num_samples, len(s_lines) - 1)]
    l_lines = l_lines[: min(num_samples, len(l_lines) - 1)]

    # Tokenize
    for seq, label in zip(s_lines, l_lines):
        # Throwing out long texts
        if len(seq) > max_input_length:
            continue
        # Replace problematic characters that're basically spaces!
        for char in ['\u2009', '\u202f', '\xa0']:
            seq = seq.replace(char, ' ')
        seqs.append(seq)
        labels.append(label)
        # Delete non-alphabetic input data
        for char in seq:
            if (not char.isalpha()) and (char != " "):
                seq = seq.replace(char, " ")
        # Tokenize targets
        for token in seq.split():
            vocab.add(token.lower())

    # Return desired data, with tokens being sorted and converted to list
    return sorted(list(vocab)), seqs, labels


def retrieve_texts(data_path, num_samples, max_input_length):
    vocab, seqs, labels = preprocess(data_path, num_samples, max_input_length)
    # Special treatment for input code sequences
    features = []
    for seq in seqs:
        for char in seq:
            if (not char.isalpha()) and (char != " "):
                seq = seq.replace(char, " ")
        a_list = []
        for token in seq.split():
            a_list.append(token.lower())
        # a_list, word = [], ''
        # for i, char in enumerate(seq):
        #     # Deal with words of multiple characters as one token and ignore non-alphabetic chars
        #     if char.isalpha():
        #         word += char
        #         if (i == len(seq) - 1) or (not seq[i + 1].isalpha()):
        #             a_list.append(word.lower())
        #     # Deal with non-alphabetic characters
        #     else:
        #         word = ''
        features.append(a_list)
    # add "<unknown>" token for unknown words during testing
    vocab = vocab + ["<unknown>"]

    return seqs, features, vocab, labels



class DataObject:
    def __init__(self, seqs, features, vocab, labels):
        self.seqs = seqs
        self.features = features
        self.vocab = vocab
        self.labels = labels



def data_shapes(do):
    num_encoder_tokens = len(do.vocab)
    max_encoder_seq_length = max([len(txt) for txt in do.features])
    n_input_samples = len(do.features)

    return num_encoder_tokens, max_encoder_seq_length, n_input_samples


def shape_info(n_input_samples, num_encoder_tokens, max_encoder_seq_length):
    print('Number of samples:', n_input_samples)
    print('Number of unique input tokens:', num_encoder_tokens)
    print('Max sequence length for inputs:', max_encoder_seq_length)


def token_integer_mapping(input_tokens):
    input_token_index = dict([(token, i+1) for i, token in enumerate(input_tokens)])
    reverse_input_token_index = dict((i, token) for token, i in input_token_index.items())
    return input_token_index, reverse_input_token_index


def retrieve_data(project, k, num_samples, max_input_length, batch_size, embed_size, lstm_size):
    # Set paths
    train_path = '/home/aziz/experiments/data/td/com2class/' + project + '/' + str(k) + '/train/'
    test_path = '/home/aziz/experiments/data/td/com2class/' + project + '/' + str(k) + '/test/'

    # Training data
    seqs, features, vocab, labels = retrieve_texts(train_path, num_samples, max_input_length)
    train_do = DataObject(seqs, features, vocab, labels)
    num_input_tokens, max_input_seq_length, n_input_samples = data_shapes(train_do)
    print("================\nTraining data info:-")
    shape_info(n_input_samples, num_input_tokens, max_input_seq_length)
    print("Batch size:", batch_size)
    print("Embedding dimensionality:", embed_size)
    print("LSTM layer size:", lstm_size)
    print("Project:", project)
    print("CV #:", k)
    print("================")

    # Converting tokens to integers and reverse-lookup token index
    input_token_index, reverse_input_token_index = token_integer_mapping(train_do.vocab)
    # Define model's input/output training data
    model_inputs = np.zeros((n_input_samples, max_input_seq_length), dtype='int32')
    model_outputs = np.array(train_do.labels, dtype='int32')
    for i, feature in enumerate(train_do.features):
        for t, token in enumerate(feature):
            model_inputs[i, t] = input_token_index[token]

    # Testing data
    seqs, features, vocab, labels = retrieve_texts(test_path, num_samples, max_input_length)
    test_do = DataObject(seqs, features, vocab, labels)
    test_num_input_tokens, test_max_input_seq_length, test_n_input_samples = data_shapes(test_do)
    print("Testing data info:-")
    shape_info(test_n_input_samples, test_num_input_tokens, test_max_input_seq_length)
    print("================")
    # Replace unseen-before tokens with: <unknown>
    # Find
    unseen_tokens = []
    for token in test_do.vocab:
        if token not in train_do.vocab:
            unseen_tokens.append(token)
    # Replace
    for i in range(len(test_do.features)):
        for j in range(len(test_do.features[i])):
            if test_do.features[i][j] in unseen_tokens:
                test_do.features[i][j] = "<unknown>"
    # Prepare input data for model evaluation session
    test_model_inputs = np.zeros((test_n_input_samples, test_max_input_seq_length), dtype='int32')
    test_model_outputs = np.array(test_do.labels, dtype='int32')
    for i, feature in enumerate(test_do.features):
        for t, token in enumerate(feature):
            test_model_inputs[i, t] = input_token_index[token]

    return num_input_tokens, model_inputs, model_outputs, test_model_inputs, test_model_outputs


def build_model(embed_size, lstm_size, num_input_tokens, batch_size, learning_rate):
    n_words = num_input_tokens+1  # Adding 1 because we use 0's for padding, dictionary started at 1
    # Create and add nodes to the TensorFlow's graph object
    graph = tf.Graph()
    with graph.as_default():
        # Model inputs, outputs, and dropout-keep-prob
        inputs_ = tf.placeholder(tf.int32, [None, None], name="inputs")
        labels_ = tf.placeholder(tf.int32, [None, None], name="labels")
        keep_prob = tf.placeholder(tf.float32, name="keep_prob")
        # Embedding configuration
        embedding = tf.Variable(tf.random_uniform((n_words, embed_size), -1, 1))  # The embedding matrix
        embed = tf.nn.embedding_lookup(embedding, inputs_)  # The embedded vectors
        # Defining LSTMs
        lstm = tf.contrib.rnn.BasicLSTMCell(lstm_size)  # LSTM layer
        drop = tf.contrib.rnn.DropoutWrapper(lstm, output_keep_prob=keep_prob)  # Dropout layer
        lstm_net = tf.contrib.rnn.MultiRNNCell([drop])  # Stacking LSTM layers
        initial_state = lstm_net.zero_state(batch_size, tf.float32)
        # The feed-forward step
        outputs, final_state = tf.nn.dynamic_rnn(lstm_net, embed, initial_state=initial_state)
        predictions = tf.contrib.layers.fully_connected(outputs[:, -1], 1, activation_fn=tf.sigmoid)
        # The back-propagation step
        cost = tf.losses.mean_squared_error(labels_, predictions)
        optimizer = tf.train.AdamOptimizer(learning_rate).minimize(cost)
        # Model accuracy
        correct_pred = tf.equal(tf.cast(tf.round(predictions), tf.int32), labels_)
        accuracy = tf.reduce_mean(tf.cast(correct_pred, tf.float32))
        # Model saver (checkpoints)
        saver = tf.train.Saver()

    return graph, initial_state, inputs_, labels_, keep_prob, accuracy, cost, final_state, optimizer, lstm_net, correct_pred, saver


# def get_batches(x, y, batch_size):
#     for i in range(0, len(x), batch_size):
#         yield x[i:i+batch_size], y[i:i+batch_size]

def get_batches(x, y, batch_size):
    n_batches = len(x) // batch_size
    x, y = x[:n_batches*batch_size], y[:n_batches*batch_size]
    for i in range(0, len(x), batch_size):
        yield x[i:i+batch_size], y[i:i+batch_size]

def train_model(graph, initial_state, model_inputs, model_outputs, batch_size, epochs,
                inputs_, labels_, keep_prob, drop_prob, accuracy, cost, final_state, optimizer, saver):
    print("Training started at:", datetime.datetime.now())
    print("================")

    train_acc = []
    with tf.Session(graph=graph) as sess:
        sess.run(tf.global_variables_initializer())
        iteration = 0
        # Looping through epochs
        for e in range(epochs):
            state = sess.run(initial_state)
            # Looping through batches within an epoch
            for i, (x, y) in enumerate(get_batches(model_inputs, model_outputs, batch_size), 1):
                feed = {inputs_: x, labels_: y[:, None], keep_prob: drop_prob, initial_state: state}  # Feed-forward
                epoch_acc, loss, state, _ = sess.run([accuracy, cost, final_state, optimizer], feed_dict=feed)  # Back-propagation
                train_acc.append(epoch_acc)
                iteration += 1
            print("Epoch: {}/{} -".format(e + 1, epochs), "Iteration: {} -".format(iteration),
                  "Training Loss: {:.4f} -".format(loss), "Train. Acc.: {:.4f}".format(np.mean(train_acc)))
        # Save the trained model to disk
        saver.save(sess, "checkpoints/sentiment.ckpt")

    print("================")
    print("Training completed at:", datetime.datetime.now())
    print("================")

    return graph, inputs_, labels_, keep_prob, initial_state, accuracy, final_state, saver


def test_model(graph, saver, lstm_net, batch_size, test_model_inputs, test_model_outputs, inputs_, labels_,
               keep_prob, initial_state, correct_pred, accuracy, final_state):
    test_acc = []
    test_preds = []
    with tf.Session(graph=graph) as sess:
        # Restore the saved model
        saver.restore(sess, tf.train.latest_checkpoint('checkpoints'))
        test_state = sess.run(lstm_net.zero_state(batch_size, tf.float32))
        for i, (x, y) in enumerate(get_batches(test_model_inputs, test_model_outputs, batch_size), 1):
            feed = {inputs_: x, labels_: y[:, None], keep_prob: 1, initial_state: test_state}
            test_pred, batch_acc, test_state = sess.run([correct_pred, accuracy, final_state], feed_dict=feed)
            test_acc.append(batch_acc)
            test_preds.append(test_pred)
        print("================")
        print("Test Accuracy: {:.4f}".format(np.mean(test_acc)))

    with open('/home/aziz/experiments/output/td/classify/com2class/predicted_outputs.pkl', 'wb') as f:
        pickle.dump(test_preds, f)

    return test_preds
    # predictions = model.predict_classes(test_model_inputs, verbose=1, batch_size=256)
    # tp, tn, fp, fn = 0, 0, 0, 0
    # for pred, lbl in zip(predictions, target_labels):
    #     if int(lbl) == 1 and pred[0] == 1: tp += 1
    #     if int(lbl) == 0 and pred[0] == 0: tn += 1
    #     if int(lbl) == 0 and pred[0] == 1: fp += 1
    #     if int(lbl) == 1 and pred[0] == 0: fn += 1
    # print("TPs =", tp, "- TNs =", tn, "- FPs =", fp, "- FNs =", fn, "- Total # of testing samples =", tp + tn + fp + fn)
    # p, r = tp / (tp + fp), tp / (tp + fn)
    # f1 = 2 * p * r / (p + r)
    # print("Precision =", "%.3f" % p, "- Recall =", "%.3f" % r, "- F1 Socre =", "%.3f" % f1)
    #
    # return p, r, f1


def project_info(precisions, recalls, f1scores):
    print("================")
    print("CV Precisions:", precisions)
    print("CV Recalls:", recalls)
    print("CV F1 Scores:", f1scores)
    project_precision = sum(precisions) / len(precisions)
    project_recall = sum(recalls) / len(recalls)
    project_f1_score = sum(f1scores) / len(f1scores)
    print("Project Precision:", project_precision)
    print("Project Recall:", project_recall)
    print("Project F1 Score:", project_f1_score)

    return project_precision, project_recall, project_f1_score


def average_info(all_precisions, all_recalls, all_f1scores):
    print("================")
    print("Project Precisions:", all_precisions)
    print("Project Recalls:", all_recalls)
    print("Project F1 Scores:", all_f1scores)
    print("Average Precision:", sum(all_precisions) / len(all_precisions))
    print("Average Recall:", sum(all_recalls) / len(all_recalls))
    print("Average F1 Score:", sum(all_f1scores) / len(all_f1scores))
