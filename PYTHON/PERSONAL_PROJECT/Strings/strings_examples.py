# ^ use
text = "lion"
print(len(f'[{text:^7}]'))
print(f'[{text:^10}]')

text2 = "lion king"
print(f'[{text2:^15}]')
print(len(f'[{text:^15}]'))

#format method
num1 = 567
num2 = 39.870
print('{:d}'       '        {:.1f}' .format(num1, num2))

#* function use
fruits = 'apple'
print(fruits * 2)
star = '*'
print(star * 10)

#join
fruit = "apple for food"
print(' - '.join(fruit))

fruit1 = ['apple', 'for', 'food']
print('-'.join(fruit1))


#strip
numbers = '   \t\tjungle\t\t   '
print(numbers.strip())

#upper case and comparison with title
name = "chief okafor"
#first character is been change to a capital letter
print(name.capitalize())
#changes both first letter of every word to capital letter
print(name.title())
#lower
print(name.lower())
#upper
print(name.upper())

print('eddy' > 'oba')

#finde method
word  = 'jjfbfhheuuwjjfuujfjdr'
print(word.find('heu'))



