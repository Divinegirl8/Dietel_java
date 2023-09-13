package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitTest {

    @Test

    public void testAccountNumber() {
        CreditLimit credit = new CreditLimit();

        credit.setAccountNumber(2134567);
        assertEquals(2134567,credit.getAccountNumber());

    }

    @Test

    public void testBalance() {
        CreditLimit credit = new CreditLimit();
        credit.setBalance(5000);
        assertEquals(5000,credit.getBalance());
    }

    @Test

    public  void testItemsCharged() {
        CreditLimit credit = new CreditLimit();
        credit.setItemsCharged(4500);
        assertEquals(4500,credit.getItemsCharged());
    }

    @Test
    public void testCredit() {
        CreditLimit credit = new CreditLimit();

        credit.setTotalCredit(6500);
        assertEquals(6500,credit.getTotalCredit());
    }

    @Test

    public void testAllowedCredit() {
        CreditLimit credit = new CreditLimit();

        credit.setAllowedCredit(15000);
        assertEquals(15000,credit.getAllowedCredit());

    }

    @Test
    public void testNewBalance() {
        CreditLimit credit = new CreditLimit();

        credit.setAccountNumber(2134567);
        credit.setBalance(50);
        credit.setItemsCharged(40);
        credit.setTotalCredit(5);

        assertEquals(85,credit.newBalance(credit.getBalance(), credit.getItemsCharged(), credit.getTotalCredit()));
    }

    @Test
    public void testCreditLimitExceeds() {
        CreditLimit credit = new CreditLimit();
        credit.setAccountNumber(2134567);
        credit.setBalance(50);
        credit.setItemsCharged(40);
        credit.setTotalCredit(5);
        credit.setAllowedCredit(12);

        assertFalse(credit.creditLimit());




    }


    @Test
    public void testCreditLimitDoesNotExceed() {
        CreditLimit credit = new CreditLimit();
        credit.setAccountNumber(2134567);
        credit.setBalance(50);
        credit.setItemsCharged(40);
        credit.setTotalCredit(5);
        credit.setAllowedCredit(1200);

        assertTrue(credit.creditLimit());




    }



}