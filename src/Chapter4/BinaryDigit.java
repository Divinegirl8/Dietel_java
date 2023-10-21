package Chapter4;

import Function.Function;

import java.util.Scanner;

public class BinaryDigit {
    public static void main(String[] args) {;


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer containing only 0s and 1s");
        int number = scan.nextInt();
        String digit = String.valueOf(number);
        int length = digit.length();

        int count = 0;
        int sum = 0;
        int sumUp = 0;

        while (count < length) {

            int result = number / Function.numberPower(10, count) % 10;
            count++;

            int result2 = result * Function.numberPower(2, sumUp);
            sumUp++;

            sum += result2;

        }

        System.out.println(sum);


    }
}


