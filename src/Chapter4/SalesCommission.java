package Chapter4;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {



        Commission();

        boolean yes = true;
        Scanner scan = new Scanner(System.in);


        while (yes) {
            System.out.println();
            System.out.println("Do you want to do calculation for another salesperson (press yes or no): ");
            String option = scan.nextLine();

            if (option.equals("yes") || option.equals("YES") || option.equals("Yes")) {
               Commission();
            }
            else {
                yes = false;
            }

        }

    }



    public static void Commission() {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter amount of item value for a salesperson (press -2 to exit): ");
        double itemValue = scan.nextDouble();

        double sum = 0;
        int salary = 200;


        while ( itemValue != -2) {

            sum += itemValue;

            System.out.println("Enter amount of item value for a salesperson (press -2 to exit): ");
            itemValue = scan.nextDouble();


        }

        double   grossSales =  (9 * sum) / 100;
        double  weeklySalary = salary + grossSales;
        System.out.printf("Sales person receives: $%.2f%n", weeklySalary);

    }
}
