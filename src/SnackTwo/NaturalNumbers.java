package SnackTwo;

import java.util.Scanner;

public class NaturalNumbers {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);




        int sum = 0;
        int total = 0;



        for(int numbers = 1;;numbers+=1) {

            System.out.print("Enter a number: ");
            int user1 = scan.nextInt();

            if(user1 > 0){
                total+=1;
                sum+=user1;

            }

            if(total == 10) break;

        }

        System.out.println(sum);

    }


}
