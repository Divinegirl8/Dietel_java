package Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number consisting of four digits");
        String digit = scan.nextLine();
        System.out.println(decryption(digit));

    }

public static String decryption(String digit){
        Scanner scan = new Scanner(System.in);
    int numberLength = digit.length();
    int count = 0;
    int convert = 0;

    while (numberLength != 4 || !digit.matches("\\d+")){
        System.out.println("Enter a number consisting of four digits");
        digit = scan.nextLine();
        numberLength = digit.length();

    }

    StringBuilder value = new StringBuilder();
    StringBuilder value2 = new StringBuilder();

    if (digit.matches("\\d+")) {

        ArrayList<Integer> array = new ArrayList<>();
        for (int index = 0; index < numberLength; index++) {
            char digitChar = digit.charAt(index);
            convert = Integer.parseInt(String.valueOf(digitChar));
            int decrypt = (convert - 7 + 10) % 10;
            array.add(decrypt);
        }

        int divideLength = array.size() / 2;

        for (int first = 0; first < divideLength; first++) {
            value.append(array.get(first));
        }
        for (int second = divideLength; second < array.size(); second++) {
            value2.append(array.get(second));
        }


    }
    return value2 + "" + value;
}



}