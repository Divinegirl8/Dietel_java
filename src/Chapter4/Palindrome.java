package Chapter4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number that contains five digit: ");
        int number = scan.nextInt();
        String length = String.valueOf(number);
        int lengthOfNumber = length.length();


        while (lengthOfNumber != 5) {
            System.out.println("Enter a number that contains five digit: ");
            number = scan.nextInt();
            length = String.valueOf(number);
            lengthOfNumber = length.length();

        }



        if (lengthOfNumber == 5) {
            int firstNumber = number / 10000 % 10;
            int fifthNumber = number % 10;

            if (firstNumber == fifthNumber) {
                System.out.println(number + " is a palindrome number");
            }
            else {
                System.out.println(number + " is not a palindrome number");
            }
        }

}}
