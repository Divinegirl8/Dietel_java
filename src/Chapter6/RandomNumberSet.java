package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberSet {

    public static void main(String[] args) {
        int[] numbers = {0,3,6,9,12};

        int display = 0;

        for (int index = 1; index <= numbers.length; index++) {
            int value = generateRandom(index);
            display = numbers[value];
        }
        System.out.println(display);


        int[] numberSet = {1,2,4,8,16,32};
        int valueOf = generateRandom(numberSet.length);
        System.out.println(numberSet[valueOf]);

        int[] numberSet2 = {10,20,30,40};
        int value = generateRandom(numberSet2.length);
        System.out.println(numberSet2[value]);

    }

    public static int generateRandom(int integer){
        Random random = new Random();

        return random.nextInt(integer);

    }
}
