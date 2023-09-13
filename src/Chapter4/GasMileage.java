package Chapter4;

import java.util.Scanner;

public class GasMileage {



    public static void main(String[] args) {







        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of Gallons used for tankful: ");
        int gallon = scan.nextInt();
        System.out.println("Enter number of Miles driven: ");
        int miles = scan.nextInt();

        float sumGallon = 0;
        float sumMiles = 0;

        float average = (float) gallon / miles;
        System.out.printf("The cost of gallons used per miles is %.2f%n",average);

        while (gallon != -1) {

            sumGallon += gallon;
            sumMiles += miles;

            System.out.println("Enter number of Gallons used for tankful: ");
            gallon = scan.nextInt();
            if (gallon == -1){  break;}

            System.out.println("Enter number of Miles driven: ");
             miles = scan.nextInt();

             average = (float) gallon / miles;
            System.out.printf("The cost of gallons used per miles is %.2f%n",average);

        }

        System.out.printf("The average of MilesPerGallon is %.2f ", sumGallon / sumMiles);




    }
}
