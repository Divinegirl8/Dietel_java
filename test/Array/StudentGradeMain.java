package Array;

import java.util.Arrays;
import java.util.Scanner;
import static Array.StudentGrade.*;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many student(s) do you have: ");
        String student = scan.nextLine();

        while (!student.matches("\\d+")) {
            System.out.println("invalid!. The number of student(s) must consist of positive number(s) only \nEnter again");
            student = scan.nextLine();
        }

        int convert = 0;
        if (student.matches("\\d+")) {
            convert = Integer.parseInt(student);
        }

        while (convert == 0) {
            System.out.println("invalid!. The number of student(s) must be greater than 0\nEnter again");
            student = scan.nextLine();
            if (student.matches("\\d+")) {
                convert = Integer.parseInt(student);
            }
        }

        System.out.println("How many subject(s) do they offer: ");
        String subject = scan.nextLine();

        while (!subject.matches("\\d+")) {
            System.out.println("invalid!. The number of subject(s) must consist of positive number(s) only \nEnter again");
            subject = scan.nextLine();
        }

        int convert2 = 0;
        if (subject.matches("\\d+")) {
            convert2 = Integer.parseInt(subject);

            while (convert2 == 0) {
                System.out.println("invalid!. The number of subject(s) must be greater than 0\nEnter again");
                subject = scan.nextLine();

                if (subject.matches("\\d+")) {
                    convert2 = Integer.parseInt(subject);
                }
            }}
        saving();

        System.out.println(total(storeValue(convert, convert2)));
        totalSubjectCal(storeValueList);
        System.out.println(totalSubject);
        averageSubject(totalSubject,convert);
        System.out.println(averageSubjectList);
        System.out.println(maximumScore(storeValueList));
        System.out.println(maximumScoreList);
    }

}
