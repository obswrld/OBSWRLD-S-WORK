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

#


