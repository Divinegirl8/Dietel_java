package Chapter6;
import java.util.Scanner;

import static Chapter6.Parking.*;
public class ParkingMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the hour(s) used by the current customer");
        String hourValue = scan.nextLine();

        while (!hourValue.matches("\\d+")){
            System.out.println("""
                    Error!!! Value must contain numbers only
                    Enter Again:
                    """);
            hourValue = scan.nextLine();
        }
        int hour = Integer.parseInt(hourValue);


        System.out.println("The parking fee for the current customer is " + "$" +calculateCharges(hour));


        System.out.println();

        System.out.println("How many Customers did you have yesterday???");
        String customer = scan.nextLine();

        while (!customer.matches("\\d+")){
            System.out.println("""
                    Error!!! Value must contain numbers only
                    Enter Again:
                    """);
            customer = scan.nextLine();
        }

        int numberOfCustomers = Integer.parseInt(customer);

        double total = 0;
        for (int customers = 0; customers < numberOfCustomers; customers++) {
            System.out.println("Enter the hour(s) used by the customer" + (customers + 1));
            String hours = scan.nextLine();

            while (!hours.matches("\\d+")){
                System.out.println("""
                    Error!!! Value must contain numbers only
                    Enter Again:
                    """);
                hours = scan.nextLine();
            }
            int hourConvert = Integer.parseInt(hours);
            System.out.println("The parking fee for customer" + (customers + 1) + " is $" + calculateCharges(hourConvert));


            total += calculateCharges(hourConvert);

        }
        System.out.println();
        System.out.println("The total amount of yesterday's receipt is $" + total);




    }
}
