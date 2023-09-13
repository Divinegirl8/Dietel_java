package SnackOne;

import java.util.Scanner;
public class CalculateInterest {




        public static void main(String[] args){



            Scanner input = new Scanner(System.in);


            System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");

            double balance = input.nextDouble();

            double annualRate = input.nextDouble();



            double interest = balance * (annualRate/1200);


            System.out.printf("The interest is %.5f%n" , interest);



        }



    }


