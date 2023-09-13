package SnackOne;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");

        int digit = input.nextInt();

        int remainDigit = digit / 100;
        int remainDigit2 = digit/10 % 10;
        int remainDigit3 = digit % 10;


        System.out.printf("The sum of the digits is %d%n" , remainDigit + remainDigit2 + remainDigit3);




    }
}
