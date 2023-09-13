package Chapter3;

import java.util.Calendar;

public class HealthProfile {

    private  String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    private double height;
    private double weight;

    public  HealthProfile(String firstName , String lastName , String gender, int birthMonth , int birthDay , int birthYear , double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;

    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int calculateAge(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);


        return year - birthYear;


    }

    public int maximumHeartRate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int age = year - birthYear;
        int maximumHeart = 220 - age;

        return maximumHeart;
    }

    public void targetHeartRate() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int age = year - birthYear;
        int heartRate = 220 - age;


        System.out.printf("Target Rate: %d and %d%n" , 50 - heartRate /100 , 70 - heartRate /100);
    }

    public  void bodyMassIndex() {
        double heightIninches = height * 12;
        double weigthInpounds = weight * 2.20462;

        double result = ( weigthInpounds *  703 ) / (heightIninches * heightIninches);
        System.out.printf("Body Mass Index: %.1f%n" , result);

        System.out.println();

        System.out.println("BMI Categories:");
        System.out.println("Underweight = <18.5");
        System.out.println("Normal weight = 18.5–24.9 ");
        System.out.println("Overweight = 25–29.9");
        System.out.println("Obesity = BMI of 30 or greater ");
    }

}
