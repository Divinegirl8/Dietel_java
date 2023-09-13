package Task;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("enter a number ");
        int number = scanner.nextInt();

        if (number % 2 == 0 ) {
            System.out.println(number + " your number is even");


        }else if (number % 2 != 0 ) {
            System.out.println(number + " number is odd");
        }
    }
}
