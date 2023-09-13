package Task;

import java.util.Scanner;

public class PrimeWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userNumber = scan.nextInt();

        int count = 1;
        int lengthOfNumbers = 0;

        while (count <= userNumber) {

            count++;

            if (userNumber % count == 0) {
                lengthOfNumbers++;
            }

        }

        if(lengthOfNumbers == 2) {
            System.out.printf("%d is not a prime number", userNumber);
        }
        else {
            System.out.printf("%d is a prime number" , userNumber);
        }

    }

}
