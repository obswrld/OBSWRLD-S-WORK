import unittest

from Contact import Contact


class TestContact(unittest.TestCase):
    def setUp(self):
        self.contact = Contact("babs", "gabe", "09067890576")

    def  test_initialization(self):
        self.assertEqual(self.contact.first_name, "babs")
        self.assertEqual(self.contact.last_name, "gabe")
        self.assertEqual(self.contact.phone_number, "09067890576")

    def test_first_name(self):
        self.contact.first_name = "babs"
        self.assertEqual(self.contact.first_name, "babs")

    def test_last_name(self):
        self.contact.last_name = "gabe"
        self.assertEqual(self.contact.last_name, "gabe")

    def test_phone_number(self):
        self.contact.phone_number = "09067890576"
        self.assertEqual(self.contact.phone_number, "09067890576")

