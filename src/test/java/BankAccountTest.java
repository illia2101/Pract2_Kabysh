import org.junit.jupiter.api.Test;
import ua.university.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    @Test
    void depositShouldIncreaseBalance() {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
        System.out.println("Balance = " + account.getBalance());
    }
}
