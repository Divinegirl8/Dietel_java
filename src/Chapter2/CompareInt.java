package Chapter2;

import java.util.Scanner;


public class CompareInt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int userInt = input.nextInt();

        int squareOfNumber = userInt * userInt;



        if (userInt > 100 && squareOfNumber > 100)  {

            System.out.printf("number %d and square of %d is greater than 100%n" , userInt , userInt);


        }


        if (userInt < 100 || squareOfNumber < 100){


            System.out.printf("number %d and square of %d is less than 100%n" , userInt , userInt);

        }



        if  (userInt == 100 || squareOfNumber == 100) {

            System.out.printf("number %d and square of %d is equal to 100%n" , userInt , userInt);


        }


        else if (userInt != 100 && squareOfNumber != 100) {


            System.out.printf("number %d and square of %d is not equal to 100%n" , userInt , userInt);

        }





    }




}
