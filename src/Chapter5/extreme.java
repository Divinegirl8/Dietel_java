package Chapter5;

import Function.Function;

import java.util.Scanner;

public class extreme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Values entered should not be more than 10");

        System.out.println("Enter number: ");
        int number = scan.nextInt();

        int largest = number;
        int smallest = number;

        for (int count = 1; count <= 9; count++) {

            System.out.println("Enter number: ");
             number = scan.nextInt();

            if(number > largest) {
                largest = number;

            }
            else if (number < smallest){
                smallest = number;
            }

        }
       int total = largest + smallest;
        System.out.println("The sum of the extreme is " + total);
  }

}
