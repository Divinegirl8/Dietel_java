package Chapter6;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        System.out.printf("""
                %d
                %d
                %d
                %d
                %d
                %d
                
                """,generateRandom(2,6),generateRandom(4,50),generateRandom(0,7),generateRandom(1000,1030),generateRandom(-5,1),generateRandom(-2,9));
    }


    public static int generateRandom(int integer,int number){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        return random.nextInt(integer,number);

    }

}
