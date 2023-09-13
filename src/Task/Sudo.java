package Task;


/*
 * prompt user for a score
 *
 *
 *
 * if  score is in the range of 90 - 100
 *     print "A"
 *
 *  if score is in the range of 80 - 89
 *     print "B"
 *
 *
 *  if score is in the range of 70 - 79
 *      print "C"
 *
 * if score is in the range of 60 - 69
 *       print "D"
 *
 *  if score is less than 60
 *      print "F"
 *
 *
 *

 */







import  java.util.Scanner;


public class Sudo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a score: ");
        int score = scan.nextInt();

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        }

       if(score >= 80  && score <= 89) {
            System.out.println("B");
        }

        else if(score >= 70 && score <= 79) {
            System.out.println("C");
        }
        else if (score >= 60 && score <= 69) {
            System.out.println("D");
        }

        else {
            System.out.println("F");
        }


    }

}
