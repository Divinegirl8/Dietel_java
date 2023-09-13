package Task;

public class MultiplicationTable {

    public static void main(String[] args) {

        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;


        for (int times = 1; times <= 12; times++) {

           for ( int row = 1; row <= 1; row++) {
               count += 1 * 2;

               System.out.print("2 * " + times + " = " + count );

           }

            for ( int row = 1; row <= 1; row++) {
                count2 += 1 * 3;

                System.out.print("\t \t" + "3 * " + times + " = " + count2);


            }


            for (int row = 1; row <=1 ; row++) {

                count3 += 1 * 4;
                System.out.print("\t \t" + "4 * " + times + " = " + count3);

            }

            for (int row = 1; row <= 1; row++) {

                count4 += 1 * 5;

                System.out.print("\t \t" + "5 * " + times + " = " + count4);

            }

            for (int row = 1; row <= 1; row++) {

                count5 += 1 * 6;

                System.out.print("\t \t" + "6 * " + times + " = " + count5);

            }

            for (int row = 1; row <= 1; row++) {

                count6 += 1 * 7;

                System.out.print("\t \t" + "7 * " + times + " = " + count6);

            }



            for (int row = 1; row <= 1; row++) {

                count7 += 1 * 8;

                System.out.print("\t \t" + "8 * " + times + " = " + count7);

            }

            for (int row = 1; row <= 1; row++) {

                count8 += 1 * 9;

                System.out.print("\t \t" + "9 * " + times + " = " + count8);

            }

            for (int row = 1; row <= 1; row++) {

                count9 += 1 * 10;

                System.out.print("\t \t" + "10 * " + times + " = " + count9);

            }

            System.out.println();

        }

        System.out.println();

        int counter = 1;
        int number1 = 0;
        int number2 = 0;

        while (counter <= 12) {
            counter ++;

            number1 += 1 * 11;

            number2 += 1 * 12;

            System.out.print("11 * " + counter + " = " + number1);
            System.out.print("\t  " + "12 * " + counter + " = " + number2);

            System.out.println();
        }




    }

}
