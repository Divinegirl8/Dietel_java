package Chapter4;

public class Asteriks {
    public static void main(String[] args) {


        for (int column = 1; column <= 4; column++){

            for (int row = 1; row <= 8; row++){
                System.out.print("*" + "  ");
            }
            System.out.println();
            System.out.print(" ");
            for (int row2 = 1; row2 <= 8; row2 ++) {
                System.out.print("*" + "  " );
            }
            System.out.println();


        }
    }
}
