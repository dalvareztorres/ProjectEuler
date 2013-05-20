#Way 1
myList = []
for i in range (1, 300000):
    myString = str(i)
    myNum = 0
    for character in myString:
        myNum += int(character) ** 5
    if myNum == i:
        myList.append(i)
        
print (sum(myList)-1)

# Way 2
print (sum(x for x in range (10, 1000000) if x == sum(int(character) ** 5 for character in str(x))))