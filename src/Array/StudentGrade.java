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
    public static int[] passes(int[][] number){
        int[] passCount = new int[number[0].length];
        for (int index = 0; index < number[0].length; index++){
            int pass = 0;
            for (int column = 0; column < number.length; column++){
                if (number[column][index] >= 50){
                    ++pass;
                }
            }
            passesList.add(pass);
            passCount[index] = pass;
        }
        return passCount;
    }




    public static ArrayList<Integer> failList = new ArrayList<>();

    public static int[] fail(int[][] number) {
        int[] failCount = new int[number[0].length];

        for (int column = 0; column < number[0].length; column++) {
            int fail = 0;
            for (int row = 0; row < number.length; row++) {
                if (number[row][column] < 50) {
                    ++fail;
                }
            }
            failList.add(fail);
            failCount[column] = fail;
        }
        return failCount;
    }


    public static int hardest = 0;
    public static int getHardestSubject(int[] subject){
        int max = 0;
        for (int index = 0; index < subject.length;index++){
            if (max < subject[index]){
                max = subject[index];
            }
        }
        hardest = max;
        return max;
    }

    public static int hardestIndex = 0;
    public static int getHardestSubjectIndex(int[] subject){
        int max = 0;
        int indexHardest = 0;
        for (int index = 0; index < subject.length;index++){
            if (max < subject[index]){
                max = subject[index];
                indexHardest = index + 1;
            }
            hardestIndex = indexHardest;
        }
        return indexHardest;
    }




    public static int easiest = 0;
    public static int getEasiestSubject(int[] subject){
        int min = 0;
        for (int index = 0; index < subject.length;index++){
            if (min < subject[index]){
                min = subject[index];
            }
        }
        easiest = min;
        return min;
    }

    public static int easiestIndex = 0;
    public static int getEasiestSubjectIndex(int[] subject){
        int min = 0;
        int indexEasiest = 0;
        for (int index = 0; index < subject.length;index++){
            if (min < subject[index]){
                min = subject[index];
                indexEasiest = index + 1;
            }
        }
        easiestIndex = indexEasiest + 1;
        return indexEasiest;
    }

    public static int overall = 0;
    public static int getOverallBest(int[][] student){
        int max = 0;
        for (int row  = 0; row < student.length; row++){
            for (int column = 0; column < student[row].length; column++){
                if (max < student[row][column]){
                    max = student[row][column];
                }
            }
        }
        overall = max;
        return max;
    }


    public static int overallBestIndex = 0;
    public static int getOverallBestIndex(int[][] student){
        int max = 0;
        int bestIndex = 0;
        for (int row  = 0; row < student.length; row++){
            for (int column = 0; column < student[row].length; column++){
                if (max < student[row][column]){
                    max = student[row][column];
                    bestIndex = column + 1;
                }
            }

        }
        overallBestIndex = bestIndex;
        return bestIndex;
    }



    public static int getOverallBestStudentIndex(int[][] student){
        int max = 0;
        int bestStudentIndex = 0;
        for (int row  = 0; row < student[0].length; row++){
            for (int column = 0; column < student.length; column++){
                if (max < student[column][row]){
                    max = student[column][row];
                    bestStudentIndex = column + 1;
                }
            }

        }
        return bestStudentIndex;
    }



    public static int overallWorst = 0;
    public static int getOverallWorst(int[][] student){
        int min = Integer.MAX_VALUE;
        for (int row  = 0; row < student.length; row++){
            for (int column = 0; column < student[row].length; column++){
                if (min > student[row][column]){
                    min = student[row][column];
                }
            }
        }
        overallWorst = min;
        return min;
    }


    public static int overallWorstIndex = 0;
    public static int getOverallWorstIndex(int[][] student){
        int min = Integer.MAX_VALUE;
        int worstIndex = 0;
        for (int row  = 0; row < student.length; row++){
            for (int column = 0; column < student[row].length; column++){
                if (min > student[row][column]){
                    min = student[row][column];
                    worstIndex = column+1;
                }
            }
        }
        overallWorstIndex = min;
        return worstIndex;
    }



    public static int getOverallWorstStudentIndex(int[][] student){
        int min = Integer.MAX_VALUE;
        int worstStudentIndex = 0;
        for (int row  = 0; row < student[0].length; row++){
            for (int column = 0; column < student.length; column++){
                if (min > student[column][row]){
                    min = student[column][row];
                    worstStudentIndex = column + 1;
                }
            }

        }
        return worstStudentIndex;
    }


    public static int bestStudentValue = 0;
    public static int bestStudent(int[] totalValue){
        int maxStudent = 0;
        for (int number : totalValue){
            if(maxStudent < number){ maxStudent = number;

            }
        }
        bestStudentValue = maxStudent;
        return maxStudent;
    }



    public static int bestStudentValueIndex = 0;
    public static int bestStudentIndex(int[] totalValue){
        int maxStudent = 0;
        int bestStudentIndexValue = 0;
        for (int index = 0; index < totalValue.length; index++){
            if(maxStudent < totalValue[index]){ maxStudent = totalValue[index];
                bestStudentIndexValue = index + 1;
            }
        }
        bestStudentValueIndex = maxStudent;
        return bestStudentIndexValue;
    }


    public static int worstStudentValue = 0;
    public static int worstStudent(int[] totalValue){
        int minStudent = Integer.MAX_VALUE;
        for (int number : totalValue){
            if(minStudent > number) minStudent = number;
        }
        worstStudentValue = minStudent;
        return minStudent;
    }


    public static int worstStudentValueIndex = 0;
    public static int worstStudentIndex(int[] totalValue){
        int minStudent = Integer.MAX_VALUE;
        int worstStudentIndexValue = 0;
        for (int index = 0; index < totalValue.length; index++){
            if(minStudent > totalValue[index]) {minStudent = totalValue[index];
            worstStudentIndexValue = index+1;
            }
        }
        worstStudentValueIndex = minStudent;
        return worstStudentIndexValue;
    }

    public static int overallTotal(int[] total){
        int sum = 0;

        for (int number : total){
            sum += number;
        }

        return sum;
    }


    public static double averageOverAllTotal(int[] total, int student){
        double result = (double) Math.round(((double) overallTotal(total) / student) * 10) / 10;
        return result;
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
                System.out.print("=");
            }
            System.out.println();
        }

    }



            }
