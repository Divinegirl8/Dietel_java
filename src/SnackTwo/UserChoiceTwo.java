package SnackTwo;

import java.util.Scanner;

public class UserChoiceTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number and press -2 to quit: ");
        int userNumber = scan.nextInt();

        int largeNumber = userNumber;
        int count = 0;
        int smallNumber = userNumber;


        while (userNumber != -2) {

            count+=1;


            if(userNumber > largeNumber){
                largeNumber = userNumber;
            }
            if(userNumber < smallNumber){
                smallNumber = userNumber;
            }


            System.out.print("Enter a number and press -2 to quit: ");
            userNumber = scan.nextInt();


        }

            System.out.printf("The largest number entered is %d%n", largeNumber);
            System.out.printf("The smallest number entered is %d%n", smallNumber);



    }


}
