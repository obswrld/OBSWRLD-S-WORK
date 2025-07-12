class InvalidPinException(Exception):
    pass

class InsufficientFundsException(Exception):
    pass

class Account:
    def __init__(self, first_name, last_name, correct_pin="Correct Pin"):
        self.balance = 0
        self.correct_pin = correct_pin
        self.name = f"{first_name} {last_name}" if first_name and last_name else first_name

    def get_balance(self, correct_pin):
        return self.balance

    def deposit(self, amount, correct_pin):
        self.balance += amount

    def withdraw(self, amount, correct_pin):
        self.validate_amount_and_pin(amount, correct_pin)
        self.balance -= amount

    def is_amount_valid(self, amount):
        if amount > self.balance:
            raise InsufficientFundsException("Insufficient funds")

    def is_pin_valid(self, correct_pin):
        if correct_pin != self.correct_pin:
            raise InvalidPinException("Invalid Pin Details")

    def validate_amount_and_pin(self, amount, correct_pin):
        self.is_amount_valid(amount)
        self.is_pin_valid(correct_pin)



