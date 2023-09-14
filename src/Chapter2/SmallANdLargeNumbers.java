package Chapter2;

import java.util.Scanner;

public class SmallANdLargeNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Input first number: ");

        int firstNumber = input.nextInt();


        System.out.print("Input second number: ");

        int secondNumber = input.nextInt();


        System.out.print("Input third number: ");

        int thirdNumber = input.nextInt();


        System.out.printf("The sum of the numbers is  %d%n" , firstNumber + secondNumber + thirdNumber );
        System.out.printf("The average of the numbers is  %d%n" , (firstNumber + secondNumber + thirdNumber) / 3 );
        System.out.printf("The product  of the numbers is  %d%n" , firstNumber * secondNumber * thirdNumber );

// smallest number

        int smallestNumber = 0;
        int largestNumber = 0;


        if (firstNumber < secondNumber && firstNumber < thirdNumber ) {

            smallestNumber = firstNumber;


        }

        else if (firstNumber > secondNumber && firstNumber > thirdNumber ) {

            largestNumber = firstNumber;


        }






        if (secondNumber < firstNumber  && secondNumber < thirdNumber ) {

            smallestNumber = secondNumber;


        }

        else if (secondNumber > firstNumber  && secondNumber > thirdNumber ) {

            largestNumber = secondNumber;


        }






        if (thirdNumber < firstNumber && thirdNumber < secondNumber){

            smallestNumber = thirdNumber;

        }



        else if (thirdNumber > firstNumber && thirdNumber > secondNumber){

            largestNumber = thirdNumber;

        }






        System.out.printf("The smallest number is %d%n " , smallestNumber);
        System.out.printf("The largest number is %d%n " , largestNumber);


    }



}
