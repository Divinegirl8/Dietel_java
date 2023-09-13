package Chapter2;

import java.util.Scanner;


public class BodyMass{


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter weight: ");
        int weightInpounds = input.nextInt();

        System.out.print("Enter height: ");
        int heightIniches = input.nextInt();




        System.out.printf("Body Mass Index is %d%n ",(weightInpounds * 703) / (heightIniches * heightIniches));

        System.out.println();

        System.out.println("BMI Categories:");
        System.out.println("Underweight = <18.5");
        System.out.println("Normal weight = 18.5–24.9 ");
        System.out.println("Overweight = 25–29.9");
        System.out.println("Obesity = BMI of 30 or greater ");

    }

}
