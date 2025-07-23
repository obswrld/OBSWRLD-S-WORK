from typing import List
class Contact:
    def __init__(self, first_name, last_name, phone_number):
        self.first_name = first_name
        self.last_name = last_name
        self.phone_number = phone_number


    @property
    def first_name(self):
        return self._first_name

    @first_name.setter
    def first_name(self, name):
        self._first_name = name

    @property
    def last_name(self):
        return self._last_name

    @last_name.setter
    def last_name(self, second_name):
        self._last_name = second_name

    @property
    def phone_number(self):
        return self._phone_number

    @phone_number.setter
    def phone_number(self, number):
        self._phone_number = number

