package Chapter4;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ttd.CreditLimit creditLimit = new ttd.CreditLimit();
       boolean yes = true;

       do {
           System.out.println("Enter account number: ");
           int acctNumber = scan.nextInt();
           creditLimit.setAccountNumber(acctNumber);


           System.out.println("Enter balance at the beginning of the month");
           int balance = scan.nextInt();
           creditLimit.setBalance(balance);

           System.out.println("Enter total of all items charged by the customer this month");
           int charged = scan.nextInt();
           creditLimit.setTotalCredit(charged);

           System.out.println("Enter total of all credits applied to the customer’s account this month");
           int credit = scan.nextInt();
           creditLimit.setTotalCredit(credit);

           System.out.println("Enter the allowed credit limit");
           int allowedCredit = scan.nextInt();
           creditLimit.setAllowedCredit(allowedCredit);

            int rate = creditLimit.newBalance(balance,charged,credit);


           System.out.println("The new balance is " + rate);

           if (rate > allowedCredit) {
               System.out.println("Tne new balance exceeds the credit limit");
           }else {
               System.out.println("The new balance do not exceed the credit limit");
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
