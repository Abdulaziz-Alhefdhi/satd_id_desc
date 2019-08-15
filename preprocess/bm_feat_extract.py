from lxml import etree as ET
from support_functions import extract_code_metrics, feature_set_counts, calc_cyclo, extract_pmd_metrics, \
    retrieve_r, create_bm_dataset


data_dir = "/home/aa043/sea/data/td/ours/v2/CT/framework_ready/"
parser = ET.XMLParser(recover=True)

# Prepare for extracting source code metrics (M)
cv_forest, cv_m_counts = extract_code_metrics(data_dir+'temp/codes.xml', parser)
tune_forest, tune_m_counts = extract_code_metrics(data_dir+'temp/tune_val/codes.xml', parser)
print("# CV M inputs:", len(cv_m_counts))
print("# tuning M inputs:", len(tune_m_counts))
print("==========")

# Calculate cyclomatic complexity (McCabe)
cv_cyclos = calc_cyclo(cv_forest)
tune_cyclos = calc_cyclo(tune_forest)
print("# CV cyclos:", len(cv_cyclos))
print("# tuning cyclos:", len(tune_cyclos))
print("==========")

# Prepare for extracting PMD metrics (P)
cv_p_counts = extract_pmd_metrics(data_dir+"temp/pmd_report.csv", len(cv_m_counts))
tune_p_counts = extract_pmd_metrics(data_dir+"temp/tune_val/pmd_report.csv", len(tune_m_counts))
print("# CV P inputs:", len(cv_p_counts))
print("# tuning P inputs:", len(tune_p_counts))
print("==========")

# Retrieve readability scores (R)
cv_reads = retrieve_r(data_dir+'temp/readability.txt')
tune_reads = retrieve_r(data_dir+'temp/tune_val/readability.txt')
print("# CV Rs:", len(cv_reads))
print("# tuning Rs:", len(tune_reads))
print("==========")

# Create features and save to csv files
# create_bm_dataset(cv_m_counts, cv_p_counts, cv_cyclos, cv_reads, data_dir+'labels.txt', data_dir+'bm_data.csv')  # CV set
# print("CV features have been written to CSV file")
# create_bm_dataset(tune_m_counts, tune_p_counts, tune_cyclos, tune_reads, data_dir+'tune_val/labels.txt', data_dir+'tune_val/bm_data.csv')  # Tuning set
# print("Tuning features have been written to CSV file")
