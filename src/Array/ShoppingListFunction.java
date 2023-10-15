package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingListFunction {

    static  Scanner scan = new Scanner(System.in);
    public static int customer(String customerValue){
        Scanner scan = new Scanner(System.in);
        while (!customerValue.matches("\\d+")){
            System.out.println("invalid!. The number of customer(s) must consist of positive number(s) only \nEnter again");
            customerValue = scan.nextLine();
        }

        int convert = 0;
        if (customerValue.matches("\\d+")){
            convert = Integer.parseInt(customerValue); }

        while (convert == 0){
            System.out.println("invalid!. The number of customer(s) must be greater than 0\nEnter again");
            customerValue = scan.nextLine();
            if (customerValue.matches("\\d+")){convert = Integer.parseInt(customerValue); }
        }
        return convert;

    }


    public static int item(String itemValue){
        Scanner scan = new Scanner(System.in);


        while (!itemValue.matches("\\d+")){
            System.out.println("invalid!. The number of item(s) must consist of positive number(s) only \nEnter again");
            itemValue = scan.nextLine();
        }

        int convert2 = 0;
        if (itemValue.matches("\\d+")) {
            convert2 = Integer.parseInt(itemValue);

            while (convert2 == 0){
                System.out.println("invalid!. The number of item(s) must be greater than 0\nEnter again");
                itemValue = scan.nextLine();

                if (itemValue.matches("\\d+")){ convert2 = Integer.parseInt(itemValue);}
            }
        }
        return convert2;
    }


    public static int[][] collectItems(int customer, int item){
        Scanner scan = new Scanner(System.in);
        String[][] storage = new String[customer][item];
        int[][] convertion = new int[customer][item];

        for (int row = 0; row < customer; row++){
            System.out.print("Customer " + (row + 1) + " price of item bought: " + "\n");
            for (int column = 0; column < item;column++){
                System.out.print("Item" + (column + 1) + ": ");
                storage[row][column] = scan.nextLine();

                while (!storage[row][column].matches("\\d+")){
                    System.out.println("Invalid!. The number of item(s) must consist of positive number(s) only \nEnter again ");
                    storage[row][column] = scan.nextLine();
                }

                convertion[row][column] = Integer.parseInt(storage[row][column]);}

        }


        System.out.printf("%-15s"," ");
        for (int heading = 0; heading < item; heading++){
            System.out.printf("%-16s","Item"+(heading+1));
        }
        System.out.println();

        return convertion;

    }

    public static void viewShoppersList(int[][] convertion){
        for (int customerItem = 0; customerItem < convertion.length; customerItem++){
            System.out.printf("%-16s","Customer " +  (customerItem + 1));
            for (int prices = 0; prices < convertion[customerItem].length; prices++){
                System.out.printf("%-15d ", convertion[customerItem][prices]);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        System.out.print("Enter number: ");
        String word  = scan.nextLine();

        System.out.print("Enter column: ");
        String word2  = scan.nextLine();


        viewShoppersList(collectItems(customer(word),item(word2)));


    }




}
