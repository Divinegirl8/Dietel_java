package Chapter6;
import static Chapter6.PerfectNumbers.*;



public class PerfectNumberMain {
    public static void main(String[] args) {
        for (int index = 1; index <= 1000; index++) {
              if (isPerfectNumber(index)){
                  System.out.println(index);
              }
        }

        System.out.println("\n" +"Going beyond 1000");


        for (int index2 = 1000; index2 <= 10000; index2++) {
            if (isPerfectNumber(index2)){
                System.out.println(index2);
            }
        }

    }
}
