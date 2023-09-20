package Task;

public class StaticAccount {

    private int balance;
    private String name;

    public void setName(String username){
        name = username;
    }

    public String getName(){
        return name;
    }

    public void setBalance(int userbalance){
        balance = userbalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(int amount) {
        if(amount >= 0) {
            balance += amount;
        }
        else {
            System.out.println("Exceeded");
        }
    }

    public void withdraw(int money) {
        if (money <= balance && money >= 0) {
            balance -= money;
            System.out.println("successful!");
        } else {
            System.out.println("insufficient funds");
        }
    }


    public static void trial(StaticAccount account){
        System.out.println("Account Name: " + account.getName() +"\n" + "Account balance: " + account.getBalance());
    }


}

