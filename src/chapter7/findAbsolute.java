package chapter7;

public class findAbsolute {
    public static void main(String[] args) {

            for (String value : args){
                int number = Integer.parseInt(value);
                System.out.print("The absolute value of "  + number + " is " + Math.abs(number) + "\n");
            }
    }
}
