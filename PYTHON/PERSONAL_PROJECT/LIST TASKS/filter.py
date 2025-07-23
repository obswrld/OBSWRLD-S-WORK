from PERSONAL_PROJECT.FUNCTIONS.temperature_conversion import fahrenheit

numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

def is_odd(x):
    return x % 2 != 0

#Function (filter function)
print(list(filter(is_odd, numbers)))

#Filter function Also known as high order function
print([item for item in numbers if is_odd(item)])

#Lambda Expresion
print(list(filter(lambda x: x % 2 == 0, numbers)))

#Using a built-in function map and lambda to square each value
number1 = [10, 23, 30, 43, 50, 63, 73, 80, 90]

#Function
def is_square(a):
    return a ** 2
#Mapping
print(list(map(lambda a: a ** 2, number1)))

#Combining mapping and filter together
print(list(map(lambda a: a ** 2,
               filter(lambda x: x % 2 != 0, number1))))

#Exercise
number10 = list(range(1, 16))
result = list(filter(lambda x: x % 2 == 0, number10))
print(result)

number11 = list(range(1, 16))
result1 = list(map(lambda x: x ** 2, number11))
print(result1)

number12 = list(range(1, 16))
result2 = list(map(lambda x: x ** 2,
                   filter(lambda x: x % 2 != 0, number12)))
print(result2)

#Exercise
fahrenheit = [41, 32, 212]
result10 = list(map(lambda x: (x, (x -32) * 5 / 9), fahrenheit))
print(result10)

#lexicographical
colors = ['red', 'green', 'blue']
result_colors = min(colors, key=lambda s: s.lower())
print(result_colors)
result_color = max(colors, key=lambda s: s.lower())
print(result_color)

#Backward Iteration
num = [10, 3, 4, 7, 8, 9, 5]
reversed_num = [item ** 2 for item in reversed(num)]
print(reversed_num)

#
