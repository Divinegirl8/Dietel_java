package Chapter3;

import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HealthProfile profile = new HealthProfile(" " , " " , " " , 0 , 0 , 0 , 0 , 0);


        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        profile.setFirstName(firstName);

        System.out.print("last Name: ");
        String lastName = scan.nextLine();
        profile.setLastName(lastName);

        System.out.print("Gender: ");
        String gender = scan.nextLine();
        profile.setGender(gender);

        System.out.print("Birth Month: ");
        int month = scan.nextInt();
        profile.setBirthMonth(month);

        System.out.print("Birth Day: ");
        int day = scan.nextInt();
        profile.setBirthDay(day);

        System.out.print("Birth Year: ");
        int year = scan.nextInt();
        profile.setBirthYear(year);

        System.out.printf("Height: ");
        double height = scan.nextDouble();
        profile.setHeight(height);

        System.out.print("Weight: ");
        double weight = scan.nextDouble();
        profile.setWeight(weight);

        System.out.println();

        System.out.printf("Name: %s %s %nGender: %s %nDate of Birth: %d-%d-%d %nAge: %d  %nHeight: %.1f  %nWeight: %.1f %nMaximum Heart Rate: %d%n " , profile.getFirstName() , profile.getLastName() , profile.getGender() , profile.getBirthMonth() , profile.getBirthDay() , profile.getBirthYear() , profile.calculateAge() , profile.getHeight() , profile.getWeight(), profile.maximumHeartRate() );
        profile.targetHeartRate();
        profile.bodyMassIndex();


    }




}
