package Chapter6;

import java.security.SecureRandom;

public class GameOfCraps {
    private enum GameStatus{CONTINUE,WON,LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollDice(){
        SecureRandom random = new SecureRandom();
        int firstDie = 1 + random.nextInt(6);
        int secondDie = 1 + random.nextInt(6);

        return firstDie + secondDie;
    }

    public static void main(String[] args) {
        int point;
        int sumDice = rollDice();
        GameStatus gameStatus;

        switch (sumDice) {
            case SEVEN, YO_LEVEN -> gameStatus = GameStatus.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = GameStatus.LOST;
            default -> {
                {
                    point = sumDice;
                    gameStatus = GameStatus.CONTINUE;
                    System.out.println("point is " + point);
                }
                while (gameStatus == GameStatus.CONTINUE) {
                    sumDice = rollDice();

                    if (sumDice == point) gameStatus = GameStatus.WON;
                    else if (sumDice == SEVEN) gameStatus = GameStatus.LOST;

                }
            }
        }

        if (gameStatus == GameStatus.WON){
            System.out.println("player wins");
        }else {
            System.out.println("player lose");
        }
    }

}
