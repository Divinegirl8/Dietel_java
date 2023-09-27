package Chapter5;

import java.util.Scanner;

public class ModifiedDiamond {
    public static void main(String[] args) {
    modifyInteger();
    }


    public static void modifyInteger(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an odd number between 1 and 19: ");
        int userNumber = scan.nextInt();


          if(userNumber > 0 && userNumber <= 19 && userNumber % 2 != 0) {
        for(int count = 1; count <= userNumber; count++){
            for (int row = userNumber; row > count; row--){
                System.out.print(" " + " ");
            }
            for (int row2 = 1; row2 < count; row2++){
                System.out.print("*" + " ");
            }

            for (int row = 2; row < count; row++){
                System.out.print("*" + " ");
            }
            for (int row2 = userNumber; row2 > count; row2--){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int count = 1; count <= userNumber; count++){


            for (int row = 1; row <= count; row++){
                System.out.print(" " + " ");
            }
            for (int row2 = userNumber - 1; row2 > count; row2--){
                System.out.print("*" + " ");
            }
            for (int row = userNumber - 2; row > count; row--){
                System.out.print("*" + " ");
            }
            for (int row2 = 1; row2 < count; row2++){
                System.out.print(" " + " ");
            }

            System.out.println();
        }}

          else {
             modifyInteger();
          }
    }
}
