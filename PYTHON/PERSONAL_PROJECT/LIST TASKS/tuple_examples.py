#Declaring a tuple
student_profile = 'John', 'green', 3.3
print(len(student_profile))
print(student_profile)

oba = 'Republic'
print(oba)

#Assigning a tuple to another variable
tuple1 = (1, 2, 3)
tuple2 = tuple1
tuple1 += (10, 20, 30)
print(tuple1)
print(tuple2)

#concatenating list and tuple
number = [10, 20, 30]
num = (19, 20)
number += num
print(number)

#Accesing elements in the list in a tuple
student_tuple = ('John', 'green', [3.3, 4, 5])
student_tuple[2][1] = 30
print(student_tuple)


#unpack sequence
student_tuple1 = ('John', 'green', [3.3, 4, 5])
first_name, last_name, grade = student_tuple1
print(first_name, last_name)
print(grade)

#Unpacking Strings
student_tuple2 = 'py'
fist_letter, last_letter = student_tuple2
print(fist_letter, last_letter)

#Unpacking integers
student_tuple3 =(3, 2, 1)
first_number, second_number, last_number = student_tuple3
print(first_number, second_number, last_number)

#Swapping via unpacking and packing
number = (1, 2, 3)
first_number, second_number, last_number = number
print(first_number, second_number, last_number)
first_number, second_number = (second_number, first_number)
print(first_number, second_number, last_number)

#enumerate
numbers1 = [1, 2, 3]
list(enumerate(numbers1))
print(numbers1)

numbers2 = 1, 2, 3
tuple(enumerate(numbers2))
print(numbers2)

colors = 'red', 'green', 'blue'
for index, color in enumerate(colors):
    print(f'{index}: {color}')

#Enumerate values in a for loop
num10 = [10, 6, 23, 13, 15]
for index, num in enumerate(num10):
    print(f'{index}: {num:>8}    {"*" * num}')

#Mini Task
high_low = ('Monday', 75, 80)
day_of_week, high, low = high_low
print(day_of_week, high, low)
for index, day in enumerate(high_low):
    print(f'{index}: {day}')

names = 'oba', 'favour', 'republic'
for index, name in enumerate(names):
    print(f'{index}: {name}')

#Slice
numbers = [10, 6, 23, 13, 15, 25, 36, 50]
print(numbers[2:6])
print(numbers[:6])
print(numbers[2:])
print(numbers[:2])
print(numbers[6:len(numbers)])
print(numbers[2:len(numbers)])
print(numbers[:])
print(numbers[::2])

#slicing strings into the list
numbers[0:3] = ['one', 'two', 'three']
print(numbers)

numbers[0:3] = []
print(numbers)

numbers = [10, 6, 23, 13, 15, 25, 36, 50]
numbers[::2] = [100, 100, 100, 100]
print(numbers)
id(numbers)
print(id(numbers))
numbers[:] = []
print(numbers)
print(id(numbers))


#Task
numbers = list(range(1, 16))
print(numbers)
print(numbers[1:len(numbers):2])
print(numbers[1:len(numbers):3])
numbers[5:9] = [0, 0, 0, 0]
print(numbers)
print(numbers[:5])
numbers[:] = []
print(numbers)

#Del
numbers = list(range(1, 10))
del numbers[0:1]
print(numbers)
del numbers[::2]
print(numbers)



