package Chapter3;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account firstBank = new Account("sarah" , 0);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        firstBank.newUser(name);

        System.out.println("Welcome " + firstBank.checkName());

        System.out.println();

        System.out.print("Deposit an amount: ");
        int amount = scan.nextInt();
        firstBank.deposit(amount);

        System.out.println("your account balance is " + firstBank.checkBalance());

        System.out.println();

        System.out.print("Withdraw an amount: ");
        int money = scan.nextInt();
        firstBank.withdraw(money);

        System.out.println("your account balance is " + firstBank.checkBalance());





    }
}
