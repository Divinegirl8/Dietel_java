package SnackOne;

import java.util.Scanner;
import java.lang.Math;

public class FutureInvestment {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        System.out.print("Enter investment amount: ");

        double investmentAmount = input.nextDouble();


        System.out.print("Enter annual interest rate in percentage: ");

        double annualInterestRate = input.nextDouble();


// according to the question, annual interest has a % behind the number i.e percentage = 100 in maths then i want to get my monthlyinterestrate which makes 12 months equals to 1 year.

        double monthlyInterestRate = annualInterestRate / 12 / 100;

        System.out.print("Enter number of years: ");

        double numberOfYears = input.nextDouble();



        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate) , numberOfYears*12);


        System.out.printf("Accumulated value is %.2f%n" , futureInvestmentValue );




    }

}
