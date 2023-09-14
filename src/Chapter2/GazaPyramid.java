package Chapter2;

import java.util.Scanner;

public class GazaPyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.print("Estimated number of stones used to build the gaza pyramid: ");
        int gazaStones = scan.nextInt();

        System.out.print("Average weight of each stones: ");
        int stoneWeight = scan.nextInt();


        System.out.print("Number of years taken to build the pyramid (assuming a year comprises 365 days): ");
        int yearsPyramid = scan.nextInt();


        int estimatedWeightOfStone = gazaStones * stoneWeight;


        int StoneBuiltEachYear = estimatedWeightOfStone / yearsPyramid;
        int numberOfHours = (StoneBuiltEachYear) / (365 * 24) ;
        int numberofMinutes = (StoneBuiltEachYear) / (60 * 24);


        System.out.printf("The estimated weight of pyramid built each year is %d and each hour is %d and each minute %d%n "
                ,StoneBuiltEachYear, numberOfHours , numberofMinutes );



    }

}
