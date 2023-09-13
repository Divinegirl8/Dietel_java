package SnackOne;
import  java.util.Scanner;
public class FeetIntoMeters {
    public static void main(String[] args){



        Scanner input = new Scanner(System.in);



        System.out.print("Enter a value for feet: ");


        double feetValue = input.nextDouble();


        double oneFoot  = 0.305;


        System.out.printf("%.1f feet is %.4f meters%n" , feetValue , feetValue * oneFoot);




    }
}
