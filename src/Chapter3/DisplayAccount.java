package Chapter3;
import  java.util.Scanner;

public class DisplayAccount {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Account firstBank = new Account("" , 5000);

        System.out.print("Enter your name: ");
        String name =  scan.nextLine();
        firstBank.newUser(name);

        System.out.print("Deposit an amount: ");
        int amount = scan.nextInt();
        firstBank.deposit(amount);

displayAccount(firstBank);

    }

public static void displayAccount(Account accountToDisplay) {
    System.out.printf("The user\'s name is %s and the account balance is %d" , accountToDisplay.checkName() , accountToDisplay.checkBalance());
}



}
