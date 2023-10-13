package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number consisting of four digits");
        String digit = scan.nextLine();

        System.out.println(encryption(digit));

    }

    public static String encryption(String digit) {
        int numberLength = digit.length();
        int count = 0;
        int convert = 0;
        Scanner scan = new Scanner(System.in);

        while (numberLength != 4 || !digit.matches("\\d+")) {
            System.out.println("Invalid Input, value should consist of positive numbers only");
            digit = scan.nextLine();
            numberLength = digit.length();

        }
        StringBuilder variable = new StringBuilder();
        StringBuilder variable2 = new StringBuilder();


        if (digit.matches("\\d+")) {


            ArrayList<Integer> array = new ArrayList<>();
            for (int index = 0; index < numberLength; index++) {
                char digitChar = digit.charAt(index);
                convert = Integer.parseInt(String.valueOf(digitChar));
                int decrypt = (convert + 7) % 10;
                array.add(decrypt);
            }

            int divideLength = array.size() / 2;



            for (int first = 0; first < divideLength; first++) {
                variable.append(array.get(first));
            }
            for (int second = divideLength; second < array.size(); second++) {
                variable2.append(array.get(second));
            }


        }
        return variable2 + "" + variable;
    }
}
