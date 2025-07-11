package Account;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> obaAccounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String correctPin) {
        Account obaAccount = new Account(firstName, lastName, correctPin);
        obaAccounts.add(obaAccount);
        return obaAccount;
    }

    public String getCorrectPin(int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.getCorrectPin();
    }

    private Account findAccountByAccountNumber(int accountNumber) {
        return obaAccounts.get(accountNumber - 1);
    }

    public int getBalance(int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        return foundAccount.getBalance("9999");
    }

    public void deposit(int accountNumber, int amount) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.deposit(amount, "9999");
    }

    public void withdraw(int amount, String pin, int accountNumber) {
        Account foundAccount = findAccountByAccountNumber(accountNumber);
        foundAccount.withdraw(amount, pin);
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, int amount, String pin) {
        Account fromAccount = findAccountByAccountNumber(fromAccountNumber);
        Account toAccount = findAccountByAccountNumber(toAccountNumber);

        fromAccount.withdraw(amount, pin);
        toAccount.deposit(amount, pin);
    }
}
