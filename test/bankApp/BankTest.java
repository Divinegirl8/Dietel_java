package bankApp;

import bankApp.exceptions.AccountNotFound;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank myBank;

    @BeforeEach void setUp(){
        myBank = new Bank("Oceanic Bank");
    }

    @Test void testThatMyBankCanCreateAnAccount(){
        myBank.createAccount("FirstName","LastName","Pin");
        assertEquals(1,myBank.getNumberOfAccountCreated());
    }

    @Test void testThatMyBankCanCreateMoreThanOneAccount(){
      myBank.createAccount("FirstName","LastName","Pin");
        assertEquals(1,myBank.getNumberOfAccountCreated());
        myBank.createAccount("FirstName","LastName","Pin");
        assertEquals(2,myBank.getNumberOfAccountCreated());

    }

  @Test void testThatAccountNumberExists(){
        myBank.createAccount("First Name","Last Name", "Pin");
        Account findAccount = myBank.findCustomerAccountNumber("10131");
        assertEquals("10131",findAccount.getNumber());
  }

  @Test void testThatAccountNumberThatDoesNotExistWillThrowAnException(){
      myBank.createAccount("First Name","Last Name", "Pin");
      assertThrows(AccountNotFound.class,() ->myBank.findCustomerAccountNumber("10133"));
  }

  @Test void testThatAccountCanDepositMoney(){
      myBank.createAccount("First Name","Last Name", "Pin");
      myBank.deposit(BigDecimal.valueOf(10_000),"10131");
      assertEquals(BigDecimal.valueOf(10_000),myBank.checkBalance("10131","Pin"));
  }

  @Test void testThatAccountCanWithdrawMoney(){
      myBank.createAccount("FirstName","LastName","Pin");
      myBank.createAccount("FirstName","LastName","Pin2");
        myBank.deposit(BigDecimal.valueOf(50_000),"10132");
        myBank.withDraw(BigDecimal.valueOf(30_000),"10132","Pin2");
        assertEquals(BigDecimal.valueOf(20_000),myBank.checkBalance("10132","Pin2"));
  }

  @Test void testThatAccountCanTransfer(){
      myBank.createAccount("FirstName","LastName","Pin");
      myBank.createAccount("FirstName","LastName","Pin2");
      myBank.deposit(BigDecimal.valueOf(100_000),"10132");
      myBank.transfer(BigDecimal.valueOf(80_000),"10132","10131","Pin2");
      assertEquals(BigDecimal.valueOf(20_000),myBank.checkBalance("10132","Pin2"));
      assertEquals(BigDecimal.valueOf(80_000),myBank.checkBalance("10131","Pin"));
  }

  @Test void testThatAccountCanCreateFourAccountAndDeposit(){
      myBank.createAccount("FirstName","LastName","Pin1");
      myBank.createAccount("FirstName","LastName","Pin2");
      myBank.createAccount("FirstName","LastName","Pin3");
      myBank.createAccount("FirstName","LastName","Pin4");

      myBank.deposit(BigDecimal.valueOf(10_000),"10131");
      myBank.deposit(BigDecimal.valueOf(50_000),"10132");
      myBank.deposit(BigDecimal.valueOf(8_000),"10133");
      myBank.deposit(BigDecimal.valueOf(2_000),"10134");

      assertEquals(BigDecimal.valueOf(2_000),myBank.checkBalance("10134","Pin4"));
      assertEquals(BigDecimal.valueOf(10_000),myBank.checkBalance("10131","Pin1"));
      assertEquals(BigDecimal.valueOf(50_000),myBank.checkBalance("10132","Pin2"));
      assertEquals(BigDecimal.valueOf(8_000),myBank.checkBalance("10133","Pin3"));

  }

  @Test void testThatMyAccountCanRemoveAccount() {
        myBank.createAccount("FirstName","LastName","Pin1");
        myBank.createAccount("FirstName","LastName","Pin2");
        myBank.removeAccount("10131","Pin1");
        assertEquals(1,myBank.getNumberOfAccountCreated());
  }

  @Test void testThatMyAccountCanRemoveAccount2(){
      myBank.createAccount("FirstName","LastName","Pin1");
      myBank.createAccount("FirstName","LastName","Pin2");
      myBank.createAccount("FirstName","LastName","Pin3");
      myBank.createAccount("FirstName","LastName","Pin4");
      assertEquals(4,myBank.getNumberOfAccountCreated());
      myBank.removeAccount("10133","Pin3");
      assertEquals(3,myBank.getNumberOfAccountCreated());
      assertThrows(AccountNotFound.class, () -> myBank.findCustomerAccountNumber("10133"));
      myBank.removeAccount("10131","Pin1");
      assertThrows(AccountNotFound.class, () -> myBank.findCustomerAccountNumber("10131"));
  }



}