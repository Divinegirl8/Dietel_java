package Chapter4;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first x axis: ");
        int firstX = scan.nextInt();

        System.out.println("Enter first y axis: ");
        int firstY = scan.nextInt();


        System.out.println("Enter second x axis: ");
        int secondX = scan.nextInt();

        System.out.println("Enter second y axis: ");
        int secondY = scan.nextInt();

        if (firstX == secondX) {
            System.out.println(firstX + " and " + secondX + " are located on a line perpendicular to an axis");
        }
        else {
            System.out.println(firstX + " and " + secondX + " are not located on a line perpendicular to an axis");
        }

        if (firstY == secondY ) {
            System.out.println(firstY + " and " + secondY + " are located on a line perpendicular to an axis");
        }
        else {
            System.out.println(firstY + " and " + secondY + " are not located on a line perpendicular to an axis");
        }

    }
}
