package Task;

public class Account {
    private int balance;
    public void deposit(int amount) {


        if (amount > 0) {
        balance += amount;
            System.out.println("successfully");
        }
        else {
            System.out.println("error");
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

    public int checkBalance() {
        return balance;
    }



}
