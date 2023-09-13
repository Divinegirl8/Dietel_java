package Chapter3;

public class Account {

    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }


    public void newUser(String name) {
        this.name = name;
    }

    public String checkName() {
        return name;
    }

    public void  deposit(int amount) {
if (amount > 0) {
    balance += amount;
    System.out.println("successful!!!");
}        else {
    System.out.println("error!!! you cannot deposit money less than 0");
}
    }

    public  void withdraw(int amount) {
        if (amount <= balance){
            if(amount > 0) {
                balance -= amount;
                System.out.println("successful!!!");
            }
        }
        else {
            System.out.println("insufficient funds");
        }
    }

    public int checkBalance() {
        return balance;
    }

}
