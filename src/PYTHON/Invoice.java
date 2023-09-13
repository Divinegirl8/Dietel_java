package PYTHON;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Credit score(enter true for good credit score and false for bad credit score): ");
        String creditScore = scan.nextLine();



        System.out.println("Price of goods: ");
        double price = scan.nextDouble();



        System.out.println("Name of the item: ");
        String item = scan.next();

        if (creditScore.equals("True") || creditScore.equals("true")){
           double discount = 10 * price / 100;
            double down_payment = 10 * price / 100;

            System.out.println("************************\n\t\tInvoice\n*************************");
            System.out.printf(" Name of items: %s%n Discount: %.1f%n Deposit: %.1f%n",item,discount,down_payment);
            System.out.println("************************");
        }
        else {
            double down_payment = 25 * price / 100;

            System.out.println("************************\n\t\tInvoice\n*************************");
            System.out.printf(" Name of items: %s%n Discount: no discount%n Deposit: %.1f%n",item,down_payment);
            System.out.println("************************");
        }
    }
}
