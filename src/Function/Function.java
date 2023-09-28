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

    public static  int fibonacci(int number){
        int firstNumber = 0;
        int secondNumber = 1;
        int result = firstNumber + secondNumber;
        int count = 1;
        int integer = 0;

        while (count <= number){
            count++;
            firstNumber = secondNumber;
            secondNumber = result;
            result = firstNumber + secondNumber;

            if (result < number) {
                integer = result;
            }

        }

        return integer;
    }

    public static double interestCalculation(int interestRate,int years,int principal){
        double rate = (double) interestRate / 100;
        double result = 0;
        for (int count = 1; count <= years; count++){
             result = principal * Math.pow(1 + rate,count);


        }
        return Math.round(result * 100.0)/100.0;
    }

    public static String print(String user){
        Scanner scan = new Scanner(System.in);
        System.out.println(user);
        String input = scan.nextLine();
        return input;
    }

public static double divideOrSquare(int number){
        double result = 0;
        if(number % 5 == 0 ){
            result = Math.sqrt(number);
        }
        else {
            result = number % 5;
        }
        return Math.round(result * 100.0)/100.0;
}

    public static  int sumDigits(long number){
        String extractNumber = String.valueOf(number);
        long integer = extractNumber.length();

        int count = 0;
        int sum = 0;

        while (count < integer){
            int result = (int) number / Function.numberPower(10,count) % 10;
            count ++;
            sum += result;
        }

        return sum;

    }

    public static void reverse(int number){
        String extractNumber = String.valueOf(number);
        int integer = extractNumber.length();

        int count = 0;
        int result = 0;

        System.out.print("The reversed number is ");
        while (count < integer){
            result = number / Function.numberPower(10,count) % 10;
            count ++;
            System.out.print(result);

        }

    }

    public static void triangle(){
        for(int count = 1; count <= 8; count++){
            for (int row = 8; row > count; row--){
                System.out.print(" " + " ");
            }
            for (int row2 = 1; row2 < count; row2++){
                System.out.print("*" + " ");
            }

            for (int row = 2; row < count; row++){
                System.out.print("*" + " ");
            }
            for (int row2 = 8; row2 > count; row2--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void reversedTriangle(){
        for(int count = 1; count <= 8; count++){


            for (int row = 1; row <= count; row++){
                System.out.print(" " + " ");
            }
            for (int row2 = 7; row2 > count; row2--){
                System.out.print("*" + " ");
            }
            for (int row = 6; row > count; row--){
                System.out.print("*" + " ");
            }
            for (int row2 = 1; row2 < count; row2++){
                System.out.print(" " + " ");
            }

            System.out.println();
        }
    }

    public static String monetaryInterestCalculator(int principalAmount,int rateAmount,int compound,int years){
        int principal = principalAmount;
//        convert to penny, 1 penny is equivalent to 1 cent, 100 cent is 1 dollar
        int penny = principal * 100;

        double rate = (double)rateAmount / 100;
        int compoundingFrequently = compound;

        double annual = 0;
        String letter = " ";
        for (int count = 1; count <= years; count++){
            annual = penny * Math.pow(1 + rate / compoundingFrequently,compoundingFrequently * count);
        }

        int dollar = (int)annual / 100;
        int cent = (int)annual % 100;

        String value = String.format("The compounded interest is $%d.%d cents",dollar,cent);

        return  value + letter;

    }


    public static int arrayMaxNumber(int[] integer){
        int largest = integer[0];
        for (int count = 0; count < integer.length; count++){
            if (integer[count] > largest){
                largest = integer[count];
            }
        }



        return largest;
    }


    public static int minNumber(int[] integer){
        int smallest = integer.length;

        for (int count = 0; count < integer.length;count++){
            if(integer[count] < smallest){
                smallest = integer[count];
            }
        }
        return smallest;
    }

    public static int sumInt(int[] integer){
        int total = 0;

        for (int count = 0; count < integer.length; count++){
            total += integer[count];
        }

        return total;
    }

    public static double averageArray(int[] integers){
        double result = 0;
        for (int count = 0; count < integers.length;count++){
           int number = sumInt(integers);
           result = number / (integers.length * 1.0);
        }
        return result;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to get the reversal: ");
        int userInput = scan.nextInt();
        reverse(userInput );



    }

    }



