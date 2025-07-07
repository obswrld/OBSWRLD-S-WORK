student_profile = 'John', 'green', 3.3
print(len(student_profile))
print(student_profile)

oba = 'Republic'
print(oba)

tuple1 = (1, 2, 3)
tuple2 = tuple1
tuple1 += (10, 20, 30)
print(tuple1)
print(tuple2)

number = [10, 20, 30]
num = (19, 20)
number += num
print(number)

student_tuple = ('John', 'green', [3.3, 4, 5])
student_tuple[2][1] = 30
print(student_tuple)