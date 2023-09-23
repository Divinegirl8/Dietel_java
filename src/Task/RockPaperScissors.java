package Task;
import java.util.Random;


import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("scissor (0), rock (1), paper (2): ");
        int number = scan.nextInt();
        int generate = random.nextInt(0,3);
        System.out.println(generate);


        String game = " ";
       if (number == 0 && generate == 0) {
           game = "Scissors";
       }
        if (number == 1 && generate == 1) {
            game = "Rock";
        }
        if (number == 2 && generate == 2) {
            game = "Paper";
        }

        if (number == 1) {
            System.out.printf("The computer is %s and you are %s, you won",game , game);
        }
        else if (number == generate) {
            System.out.printf("The computer is %s and you are %s too,it is draw",game ,game);
        }

        else {
            System.out.printf("The computer is %s and you are %s computer won",game,game);
        }

    }
}
