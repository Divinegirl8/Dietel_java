package SnackOne;

import java.util.Scanner;

public class Geometry {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter side X1 of the triangle: ");

        double sideX1 = scan.nextDouble();


        System.out.print("Enter side Y1 of the triangle: ");

        double sideY1 = scan.nextDouble();

        System.out.print("Enter side X2 of the triangle: ");

        double sideX2 = scan.nextDouble();

        System.out.print("Enter side Y2 of the triangle: ");

        double sideY2 = scan.nextDouble();

        System.out.print("Enter side X3 of the triangle: ");

        double sideX3 = scan.nextDouble();

        System.out.print("Enter side Y3 of the triangle: ");

        double sideY3 = scan.nextDouble();


//        side one

        double firstX = sideX2 - sideX1;
        double squareFirstX = Math.pow(firstX , 2);

        double firstY = sideY2 - sideY1;
        double squareFirstY = Math.pow(firstY , 2);

        double sideOneSum = squareFirstX + squareFirstY;
        double sideOne = Math.sqrt(sideOneSum);

//        side two

        double secondX = sideX3 - sideX2;
        double squareSecondX = Math.pow(secondX , 2);

        double secondY = sideY3 - sideY2;
        double squareSecondY = Math.pow(secondY , 2);

        double sideTwoSum = squareSecondX + squareSecondY;
        double sideTwo = Math.sqrt(sideTwoSum);


//  side three

        double thirdX = sideX1 - sideX3;
        double squareThirdX = Math.pow(thirdX , 2);

        double thirdY = sideY1 - sideY3;
        double squareThirdY = Math.pow(thirdY , 2);

        double sideThreeSum = squareThirdX + squareThirdY;
        double sideThree = Math.sqrt(sideThreeSum);


        double side = (sideOne + sideTwo + sideThree) / 2;

        double area = Math.sqrt(side *(side - sideOne) * (side - sideTwo) * (side - sideThree));

        System.out.printf("The area of the triangle is %.1f" , area);

    }

}
