package PYTHON;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the gallons used (-1 to end): ");
        double gallons = scan.nextDouble();

        System.out.println("Enter the miles driven: ");
        int miles = scan.nextInt();

        System.out.printf("The miles/gallon for this tank was %f" , miles/gallons);
        System.out.println();


        double sum = 0;
        double sum2 = 0;
        for (;gallons != -1;){

            sum +=  gallons;
            sum2 +=  miles;

            System.out.println("Enter the gallons used (-1 to end): ");
            gallons = scan.nextDouble();

            if (gallons == -1) break;
            System.out.println("Enter the miles driven: ");
            miles = scan.nextInt();
            System.out.printf("The miles/gallon for this tank was %f" , miles/gallons);
            System.out.println();





        }

        double average =  sum2 / sum;
       System.out.printf("The overall average miles/gallon was %f " , average);

    }
}
