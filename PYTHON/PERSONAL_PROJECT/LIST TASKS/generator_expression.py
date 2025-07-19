#Greedy evaluation
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]
for value in (x ** 2 for x in numbers if x  % 2 != 0):
    print(value, end=' ')
print()

print(list(x ** 3 for x in [6, 7, 8, 9, 4, 5, 9, 10] if x % 2 == 0))
