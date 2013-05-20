import datetime

total = 0

for i in range(1901,2001):
    for j in range(1,13):      
        if datetime.date(i, j, 1).weekday() == 6:
            total+=1
            
print (total)