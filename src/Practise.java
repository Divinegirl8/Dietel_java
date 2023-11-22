import java.util.Random;
import java.util.Scanner;

public class Practise {

    public static String rankDisplay(){
        String result = "";
        switch (new Random().nextInt(1,14)){
            case 1 -> result = "Ace";
            case 2 -> result = "2";
            case 3 -> result = "3";
            case 4 -> result = "4";
            case 5 -> result = "5";
            case 6 -> result = "6";
            case 7 -> result = "7";
            case 8 -> result = "8";
            case 9 -> result = "9";
            case 10 -> result = "10";
            case 11 -> result = "Jack";
            case 12 -> result = "Queen";
            case 13 -> result = "King";
        }return result;}

    public static String suitDisplay(){
        String result = "";
        switch (new Random().nextInt(1,5)) {
            case 1 -> result = "Clubs";
            case 2 -> result = "Diamonds";
            case 3 -> result = "Hearts";
            case 4 -> result = "Spades";
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        System.out.println("Pick a card from the deck 1 - 52");
        int card = scanner.nextInt();

        while (card <= 0 || card > 52) {System.out.println("Error card must be between 1 - 52");
            card = scanner.nextInt();

        }

        System.out.println("The card you picked is " + rankDisplay() + " of " + suitDisplay());
    }
}
