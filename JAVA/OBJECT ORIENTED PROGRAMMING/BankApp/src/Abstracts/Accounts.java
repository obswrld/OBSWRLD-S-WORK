package Abstracts;

abstract class Accounts {
    protected String accountNumber;
    protected double balance;

    public Accounts(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public String getAccountNumber() {
        return accountNumber;
    }
}
