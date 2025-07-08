#Passing a List in a function
def get_modified_elements(items):
    for i in range(len(items)):
        items[i] *= 2
    return items

numbers = [10, 20, 30]
print(get_modified_elements(numbers))

#Passing a list in a function
#  for i in range(len(items)):
#       items[i] *= 2
#  return items
#numbers = 10, 20, 30
#print(get_modified_element(numbers))

#Sorting
numbers = [90,80, 70, 60, 50, 40, 30, 20, 10]
numbers.sort()
print(numbers)
numbers.sort(reverse=True)
print(numbers)

numbers = [80, 70, 60, 90, 40, 50, 30, 20, 10]
new_numbers = sorted(numbers)
print(new_numbers)
letters = 'eadfghtewcvn'
new_letters = sorted(letters)
print(new_letters)
colors = ['red', 'green', 'blue', 'yellow', 'magenta', 'cyan']
new_colors = sorted(colors)
print(new_colors)

#Task
food = ['bread', 'Grapes', 'meat', 'Bacon', 'Semolina', 'rice', 'Onion']
new_food = sorted(food)
print(new_food)

#Sequence
numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
numbers *= 2
print(numbers)
numbers.insert(5, 7)
print(numbers)

number = [67, 12, 43, 13, 46]
number.index(43)
print(number.index(43))
