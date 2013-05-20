from math import factorial

total = 0
for i in range(3, 100000):
    stNumber = str(i)
    if i == sum(factorial(int(x)) for x in stNumber):
        total+=i
        
print (total)
    
        
    