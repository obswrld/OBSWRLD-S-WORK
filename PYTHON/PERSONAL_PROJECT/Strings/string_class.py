import re


pattern = 'yahoo.com'
text = 'oba@yahoo.com'
replacement = 'gmail.com'

result = re.sub(pattern, replacement, text)
print(result)

text = 'letter story comprehension'
pattern = ' '
result = re.split(pattern,  text)
print(result)

money = '80,000,000'
pattern = '   ,   '
pattern2 = '   ,   '
result = re.split(pattern, money)
print(result)
result2 = re.split(pattern2, money)
print(result2)