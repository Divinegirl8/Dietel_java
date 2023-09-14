package Chapter2;

import java.util.Scanner;
public class Numbers {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = scan.nextInt();


        System.out.print("Enter second number: ");
        int number2 = scan.nextInt();


        System.out.print("Enter third number: ");
        int number3 = scan.nextInt();


        System.out.print("Enter fourth number: ");
        int number4 = scan.nextInt();


        System.out.print("Enter fifth number: ");
        int number5 = scan.nextInt();


        int largeNumber = 0;
        int smallNumber = 0;


        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {

            smallNumber = number1;

        }

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {

            largeNumber = number1;

        }




        if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {

            smallNumber = number2;

        }

        if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {

            largeNumber = number2;

        }






        if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {

            smallNumber = number3;

        }

        if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {

            largeNumber = number3;

        }





        if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {

            smallNumber = number4;

        }


        if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {

            largeNumber = number4;

        }






        if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4) {

            smallNumber = number5;

        }

        if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {

            largeNumber = number5;

        }





        System.out.printf("The smallest number is %d%n",smallNumber);


        System.out.printf("The largest number is %d%n",largeNumber);













    }
}
