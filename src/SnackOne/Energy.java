package SnackOne;

import java.util.Scanner;

public class Energy {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.print("Enter the amount of water in kilograms: ");

        double M = input.nextDouble();


        System.out.print("Enter the initial temperature: ");

        double initialTemperature = input.nextDouble();


        System.out.print("Enter the final temperature: ");

        double finalTemperature = input.nextDouble();


        double Q = M * (finalTemperature - initialTemperature) * 4184;


        System.out.printf("The energy needed is %.1f%n " , Q);
}}
