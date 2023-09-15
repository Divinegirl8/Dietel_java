package Chapter4;

import java.util.Scanner;

public class UserNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        int sum = 0;

        while (true) {
            System.out.println("Enter another integer value: ");
            int secondNumber = scan.nextInt();
            sum += secondNumber;

            if (sum == number || sum > number ) {
                break;

            }




        }
    }
}
