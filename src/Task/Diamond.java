package Task;

public class Diamond {

    public static void main(String[] args) {
        for (int column = 1; column <= 10; column++) {


            for (int row1 = 1; row1 <= 1; row1++) {

                for (int row = 10; row >= column; row--) {

                    System.out.print("   ");

                }

                for (int row2 = 2; row2 <= column; row2++) {
                    System.out.print(" * ");
                }


            }


            for (int row1 = 1; row1 <= 1; row1++) {

                for (int row = 3; row <= column; row++) {
                    System.out.print(" * ");
                }

                for (int row2 = 10; row2 >= column; row2--) {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }


// second row


        System.out.print(" ");

        for (int column2 = 1; column2 <= 10; column2++) {

            for (int row = 1; row <= 1; row++) {

                for (int row2 = 1; row2 <= column2; row2++) {
                    System.out.print("   ");
                }
                for (int row3 = 9; row3 >= column2; row3--) {
                    System.out.print(" * ");
                }

            }

            for (int row = 1; row <= 1; row++) {
                for (int row2 = 8; row2 >= column2; row2--) {

                    System.out.print(" * ");
                }

                for (int row3 = 1; row3 <= column2; row3++) {

                    System.out.print("   ");
                }


                System.out.println();

            }





        }

    }
}
