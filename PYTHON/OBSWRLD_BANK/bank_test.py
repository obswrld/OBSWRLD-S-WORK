import unittest

from OBSWRLD_BANK.account import InsufficientFundsException, InvalidPinException, InvalidAmountException
from OBSWRLD_BANK.bank import Bank


class TestBank(unittest.TestCase):
    def setUp(self):
        self.bank = Bank()

    def test_create_account(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.assertEqual(account.get_correct_pin(), "1234")
        self.assertEqual(len(self.bank.oba_accounts), 1)

    def test_get_correct_pin(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.assertEqual(self.bank.get_correct_pin(1), "1234")

    def test_get_balance(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.bank.deposit(20000, 1)
        balance = self.bank.get_balance(1)
        self.assertEqual(balance, 20000)

    def test_deposit(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.bank.deposit(20000, 1)
        balance = self.bank.get_balance(1)
        self.assertEqual(balance, 20000)

    def test_withdraw(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.bank.deposit(20000, 1)
        balance = self.bank.get_balance(1)
        self.bank.withdraw(10000, 1, "1234")
        balance = self.bank.get_balance(1)
        self.assertEqual(balance, 10000)

    def test_withdraw_invalid_pin(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.bank.deposit(20000, 1)
        balance = self.bank.get_balance(1)
        with self.assertRaises(InvalidPinException):
            self.bank.withdraw(1000, 1, "2222")

    def test_withdraw_invalid_amount(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        self.bank.deposit(20000, 1)
        balance = self.bank.get_balance(1)
        with self.assertRaises(InsufficientFundsException):
            self.bank.withdraw(500000, 1, "1234")

    def test_deposit_invalid_amount(self):
        account = self.bank.create_account("Oba", "Republic", "1234")
        with self.assertRaises(InvalidAmountException):
            self.bank.deposit(-20000, 1)

    def test_transfer_works_from_one_account_to_another_account(self):
        account2 = self.bank.create_account("Oje", "dave", "2222")
        account3 = self.bank.create_account("mike", "tosin", "3333")
        self.bank.deposit(20000, 2)
        self.bank.withdraw(5000, 2, "2222")
        self.bank.deposit(5000, 3)
        balance = self.bank.get_balance(2)
        self.assertEqual(balance, 15000)
        balance1 = self.bank.get_balance(3)
        self.assertEqual(balance1, 5000)


if __name__ == '__main__':
    unittest.main()