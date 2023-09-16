package Chapter4;

import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number consisting of four digits");
        int digit = scan.nextInt();
        String lengthNumber = String.valueOf(digit);
        int numberLength = lengthNumber.length();

        int count = 0;

        while (numberLength != 4) {
            System.out.println("Enter a number consisting of four digits");
            digit = scan.nextInt();
            lengthNumber = String.valueOf(digit);
            numberLength = lengthNumber.length();
        }

        int firstDigit  = digit / 1000 % 10;
        int secondDigit  = digit / 100 % 10;
        int thirdDigit  = digit / 10 % 10;
        int fourthDigit  = digit % 10;


        int decrypt1 = (thirdDigit - 7 + 10) % 10;
        int decrypt2 = (fourthDigit - 7 + 10) % 10;
        int decrypt3 = (firstDigit - 7 + 10) % 10;
        int decrypt4 = (secondDigit - 7 + 10) % 10;


        System.out.println("The decrypted code is " + decrypt1 + "" + decrypt2 + "" + decrypt3 + "" + decrypt4);



    }
}
