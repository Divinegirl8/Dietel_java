package ticTacToePackage.exceptionPackage;

public class SpaceIsOccupiedError extends RuntimeException {
    public SpaceIsOccupiedError(String message){
        super(message);
    }
}
