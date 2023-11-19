package Airline;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineCompany {

    private static boolean[] assignSeatFirstClass(boolean[] user, int score) {
        for (int index = 0; index < user.length/2; index++) {
            if (score == 1 && !user[index]) {
                user[index] = true;
                break;
            }
        }
        return user;
    }

    private static boolean[] assignSeatEconomy(boolean[] user, int score) {
        for (int index = user.length/2; index < user.length; index++) {
            if (score == 2 && !user[index]) {
                user[index] = true;
                break;
            }
        }
        return user;
    }

    private static void output(){
        System.out.println("Seat is filled up");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirlineSeat company = new AirlineSeat();
        boolean[] seats = company.getSeats();

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter seat type (1 for first class, 2 for economy)");
            int value = scanner.nextInt();
            if (value == 1){
            seats = assignSeatFirstClass(seats, value);}

            else if (value == 2) {
               seats = assignSeatEconomy(seats,value);
            }


        }
        System.out.println(Arrays.toString(seats));
    }
}
