#Mapping
numbers = [number ** 3 for number in range(1, 6)]
print(numbers)

#Filtering
numbers2 = [number ** 2 for number in range(1, 6) if number % 2 == 0]
print(numbers2)

#List comprehension that processes and another list element
colors = ["red", "blue", "green", "yellow", "pink"]
print(colors)
color = [item.upper() for item in colors]
print(color)

#List comprehension using tuples
nums = [(num, num **3) for num in range(1, 6)]
print(nums)

#List comprehension function for List of numbers
multiples = [num for num in range(3, 30, 3)]
print(multiples)

#List comprehension function for list of numbers with filtering
multiple = [num for num in range(3, 30, 3) if num % 2 == 0]
print(multiple)
