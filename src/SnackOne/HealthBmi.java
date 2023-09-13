package SnackOne;

import  java.util.Scanner;

public class HealthBmi {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter weight in pounds: ");

        double weightPounds = input.nextDouble();


        System.out.print("Enter height in inches: ");

        double heightInches = input.nextDouble();


        double onePound = 0.45359237;

        double oneInch = 0.0254;


        double productOfinches = heightInches * oneInch;

        double sqrHeight = productOfinches * productOfinches;


        double productOfpounds = weightPounds * onePound;

        double result = productOfpounds / sqrHeight;


        System.out.printf("BMI is  %.4f%n", result);
    }
}
