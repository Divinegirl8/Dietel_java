package SnackTwo;

public class CastFloat {

    public static void main(String[] args) {


        int result = 1;
        int result1 = 1;
        int result2 = 1;
        int result3 = 1;
        int result4 = 1;


        int firstPower = 2;
        int first = 1;
        int second = 2;
        int secondPower = 3;
        int third = 3;
        int thirdPower = 4;
        int fourth = 4;
        int fourPower = 5;
        int fifth = 5;
        int fifthPower = 6;


            for (int one = 1; one <= firstPower; one++) {
                result *= first;
            }

            for (int two = 1; two <= secondPower; two++) {
                result1 *= second;

            }

            for (int three = 1; three <= thirdPower; three++){
                result2 *= third;
            }
            for(int four = 1; four <= fourPower; four++){
                result3 *= fourth;

            }
            for(int five = 1; five <= fifthPower; five++){
                result4 *= fifth;
            }

            System.out.print("a\tb\tpow(a,b)\n");
            System.out.printf("%d\t%d\t %d%n",first,firstPower , result);
            System.out.printf("%d\t%d\t %d%n",second,secondPower , result1);
            System.out.printf("%d\t%d\t %d%n",third,thirdPower , result2);
            System.out.printf("%d\t%d\t %d%n",fourth,fourPower , result3);
            System.out.printf("%d\t%d\t %d%n",fifth,fifthPower , result4);

    }

}
