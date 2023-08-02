import csv


file = 'counter_party.csv'
table = file.replace('.csv','')

openFile = open(file, 'r')
csvFile = csv.reader(openFile)
header = next(csvFile)
transformed_columns=[]

for column_name in header:
    transformed_columns.append((column_name.encode('ascii','ignore').decode('utf')))

headers = map((lambda x: '`' + x + '`'), transformed_columns)
insert = f'INSERT INTO {table} (' + ", ".join(headers) + ") VALUES "
for row in csvFile:
    values = map((lambda x: "'" + x + "'"), row)
    print(insert + "(" + ", ".join(values) +");" )
openFile.close()