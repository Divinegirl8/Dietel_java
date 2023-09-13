package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int largest = 0;

        for (int count = 1; count <= 10; count++) {

            System.out.println("Enter the number of units sold by each salesperson: ");
            int unit = scan.nextInt();

            if (unit > largest){
                largest = unit;
            }

        }
        System.out.println("The largest number is " + largest);

    }
}
