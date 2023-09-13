package SnackOne;

import  java.util.Scanner;

public class PhysicsAcceleration {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter starting velocity: ");
        double startingVelocity = scan.nextDouble();

        System.out.print("Enter ending velocity: ");
        double endingVelocity = scan.nextDouble();

        System.out.print("Enter time: ");
        double time = scan.nextDouble();


        double acceleration = (endingVelocity - startingVelocity) / time;

        System.out.printf("The average acceleration is %.4f%n" , acceleration);


    }



}
