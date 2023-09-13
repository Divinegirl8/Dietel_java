package Task;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter today\'s day: ");
        int today = scan.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int future = scan.nextInt();

        int result = (today + future) % 7;



            switch (today) {
                case 0:
                    System.out.print("Today is Sunday and");
                    break;
                case 1:
                    System.out.print("Today is Monday and");
                    break;
                case 2:
                    System.out.print("Today is Tuesday and");
                    break;
                case 3:
                    System.out.print("Today is Wednesday and");
                    break;
                case 4:
                    System.out.print("Today is Thursday and");
                    break;
                case 5:
                    System.out.print("Today is Friday and");
                    break;
                case 6:
                    System.out.print("Today is Saturday and");
                    break;
                default:
                    System.out.println("error!!!");
            }

            switch (result) {
                case 0:
                    System.out.println(" the future day is Sunday");
                    break;
                case 1:
                    System.out.println(" the future day is Monday");
                    break;
                case 2:
                    System.out.println(" the future day is Tuesday");
                    break;
                case 3:
                    System.out.println(" the future day is Wednesday");
                    break;
                case 4:
                    System.out.println(" the future day is Thursday");
                    break;
                case 5:
                    System.out.println(" the future day is Friday");
                    break;
                case 6:
                    System.out.println(" the future day is Saturday");
                    break;


            }


    }
}
