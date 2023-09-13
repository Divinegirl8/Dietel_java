package SnackOne;

import java.util.Scanner;
public class PoundToKilo {
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);



        System.out.print("Enter a number: ");
        double poundNumber = input.nextDouble();



        double onePound = 0.454;

        double product =  onePound * poundNumber;

        System.out.printf("%.1f pounds is %.3f kilograms%n " , poundNumber , product);



    }
}
