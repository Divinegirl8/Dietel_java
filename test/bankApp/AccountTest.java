package bankApp;

import bankApp.exceptions.InsufficientFundsError;
import bankApp.exceptions.InvalidAmountException;
import bankApp.exceptions.InvalidPinException;
import bankApp.exceptions.LowAmountError;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;




class AccountTest {

    Account account;

    @BeforeEach
    void setUp(){
        account = new Account("Rhoda John","correct password","2104567");
    }

    @Test void testThatMyAccountBalanceIsEmpty(){
        assertNull(account.checkBalance("correct password"));
    }

    @Test void testThatMyAccountCanDeposit(){

        BigDecimal depositAmount = new BigDecimal(1000);
        account.deposit(depositAmount);
        assertEquals(depositAmount,account.checkBalance("correct password"));
    }

    @Test void testThatMyAccountCanThrowInvalidPinExceptionIfPinIsWrong(){
        account.deposit(new BigDecimal(500));
        assertThrows(InvalidPinException.class, () ->  account.withdraw(BigDecimal.valueOf(1000),"wrong password") );
    }

    @Test void testThatMyAccountCanDepositMoreThanOnce(){
        account.deposit(new BigDecimal(2000));
        account.deposit(new BigDecimal(2100));
        assertEquals(new BigDecimal(4100),account.checkBalance("correct password"));
        account.deposit(new BigDecimal(400));
        assertEquals(new BigDecimal(4500),account.checkBalance("correct password"));

    }

    @Test void TestThatMyAccountWillThrownInvalidAmountExceptionIfAmountIsLessThanAndEqualsToZero(){
        assertThrows(InvalidAmountException.class, () -> account.deposit(new BigDecimal(0)));
    }

    @Test void testThatMyAccountCanWithdrawMoney(){
        account.deposit(new BigDecimal(1000));
        account.withdraw(new BigDecimal(500),"correct password");
        assertEquals(new BigDecimal(500),account.checkBalance("correct password"));
    }

    @Test void testThatMyAccountCannotWithdrawAnEmptyBalance(){
        assertNull(account.checkBalance("correct password"));
        assertThrows(InsufficientFundsError.class, () ->account.withdraw(new BigDecimal(1000),"correct password"));
    }
    @Test void testThatMyAccountCannotWithdrawAnAmountLessThanZero(){
        account.deposit(new BigDecimal(1000));
        assertThrows(LowAmountError.class, () ->account.withdraw(new BigDecimal(-12),"correct password"));
    }

    @Test void testThatMyAccountCannotWithDrawMoreThanTheBalance(){
        account.deposit(new BigDecimal(1000));
        assertThrows(InsufficientFundsError.class, () ->account.withdraw(new BigDecimal(7000),"correct password"));

    }

}