package PYTHON;

public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNUmber = 1;
        int result = firstNumber + secondNUmber;

        System.out.printf("%d %d %d ",firstNumber,secondNUmber,secondNUmber);
        for(int count = 1; count <= 50; count++){
            firstNumber = secondNUmber;
            secondNUmber = result;
            result = firstNumber + secondNUmber;

            if (result <= 50){
                System.out.print(result +" ");
            }

        }

    }

}
