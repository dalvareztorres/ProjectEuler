def sizeOfChain (startingNumber):
    chain = 0
    while (True):
        if startingNumber == 1:
            return chain + 1
        if startingNumber % 2 == 0:
            startingNumber = startingNumber / 2
            chain += 1
        else:
            startingNumber = (startingNumber * 3) + 1
            chain += 1

maxChain = 0
for i in range (1, 1000000):
    chain = sizeOfChain(i)
    if chain > maxChain:
        maxChain = chain
        solution = i
        
print (solution)