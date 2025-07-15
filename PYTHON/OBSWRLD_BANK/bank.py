from OBSWRLD_BANK.account import Account


class Bank:
    def __init__(self):
        self.oba_accounts = []

    def create_account(self, first_name, last_name, correct_pin):
        oba_accounts = Account(first_name, last_name, correct_pin)
        self.oba_accounts.append(oba_accounts)
        return oba_accounts

    def get_correct_pin(self, account_number):
        found_account = self.find_account_by_account_number(account_number)
        return found_account.get_correct_pin()

    def find_account_by_account_number(self, account_number):
        return self.oba_accounts[account_number - 1]

    def get_balance(self, account_number):
        found_account = self.find_account_by_account_number(account_number)
        return found_account.get_balance("1234")

    def deposit(self, amount, account_number):
        found_account = self.find_account_by_account_number(account_number)
        found_account.deposit(amount, "1234")

    def withdraw(self, amount, account_number, pin):
        found_account = self.find_account_by_account_number(account_number)
        found_account.withdraw(amount, pin)

    def transfer(self, from_account_number, to_account_number, amount, pin):
        from_account = self.find_account_by_account_number(from_account_number)
        to_account_number = self.find_account_by_account_number(to_account_number)


        from_account.withdraw(amount, pin)
        to_account_number.deposit(amount, pin)

