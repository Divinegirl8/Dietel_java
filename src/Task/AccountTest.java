package Task;

import Task.Account;

import java.util.Scanner;


public class AccountTest {

    public static void main(String[] args) {
        Account acct = new Account();
        Scanner scan = new Scanner(System.in);

        System.out.print("Deposit an amount: ");
        int amount = scan.nextInt();
        acct.deposit(amount);
        System.out.printf("you deposited %d to your account %n" , acct.checkBalance());

        System.out.println();

        System.out.print("Enter a withdrawal amount: ");
        int money = scan.nextInt();
        acct.withdraw(money);

        System.out.printf("Account balance is %d %n" , acct.checkBalance());

    }
}
