package SnackOne;
import java.util.Scanner;

public class SetOfIntegers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer: ");

        int Number1 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number2 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number3 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number4 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number5 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number6 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number7 = input.nextInt();


        System.out.print("Enter an integer: ");

        int Number8 = input.nextInt();


        int evenNumber = 0;
        int oddNumber = 0;



        if(Number1 % 2 == 0) {

            evenNumber = evenNumber + Number1;


        }


        else if(Number1 % 2 != 0) {

            oddNumber = oddNumber + Number1;


        }



        if(Number2 % 2 == 0) {

            evenNumber = evenNumber + Number2;


        }

        else if(Number2 % 2 != 0) {

            oddNumber = oddNumber + Number2;


        }


        if(Number3 % 2 == 0) {

            evenNumber = evenNumber + Number3;


        }


        else if(Number3 % 2 != 0) {

            oddNumber = oddNumber + Number3;


        }


        if(Number4 % 2 == 0) {

            evenNumber = evenNumber + Number4;


        }


        else if(Number4 % 2 != 0) {

            oddNumber = oddNumber + Number4;


        }



        if(Number5 % 2 == 0) {

            evenNumber = evenNumber + Number5;


        }


        else if(Number5 % 2 != 0) {

            oddNumber = oddNumber + Number5;


        }

        if(Number6 % 2 == 0) {

            evenNumber = evenNumber + Number6;

        }


        else if(Number6 % 2 != 0) {

            oddNumber = oddNumber + Number6;

        }

        if(Number7 % 2 == 0) {

            evenNumber = evenNumber + Number7;


        }


        else if(Number7 % 2 != 0) {

            oddNumber = oddNumber + Number7;


        }


        if(Number8 % 2 == 0) {

            evenNumber = evenNumber + Number8;



        }

        else if(Number8 % 2 != 0) {

            oddNumber = oddNumber + Number8;

        }

        System.out.printf("Sum of even number is %d%n" , evenNumber);

        System.out.printf("Sum of odd number is %d%n" , oddNumber);

    }

}
