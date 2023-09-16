package Chapter4;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number consisting of four digits");
        int digit = scan.nextInt();
        String lengthNumber = String.valueOf(digit);
        int result = lengthNumber.length();

        int count = 0;
        while (result != 4) {
            count++;
            System.out.println("Enter a number consisting of four digits");
             digit = scan.nextInt();
            lengthNumber = String.valueOf(digit);
            result = lengthNumber.length();

        }

        int firstDigit  = digit / 1000 % 10;
        int secondDigit  = digit / 100 % 10;
        int thirdDigit  = digit / 10 % 10;
        int fourthDigit  = digit % 10;

        int remainderDigit1 = (firstDigit + 7) % 10;
        int remainderDigit2 = (secondDigit + 7) % 10;
        int remainderDigit3 = (thirdDigit + 7) % 10;
        int remainderDigit4 = (fourthDigit + 7) % 10;



        int container1 = remainderDigit1;
        int container2 = remainderDigit2;

        int result1 = remainderDigit3;
        int result2 = remainderDigit4;
        int result3 = container1;
        int result4 = container2;

        System.out.println("The encrypted code is " + result1 + "" + result2 + "" + result3 + "" + result4);





    }
}
