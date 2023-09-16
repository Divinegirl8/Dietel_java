package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ttd.TaxCalculator tax = new ttd.TaxCalculator();

        for (int count = 0; count < 3; count++) {


            System.out.println("Enter Citizen Name: ");
            String name = scan.nextLine();
            tax.setName(name);


            System.out.println("Enter Citizen Earnings: ");
            double earning = scan.nextInt();
            tax.setSalary(earning);


            scan.nextLine();
            System.out.printf("Monthly Tax Rate is %.1f%n", tax.checkSalary(tax.getSalary()));
            System.out.printf("Yearly Tax Rate is %.1f%n", tax.checkYearlyTax(tax.getSalary()));

        }



    }
}
