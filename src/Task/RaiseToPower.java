package Task;

import  java.util.Scanner;

public class RaiseToPower {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();

      numberPower(firstNumber,secondNumber);
//      int result =  (int) Math.pow(firstNumber,secondNumber);
//
//        System.out.println(result);

    }


    public static void numberPower(int firstNumber , int secondNumber) {
        int result = 1;

        for (int number = 1; number <= secondNumber; number++){

            result *= firstNumber;

        }

        System.out.printf("%d raise to the power of %d is %d%n" , firstNumber ,secondNumber ,result);

    }
}
