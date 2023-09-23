package Function;

import java.util.Scanner;

public class Function {

    public static int Rate(int percentage){
        if (percentage < 50) {
            return percentage * 160 + 5000;
        }
        if (percentage <=59) {
            return percentage * 200 + 5000;
        }
        if (percentage <= 69) {
            return  percentage * 250 + 5000;
        }
        else {
            return percentage * 500 + 5000;
        }
    }

    public static int copies(int copies){
        if (copies > 0 && copies <= 4) {
            return 2000;
        }
        else if (copies <= 9) {
            return 1800;
        }

        else if (copies <= 29) {
            return 1600;
        }
        else if (copies <= 49) {
            return  1500;
        }
        else if (copies <= 99) {
            return  1300;
        }
        else if (copies <= 199) {
            return  1200;
        }

        else if (copies <= 499) {
            return  1100;
        }

        else {
            return 1000;
        }
    }

    public static int numberPower(int firstNumber , int secondNumber) {
        int result = 1;

        for (int number = 1; number <= secondNumber; number++){

            result *= firstNumber;

        }

        return result;

    }

    public static boolean isEven(int integer) {

        if (integer % 2 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean isPrime(int integer) {
        int lengthOfNumbers = 0;

        for (int count = 1; count <= integer; count++){
            if(integer % count == 0) {
                lengthOfNumbers++;
            }

        }

        if (lengthOfNumbers == 2) {
            return true;
        }
        else return false;
    }


    public static int subtract(int firstNUmber , int secondNumber){
        if (firstNUmber < secondNumber) {
            return secondNumber - firstNUmber;
        }
        else {
            return firstNUmber - secondNumber;
        }
    }

    public static double divide(int firstNumber, int secondNumber){
        if (secondNumber != 0) {
            double result = (double) firstNumber / secondNumber;
            return Math.round(result * 100.0) / 100.0;

        }
        else {
            return 0;
        }
    }

    public static int factorOf(int integer) {
        int count = 0;
        int length = 0;

        while (count <= integer) {
            count ++;

            if (integer % count == 0) {
                length += 1;
            }
        }
        return length;
    }


    public static boolean isSquare(int number) {

        for (int count = 2; count <= number; count++) {

            if (count * count == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean palindrome(int number) {

        int result = number / 10000 % 10;
        int result2 = number % 10;

        if (result == result2) {
            return  true;
        }
        return false;
    }

    public static int factorial(int number) {

      int count = 1;
      int result = 1;

      while (count < number) {
          count ++;
          result *= count;

      }

      return  result;

    }

    }


