

import os, re
def keres(filename):
    with open(filename,"r") as file:
        for line in file:
            if re.search("todo", line): # Ha talált
                return(True)
    return(False)

def link(newfile):
    
    
    file1 = open('todos.txt','a') # megnyitja a korábbi táblát
    file2 = open(newfile, 'r')      # megnyitja a mintát tartalmazó táblát
    while(True):
        line = file2.readline()
        if line == '': break    # ha üres sor jött, vége a fájlnak, kilép
        file1.write(line)
    file2.close()
    file1.close()

print ("\n----------------------------todo kereső-------------------------------")
subdir = '.git'
files = os.listdir(subdir)
for fl in files:
    siker = keres(subdir+'//'+fl)
    print(fl,siker)
    if siker: link(subdir+'//'+fl)  # Ha van benne "todo" hozzáfűzi