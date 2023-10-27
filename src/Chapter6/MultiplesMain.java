package Chapter6;

import java.util.Scanner;

import static Chapter6.Multiples.*;

public class MultiplesMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            System.out.println("Enter first number: ");
            int number = scan.nextInt();

            System.out.println("Enter second number: ");
            int number2= scan.nextInt();

            System.out.println(multiplesOf(number,number2));

        }
    }
    }

