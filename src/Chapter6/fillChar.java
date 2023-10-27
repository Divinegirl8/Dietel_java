package Chapter6;

import java.util.Scanner;

public class fillChar {
    public static String characterDisplay(int number,char fillCharacter){
        for (int inner = 0; inner < number; inner++) {
            for (int outer = 0; outer < number; outer++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a symbol");
        char fill = input.next().charAt(0);
        System.out.println(characterDisplay(4,fill));

    }
}
