package Chapter5;

import java.util.Scanner;

public class GlobalWarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Questions on Global Warming
                Choose between a - d
                """);
        System.out.println("""
                Question 1
                Since 1870, global sea levels have risen by about _______
                a) 4 inches b) 23 inches c) 8 inches d) 23 inches
                """);
        String question1 = scan.nextLine().toLowerCase();

        while (!question1.matches("[a-d]+")){
            System.out.print("""
                    Error choose between a-d
                    """);
            question1 = scan.nextLine().toLowerCase();
        }


        System.out.println("""
                Question 2
             _________ is the increase of Earth's average surface temperature due to greenhouse gases that
             collect in the atmosphere like a thickening blanket, trapping the sun's heat and
             causing the planet to warm up
             a) Heat wave b) Global warming c) Radiation d) Emittance
                """);
        String question2 = scan.nextLine().toLowerCase();

        while (!question2.matches("[a-d]+")){
            System.out.print("""
                    Error choose between a-d
                    """);
            question2 = scan.nextLine().toLowerCase();
        }


        System.out.println("""
                Question 3
                Heat waves caused by global warming present greater risk of heat-related _______
                a) Sore b) Body rashes c) Fatigue d) Illness and death
                """);
        String question3 = scan.nextLine().toLowerCase();

        while (!question3.matches("[a-d]+")){
            System.out.print("""
                    Error choose between a-d
                    """);
            question3 = scan.nextLine().toLowerCase();
        }



        System.out.println("""
                Question 4
                According to the U.S. Global Change Research Program, the temperature in the U.S. has increased
                by ___ degrees Celsius in the last ___ years and precipitation has increased by ___%.
                a) 2,50, 5   b) 10,2,6   c) 25,3,10     d) 7,6,4
                """);
        String question4 = scan.nextLine().toLowerCase();

        while (!question4.matches("[a-d]+")){
            System.out.print("""
                    Error choose between a-d
                    """);
            question4 = scan.nextLine().toLowerCase();
        }


        System.out.println("""
                Question 5
                What is the full meaning of E.P.A
                a) Environmental Pushing Agency   b) Economy Prevent Agency   c) Economy Priority Advocate    d) Environmental Protection Agency
                """);
        String question5 = scan.nextLine().toLowerCase();

        while (!question5.matches("[a-d]+")){
            System.out.print("""
                    Error choose between a-d
                    """);
            question5 = scan.nextLine().toLowerCase();
        }

        System.out.println(comment(countAnswer(question1,question2,question3,question4,question5)) + "\n" + "FACTS WAS GOTTEN IN 11 FACTS ABOUT GLOBAL WARMING\n" +
                "https://www.dosomething.org/us/facts/11-facts-about-global-warming");

    }


    public static int countAnswer(String answer,String answer2,String answer3,String answer4,String answer5){
        int count = 0;

        if (answer.equals("c")){
            ++count;
        }
        if (answer2.equals("b")){
            ++count;
        }
        if (answer3.equals("d")){
            ++count;
        }
        if (answer4.equals("a")){
            ++count;
        }
        if (answer5.equals("d")){
            ++count;
        }
        return count;
    }

    public static String comment(int number){
        String answer = "";
        switch (number){
            case 5:
                answer = "Excellent";
                break;
            case 4:
                answer = "Fair";
                break;

            default:
                answer = "Time to brush up on your knowledge of global warming";
        }
        return answer;
    }
}


