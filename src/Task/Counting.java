package Task;

public class Counting {

    public static void main(String[] args) {
        int total = 0;
        int count = 1;

        while(count <= 100) {
            total += 1;
            count += 1;



            System.out.print("  " + total);


        }
        System.out.println();

        int number = 2;
        int countNumbers = 1;

        while (countNumbers <= 100) {

            if (number % 2 == 0){
                countNumbers += number;
                System.out.print( " " + countNumbers);
            }
            else {
                System.out.print(" " + countNumbers);
            }
        }

        System.out.println();

        for(number = 1; number <= 100; number++) {
             int square = number * number;
            System.out.print(" " + number);
            System.out.println("  "  + square);

        }

        System.out.println();

        for(int even = 2; even <= 100; even++){
            if (even % 2 == 0) {
                System.out.print(" " + even);
            }
        }

        System.out.println();

        for(int odd = 1; odd <= 100; odd++){
            if(odd % 2 != 0){
                System.out.print("  " + odd);
            }
        }

    }

}
