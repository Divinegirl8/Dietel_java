package FEMI;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find it factorial: ");
        int number = scan.nextInt();

        int result = 1;
        for (int count = 1; count <= number; count++) {
            result *= count;
        }
        System.out.println("The factorial of " + number + " is " +result);
    }
}
