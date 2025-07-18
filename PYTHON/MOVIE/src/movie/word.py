from os.path import split


def word(words, ce):
    if len(words) % 2 == 0:
        middle = len(words) // 2
        return words[:middle] + ce + words[middle:]
    return words + ce

name = word("helloo", "ce")
print(name)
