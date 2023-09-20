package Task;

import java.util.Scanner;

public class StaticAccountTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StaticAccount account = new StaticAccount();

        System.out.println("Enter Name: ");
        String name = scan.nextLine();

        account.setName(name);

        System.out.println("Deposit an amount: ");
        int balance  = scan.nextInt();

        account.deposit(balance);

        StaticAccount.trial(account);
    }
}
