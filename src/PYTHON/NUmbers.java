package PYTHON;

import java.util.Scanner;

public class NUmbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double user = scan.nextInt();

        double sum = 0;
        double total = 0;
        double product = 1;

        double largest = user;
        double smallest = user;

        for (int count = 1; count <= 4; count ++){

            total++;
            System.out.print("Enter a number: ");
            user = scan.nextInt();
            sum += user;
            product *= user;



            if (user > largest){
                largest = user;
            }
            if (user < smallest) {
                smallest = user;
            }



        }

        System.out.printf("The sum of the numbers is %.0f%n" , sum);
        System.out.println("The average of the numbers is " + sum/total);
        System.out.printf("The product of the numbers is %.0f%n" , product);
        System.out.printf("The largest number is %.0f%n " , largest);
        System.out.printf("The smallest number is %.0f%n " , smallest);
    }
}
