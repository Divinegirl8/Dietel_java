package SnackTwo;
import java.util.Scanner;


public class UserNumberChoice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number and press -2 to quit: ");
        int userNumber = scan.nextInt();

        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;
        int count = 0;

        while (userNumber != -2) {

            count+=1;

            System.out.print("Enter a number and press -2 to quit: ");
            userNumber = scan.nextInt();

            if(userNumber > 0){
                positiveNumber +=1;
            }
            if(userNumber < 0){
                negativeNumber +=1;
            }

            if(userNumber == 0){
                zeroNumber +=1;
            }
        }

        System.out.printf("The number of positive number entered is %d%n",positiveNumber);
        System.out.printf("The number of negative number entered is %d%n",negativeNumber);
        System.out.printf("The number of zero number entered is %d%n",zeroNumber);


    }
}
