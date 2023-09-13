package SnackTwo;

import java.util.Scanner;

public class UserFactorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int total = 1;

    for(int count =1; count <= number; count++){

        total*=count;


    }

        System.out.print("The factorial of "+ number + " is " + total);

    }


}
