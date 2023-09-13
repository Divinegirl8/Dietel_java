package Chapter2;

import java.util.Scanner;



public class CircleRadius {


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.print(" Enter an integer: ");

        double radius = input.nextDouble();

        double π = 3.14159;

        double diameter = 2 * radius;

        double circumference = 2 * π * radius;

        double area = π * (radius * radius);

        System.out.println();

        System.out.printf(" %s is %.2f%n" , "The circle's diameter" , diameter);

        System.out.printf(" %s is %.2f%n" , "The circle's circumference" , circumference);

        System.out.printf(" %s is %.2f%n" , "The area of a circle" , area);




    }

}
