package Chapter6;

public class RoundingNumber2 {
    public static double roundingNumberToInteger(double number){
        return  (Math.floor(number * 1 + 0.5));
    }
    public static double roundingNumberToTenth(double number){
        return  (Math.floor(number * 10 + 0.5) / 10);
    }

    public static double roundingNumberToHundred(double number){
        return  (Math.floor(number * 100 + 0.5) / 100);
    }

    public static double roundingNumberToThousand(double number){
        return  (Math.floor(number * 1000 + 0.5) / 1000);
    }
}
