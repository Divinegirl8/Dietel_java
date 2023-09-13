package Task;

import  java.util.Scanner;


public class Iteration {

    public static void main(String[] args) {

//        int product = 2;
//
//        while (product <= 100) {
//            product = 3 * product;
//            System.out.println(product);
//        }

        int product = 2;

        while (product <= 10) {

            product = 3 * product;
            System.out.println(product);

        }

        System.out.println();

        for (int number = 2; number <= 10; ) {
            number = number * 3;
            System.out.println(number);
        }


        System.out.println();

        Scanner scan = new Scanner(System.in);

        int total = 0;
        int count = 1;
        final int SIZE = 10;

        while (count <= SIZE) {
            System.out.print("Enter a Score: ");
            int score = scan.nextInt();
            total += score;
            count += 1;

        }
        System.out.printf("The total score is %d and the average score is %d%n", total, total / SIZE);


    }}