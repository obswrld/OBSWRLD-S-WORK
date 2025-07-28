from abc import ABC, abstractmethod


class Animal(ABC):

    @abstractmethod
    def speak(self):
        pass

class Lion(Animal):

    def speak(self):
        return "Roar"

class Dog(Animal):

    def speak(self):
        return "Woof!"

def sound(speaker : Animal):
    print(speaker.speak())

Lion = Lion()
Dog = Dog()
print(Lion.speak())
print(Dog.speak())


def abstractmethod():
    return None


def ABC():
    return None