package Chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();

        int firstResult = firstNumber * firstNumber * firstNumber;
        int secondResult = secondNumber * secondNumber;

        if (firstResult % secondResult == 0) {
            System.out.println(firstNumber + " tripled is a multiple of " + secondNumber + " doubled");
        }
        else {
            System.out.println(firstNumber + " tripled is not a multiple of " + secondNumber + " doubled");
        }
    }
}
