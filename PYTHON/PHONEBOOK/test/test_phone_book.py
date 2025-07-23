import unittest

from PHONEBOOK.src.phone_book import PhoneBook

class TestPhoneBook(unittest.TestCase):
    def setUp(self):
        self.phonebook = PhoneBook()

    def test_phonebook_can_add_contact(self):
        phonebook = self.phonebook
        phonebook.add_contact("Republic Oba 07089863490")
        self.assertEqual(1, len(phonebook.contacts))
