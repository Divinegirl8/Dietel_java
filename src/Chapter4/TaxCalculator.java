package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int count = 0; count < 3; count++){


            System.out.println("Enter Citizen Name: ");
            String name = scan.nextLine();


            System.out.println("Enter Citizen Earnings: ");
            double earning = scan.nextInt();

            scan.nextLine();



            if (earning <= 30_000) {
                double tax = (15 * earning) / 100;
                System.out.printf("Citizen's Tax: %.1f%n",tax);
            }

            else {
                double tax = (20 * earning) / 100;
                System.out.printf("Citizen's Tax: %.1f%n",tax);
            }

        }
    }
}
