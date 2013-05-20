import math

abundantsBelow28123 = []

def FindAllDivisors(x):
    divList = set()
    y = 1
    while y <= math.sqrt(x):
        if x % y == 0:
            divList.add(y)
            divList.add(int(x / y))
        y += 1
    divList.remove(x)
    return divList

def numberType(x):
    if sum(FindAllDivisors(x)) > x:
        return "abundant"
    elif sum(FindAllDivisors(x)) < x:
        return "deficient"
    else:
        return "perfect"
    
    
for i in range(1,28124):
    if numberType(i) == "abundant":
        abundantsBelow28123.append(i)
        
print(abundantsBelow28123)
   
def canBeWrittenAsSumOfAbundants(i):
    min = 0;
    max = len(abundantsBelow28123)-1
    
    while max >= min:
    
        if abundantsBelow28123[max] + abundantsBelow28123[min] > i:
            max -= 1
        elif abundantsBelow28123[max] + abundantsBelow28123[min] < i:
            min+=1
        elif abundantsBelow28123[max] + abundantsBelow28123[min] == i:    
            return True
        
    return False

total = 0
for i in range(1,28124):
    if not canBeWrittenAsSumOfAbundants(i):
        total+=i
       
print (total)          