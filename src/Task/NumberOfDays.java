package Task;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the month(e.g month in numbers(2 for february..): ");
        int month = scan.nextInt();
        System.out.println("Enter the year");
        int year = scan.nextInt();

        switch (month) {
            case 1 -> System.out.print("January " + year);
            case 2 -> System.out.print("February "+ year);
            case 3 -> System.out.print("March "+ year );
            case 4 -> System.out.print("April "+ year );
            case 5 -> System.out.print("May " + year);
            case 6 -> System.out.print("June " + year);
            case 7 -> System.out.print("July "+ year);
            case 8 -> System.out.print("August "+ year);
            case 9 -> System.out.print("September "+ year);
            case 10 -> System.out.print("October " + year);
            case 11 -> System.out.print("November " + year);
            case 12 -> System.out.print("December " + year);
        }

        switch (month) {
            case 1 -> System.out.println(" had 31 days");
            case 2 -> System.out.println(" had 29 days");
            case 3 -> System.out.println(" had 31 days");
            case 4 -> System.out.println(" had 30 days");
            case 5 -> System.out.println(" had 31 days");
            case 6 -> System.out.println(" had 30 days");
            case 7 -> System.out.println(" had 31 days");
            case 8 -> System.out.println(" had 31 days");
            case 9 -> System.out.println(" had 30 days");
            case 10 -> System.out.println(" had 31 days");
            case 11 -> System.out.println(" had 30 days");
            case 12 -> System.out.println(" had 31 days");
        }
    }
}
