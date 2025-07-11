import Account.Account;
import Account.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank bank;
    Account obaAccount;
    @BeforeEach
    public void setUp() {
        bank = new Bank();
        obaAccount = bank.createAccount("Oba", "Republic","9999");
    }

    @Test
    public void testBankCanCreateAccount(){
        assertEquals("9999", bank.getCorrectPin(1));
    }

    @Test
    public void testBalanceIs2KWhileWhenDepositIs2K(){
        assertEquals(0, bank.getBalance(1));
        bank.deposit(1,2000);
        assertEquals(2000,bank.getBalance(1));
    }

    @Test
    public void testBalanceIs3KWhenBankWithdraw2KFrom5KBalance(){
        assertEquals(0, bank.getBalance(1));
        bank.deposit(1,5000);
        assertEquals(5000,bank.getBalance(1));
        bank.withdraw(2000, "9999", 1);
        assertEquals(3000,bank.getBalance(1));
    }

    @Test
    public void testBankCanTransferMoneyBetween2Accounts(){
        Account kesterAccount = bank.createAccount("kester", "Joe","8888");
        Account mikeAccount = bank.createAccount("mike", "jed","7777");

        bank.deposit(2, 3000);
        assertEquals(3000,bank.getBalance(2));
        assertEquals(0,bank.getBalance(3));
        bank.transfer(2, 3, 1000, "8888");

        assertEquals(2000,bank.getBalance(2));
        assertEquals(1000,bank.getBalance(3));
    }

}
