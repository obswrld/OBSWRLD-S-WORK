from typing import Protocol

class Protocol:
    pass

class Speaker(Protocol):

    def speak(self) -> str:
        ...

class Dog:
    def speak(self) -> str:
        return "Woof!"

class Lion:
    def speak(self) -> str:
        return "Roar!"

def animal_sound(speaker: Speaker):
    speaker.speak()

Dog = Dog()
Lion = Lion()
print(Dog.speak())
print(Lion.speak())