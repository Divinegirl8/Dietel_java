package pythonDict;

public class Difference {
    public static  int maximum(int... numbers){
        int max = 0;
        for(int number: numbers){
            if (max < number) max = number;
        }
        return max;
    }

    public static  int minimum(int... numbers){
        int min = numbers.length;
        for(int number: numbers){
            if (min > number) min = number;
        }
        return min;
    }

    public static int differenceOf(int... numbers){
        return maximum(numbers) - minimum(numbers);
    }

}
