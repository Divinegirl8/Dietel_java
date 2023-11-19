package Airline;

import java.util.Arrays;
import java.util.Scanner;

public class AirLineSitBooking2 {

    private boolean[] planeSit =  new boolean[10];
    int count = 0;
    int count1 = 0;
    public boolean firstClassBookingFunction(){

        for (int i = 0; i < 4; i++) {
            if (planeSit[i]) count = +1;
        }
        if (count == 5) return false;
            planeSit[freeIndex(planeSit)] = true;
        return true;
    }
    public boolean economyClassBookingFunction(){

        for (int i = 5; i < 9; i++) {
            if (planeSit[i]) count = +1;
        }
        if (count == 5) return false;
            planeSit[freeIndexF(planeSit)] = true;
        return true;
    }


    public int freeIndex(boolean[] sits){
        for (int i = 5; i < 9; i++) {
            if (!sits[i]) return i;
        }
        return 12;
    }
    public int freeIndexF(boolean[] sits){
        for (int i = 0; i < 4; i++) {
            if (!sits[i]) return i;
        }
        return 12;
    }
    public boolean[] sitStatus(){
        return planeSit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AirLineSitBooking2 booking2 = new AirLineSitBooking2();
        while (true) {

            int option = 0;
            while (true) {
                System.out.println("""
                        press 1 for first class
                                        
                        press 2 for economy class
                         
                        """);
                option = scanner.nextInt();
                if (option > 2 || option < 1) continue;
                break;
            }
            boolean result = false;
            if (option == 2) {
                result = booking2.economyClassBookingFunction();
                if (result) System.out.println("a bit has been book for you in the economy sit position");
                System.out.println("no available sit in the economy position");
            }
            if (option == 1) result = booking2.firstClassBookingFunction();
            result = booking2.firstClassBookingFunction();
            if (result) System.out.println("a bit has been book for you in the first class sit position");
            System.out.println("no available sit in the first class  position");

            while (true) {
                option = 0;
                System.out.println("""
                        press 1 to book another sit 
                                            
                        press 2 to quit
                        """);
                option = scanner.nextInt();
                if (option > 2 || option < 1) continue;
                break;
            }
            if (option == 1) continue;
            break;
            }
        }
    }




