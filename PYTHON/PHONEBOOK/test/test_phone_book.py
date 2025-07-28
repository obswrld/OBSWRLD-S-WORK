import unittest

from numpy.ma.testutils import assert_equal

from contact import Contact
from PHONEBOOK.src.phone_book import PhoneBook

class TestPhoneBook(unittest.TestCase):
    def setUp(self):
        self.phonebook = PhoneBook()

    def test_phonebook_can_add_valid_contact(self):
        self.contact1 = Contact("Ola", "Joe","09069672905")
        self.phonebook.add_contact(self.contact1)
        self.assertEqual(len(self.phonebook.contacts), 1)

    def test_phonebook_can_remove_invalid_contact(self):
        self.contact2 = Contact("Ola", "Joe","09069672905")
        self.phonebook.add_contact(self.contact2)
        self.assertEqual(len(self.phonebook.contacts), 1)
        self.phonebook.remove_contact(self.contact2)
        self.assertEqual(len(self.phonebook.contacts), 0)

    def test_find_contact_by_first_name(self):
        self.contact2 = Contact("Ola", "Joe","09069672905")
        self.phonebook.add_contact(self.contact2)
        self.assertEqual(str(self.phonebook.find_contact_by_first_name("Ola")), "Ola Joe 09069672905")

    def test_find_contact_by_last_name(self):
        self.contact2 = Contact("Ola", "Joe","09069672905")
        self.phonebook.add_contact(self.contact2)
        self.assertEqual(str(self.phonebook.find_contact_by_last_name("Joe")), "Ola Joe 09069672905")

    def test_find_contact_by_phone_number(self):
        self.contact2 = Contact("Ola", "Joe","09069672905")
        self.phonebook.add_contact(self.contact2)
        self.assertEqual(str(self.phonebook.find_contact_by_phone_number("09069672905")), "Ola Joe 09069672905")

