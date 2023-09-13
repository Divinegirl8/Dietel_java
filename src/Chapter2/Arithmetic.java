package Chapter2;

import java.util.Scanner;


public class Arithmetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter two integers: ");

        int integer1 = input.nextInt();
        int integer2 = input.nextInt();


        int sqrInt1 = integer1 * integer1;
        int sqrInt2 = integer2 * integer2;

        int sumSqr = sqrInt1 + sqrInt2;
        int difSqr = sqrInt1 - sqrInt2;

        System.out.printf("The sum of the square is %d%n" , sumSqr);
        System.out.printf("The differences of the square is %d%n" , difSqr);






    }


}