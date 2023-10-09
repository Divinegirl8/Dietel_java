package FEMI;

public class ArraySwap {

    public static int[] swap(int[] numbers, int first, int second) {

            numbers[first] = numbers[first] + numbers[second];
            numbers[second] = numbers[first] - numbers[second];
            numbers[first] = numbers[first] - numbers[second];


        return numbers;
    }




}
