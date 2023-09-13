package Task;

import java.util.Scanner;

public class PrimeFor {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int lengthOfNumbers = 0;

        for (int count = 2; count < number; count++){

            if(number % count == 0) {
                lengthOfNumbers++;
            }

        }

        if (lengthOfNumbers > 0) {
            System.out.printf("%d is not a prime number" , number);
        } else {
            System.out.printf("%d is a prime number" , number);
        }

    }




}
