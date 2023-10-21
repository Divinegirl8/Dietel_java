package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

    public static int student(int number){
        return number;
    }

    public static int subject(int number){
        return number;
    }

    public static ArrayList<ArrayList<Integer>> storeValueList = new ArrayList<ArrayList<Integer>>();
    public static int[][] storeValue(int convert,int convert2){
        Scanner scan = new Scanner(System.in);

        String[][] storage = new String[convert][convert2];
        int[][] conversion = new int[convert][convert2];

        for (int row = 0; row < convert; row++) {
            int total = 0;

            ArrayList<Integer> scores = new ArrayList<>();
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
                scores.add(conversion[row][column]);
            }
            storeValueList.add(scores);
            saving();
        }
        dashDisplay(105);
        System.out.printf("%-15s", "STUDENT ");
        for (int heading = 0; heading < convert2; heading++) {
            System.out.printf("%-16s", "Subject" + (heading + 1));
        }
        System.out.printf("%-15s","  Tot");
        System.out.printf("%-12s"," Ave");
        System.out.printf("%-13s%n"," Pos");
        dashDisplay(105);

    return conversion;
    }

    public static ArrayList<Integer> totalList = new ArrayList<>();

    public static ArrayList<Integer> total(int[][] value){
        for (int[] count : value){
            int sum = 0;
            for (int index : count){
                sum += index;

            }
            totalList.add(sum);
        }

        return totalList;
    }

public static ArrayList<Double> averageList = new ArrayList<>();

    public static ArrayList<Double> average(ArrayList<Integer> number,int integer){
        for (Integer index : number){
            double ave = (double) index / integer;
            averageList.add(ave);
        }
        return averageList;
    }

    public static ArrayList<ArrayList<Integer>> getSubjectList = new ArrayList<ArrayList<Integer>>();

    public static ArrayList<ArrayList<Integer>> getSubject(ArrayList<ArrayList<Integer>> integer) {

        for (int col = 0; col < integer.get(0).size(); col++) {
            ArrayList<Integer> column = new ArrayList<>();
            for (int row = 0; row < integer.size(); row++) {
                column.add(integer.get(row).get(col));
            }
            getSubjectList.add(column);
        }

        return getSubjectList;
    }

    public static ArrayList<Integer> totalSubject = new ArrayList<>();

    public static ArrayList<Integer> totalSubjectCal(ArrayList<ArrayList<Integer>> number){
        for (int index = 0; index < number.get(0).size(); index++){
            int total = 0;
            for (int temp = 0; temp < number.size(); temp++){
                total += number.get(temp).get(index);
            }
            totalSubject.add(total);
        }
        return totalSubject;
    }

public static ArrayList<Double> averageSubjectList = new ArrayList<>();

    public static ArrayList<Double> averageSubject (ArrayList<Integer> number,int value){
        for (Integer index : number){
            double average = (double) index / value;
            averageSubjectList.add(average);
        }
        return averageSubjectList;
    }

    public static ArrayList<Integer> maximumScoreList = new ArrayList<>();

    public static ArrayList<Integer> maximumScore(ArrayList<ArrayList<Integer>> number){
        for (int value = 0; value < number.get(0).size(); value++){
            int max = 0;
            for (ArrayList<Integer> integers : number) {
                if (max < integers.get(value)) {
                    max = integers.get(value);
                }
            }
            maximumScoreList.add(max);}
        return maximumScoreList;
    }

    public static ArrayList<Integer> minimumScoreList = new ArrayList<>();

    public static ArrayList<Integer> minimumScores(ArrayList<ArrayList<Integer>> number) {
        for (int index = 0; index < number.get(0).size(); index++) {
            int min = Integer.MAX_VALUE;
            for (ArrayList<Integer> integer : number) {
                if (min > integer.get(index)) {
                    min = integer.get(index);
                }
            }
            minimumScoreList.add(min);}
        return minimumScoreList;
    }

    public static ArrayList<Integer> passesList = new ArrayList<>();
    public static ArrayList<Integer> passes(ArrayList<ArrayList<Integer>> number){
        for (int index = 0; index < number.get(0).size(); index++){
            int pass = 0;
            for (ArrayList<Integer> temp : number){
                if (temp.get(index) >= 50){
                    ++pass;
                }
            }
            passesList.add(pass);
        }
        return passesList;
    }

    public static ArrayList<Integer> failList = new ArrayList<>();
    public static ArrayList<Integer> fail(ArrayList<ArrayList<Integer>> number){
        for (int temp = 0; temp < number.get(0).size();temp++){
            int fail = 0;
            for (ArrayList<Integer> value : number){
                if (value.get(temp) < 50){
                    ++fail;
                }
            }
            failList.add(fail);
        }
        return failList;
    }



    public static ArrayList<String> addPosition = new ArrayList<String>();
    public static ArrayList<String> positionScore (ArrayList<Integer> number){
        int[] new_value = new  int[number.size()];

        Arrays.fill(new_value,1);
        for (int count = 0; count < number.size(); count++){
            for (Integer index : number){
                if (number.get(count) < index){
                    new_value[count] += 1;
                }
            }
            addPosition.add(String.valueOf(new_value[count]));
        }

        return addPosition;
    }


    public static void saving(){
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully
                """);
    }

    public static void dashDisplay(int number){
        for (int row = 0; row < 2; row++){
            for (int index = 0; index < number; index++){
                System.out.print("-");
            }
            System.out.println();
        }

    }
            }
