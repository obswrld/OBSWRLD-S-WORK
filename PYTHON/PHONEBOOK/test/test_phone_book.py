import unittest

from Contact import Contact
from PHONEBOOK.src.phone_book import PhoneBook

class TestPhoneBook(unittest.TestCase):
    def setUp(self):
        self.phone_book = PhoneBook()
        self.contact = []
        self.contact1 = Contact("Oba", "dave", "09069672905")
    def test_add_contact(self):
       self.contact.append(self.contact1)
       self.assertEqual(len(self.contact), 1)

    def test_phone_book_cannot_add_invalid_contact(self):
        self.contact2 = Contact("babs", "gabe", "12345")
        self.contact.append(self.contact2)
        self.assertEqual(len(self.contact), 1)

    def test_phone_book_can_remove_contact(self):
        self.contact2 = Contact("babs", "gabe", "09067890576")
        self.contact.append(self.contact2)
        self.contact.append(self.contact1)
        self.contact.remove(self.contact2)
        self.assertEqual(len(self.contact), 1)

    def test_phone_book_can_edit_contact(self):
        self.contact3 = Contact("babs", "gabe", "09067890576")
        self.contact.append(self.contact3)
        self.ph

    def test_phone_number_can_be_found_by_first_name(self):
        self.phone_book.add_contact(self.contact1)
        find_contact = self.phone_book.find_contact_by_first_name(self.contact1)
        self.assertIsNone(find_contact)
        self.assertEqual(find_contact.first_name, "Oba")



