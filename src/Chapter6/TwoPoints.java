package Chapter6;

public class TwoPoints {
    public static double points(double firstX, double firstY, double secondX, double secondY){
        double result = Math.sqrt((Math.pow(secondX - firstX,2)) + (Math.pow(secondY - firstY,2)));
        return (double) Math.round(result * 10000) / 10000;
    }
}
