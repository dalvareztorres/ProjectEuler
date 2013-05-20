
dict = { "1":"one", "2":"two", "3":"three", "4":"four", "5":"five","6":"six","7":"seven", "8":"eight", "9":"nine", "10":"ten", "11":"eleven",
         "12":"twelve", "13":"thirteen", "14":"fourteen", "15":"fifteen", "16":"sixteen", "17":"seventeen", "18":"eighteen", "19":"nineteen",
         "20":"twenty", "30":"thirty", "40":"forty", "50":"fifty", "60":"sixty", "70":"seventy", "80":"eighty", "90":"ninety",
         "01":"one", "02":"two", "03":"three", "04":"four", "05":"five","06":"six","07":"seven", "08":"eight", "09":"nine"}

a = "and"
h = "hundred"
n = 0
pp = []
                
def formatNumber(y):
    if (int(y) > 99):
        pp.append(y[0])
        pp.append(h)
        pp.append(a)
        if (int(y[1:3]) < 20):
            pp.append(y[1:3])
        else:
            pp.append(str(int(y[1])*10))
            pp.append(y[2])
    else:
        if (int(y) < 20):
            pp.append(y)
        else:
            pp.append(str(int(y[0])*10))
            pp.append(y[1])
        
    
    
    

def numberOfLetters(x):
    n = 0
    formatNumber(x)
    for element in pp:
        if element in dict:
            n+=len(dict[element])
        else:
            if element != "0" and element != '00':
                n+=len(element)
    return n

t = 0
for i in range(1,1000):
    pp = []
    t+= (numberOfLetters(str(i)))
    
# add 11 because didn't add 'one thousand' before
# remove 3 * 9 times el and from when: one hundred, two hundred... nine hundred

print (t+(11-27))

