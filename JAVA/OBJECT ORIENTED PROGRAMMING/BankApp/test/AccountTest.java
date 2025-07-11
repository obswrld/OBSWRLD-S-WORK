import Account.Account;
import Exception.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {


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
    public void testThatICannotDepositNegativeAmountThrowException() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

       assertThrows(NegativeAmountException.class, () -> obaAccount.deposit(-5000, "correct Pin"));
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
        assertEquals("Correct Pin",obaAccount.getCorrectPin());
    }

    @Test
    public void tesThatICannotDepositWithNegativeAmount() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        assertThrows(NegativeAmountException.class, () -> obaAccount.withdraw(-5000, "correct Pin"));
    }

    @Test
    public void testThatICanWithdrawWithCorrectPin() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));

        obaAccount.deposit(10000, "Correct Pin");
        assertEquals(10000,obaAccount.getBalance("Correct Pin"));

        obaAccount.withdraw(10000, "Correct Pin");
        assertEquals("Correct Pin",obaAccount.getCorrectPin());
    }

    @Test
    public void testThatICannotWithdrawWithIncorrectPin() {
        Account obaAccount = new Account();
        assertEquals(0,obaAccount.getBalance("Correct Pin"));
        obaAccount.deposit(10000, "Correct Pin");

        assertThrows(InvalidPinException.class, () -> obaAccount.withdraw(5000, "Wrong Pin"));
    }

    @Test
    public void testThatICannotWithdrawNegativeAmountThrowException() {
        Account obaAccount = new Account();
        obaAccount.deposit(10000, "Correct Pin");
        assertThrows(NegativeAmountException.class, () -> obaAccount.withdraw(-5000, "correct Pin"));
    }

    @Test
    public void testThatAmountCannotWithdrawMoreThanBalance() {
        Account obaAccount = new Account();
        obaAccount.deposit(10000, "Correct Pin");
        assertEquals(10000,obaAccount.getBalance("Correct Pin"));

        assertThrows(InsufficientFundException.class, () -> obaAccount.withdraw(50000, "Correct Pin"));
    }
}
