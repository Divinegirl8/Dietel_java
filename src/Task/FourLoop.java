package Task;

public class FourLoop {

    public static void main(String[] args) {


        System.out.println(" PATTERN A");
        for (int row = 1; row <= 6; row++){
            for (int column = 1; column <= row; column++) {
                System.out.print(" " + column);
            }

            System.out.println();

        }

        System.out.println();
        System.out.println("  PATTERN B");
        for (int row = 1; row <= 6; row++) {
            for (int column2 = 1; column2 <= 7 - row; column2++){
                System.out.print(" " + column2);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("  PATTERN C");
        for (int row = 1; row <= 6; row++) {

            for (int column = 5; column >= row; column--){
                System.out.print(" ");

            }
            for (int reversed = 1; reversed <= row - 1; reversed++){

                System.out.print(reversed);
            }


            System.out.println();
        }


        System.out.println();
        System.out.println("    PATTERN D");
        for (int row = 1; row <= 6; row++){
            for (int column = 1; column <= row; column++) {
                System.out.print("  ");
            }
            for (int column2 = 1; column2 <= 7 - row; column2++){
                System.out.print(" " + column2);
            }
            System.out.println();

        }

    }

}
