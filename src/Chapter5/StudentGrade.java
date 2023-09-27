package Chapter5;

import java.util.Scanner;

public class StudentGrade {
    public static void Grade(){
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for(int count = 0; count < 5; count++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student Name: ");
            String name = scan.nextLine();
            System.out.println("Enter Student Grade(A,B.C.D): ");
            String score = scan.nextLine();
            String change = score.toLowerCase();

            switch (change){
                case "a":
                    countA += 1;
                break;
                case "b":
                    countB += 1;
                break;
                case "c":
                    countC += 1;
                break;
                case "d":
                    countD += 1;
                break;
                default:
                    System.out.println("Error!!! Enter Grade (A.B.C,D)");
            }

        }

        System.out.printf("""
The number of student that scored A is %d
The number of student that scored B is %d
The number of student that scored C is %d
The number of student that scored D is %d
""",countA,countB,countC,countD);
    }

    public static void main(String[] args) {
        Grade();
    }
}
