package Array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

    public static int student(int number){
        int convert;
        if (number < 0){
            convert = number * -1;
        }
        else {
            convert = number;
        }

        return convert;
    }

    public static int subject(int number){
        return student(number);
    }

    public static ArrayList<ArrayList<Integer>> storeValueList = new ArrayList<ArrayList<Integer>>();
    public static int[][] storeValue(int convert,int convert2) throws InterruptedException {
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

//    public static ArrayList<Integer> totalList = new ArrayList<>();
//
//    public static int[] total(int[][] value){
//        for (int[] count : value){
//            int sum = 0;
//            for (int index : count){
//                sum += index;
//
//            }
//            totalList.add(sum);
//        }
//
//        return convertToArray(totalList);
//    }


    public static ArrayList<Integer> totalList = new ArrayList<>();

    public static int[] total(int[][] value){
        int[] add = new int[value.length];
        for (int row = 0; row < value.length; row++){
            int sum = 0;
            for (int column = 0; column < value[row].length;column++){
                sum += value[row][column];
            }
            totalList.add(sum);
            add[row] = sum;
        }

        return add;
    }

public static ArrayList<Double> averageList = new ArrayList<>();

    public static double[] average(int[] number,int integer){
        for (int index : number){
            double ave =  (double) index / integer;
            double round = Math.round(ave * 100.0) / 100.0;
            averageList.add(round);
        }
        return convertToArrayDouble(averageList);
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
    public static ArrayList<Integer> indexList = new ArrayList<>();

    public static ArrayList<Integer> maximumScore(ArrayList<ArrayList<Integer>> number){
        for (int value = 0; value < number.get(0).size(); value++){
            int max = 0;
            int index = 0;
            for (int row = 0; row < number.size(); row++) {
                if (max < number.get(row).get(value)) {
                    max = number.get(row).get(value);
                    index = row+1;
                }
            }
            maximumScoreList.add(max);
            indexList.add(index);

        }
        return maximumScoreList;
    }



    public static ArrayList<Integer> minimumScoreList = new ArrayList<>();
    public static ArrayList<Integer> indexMin = new ArrayList<>();

    public static ArrayList<Integer> minimumScores(ArrayList<ArrayList<Integer>> number) {
        for (int index = 0; index < number.get(0).size(); index++) {
            int min = Integer.MAX_VALUE;
            int indexValue = 0;
            for (int row = 0; row < number.size(); row++) {
                if (min > number.get(row).get(index)) {
                    min = number.get(row).get(index);
                    indexValue = row+1;
                }
            }
            minimumScoreList.add(min);
            indexMin.add(indexValue);
        }
        return minimumScoreList;
    }

    public static ArrayList<Integer> passesList = new ArrayList<>();
    public static int[] passes(ArrayList<ArrayList<Integer>> number){
        for (int index = 0; index < number.get(0).size(); index++){
            int pass = 0;
            for (ArrayList<Integer> temp : number){
                if (temp.get(index) >= 50){
                    ++pass;
                }
            }
            passesList.add(pass);
        }
        return convertToArray(passesList);
    }

    public static ArrayList<Integer> failList = new ArrayList<>();
    public static int[] fail(ArrayList<ArrayList<Integer>> number){
        for (int temp = 0; temp < number.get(0).size();temp++){
            int fail = 0;
            for (ArrayList<Integer> value : number){
                if (value.get(temp) < 50){
                    ++fail;
                }
            }
            failList.add(fail);
        }
        return convertToArray(failList);
    }


//    public static ArrayList<Integer> failList = new ArrayList<>();
//    public static int[] fail(int[][] number){
//        int[] failCount= new int[number.length];
//        for (int temp = 0; temp < number.length;temp++){
//            int fail = 0;
//            for (int column = 0; column < number[temp].length; column++){
//                if (number[temp][column] < 50){
//                    ++fail;
//                }
//            }
//            failList.add(fail);
//            failCount[temp] = fail;
//        }
//        return failCount;
//    }


    public static int hardest = 0;
    public static int getHardestSubject(ArrayList<Integer> subject){
        int max = 0;
        for (int index = 0; index < subject.size();index++){
            if (max < subject.get(index)){
                max = subject.get(index);
            }
        }
        hardest = max;
        return max;
    }

    public static int hardestIndex = 0;
    public static int getHardestSubjectIndex(ArrayList<Integer> subject){
        int max = 0;
        int indexHardest = 0;
        for (int index = 0; index < subject.size();index++){
            if (max < subject.get(index)){
                max = subject.get(index);
                indexHardest = index + 1;
            }
            hardestIndex = indexHardest;
        }
        return indexHardest;
    }


    public static int[] convertToArray(ArrayList<Integer> number){
        int[] value = new int[number.size()];

        for (int index = 0; index < number.size(); index++){
            value[index] = number.get(index);
        }

        return value;
    }



    public static double[] convertToArrayDouble(ArrayList<Double> number){
        double[] value = new double[number.size()];

        for (int index = 0; index < number.size(); index++){
            value[index] = number.get(index);
        }

        return value;
    }


    public static int[][] convertToArrayNested(ArrayList<ArrayList<Integer>> number) {
        int[][] value = new int[number.size()][];

        for (int row = 0; row < number.size(); row++) {
            ArrayList<Integer> innerList = number.get(row);
            value[row] = new int[innerList.size()];

            for (int outer = 0; outer < innerList.size(); outer++) {
                value[row][outer] = innerList.get(outer);
            }
        }

        return value;
    }



    public static ArrayList<Integer> addPosition = new ArrayList<Integer>();
    public static int[] positionScore (int[] number){
        int[] new_value = new  int[number.length];

        Arrays.fill(new_value,1);
        for (int count = 0; count < number.length; count++){
            for (Integer index : number){
                if (number[count] < index){
                    new_value[count] += 1;
                }
            }
            addPosition.add((new_value[count]));
        }

        return new_value;
    }

    public static void saving() throws InterruptedException {

        String symbol = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.print("Saving ");

        for (int index = 0; index < symbol.length();index++){
            System.out.print(symbol.charAt(index));
            java.lang.Thread.sleep(100);
        }
        System.out.println();
        System.out.println("Saved successfully");
        System.out.println();
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
