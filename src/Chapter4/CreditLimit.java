package Chapter4;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       boolean yes = true;

       do {
           System.out.println("Enter account number: ");
           int acctNumber = scan.nextInt();

           System.out.println("Enter balance at the beginning of the month");
           int balance = scan.nextInt();

           System.out.println("Enter total of all items charged by the customer this month");
           int charged = scan.nextInt();

           System.out.println("Enter total of all credits applied to the customer’s account this month");
           int credit = scan.nextInt();

           System.out.println("Enter the allowed credit limit");
           int allowedCredit = scan.nextInt();

           int newBalance = balance + (charged - credit);
           System.out.println();

           System.out.println("The new balance = " + newBalance);
           System.out.println();

           if (newBalance < allowedCredit) {
               System.out.println("Credit limit is not exceeded");
           }
           else {
               System.out.println("Credit limit is exceeded");
           }

           System.out.println();

           scan.nextLine();

           System.out.println("Do you want to calculate for another store?");
           String option = scan.nextLine();

           if (option.equals("no") || option.equals("NO") || option.equals("No")) {
               yes = false;
           }
           System.out.println();

       }
       while (yes);

    }
}
