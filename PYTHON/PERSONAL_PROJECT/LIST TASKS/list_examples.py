numbers = []
for number in range(1, 11):
    numbers += [number]
print(numbers)

letters = []
letters += "python"
print(letters)

list1 = [1, 2, 3]
list2 = [4, 5, 6]
combinations = list1 + list2
print(combinations)

for i in range(len(combinations)):
    print(f'{i:>3} {combinations[i]}')

lists1 = [1, 2, 3]
lists2 = [1, 2, 3]
lists3 = [4, 5, 6]
print(lists1 == lists3)

def get_cube_list(values):
    for value in range(len(values)):
        values[value] **= 3
    return values

def get_square_list(values):
    for value in range(len(values)):
        values[value] **= 2
    return values

number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print(get_cube_list(number))
print(get_square_list(number))

characters = []
characters += "Birthday"
print(characters)


#Unpacking List
list1 = [1, 2, 3, 4, 5, 6, 7]
first_number, second_number, third_number, fourth_number, fifth_number, sixth_number, seventh_number = list1
print(first_number, second_number, third_number, fifth_number, sixth_number, seventh_number)
print(first_number)