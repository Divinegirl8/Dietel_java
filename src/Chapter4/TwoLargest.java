package Chapter4;

import  java.util.Scanner;

public class TwoLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largest = 0;
        int secondlargest = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter number: ");
           int number = scan.nextInt();

            if(number > largest) {
                secondlargest = largest;
                largest = number;

            }
            else if (number > secondlargest){
                secondlargest = number;
            }

        }
        System.out.println(largest);
        System.out.println(secondlargest);

    }
}
