package Chapter2;

import java.util.Scanner;

public class FindNumbers {


    public static void main(String[] args){






        Scanner action = new Scanner(System.in);


        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;


        System.out.print("Enter first number: ");

        int firstNumb = action.nextInt();

        System.out.print("Enter second number: ");

        int secondNumb = action.nextInt();

        System.out.print("Enter third number: ");

        int thirdNumb = action.nextInt();

        System.out.print("Enter fourth number: ");

        int fourthNumb = action.nextInt();

        System.out.print("Enter fifth number: ");

        int fifthNumb = action.nextInt();





        if (firstNumb > 0 ) {

            positiveNumbers = positiveNumbers + 1;

        }


        if (secondNumb > 0 ) {

            positiveNumbers = positiveNumbers + 1;

        }

        if (thirdNumb > 0 ) {

            positiveNumbers = positiveNumbers + 1;

        }

        if (fourthNumb > 0 ) {

            positiveNumbers = positiveNumbers + 1;

        }
        if (fifthNumb > 0 ) {

            positiveNumbers = positiveNumbers + 1;

        }





        if (firstNumb < 0 ) {

            negativeNumbers = negativeNumbers + 1;

        }


        if (secondNumb < 0 ) {

            negativeNumbers = negativeNumbers + 1;

        }

        if (thirdNumb < 0 ) {

            negativeNumbers = negativeNumbers + 1;

        }

        if (fourthNumb < 0 ) {

            negativeNumbers = negativeNumbers + 1;

        }
        if (fifthNumb < 0 ) {

            negativeNumbers = negativeNumbers + 1;

        }


        if (firstNumb == 0 ) {

            zeroNumbers = zeroNumbers + 1;

        }


        if (secondNumb == 0 ) {

            zeroNumbers = zeroNumbers + 1;

        }

        if (thirdNumb == 0 ) {

            zeroNumbers = zeroNumbers + 1;

        }

        if (fourthNumb == 0 ) {

            zeroNumbers = zeroNumbers + 1;

        }
        if (fifthNumb == 0 ) {

            zeroNumbers = zeroNumbers + 1;

        }






        System.out.printf("The number of positive integers is  %d%n " , positiveNumbers);
        System.out.printf("The number of negative integers is  %d%n " , negativeNumbers);
        System.out.printf("The number of zero integers is  %d%n " , zeroNumbers);


    }

}
