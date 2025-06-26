package Account;

public class Account {
    private int balance;
    private String pin;

    public Account() {
        balance = 0;
        pin = "Correct Pin";
    }

    public int getBalance(String password) {
        if (password.equals(pin)) return balance;
        return 0;
    }


    public void deposit(int amount, String pin) {
        if(amount > 0) balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if(amount > 0 && amount <= balance && pin.equals(this.pin)) balance -= amount;
    }
}
