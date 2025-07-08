color_names = ['red', 'green', 'blue', 'yellow', 'magenta', 'cyan']

#Adding to the list in a specified index
color_names.insert(0, 'black')
print(color_names)

#Adding a new elements in the list
color_names.append('gray')
print(color_names)

#Adding in a new sequence at the end of the list
color_names.extend(['red', 'green', 'blue', 'yellow', 'magenta', 'cyan'])
print(color_names)

#same with this
color_name = []
color = 'red', 'blue', 'green'
color_name.extend(color)
print(color_name)

#Remove
color_names = ['red', 'green', 'blue', 'yellow', 'magenta', 'cyan']
color_names.remove('magenta')
print(color_names)

#clear
color_names = ['red', 'green', 'blue', 'yellow', 'magenta', 'cyan']
color_names.clear()
print(color_names)

#count
scores = [4, 5, 6, 7, 4, 5, 3, 2, 3, 4, 2, 5, 6, 7, 8, 9, 6, 6, 4, 5, 7, 8, 4, 5, 3, 2, 6, 3, 4, 5, 7, 8, 9, 10, 10, 10, 11, 2, 3, 5, 6, 7, 5, 3]
for i in range(1,12):
    print(f'{i} appears {scores.count(i)} times')

#Reverse
color_names = ['red', 'green', 'blue', 'yellow', 'magenta', 'cyan']
color_names.reverse()
print(color_names)

#copy
copied_list = color_names.copy()
print(copied_list)