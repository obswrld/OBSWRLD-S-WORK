nums = [10, 20, 30, 40, 50]
print(nums[2])

color = ['red', 'green', 'blue']
color.remove(color[2])
color.append('yellow')
print(color)
color.append('purple')
print(color)

number = [1, 2, 3, 4, 5]
number.remove(3)
print(number)

names = [len('Alice'), len('Bob'), len('Charlie')]
print(names)

numebrs1 = [4, 1, 3, 9, 2]
sorted(numebrs1)
print(sorted(numebrs1))

def even_numbers(list):
    even = []
    for i in list:
        if i % 2 == 0:
            even.append(i)
    return even

print(even_numbers([1, 2, 3, 4, 5]))

a = [1, 2, 3]
b = [4, 5, 6]
a.extend(b)
print(a)

words = ["lamb", "kit", "kings", "dogs", "man"]
new_words = []
for word in words:
    if len(word) > 3:
        new_words.append(word)
print(new_words)


