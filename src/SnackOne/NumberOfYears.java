package SnackOne;

import java.util.Scanner;

public class NumberOfYears {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of minutes: ");

        int minute = input.nextInt();


        int minutePerday = 24 * 60;
        int minutePerYear = minutePerday * 365;


        int minutesPerNumberOfYears = minute / minutePerYear;
        int minPerDays =  minute % minutePerYear;
        int minutePerNumberOfDays =  minPerDays / minutePerday ;





        System.out.printf("%d minutes is approximately %d years and %d days%n" , minute , minutesPerNumberOfYears , minutePerNumberOfDays);






    }

}
