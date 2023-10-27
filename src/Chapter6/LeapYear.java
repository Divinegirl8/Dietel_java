package Chapter6;

public class LeapYear {
    public static boolean isLeap(int number){

        return (number % 4 == 0 && number % 100 != 0) || number % 400 == 0;
    }
}
