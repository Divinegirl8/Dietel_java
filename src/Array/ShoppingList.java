package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the number of customer: ");
        String customer = scan.nextLine();

        while (!customer.matches("\\d+")){
            System.out.println("invalid!. The number of customer must consist of positive numbers only \nEnter again");
            customer = scan.nextLine();
        }
        int convert = Integer.parseInt(customer);



        System.out.println("Enter the number of items: ");
        String items = scan.nextLine();

        while (!items.matches("\\d+")){
            System.out.println("invalid!. The number of items must consist of positive numbers only \nEnter again");
            items = scan.nextLine();

        }

           int convert2 = Integer.parseInt(items);




        String[][] storage = new String[convert][convert2];
        int[][] convertion = new int[convert][convert2];

        for (int row = 0; row < convert; row++){
            System.out.print("Customer " + (row + 1) + " price of item bought: " + "\n");
            for (int column = 0; column < convert2;column++){
                storage[row][column] = scan.nextLine();

                while (!storage[row][column].matches("\\d+")){
                    System.out.println("Invalid!. The number of items must consist of positive numbers only \nEnter again ");
                    storage[row][column] = scan.nextLine();
                }

                convertion[row][column] = Integer.parseInt(storage[row][column]);}

        }
        System.out.printf("%-15s"," ");
        for (int heading = 0; heading < convert2; heading++){
            System.out.printf("%-16s","Item"+(heading+1));
        }
        System.out.println();



        for (int customerItem = 0; customerItem < storage.length; customerItem++){
            System.out.printf("%-16s","Customer " +  (customerItem + 1));
            for (int prices = 0; prices < storage[customerItem].length; prices++){
                System.out.printf("%-15d ", convertion[customerItem][prices]);
            }
            System.out.println();
        }


    }
}
