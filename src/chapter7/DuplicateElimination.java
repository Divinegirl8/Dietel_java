package chapter7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {
    public static int[] storeNumbers(){
        Scanner scanner = new Scanner(System.in);
        int[] container = new int[10];

        Arrays.fill(container,-1);

        for (int index = 0; index < container.length; index++) {
            int userInput = scanner.nextInt();

            while (userInput < 10 || userInput > 100){
                System.out.println("Error choose between 10 - 100");
                userInput = scanner.nextInt();
            }

            container[index] = userInput;

        }
return eliminateDuplicates(container);
    }

    public static int[] eliminateDuplicates(int[] values){
        ArrayList<Integer> elements = new ArrayList<>();

        for (int value: values) {
            if (!elements.contains(value)) elements.add(value);
        }
        return changeToArray(elements);
    }

    public static int[] changeToArray(ArrayList<Integer> values){
        int[] newContainer = new int[values.size()];

        for (int index = 0; index < values.size(); index++) {
            newContainer[index] = values.get(index);
        }

        return newContainer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(storeNumbers()));
    }
}
