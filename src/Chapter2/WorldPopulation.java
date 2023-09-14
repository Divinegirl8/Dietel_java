package Chapter2;
import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the current world population: ");
        double currentPopulation = scan.nextDouble();


        System.out.print("Enter the annual world population growth rate: ");
        double growth = scan.nextDouble();


        double growthRate =  growth/ 100;


        double firstYear;
        double secondYear;
        double thirdYear;
        double fourthYear;
        double fifthYear;


        firstYear = currentPopulation + (currentPopulation * growthRate);
        currentPopulation = firstYear;

        secondYear = currentPopulation + (currentPopulation * growthRate);
        currentPopulation = secondYear;

        thirdYear = currentPopulation + (currentPopulation * growthRate);
        currentPopulation = thirdYear;

        fourthYear = currentPopulation + (currentPopulation * growthRate);
        currentPopulation = fourthYear;

        fifthYear = currentPopulation + (currentPopulation * growthRate);
        currentPopulation = fifthYear;


        System.out.println();


        System.out.printf("The world population after one year is %.0f%n " , firstYear);
        System.out.printf("The world population after second year is %.0f%n " , secondYear);
        System.out.printf("The world population after third year is %.0f%n " , thirdYear);
        System.out.printf("The world population after fourth year is %.0f%n " , fourthYear);
        System.out.printf("The world population after fifth year is %.0f%n " , fifthYear);



    }

}
