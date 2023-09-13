package Task;

import Task.Grade;

import  java.util.Scanner;


public class GradeTest {
    public static void main(String[] args) {

//        Task.Grade grade = new Task.Grade("john rhoda" , 60.0);

        Grade grade = new Grade();
        Scanner scan = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = scan.nextLine();
        grade.setName(name);

        System.out.print("Student Score: ");
        double score = scan.nextDouble();
        grade.setAverage(score);

        System.out.printf("%s scored %.0f which is %s %n" , grade.getName() , grade.getAverage(),grade.checkGrade());

//        System.out.printf("%s scored %.0f which is %s",grade.getName() , grade.getAverage() ,grade.checkGrade());

    }


}
