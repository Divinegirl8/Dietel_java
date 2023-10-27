package Chapter6;

public class SquaresOfAsteriks {
//    public static void displayAsterik(int number,int numberTwo){
//        if (number == numberTwo){
//            for (int index = 0; index < number; index++) {
//                for (int column = 0; column < numberTwo; column++) {
//                    System.out.print("*");
//                }
//
//                System.out.println();
//            }
//        }
//        else {
//            System.out.println("error");
//        }
//    }


    public static void displayAsterik(int number) {
        for (int index = 0; index < number; index++) {
            for (int column = 0; column < number; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }



    public static void main(String[] args) {
        displayAsterik(25);
    }
}
