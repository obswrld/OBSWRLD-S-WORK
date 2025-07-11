package Account;
import Exception.*;

public class Account {
    private int balance;
    private String correctPin;
    private String name;

    public Account() {
        balance = 0;
        correctPin = "Correct Pin";
    }

    public Account(String firstName, String lastName, String correctPin) {
        this.name = firstName + " " + lastName;
        this.correctPin = correctPin;
    }

    public int getBalance(String password) {
        return balance;
    }

    public String getCorrectPin() {
        return correctPin;
    }

    public void deposit(int amount, String pin) {
        validateNegativeAMount(amount);
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        validateAmountAndPin(amount,pin);
        balance -= amount;
    }
     private static void validateNegativeAMount(int amount) {
        boolean isAMount = amount < 0;
        if(isAMount) {
            throw new NegativeAmountException();
        }
     }

     private void isAmountValid(int amount){
        boolean isAmountExceedBalance = amount > balance;
        if(isAmountExceedBalance) {
            throw new InsufficientFundException();
        }
     }

     private void validatePin(String pin) {
        boolean isPinValid = pin.equals(correctPin);
        if(!isPinValid) {
            throw new InvalidPinException();
        }
     }

     public void validateAmountAndPin(int amount, String pin) {
        validateNegativeAMount(amount);
        validatePin(pin);
        isAmountValid(amount);
     }
}
