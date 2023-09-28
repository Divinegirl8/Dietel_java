package Array;

import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {

        char[] [] inputs = new char[3][3];


        for (int count = 0; count < inputs.length; count++){
            for (int row = 0; row < inputs[count].length; row++){
                for (int column = 0; column < row; column+=2)System.out.print('|');

                if((count == 0 && row == 1) || (count == 1 && row == 2) || (count == 2 && row == 0) ) System.out.print('O');
                else System.out.print('X');
            }
            System.out.println();
        }



    }
}
