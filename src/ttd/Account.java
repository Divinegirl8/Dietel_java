package ttd;

public class Account {

private int balance;




    public void deposit(int amount) {

if(amount >= 0) {
    balance = balance + amount;
}

else {
    System.out.println("invalid!!!");
}


    }

    public void withdrawal(int money){

   if (money > 0) {
       if (money <= balance){
           balance = balance - money;
       }
   }

   else {
       System.out.println("error!");
   }

    }



    public int checkBalance() {
        return balance;
    }
}
