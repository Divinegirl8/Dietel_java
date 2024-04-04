package Array;

import java.util.Arrays;

public class VariableLength {
    public static void main(String[] args) {
        int[] result = {2,3};
        System.out.println(Arrays.toString(hcfOfHusband(24,60)));
    }
    public static int[] hcfOfHusband(int ... number){
        int getMaximumNumber = Arrays.stream(number).max().getAsInt();
        int counter = 0;
        int [] numbers = new int[number.length];
        StringBuilder result = new StringBuilder();
        for (int count = 2; count <= getMaximumNumber;){
            for (int index = 0; index < number.length; index++){
                if (number[index] % count == 0){
                    counter++;
                    numbers[index] = number[index];

                }

            }
            if (counter == number.length){
                result.append(count);
                divideNumbers(numbers, count);
                number = numbers;
            }else {
                count++;
            }
            counter = 0;
        }

        return convertToArray(result);
    }

    private static void divideNumbers(int[] numbers, int count) {
        for (int index = 0; index < numbers.length; index++){
            numbers[index] /= count;
        }

    }
//    public static ArrayList<Integer> HCF(int... number){
//        ArrayList<Integer> list_of_numbers = new ArrayList<>();
//
//        int index = 0;
//        int divide = 2;
//        while ( index < number.length) {
//
//            while (number[index] % divide == 0) {
//                list_of_numbers.add(divide);
//                number[index] /= divide;
//            }
//
//            ++index;
//            ++divide;
//
//        }
//
//        return list_of_numbers;
//
//    }

    public static int[] hcfOf(int... number){
        int index = 0;
        int divide = 2;
        StringBuilder result = new StringBuilder();
        while ( index < number.length) {
            while (number[index] % divide == 0) {
                result.append(divide);
                number[index] /= divide;
            }
            ++index;
            ++divide;
        }
        return convertToArray(result);
    }

    private static int[] convertToArray(StringBuilder result) {
        int[] list_of_numbers = new int[result.length()];

        for (int temp = 0; temp < result.length(); temp++){
            char values = result.charAt(temp);
            String view = String.valueOf (values);
            list_of_numbers[temp] = Integer.parseInt(view);
        }
        return list_of_numbers;
    }




}
