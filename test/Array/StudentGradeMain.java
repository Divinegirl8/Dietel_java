package Array;

import java.util.Arrays;
import java.util.Scanner;
import static Array.StudentGrade.*;

public class StudentGradeMain {
    public static void main(String[] args) throws InterruptedException {
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
            }
        }
        saving();

        total(storeValue(convert, convert2));
        average(totalList, convert2);
        positionScore(totalList);
        totalSubjectCal(storeValueList);
        averageSubject(totalSubject, convert);
        maximumScore(storeValueList);
        minimumScores(storeValueList);
        passes(storeValueList);
        fail(storeValueList);
;

        for (int count = 0; count < storeValueList.size(); count++) {
            System.out.printf("%-16s", "Student " + (count + 1));
            for (int count2 = 0; count2 < storeValueList.get(count).size(); count2++) {
                System.out.printf("%-16d ", storeValueList.get(count).get(count2));
            }
            System.out.printf("%-6d", totalList.get(count));
            System.out.printf("%10.2f", averageList.get(count));
            System.out.printf("%12s", addPosition.get(count));
            System.out.println();

        }
dashDisplay(105);
        System.out.println("SUBJECT SUMMARY");
        for (int value = 0; value < maximumScoreList.size(); value++) {
            if (maximumScoreList.get(value) > minimumScoreList.get(value)) {
                System.out.printf("""
                                SUBJECT %d
                                Highest scoring student is: Student %d scoring %s
                                Lowest scoring student is: Student %d scoring %s
                                Total Score is: %d
                                Average Score is: %.2f
                                Number of passes: %d
                                Number of failures: %d%n
                                """, value + 1, indexList.get(value),maximumScoreList.get(value),indexMin.get(value),minimumScoreList.get(value),
                        totalSubject.get(value), averageSubjectList.get(value),
                        passesList.get(value), failList.get(value));
            }
            else {

                    System.out.printf("""
                                SUBJECT %d
                                Highest scoring student is: %s
                                Lowest scoring student is: None
                                Total Score is: %d
                                Average Score is: %.2f
                                Number of passes: %d
                                Number of failures: %d%n
                                """, value + 1, maximumScoreList.get(value),
                            totalSubject.get(value), averageSubjectList.get(value),
                            passesList.get(value), failList.get(value));
            }
        }

    }

    }


