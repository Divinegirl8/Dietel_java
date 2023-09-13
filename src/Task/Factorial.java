package Task;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number to determine the factorial(using for loop): ");
        int factorial = scan.nextInt();

        int count = 1;

        for (int number = 1; number <= factorial; number++ ) {

            count *= number;

        }
        System.out.print(count);

        System.out.println();

        System.out.print("Enter a number to determine the factorial(using while loop): ");
        int factorial2 = scan.nextInt();


        int count2 = 1;
        int count3 = 1;

        while (count2 <= factorial2) {
            count3 *= count2;

            count2 ++;

        }

        System.out.print(count3);



    }

}
