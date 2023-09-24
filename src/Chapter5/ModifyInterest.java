package Chapter5;

import java.util.Scanner;

public class ModifyInterest {
    public static void interest() {
        int principal = 1000;
        double rate = (double) 5 / 100;
        double rate2 = (double)  6 / 100;
        double rate3 = (double)  7 / 100;
        double rate4 = (double)  8 / 100;
        double rate5 = (double)  9 / 100;
        double rate6 = (double)  10 / 100;

        System.out.println("5% Rate" + "  " + "6% Rate" + "  " + "7% Rate" + "  " + "8% Rate" + "  " + "9% Rate" + "  " + "10% Rate");
        for(int count = 1; count <= 10; count++){

            double result = principal * (Math.pow(1 + rate,count));
            double result2 = principal * (Math.pow(1 + rate2,count));
            double result3 = principal * (Math.pow(1 + rate3,count));
            double result4 = principal * (Math.pow(1 + rate4,count));
            double result5 = principal * (Math.pow(1 + rate5,count));
            double result6 = principal * (Math.pow(1 + rate6,count));


            System.out.printf("%.2f  %.2f  %.2f  %.2f  %.2f  %.2f",result,result2,result3,result4,result5,result6);
            System.out.println();


        }

    }

    public static void main(String[] args) {
        interest();
    }
}
