package Task;

import Task.Bike;

import java.util.Scanner;


public class BikeTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bike bike = new Bike();

        System.out.print("Enter name of bike: ");
        System.out.println();
        String name = scan.nextLine();

        bike.setName(name);

          bike.setOn(true);
        System.out.printf("The name of the bike is %s and it is %s", bike.getName(), bike.isOn()? "On": "Off");

//      boolean numb = bike.isOn();

//        if (numb == true) {
//            System.out.println("The name of the bike is " + bike.getName() + " and the bike is on \n");
//
//        }
//
//        else if (numb == false) {
//
//            System.out.println("The name of the bike is " + bike.getName()  + " and the bike is off \n");
//        }
//
//



    }




}
