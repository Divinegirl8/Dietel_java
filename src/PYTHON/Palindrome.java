package PYTHON;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number containing five digits to check if it is a palindrome number: ");
        int number = scan.nextInt();

       int number1 = number / 10000 % 10;
       int number2 = number / 1000 % 10;
       int number3 = number / 100 % 10;
       int number4 = number / 10 % 10;
       int number5 = number  % 10;

       if (number1 == number5) {
           System.out.println(number + " is a palindrome number");
       }
       else {
           System.out.println(number + " is not a palindrome number");
       }

    }
}
