package Array;

import java.util.Scanner;

public class ScoresInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] listArray = new int[10];

         int count;
         int largest = 0;
        for (count = 0; count < listArray.length; count++){
            System.out.print("Enter score: ");
            int score = scan.nextInt();
            listArray[count] = score;
        }

       for (int number: listArray){
           if (number > largest){
               largest = number;
           }
       }

        System.out.print("The largest number is " + largest);



    }
}
