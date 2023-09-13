package PYTHON;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int numberOne = scan.nextInt();


        System.out.println("Enter second number: ");
        int numberTwo = scan.nextInt();

        if (numberOne == numberTwo) {
            System.out.println(numberOne + " is equals to " + numberTwo);
        }
        else {

                System.out.println(numberOne + " is not equals to " + numberTwo);
        }

        if (numberOne > numberTwo) {
            System.out.println(numberOne + " is greater than " + numberTwo);
        }
        else {

            System.out.println(numberOne + " is less than " + numberTwo);
        }

        if (numberOne >= numberTwo) {
            System.out.println(numberOne + " is greater than and equals to"  + numberTwo);
        }
        else {

            System.out.println(numberOne + " is less than and equals to " + numberTwo);
        }



    }
}
