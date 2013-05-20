# Way 1
total = 0
for i in range (1000):
    if i % 3 == 0 or i % 5 == 0:
        total += i
print (total)

# Way 2
print (sum(i for i in range(3, 1000) if i % 3 == 0 or i % 5 == 0))
