class Account:
    def __init__(self, name, balance):
        self.oba = name
        self.balance = balance

    def withdraw(self, amount):
        self.balance -= amount

    def deposit(self, amount ):
        self.balance += amount

oba = Account(name= "favour", balance=1000000)
print(oba.balance)

oba.deposit(100)
print(oba.balance)
oba.withdraw(50)
print(oba.balance)
