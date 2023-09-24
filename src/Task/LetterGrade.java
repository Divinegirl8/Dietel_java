package Task;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("%s%n%s%n%s%n%s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");
int total = 0;
int gradeCounter = 0;
int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;
int countF = 0;
int grades = 0;
while (scan.hasNext()){
    grades = scan.nextInt();
    total += grades;
    gradeCounter += 1;

        switch (grades / 10) {
            case 10, 9 -> countA++;
            case 8 -> countB++;
            case 7 -> countC++;
            case 6 -> countD++;
            default -> countF++;
        }}

if (grades != 0){
    double result = (double) total / gradeCounter;
    System.out.printf("""
The average score of student entered is %.2f
The total number of student score entered is %d
Total number of Student that scored A : %d
Total number of Student that scored B : %d
Total number of Student that scored C : %d
Total number of Student that scored D : %d
Total number of Student that scored F: %d
""",result,total,countA,countB,countC,countD,countF);
}
else {
    System.out.println("No grades entered");
}
    }
}
