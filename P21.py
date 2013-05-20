import math

def divisors(x):
    listOfDivisors = []
    for i in range (1,int(x/2)+1):
        if x % i == 0:
            listOfDivisors.append(i)
    return listOfDivisors

def FindAllDivisors(x):
    divList = []
    y = 1
    while y <= math.sqrt(x):
        if x % y == 0:
            divList.append(y)
            divList.append(int(x / y))
        y += 1
    divList.remove(x)
    return divList


total = 0
for i in range(1,10000):
    for j in range (i+1, 10000):
        if sum(FindAllDivisors(i)) == j and sum(FindAllDivisors(j)) == i:
            print(str(i) +" is amicable of "+str(j))
            total+=i
            total+=j



print (total)