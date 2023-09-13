package Task;

import java.util.Scanner;



public class CompareNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if(number % 2 ==0) {
            System.out.printf("%d is an even number" , number);
        } else {
            System.out.printf("%d is an odd number" , number);

        }

    }
}
