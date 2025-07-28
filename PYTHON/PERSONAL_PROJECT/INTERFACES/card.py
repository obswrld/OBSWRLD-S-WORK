from abc import ABC, abstractmethod

class Payment(ABC):

    @abstractmethod
    def payment_process(self, amount: float)->float:
        pass

class Creditcard(Payment):
    def payment_process(self, amount: float)-> str:
        return f"The payment to be processed: {amount:.2f}"

class  Paypal(Payment):
    def payment_process(self, amount: float)-> str:
        return f"The payment to be processed: {amount:.2f}"

def make_payment(payment: Payment, amount: float) -> Payment:
    print(payment.payment_process(amount))

creditcard = Creditcard()
paypal = Paypal()

print(make_payment(payment=paypal, amount=100.70))
print(make_payment(payment=creditcard, amount=100.70))