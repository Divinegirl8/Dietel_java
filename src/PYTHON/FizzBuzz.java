package PYTHON;

public class FizzBuzz {
    public static void main(String[] args) {

        int count = 0;

        while (count < 50) {
            count ++;
            if (count % 3 == 0 && count % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(count);
            }
        }

    }
}
