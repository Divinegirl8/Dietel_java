package ttd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    public void depositTest() {

      Account input = new Account();

    input.deposit(5000);

    int initialBalance = input.checkBalance();
    assertEquals(5000 , initialBalance);


    }


    @Test
    public void depositTestTwo(){
        // given

        Account isrealAccount = new Account();

        //when

        isrealAccount.deposit(2000);

        //check

        int initialBalance = isrealAccount.checkBalance();
        assertEquals(2000 , initialBalance);

        //when

        isrealAccount.deposit(5000);

        //check

        int currentBalance = isrealAccount.checkBalance();
        assertEquals(7000 , currentBalance);

    }



    @Test

    public  void withdrawalTest() {

        Account account = new Account();

        account.deposit(2500);

        int initialBalance = account.checkBalance();
        assertEquals(2500 , initialBalance);

        account.withdrawal(1000);
        int currentBalance = account.checkBalance();
        assertEquals(1500 , currentBalance);


    }

    @Test
    public void withdrawalTest2() {

     Account scan = new Account();

     scan.deposit(2500);

     int removeMoney = scan.checkBalance();
     assertEquals(2500 , removeMoney);

     scan.withdrawal(3500);

     assertEquals(2500 , removeMoney);



    }


}