package Chapter4;

import java.util.ArrayList;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number consisting of four digits");
        String digit = scan.nextLine();
        int numberLength = digit.length();
        int count = 0;
        int convert = 0;

        while (numberLength != 4 || !digit.matches("\\d+")){
            System.out.println("Invalid Input, value should consist of positive numbers only");
            digit = scan.nextLine();
            numberLength = digit.length();

        }



        if (digit.matches("\\d+")) {

            ArrayList<Integer> array = new ArrayList<>();
            for (int index = 0; index < numberLength; index++) {
                char digitChar = digit.charAt(index);
                convert = Integer.parseInt(String.valueOf(digitChar));
                int decrypt = (convert + 7) % 10;
                array.add(decrypt);
            }

            int divideLength = array.size() / 2;


            StringBuilder variable = new StringBuilder();
            StringBuilder variable2 = new StringBuilder();
            for (int first = 0; first < divideLength; first++) {
                variable.append(array.get(first));
            }
            for (int second = divideLength; second < array.size(); second++) {
                variable2.append(array.get(second));
            }

            System.out.print(variable2 + "" + variable);
        }

    }
}
