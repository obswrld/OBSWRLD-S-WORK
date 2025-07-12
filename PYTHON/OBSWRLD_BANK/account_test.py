import unittest

from OBSWRLD_BANK.account import Account, InsufficientFundsException, InvalidPinException


class TestAccount(unittest.TestCase):
    def setUp(self):
        self.account =  Account("John", "Doe", "1234")

    def test_initial_balance(self):
        self.assertEqual(self.account.get_balance("1234"), 0)

    def test_deposit(self):
        self.account.deposit(100, "1234")
        self.assertEqual(self.account.get_balance("1234"), 100)

    def test_withdraw(self):
        self.account.deposit(100, "1234")
        self.account.withdraw(50, "1234")
        self.assertEqual(self.account.get_balance("1234"), 50)

    def test_withdraw_insufficient_funds(self):
        self.account.deposit(100000, "1234")
        with self.assertRaises(InsufficientFundsException):
            self.account.withdraw(100000000, "1234")

    def test_withdraw_with_invalid_pin(self):
        self.account.deposit(1000, "1234")
        with self.assertRaises(InvalidPinException):
            self.account.withdraw(100, "2222")

    def