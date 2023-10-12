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
        int numberLength = digit.length();
        int count = 0;
        int convert = 0;


        while (numberLength != 4) {
            System.out.println("Enter a number consisting of four digits");
            digit = scan.nextLine();
            numberLength = digit.length();
        }


        ArrayList<Integer> array = new ArrayList<>();
        for (int index = 0; index < numberLength; index++) {
            char digitChar = digit.charAt(index);
            convert = Integer.parseInt(String.valueOf(digitChar));
            int decrypt = (convert - 7 + 10) % 10;
            array.add(decrypt);
        }

        int divideLength = array.size() / 2;


        StringBuilder v = new StringBuilder();
        StringBuilder vw = new StringBuilder();
        for (int first = 0; first < divideLength; first++) {
            v.append(array.get(first));
        }
        for (int second = divideLength; second < array.size(); second++) {
            vw.append(array.get(second));
        }

        System.out.print(vw + "" + v);
    }

}