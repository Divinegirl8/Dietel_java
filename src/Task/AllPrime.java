package Task;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int total = 0;

        for (int count = 1; count <= number; count++){

            if (number % count == 0) {

               total++;

                System.out.println(count);
            }


        }




//        if (total == 2) {
//            System.out.println(number);
//        }
//
//        else {
//            System.out.println(number);
//        }
    }


}
