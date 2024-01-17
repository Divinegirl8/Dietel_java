package chapter7;

public class CommandLineArgument {
    public static void main(String[] args) {
        double max = 0;
        double min = Integer.MAX_VALUE;



        for (int index = 0; index < args.length; index++) {
            int number = Integer.parseInt(args[index]);

            if (number > max) max = number;
            if (number < min) min = number;
        }



        System.out.printf("The average of the args maximum is  %.1f%n" , max/args.length);
        System.out.printf("The average of the args minimum is %.1f" , min/args.length);
    }
}
