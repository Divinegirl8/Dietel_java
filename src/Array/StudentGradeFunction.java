package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeFunction {
    public static int students() {
        Scanner scan = new Scanner(System.in);


        System.out.println("How many student(s) do you have: ");
        String customer = scan.nextLine();

        while (!customer.matches("\\d+")) {
            System.out.println("invalid!. The number of student(s) must consist of positive number(s) only \nEnter again");
            customer = scan.nextLine();
        }

        int convert = 0;
        if (customer.matches("\\d+")) {
            convert = Integer.parseInt(customer);
        }

        while (convert == 0) {
            System.out.println("invalid!. The number of student(s) must be greater than 0\nEnter again");
            customer = scan.nextLine();
            if (customer.matches("\\d+")) {
                convert = Integer.parseInt(customer);
            }
        }
        return convert;
    }


    public static int subjects() {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many subject(s) do they offer: ");
        String items = scan.nextLine();

        while (!items.matches("\\d+")) {
            System.out.println("invalid!. The number of subject(s) must consist of positive number(s) only \nEnter again");
            items = scan.nextLine();
        }

        int convert2 = 0;
        if (items.matches("\\d+")) {
            convert2 = Integer.parseInt(items);

            while (convert2 == 0) {
                System.out.println("invalid!. The number of subject(s) must be greater than 0\nEnter again");
                items = scan.nextLine();

                if (items.matches("\\d+")) {
                    convert2 = Integer.parseInt(items);
                }
            }
        }

      saving();
        return convert2;
    }

    public static ArrayList<Integer> addValues = new ArrayList<>();
    public static ArrayList<Double> averageValue = new ArrayList<>();
    public static int[][] storeValue(int convert,int convert2){
        Scanner scan = new Scanner(System.in);

        String[][] storage = new String[convert][convert2];
        int[][] conversion = new int[convert][convert2];
        double[] averageAdd = new double[convert];
        double averageCalculation = 0;

        for (int row = 0; row < convert; row++) {
            int total = 0;


            for (int column = 0; column < convert2; column++) {
                System.out.print("Entering score for student " + (row + 1) + "\n");
                System.out.print("Enter score for subject " + (column + 1) + ": ");

                storage[row][column] = scan.nextLine();

                while (!storage[row][column].matches("\\d+") || Integer.parseInt(storage[row][column]) > 100 || Integer.parseInt(storage[row][column]) < 0) {
                    System.out.println("Invalid!. The number of score(s) must consist of positive number(s) only \n" +
                            " or must not be greater than 100 or less than 0 \nEnter again ");
                    storage[row][column] = scan.nextLine();
                }

                conversion[row][column] = Integer.parseInt(storage[row][column]);
                total += conversion[row][column];
                averageCalculation = (double) total / convert2;


            }

            addValues.add(total);
            averageValue.add(averageCalculation);

            saving();
        }
        dashDisplay();
        System.out.printf("%-15s", "STUDENT ");
        for (int heading = 0; heading < convert2; heading++) {
            System.out.printf("%-16s", "Subject" + (heading + 1));
        }
        System.out.printf("%-14s","  Tot");
        System.out.printf("%-14s%n"," Ave");
        dashDisplay();

        return conversion;
    }

public static void displayInformation(int[][] information){
    for (int students = 0; students < information.length; students++) {
        System.out.printf("%-16s", "Student " + (students + 1));
        for (int scores = 0; scores < information[students].length; scores++) {
            System.out.printf("%-16d ", information[students][scores]);
        }
        System.out.printf("%-6d",addValues.get(students));
        System.out.printf("%10.2f", averageValue.get(students));
        System.out.println();
    }
    dashDisplay();
}

    public static void saving(){
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully
                """);
    }

    public static void dashDisplay(){
        for (int count = 0; count < 2; count++){
            for (int count2 = 0; count2 < 105; count2++){
                System.out.print("-");
            }
            System.out.println();

    }}

    public static int[] sortNumbers(int[] numbers){
        for(int row = 0; row < numbers.length; row++){
            for (int column = row; column < numbers.length-1; column++){
                if (numbers[row] >  numbers[column+1]){
                    int temp = numbers[row];
                    numbers[row] = numbers[column+1];
                    numbers[column+1] = temp;
                }
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        displayInformation(storeValue(students(), subjects()));

    }
}







