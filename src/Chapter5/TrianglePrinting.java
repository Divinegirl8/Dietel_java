package Chapter5;

public class TrianglePrinting {
    public static void main(String[] args) {
        //        first column

        for (int row = 1; row <=10; row++){


            for (int row3 = 1; row3 <=1; row3++){
                for (int column = 1; column <= row; column++ ){
                    System.out.print("*  ");

                }

                for (int column3 = 10; column3 >= row; column3--) {
                    System.out.print("   ");
                }



            }
            for (int space = 1; space < 5; space++){
                System.out.print("   ");
            }


// second column

            for (int row4 = 1; row4 <=1; row4++) {
                for (int column = 10; column >= row; column--) {
                    System.out.print("*  ");

                }

                for (int column4 = 1; column4 <= row; column4++) {
                    System.out.print("   ");
                }

            }


            for (int space = 1; space < 5; space++){
                System.out.print("   ");
            }

//third column


            for (int row3 = 1; row3 <=1; row3++){
                for (int column = 1; column <= row; column++ ){
                    System.out.print("   ");

                }


                for (int column3 = 10; column3 >= row; column3--) {
                    System.out.print("*  ");
                }



            }


            for (int space = 1; space < 5; space++){
                System.out.print("   ");
            }



// fourth column


            for (int row4 = 1; row4 <=1; row4++){
                for (int column = 10; column >= row; column-- ){
                    System.out.print("   ");

                }

                for (int column4 = 1; column4 <= row; column4++) {
                    System.out.print("*  ");
                }



            }

            System.out.println();
        }


    }
}
