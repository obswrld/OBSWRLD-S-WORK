import unittest
from email._header_value_parser import Word

from movie.word import word


class TestWord(unittest.TestCase):
    def setUp(self):
        self.word = Word()

    def test_word(self):
        name = word("oba", "ce")
        self.assertEqual(name, "obace")

    def test_word2(self):
        name = word("helloo", "ce")
        self.assertEqual(name, "helceloo")

    def test_word3(self):
        name = word("Republic", "ce")
        self.assertEqual(name, "Repuceblic")

    def test_word4(self):
        name = word("Manchester United", "ce")
        self.assertEqual(name, "Manchester Unitedce")
    def test_word5(self):
        name = word("Machester United", "ce")
        self.assertEqual(name, "Machestecer United")