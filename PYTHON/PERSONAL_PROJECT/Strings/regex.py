import re


text = "The silent boy is sick today 09060672905"
text1 = "The silent 12 Boy, is sick23 today , call this number**09083 King73732"
pattern3 = re.compile(r'1')
print(pattern3)
pattern = re.findall('[a-zA-Z]', text)
pattern2 = re.compile(r'\b\d+\b', text)
match = pattern2.findall(text)
print(match)
print(type(pattern2))
print(pattern)

