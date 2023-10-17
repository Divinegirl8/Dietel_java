package Array;



import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
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

        System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);

        String[][] storage = new String[convert][convert2];
        int[][] convertion = new int[convert][convert2];
        int[] totalAdd = new int[convert];
        double[] averageAdd = new double[convert];
        double averageCalculation = 0;

        for (int row = 0; row < convert; row++) {
            int total = 0;


            for (int column = 0; column < convert2; column++) {
                System.out.print("Entering score for student " + (row + 1) + "\n");
                System.out.print("Enter score for subject " + (column + 1) + ": ");

                storage[row][column] = scan.nextLine();

                while (!storage[row][column].matches("\\d+")) {
                    System.out.println("Invalid!. The number of score(s) must consist of positive number(s) only \nEnter again ");
                    storage[row][column] = scan.nextLine();
                }

                convertion[row][column] = Integer.parseInt(storage[row][column]);
                total += convertion[row][column];
                averageCalculation = (double) total / convert2;

                totalAdd[row] = total;
                averageAdd[row] = averageCalculation;
            }
            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                    Saved successfully
                    """);
        }

        String dash = "_";
        String showDash = dash.repeat(85);

        System.out.printf("""
                %s
                %s%n
                """,showDash,showDash);
        System.out.printf("%-15s", "STUDENT ");
        for (int heading = 0; heading < convert2; heading++) {
            System.out.printf("%-16s", "Subject" + (heading + 1));
        }
        System.out.printf("%-14s","  Tot");
        System.out.printf("%-14s%n"," Ave");
        System.out.printf("""
                %s
                %s%n
                """,showDash,showDash);

        int[][] check = {sortNumbers(totalAdd)};

        for (int s = 0; s < check.length; s++){
            System.out.println(s);
        }


        for (int students = 0; students < convertion.length; students++) {
            System.out.printf("%-16s", "Student " + (students + 1));
            for (int scores = 0; scores < convertion[students].length; scores++) {
                System.out.printf("%-16d ", convertion[students][scores]);
            }
            System.out.print(totalAdd[students] + "        ");
            System.out.printf("%8.2f",averageAdd[students]);
            System.out.println();
        }
        System.out.printf("""
                %s
                %s%n
                """,showDash,showDash);

//        int[] number = Arrays.stream(totalAdd).sorted().toArray();
//        System.out.println(Arrays.toString(number));



    }
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

}
