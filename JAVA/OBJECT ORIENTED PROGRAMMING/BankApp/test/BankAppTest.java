import Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAppTest {


    @Test
    public void testThatIDeposited5kInMyAccount() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(5000, "Correct Pin");
        assertEquals(5000,obaAccount.getBalance("Correct Pin"));
    }

    @Test
    public void testThatICanDepositMultipleTimes() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(5000, "Correct Pin");
        assertEquals(5000,obaAccount.getBalance("Correct Pin"));
        obaAccount.deposit(5000, "Correct Pin");
        assertEquals(10000,obaAccount.getBalance("Correct Pin"));
    }

    @Test
    public void testThatICannotDepositNegativeAmount() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(-5000,  "Correct Pin");
        assertEquals(0,obaAccount.getBalance("Correct Pin"));
    }

    @Test
    public void testThatICannotDepositZeroAmount() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(0, "Correct Pin");
        assertEquals(0,obaAccount.getBalance("Correct Pin"));
    }

    @Test
    public void testThatICanWithdraw5kInMyAccount() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(10000, "Correct Pin");
        assertEquals(10000,obaAccount.getBalance("Correct Pin"));

        obaAccount.withdraw(5000, "Correct Pin");
        assertEquals(5000,obaAccount.getBalance("Correct Pin"));
    }

    @Test
    public void testThatICanCheckDepositWIthCorrectPin() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(10000, "Correct Pin");
        assertEquals(10000,obaAccount.getBalance("Correct Pin"));
    }

    @Test
    public void tesThatICannotDepositWithIncorrectPin() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(10000, "Wrong Pin");
        assertEquals(0,obaAccount.getBalance("Wrong Pin"));
    }

    @Test
    public void testThatICanWithdrawWithCorrectPin() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(10000, "Correct Pin");
        assertEquals(10000,obaAccount.getBalance("Correct Pin"));

        obaAccount.withdraw(10000, "Correct Pin");
        assertEquals(0,obaAccount.getBalance("Correct Pin"));
    }

}
