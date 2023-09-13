package Task;

public class AesterikShape {

    public static void main(String[] args) {
        for(int column = 1; column <= 5; column++){
            for (int row = 1; row <= column; row++){
                System.out.print(" *  ");
            }

            System.out.println();

        }

        System.out.println();

        for (int row = 1; row <= 5; row++){
            for (int column = 5; column >= row; column--) {
                System.out.print(" *  ");
            }
            System.out.println();
        }

        for (int row = 1; row <=5; row++){
            for (int column = 1; column <= row; column++ ){
                System.out.print("    ");
            }
            for (int reversed = 5; reversed >= row; reversed--){
                System.out.print(" *  ");
            }

            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= 5; row++){


            for (int column = 5; column >= row; column--){
                System.out.print("    ");

            }
            for (int reversed = 1; reversed <= row; reversed++){

                System.out.print(" *  ");
            }


            System.out.println();
        }


    }
}
