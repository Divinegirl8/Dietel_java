package Airline;

import java.util.Arrays;
import java.util.Scanner;

public class AirlineCompany {

    private static boolean[] assignSeat(boolean[] user, int score) {
        for (int index = 0; index < user.length/2; index++) {
            if (score == 1 && !user[index]) {
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
            System.out.println("Enter seat type (1 for regular, 2 for business)");
            int value = scanner.nextInt();
            seats = assignSeat(seats, value);
            System.out.println(Arrays.toString(seats));
        }
    }
}
