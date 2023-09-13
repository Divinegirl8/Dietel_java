package Task;

import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//       int passed = 0;
//       int failed = 0;
//
//       for (int count = 1; count <= 10; count++){
//           System.out.println("Enter score(pass = 1 and failed = 2): ");
//           int grade = scan.nextInt();
//
//           if(grade == 1){
//               passed += 1;
//           } else if (grade == 2) {
//               failed += 1;
//           }
//
//       }
//        System.out.println("The number of students that passed is " + passed);
//        System.out.println("The number of students that failed is " + failed);
//
//        if (passed > 8) {
//            System.out.println("Bonus to the teacher");
//        }

        int passed = 0;
        int failed = 0;
        int count = 0;

        while (count < 10){
            count++;
            System.out.println("Enter score(pass = 1 and failed = 2): ");
            int grade = scan.nextInt();

            if(grade == 1) {
                passed +=1;
            } else if (grade == 2) {
                failed +=1;

            }
        }


        System.out.println("The number of students that passed is " + passed);
        System.out.println("The number of students that failed is " + failed);

        if (passed > 8) {
            System.out.println("Bonus to the teacher");
        }


    }
}
