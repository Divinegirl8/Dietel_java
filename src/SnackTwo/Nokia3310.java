 package SnackTwo;
import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        menu();
    }


    public static void menu() {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("         MENU");
        System.out.println("""
                press 1 -->   Phone book
                press 2 -->   Messages
                press 3 -->   Chat
                press 4 -->   Call Register
                press 5 -->   Tones
                press 6 -->   Settings
                press 7 -->   Call Divert
                press 8 -->   Games
                press 9 -->   Calculator
                press 10 -->  Reminders
                press 11 -->  Clock
                press 12 -->  Profiles
                press 13 -->  SIM services
                
                
                """);

        int landerPage = scan.nextInt();

        switch (landerPage) {
            case 1 -> phoneBook();
            case 2 -> message();
            case 3 -> chat();
            case 4 -> calls();
            case 5 -> tone();
            case 6 -> phoneSetting();
            case 7 -> callDivert();
            case 8 -> games();
            case 9 -> calculatorr();
            case 10 -> System.out.println("Reminder");
            case 11 -> clock();
            case 12 -> userProfile();
            case 13 -> System.out.println("Sim Services");
            default -> menu();

        }

    }


    // Phone book section

    public static  void phoneBook() {
        Scanner scan = new Scanner(System.in);
        System.out.println("    PHONEBOOK");
        System.out.println("""
                        press 1 --> Search
                        press 2 --> Service Nos
                        press 3 --> Add Name
                        press 4 --> Erase
                        press 5 --> Edit
                        press 6 --> Assign tone
                        press 7 --> Send B' Card
                        press 8 --> Options
                        press 9 --> Speed Dials
                        press 10 --> Voice Tags
                        press 11 --> Exit
                        """);
        int phoneNumber = scan.nextInt();
        switch (phoneNumber) {
            case 1 -> System.out.println("Search");
            case 2 -> System.out.println("Service Nos");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign tone");
            case 7 -> System.out.println("Send B' Card");
            case 8 -> options();
            case 9 -> System.out.println("Speed Dials");
            case 10 -> System.out.println("Voice tags");
            case 11 -> menu();
            default -> phoneBook();
        }
    }

    public static  void  options() {
        System.out.println("       OPTIONS");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                                press 1 --> Type of view
                                press 2 --> Memory status
                                press 3 --> Go back to previous menu
                                press 4 --> Exit
                               
                                """);
        int option = scan.nextInt();
        switch (option) {
            case 1 -> System.out.println("type of view");
            case 2 -> System.out.println("Memory status");
            case 3 -> phoneBook();
            case 4 -> menu();
            default -> options();

        }

    }

    // message section

    public static void message() {
        System.out.println("         MESSAGE");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                press 1 --> Compose a message
                press 2 --> Inbox
                press 3 --> View saved messages
                press 4 --> Picture messages
                press 5 --> Templates
                press 6 --> Smileys
                press 7 --> Message settings
                press 8 --> Info service
                press 9 --> Voice mailbox number
                press 10 --> Service command editor
                press 11 --> Exit
                """);
        int message = scan.nextInt();

        switch (message) {
            case 1 -> System.out.println("compose a message");
            case 2 -> System.out.println("inbox");
            case 3 -> System.out.println("view saved messages");
            case 4 -> System.out.println("picture messaage");
            case 5 -> System.out.println("templates");
            case 6 -> System.out.println("smileys");
            case 7 -> messageSetting();
            case 8 -> System.out.println("info service");
            case 9 -> System.out.println("Voice mailbox number");
            case 10 -> System.out.println("Service command editor");
            case 11 -> menu();
            default -> message();


        }

    }

    public static void messageSetting() {
        System.out.println("MESSAGE SETTING");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                                press 1 --> Set
                                press 2 --> Common
                                press 3 --> Go back to previous menu
                                press 4 --> Exit
                                """);
        int set = scan.nextInt();
        switch (set) {
            case 1 -> set();
            case 2 -> common();
            case 3 -> message();
            case 4 -> menu();
            default -> messageSetting();

        }
    }

    public static void set() {
        System.out.println("         SET");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                                press 1 --> Message Centre Number
                                press 2 --> Message sent as
                                press 3 --> Message validity
                                press 4 --> Go back to the previous menu
                                press 5 --> Exit
                                """);
        int setCase = scan.nextInt();

        switch (setCase) {
            case 1 -> System.out.println("Message Centre Number");
            case 2 -> System.out.println("Message sent as");
            case 3 -> System.out.println("Message validity");
            case 4 -> messageSetting();
            case 5 -> menu();
            default -> set();
        }

    }

    public static void common() {
        System.out.println("         COMMON");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                                press 1 --> Delivery Report
                                press 2 --> Reply via same centre
                                press 3 --> Character support
                                press 4 --> Go back to the previous menu
                                press 5 --> Exit
                                """);
        int commonCase = scan.nextInt();

        switch (commonCase) {
            case 1 -> System.out.println("Delivery report");
            case 2 -> System.out.println("Reply via same centre");
            case 3 -> System.out.println("Character support");
            case 4 -> messageSetting();
            case 5 -> menu();
            default -> common();
        }
    }

    // Chat section
    public static void chat() {
        System.out.println("         CHAT");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                        press 1 --> Compose a message
                        press 2 --> Chat history
                        press 3 --> Chat name
                        press 4 --> Exit
                        """);
        int chat = scan.nextInt();
        switch (chat) {
            case 1 -> System.out.println("Compose a message");
            case 2 -> System.out.println("Chat history");
            case 3 -> System.out.println("Chat message");
            case 4 -> menu();
            default -> chat();
        }
    }

    // Call section
    public static void calls() {
        System.out.println("     CALL REGISTER");
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                        press 1 --> Missed calls
                        press 2 --> Received calls
                        press 3 --> Dialled numbers
                        press 4 --> Erased recent call lists
                        press 5 --> Show call duration
                        press 6 --> Show call costs
                        press 7 --> Call cost setting
                        press 8--> Prepaid credit
                        press 9 --> Exit
                        """);

        int call = scan.nextInt();

        switch (call) {
            case 1 -> System.out.println("""
                    0902222222
                    09023433333
                    09032123446
                    09034566738
                    0803656667
                    0702222222
                    0812354678
                    08563828334
                    """);

            case 2 -> System.out.println("""
                    0803656667
                    0702222222
                    0812354678
                    08563828334
                    0902222222
                    09023433333
                    09032123446
                    09034566738
                    """);
            case 3 -> System.out.println("""
                    0902222222
                    09023433333
                    09032123446
                    09034566738
                    """);
            case 4 -> erase();
            case 5 -> showCall();
            case 6 -> callCost();

            case 7  -> costSet();
            case 8 -> System.out.println("prepaid credit");
            case 9 -> menu();
            default -> calls();

        }
        }

        public static void erase() {
            System.out.println("  ERASE");
        Scanner scan = new Scanner(System.in);
        boolean yes = true;

        do {
            System.out.println("""
                    0812354678
                    08563828334
                    0902222222
                    09023433333
                    """);

            System.out.println("Do you want to erase the recent call list(yes or no)");
            String eraseNumbers = scan.nextLine();

            if (eraseNumbers.equals("Yes") ||eraseNumbers.equals("YES") || eraseNumbers.equals("yes") ) {
                System.out.println("deleted");

                System.out.println();
                calls();
            }

            if (eraseNumbers.equals("No") ||eraseNumbers.equals("NO") || eraseNumbers.equals("no")) {
                yes = false;
                calls();

            }

        }
        while (yes);



        }

    public static void showCall() {
        System.out.println("       CALL DURATION");
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                        press 1 --> Last call duration
                        press 2 --> All calls' duration
                        press 3 --> Received calls' duration
                        press 4 --> Dialled calls' duration
                        press 5 --> Clear timer
                        press 6 --> Go back to previous menu
                        press 7 --> Exit
                        """);

        int callList = scan.nextInt();

        switch (callList) {
            case 1 : System.out.println("""
                    00:03:00
                    """);
            break;
            case 2 : System.out.println(
                    """
                            00:45:10
                            00:05:10
                            00:25:10
                            00:15:10
                            00:45:10
                                   """
            );
            break;
            case 3 : System.out.println("""
                     00:45:10
                     00:05:10
                     00:25:10
                     00:15:10
                     00:45:10
                     00:45:10
                     00:05:10
                     00:25:10
                     00:15:10
                     00:45:10
                    """);
            break;
            case 4 : System.out.println("""
                     00:45:10
                     00:05:10
                     00:25:10
                     00:15:10
                     00:45:10
                     00:45:10
                     00:05:10
                     00:25:10
                     00:15:10
                     00:45:10
                     00:05:10
                     00:25:10
                     00:15:10
                    """);
            break;
            case 5 : timer();break;
            case 6 : calls(); break;
            case 7 : menu(); break;
            default : showCall(); break;
        }

    }

   public static void timer() {

       Scanner scan = new Scanner(System.in);
       boolean yes = true;

       do {

           System.out.println("Do you want to clear timer?(yes or no) ");
           String eraseNumbers = scan.nextLine();

           if (eraseNumbers.equals("Yes") ||eraseNumbers.equals("YES") || eraseNumbers.equals("yes") ) {
               System.out.println("deleted");

               System.out.println();
               calls();
           }

           if (eraseNumbers.equals("No") ||eraseNumbers.equals("NO") || eraseNumbers.equals("no")) {
               yes = false;
               calls();

           }

       }
       while (yes);

   }

   public static void callCost(){
       Scanner scan = new Scanner(System.in);

       System.out.println("""
                        press 1 --> Last call cost
                        press 2 --> All calls' cost
                        press 3 --> clear counters
                        press 4 --> Go back to previous menu
                        press 5 --> Exit
                        
                        """


       );



       int callCost = scan.nextInt();

       switch (callCost) {
           case 1 -> System.out.println("Last call costed 100 naira");
           case 2 -> System.out.println("All calls costed 1000 naira");
           case 3 -> System.out.println("counters cleared");
           case 4 -> calls();
           case 5 -> menu();
           default -> callCost();

       }
   }

public static void costSet() {
    Scanner scan = new Scanner(System.in);

    System.out.println("""
                    press 1 --> Call cost limit
                    press 2 --> show costs in
                    press 4 --> Go back to previous menu
                    press 5 --> Exit
                    """);
    int limit = scan.nextInt();

    switch (limit) {
        case 1 -> System.out.println("Call cost limit is 1hr");
        case 2 -> System.out.println("Cost in");
        case 3 -> calls();
        case 4 -> menu();
        default -> costSet();
    }
}

//  Tones section

    public static void  tone(){
        System.out.println("         TONE");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                    press 1 --> Ringing tone
                    press 2 --> Ringing volume
                    press 3 --> Incoming call alert
                    press 4 --> Composer
                    press 5 --> Message alert tone
                    press 6 --> Keypad tones
                    press 7 --> Warning and games tones
                    press 8 --> Vibrating alert
                    press 9 --> Screen saver
                    press 10 --> Exit
                    """);
        int number = scan.nextInt();
    switch (number) {
        case 1 -> ringingTone();
        case 2 -> System.out.println("Ringing volume");
        case 3 -> ringingTone();
        case 4 -> System.out.println("Composer");
        case 5 -> ringingTone();
        case 6 -> System.out.println("Keypad tones");
        case 7 -> ringingTone();
        case 8 -> System.out.println("Vibrating alert");
        case 9 -> System.out.println("Screen saver");
        case 10 -> menu();
        default -> tone();
    }

    }

public static void ringingTone() {
    System.out.println("   RINGING TONE");
    Scanner scan = new Scanner(System.in);
    System.out.println("""
                    press 1 --> piano
                    press 2 --> bell
                    press 3 --> rainfall
                    press 4 --> guitar
                    press 5 --> love
                    press 6 --> Exit
                    """);
    int number = scan.nextInt();

    switch (number){
        case 1 -> piano();
        case 2 -> bell();
        case 3 -> rainFall();
        case 4 -> guitar();
        case 5 -> love();
        case 6 -> menu();
        default -> ringingTone();

    }


}


public static void piano() {
    boolean ton = true;
    Scanner scan = new Scanner(System.in);
        do {
            System.out.println("piano playing");

            System.out.println("Do you want to set as tone(yes or no)");
            String output = scan.nextLine();

            if (output.equals("Yes") ||output.equals("YES") || output.equals("yes") ) {
                System.out.println("ringing tone set");

                System.out.println();
                ringingTone();
            }

            if (output.equals("No") ||output.equals("NO") || output.equals("no")) {
                ton = false;
                ringingTone();

            }
        }
        while (ton);
}

    public static void bell() {
        boolean ton = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("bell playing");

            System.out.println("Do you want to set as tone(yes or no)");
            String output = scan.nextLine();

            if (output.equals("Yes") ||output.equals("YES") || output.equals("yes") ) {
                System.out.println("ringing tone set");

                System.out.println();
                ringingTone();
            }

            if (output.equals("No") ||output.equals("NO") || output.equals("no")) {
                ton = false;
                ringingTone();

            }
        }
        while (ton);
    }


    public static void rainFall() {
        boolean ton = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("rainfall playing");

            System.out.println("Do you want to set as tone(yes or no)");
            String output = scan.nextLine();

            if (output.equals("Yes") ||output.equals("YES") || output.equals("yes") ) {
                System.out.println("ringing tone set");

                System.out.println();
                ringingTone();
            }

            if (output.equals("No") ||output.equals("NO") || output.equals("no")) {
                ton = false;
                ringingTone();

            }
        }
        while (ton);
    }

    public static void guitar() {
        boolean ton = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("guitar playing");

            System.out.println("Do you want to set as tone(yes or no)");
            String output = scan.nextLine();

            if (output.equals("Yes") ||output.equals("YES") || output.equals("yes") ) {
                System.out.println("ringing tone set");

                System.out.println();
                ringingTone();
            }

            if (output.equals("No") ||output.equals("NO") || output.equals("no")) {
                ton = false;
                ringingTone();

            }
        }
        while (ton);
    }

    public static void love() {
        boolean ton = true;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("love playing");

            System.out.println("Do you want to set as tone(yes or no)");
            String output = scan.nextLine();

            if (output.equals("Yes") ||output.equals("YES") || output.equals("yes") ) {
                System.out.println("ringing tone set");

                System.out.println();
                ringingTone();
            }

            if (output.equals("No") ||output.equals("NO") || output.equals("no")) {
                ton = false;
                ringingTone();

            }
        }
        while (ton);
    }


//    PHONE SETTING

    public static void phoneSetting() {

        System.out.println("         SETTINGS");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                press 1 --> Call settings
                press 2 --> Phone settings
                press 3 --> Security settings
                press 4 --> Restore factory settings
                press 5 --> Exit
                """);
        int message = scan.nextInt();

        switch (message) {
            case 1 -> callSetting();
            case 2 -> phoneSet();
            case 3 -> securitySetting();
            case 4 -> restoreFactory();
            case 5 -> menu();
            default -> phoneSetting();

        }


    }

    public static void callSetting(){
        System.out.println("    CALL SETTINGS");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                press 1 --> Automatic redial
                press 2 --> Speed dialling
                press 3 --> Call waiting options
                press 4 --> Own number sending
                press 5 --> Phone line in use
                press 6 --> Automatic answer
                press 7 --> Go back to previous menu
                press 8 --> Exit
                    
                    
                    """);
        int redial = scan.nextInt();
        switch (redial) {

            case 1 -> System.out.println("Automatic redial");
            case 2 -> System.out.println("Speed dialing");
            case 3 -> System.out.println("call waiting options");
            case 4 -> System.out.println("Own number sending");
            case 5-> System.out.println("Phone line in use");
            case 6 -> System.out.println("Automatic answer");
            case 7 -> phoneSetting();
            case 8 -> menu();
            default -> callSetting();
        }

    }

public static void phoneSet(){
    System.out.println("      PHONE SETTINGS ");
    Scanner scan = new Scanner(System.in);
    System.out.println("""
                press 1 --> Language
                press 2 --> Cell info display
                press 3 --> Welcome note
                press 4 --> Network selection
                press 5 --> Lights
                press 6 --> Confirm SIM service actions
                press 7 --> Go back to previous menu
                press 8 --> Exit
                    
                    
                    """);
    int phone = scan.nextInt();
         switch (phone) {
             case 1:
                 System.out.println("""
                         Which Language do you prefer
                         press 1 --> English
                         press 2 --> Hausa
                         press 3 --> Igbo
                         press 4 --> Yoruba
                         press 5 --> Efik
                         press 6 --> Pidgin
                         press 7 --> Go back to previous menu
                         press 8 --> Exit
                         
                         """);
             int chose = scan.nextInt();
             switch (chose) {
                 case 1 -> System.out.println("English set");
                 case 2 -> System.out.println("Hausa set");
                 case 3 -> System.out.println("Igbo set");
                 case 4 -> System.out.println("Yoruba set");
                 case 5 -> System.out.println("Efik set");
                 case 6 -> System.out.println("Pidgin set");
                 case 7 -> phoneSet();
                 case 8 -> menu();
                 default -> phoneSet();


             }
             break;
             case 2 :
                 System.out.println("Cell info display");
             break;

             case 3:
                 System.out.println("Welcome note");
             break;

             case 4:
                 System.out.println("Network Selection");
             break;

             case 5:
                 System.out.println("Lights");
             break;

             case 6:
                 System.out.println("Confirm sim service action");
             break;

             case 7: phoneSet();
             break;

             case 8: menu();
             break;

             default: phoneSet();

         }


}

public static void securitySetting() {

    System.out.println("      SECURITY SETTINGS ");
    Scanner scan = new Scanner(System.in);
    System.out.println("""
                press 1 --> PIN code request
                press 2 --> Call barring service
                press 3 --> Fixed dialling
                press 4 --> Closed user group
                press 5 --> Phone security
                press 6 --> Change access codes
                press 7 --> Go back to previous menu
                press 8 --> Exit
                    
                    
                    """);
    int security = scan.nextInt();

    switch (security){
        case 1 :
            System.out.println("PIN code request");
            break;

        case 2 :
            System.out.println("Call barring service");
            break;

        case 3:
            System.out.println(" Fixed dialling");
            break;

        case 4:
            System.out.println("Closed user group");
            break;

        case 5:
            System.out.println("Phone security");
            break;

        case 6:
            System.out.println("Change access codes");
            break;

        case 7: phoneSet();
            break;

        case 8: menu();
            break;

        default: securitySetting();
    }


}

public static void restoreFactory() {

    System.out.println("RESTORE FACTORY SETTINGS ");
    Scanner scan = new Scanner(System.in);
    boolean restore = true;

    do {
        System.out.println("Do you want to restore factory setting(yes or no)");
        String userChoice = scan.nextLine();
        if (userChoice.equals("Yes") || userChoice.equals("YES") || userChoice.equals("yes")) {
            System.out.println("Factory settings restored");

            System.out.println();
            phoneSetting();
        }

        if (userChoice.equals("No") || userChoice.equals("NO") || userChoice.equals("no")) {
            restore = false;
            phoneSetting();

        }
    }
        while (restore) ;



}


// CALL DIVERT

    public static void  callDivert(){

        System.out.println("   CALL DIVERT");
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                press 1 --> Set Standby mode
                press 2 --> Divert when busy
                press 3 --> Exit
                """);
        int divert = scan.nextInt();

        switch (divert) {
            case 1 -> System.out.println("Diverted SuccessfulLy");
            case 2 -> System.out.println("Diverted SuccessfulLy");
            case 3 -> menu();
            default -> callDivert();
        }

    }

    public static void games() {
        System.out.println("  GAMES");
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                press 1 -> Guessing Number game
                press 2 -> Exit
                """);
        int guess = scan.nextInt();

        switch (guess) {
            case 1 -> guessingGame();
            case 2 -> menu();
            default -> games();
        }
    }

    public static void guessingGame() {
        System.out.println("  GUESSING GAME");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to guess the number game");

        System.out.println("Enter a Number: ");
        int userNumber = scan.nextInt();

        int randomNumber = (int)(System.currentTimeMillis() / 2 % 10);

      while (userNumber != randomNumber) {
          System.out.println("Try Again!!!");
          System.out.println();

          System.out.println("Enter a Number: ");
           userNumber = scan.nextInt();
      }
      if (userNumber == randomNumber) {
          System.out.println("you won!!!");
          System.out.println();
          games();
      }

    }

    public static void calculatorr() {
        System.out.println("  CALCULATOR");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                press 1 --> Division
                press 2 --> Multiplication
                press 3 --> Addition
                press 4 --> Subtraction
                press 5 --> Raise To Power
                press 6 --> Square root
                press 7 --> Exit
                """);

        int calculate = scan.nextInt();
        switch (calculate) {
            case 1 -> division();
            case 2 -> multiplication();
            case 3 -> addition();
            case 4 -> subtraction();
            case 5 -> raisePower();
            case 6 -> squareRoot();
            case 7 -> menu();
            default ->
                    calculatorr();
        }
    }

    public static void division() {
        System.out.println("  DIVISION");
        Scanner scan = new Scanner(System.in);

        System.out.println("note: if you want to calculate two numbers\ndivide the two numbers with 1");

        System.out.println();

        System.out.println("Enter a number: ");
        double number = scan.nextDouble();

        System.out.println("Enter a number ");
        double numberTwo = scan.nextDouble();

        double result = number / numberTwo;

        int count = 0;

        do {
            System.out.println("Enter a number(press 0 to end): ");
            double numberThree = scan.nextDouble();
            if (numberThree == 0){break;}
            result = result / numberThree;
            System.out.println("The answer is " + result);
            count++;
        }
        while (result != 0);

        scan.nextLine();
        System.out.println();
        System.out.println("do you want to continue(yes or no) ");
        String user = scan.nextLine();

        if (user.equals("yes") || user.equals("YES") || user.equals("Yes")){
            System.out.println();
            division();
        }
        else if (user.equals("no") || user.equals("NO") || user.equals("No")) {
            System.out.println();
            calculatorr();
        }

    }

    public static void multiplication() {
        System.out.println("  MULTIPLICATION");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number(press -0 to quit) ");
        int number = scan.nextInt();

        int result = 1;
        int count = 0;
        while (number != -0){
            count++;

            result *= number;

            System.out.println("Enter a number(press -0 to quit) ");
            number = scan.nextInt();


        }

        System.out.println("The answer is " + result);
        scan.nextLine();
        System.out.println();
        System.out.println("do you want to continue(yes or no) ");
        String user = scan.nextLine();

        if (user.equals("yes") || user.equals("YES") || user.equals("Yes")){
            System.out.println();
            multiplication();
        }
        else if (user.equals("no") || user.equals("NO") || user.equals("No")) {
            System.out.println();
            calculatorr();
        }

    }


    public static void addition() {
        System.out.println("  ADDITION");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number(press -0 to quit) ");
        int number = scan.nextInt();

        int result = 0;
        int count = 0;
        while (number != -0){
            count++;

            result += number;

            System.out.println("Enter a number(press -0 to quit) ");
            number = scan.nextInt();


        }

        System.out.println("The answer is " +  result);
        scan.nextLine();
        System.out.println();
        System.out.println("do you want to continue(yes or no) ");
        String user = scan.nextLine();

        if (user.equals("yes") || user.equals("YES") || user.equals("Yes")){
            System.out.println();
            addition();
        }
        else if (user.equals("no") || user.equals("NO") || user.equals("No")) {
            System.out.println();
            calculatorr();
        }


    }

    public static void subtraction() {
        System.out.println("  SUBTRACTION");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        System.out.println("Enter a number: ");
        int numberTwo = scan.nextInt();

        int result = number - numberTwo;

        System.out.println("The answer is " +  result);

        int count = 0;

        do { System.out.println("Enter a number(press 0 to quit) ");
            number = scan.nextInt();
            result = result - number ;
            System.out.println("The answer is " +  result);
            count++;
        }
        while (number != 0);

        scan.nextLine();
        System.out.println();
        System.out.println("do you want to continue(yes or no) ");
        String user = scan.nextLine();

        if (user.equals("yes") || user.equals("YES") || user.equals("Yes")) {
            System.out.println();
            subtraction();
        } else if (user.equals("no") || user.equals("NO") || user.equals("No")) {
            System.out.println();
            calculatorr();
        }

    }

    public static void raisePower() {
        System.out.println("    RAISE TO POWER");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number (i.e base) ");
        int firstNumber = scan.nextInt();


        System.out.println("Enter second number (i.e exponent) ");
        int secondNumber = scan.nextInt();

        int total = 1;
        int count = 1;
        while (count <= secondNumber) {
            count++;

            total *= firstNumber;


        }

        System.out.println("The answer is " + total);
        scan.nextLine();
        System.out.println();
        System.out.println("do you want to continue(yes or no) ");
        String user = scan.nextLine();

        if (user.equals("yes") || user.equals("YES") || user.equals("Yes")) {
            System.out.println();
            raisePower();
        } else if (user.equals("no") || user.equals("NO") || user.equals("No")) {
            System.out.println();
            calculatorr();
        }

    }

    public static void squareRoot() {
        System.out.println("SQUARE ROOT");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number:  ");
        double number = scan.nextInt();

        double result = Math.sqrt(number);


        System.out.println("The answer is " + result);
        scan.nextLine();
        System.out.println();
        System.out.println("do you want to continue(yes or no) ");
        String user = scan.nextLine();

        if (user.equals("yes") || user.equals("YES") || user.equals("Yes")) {
            System.out.println();
            squareRoot();
        } else if (user.equals("no") || user.equals("NO") || user.equals("No")) {
            System.out.println();
            calculatorr();
        }

    }


// User Profile

    public static void userProfile() {
        System.out.println("USER PROFILE");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                press 1 --> General
                press 2 --> Silent
                press 3 --> Meeting
                press 4 --> Outdoor
                press 5 --> Indoor
                press 6 --> Headset
                press 7 --> Exit
                """);
        int number = scan.nextInt();

        switch (number) {
            case 1 -> general();
            case 2 -> silent();
            case 3 -> meeting();
            case 4 -> outdoor();
            case 5 -> indoor();
            case 6 -> headset();
            case 7 -> menu();
            default -> userProfile();
        }

    }

    public static void general(){
        System.out.println("   GENERAL");
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to activate general(yes or no)");
        System.out.println();
        String user = scan.nextLine();

        if(user.equals("yes") || user.equals("Yes") || user.equals("YES")) {
            System.out.println();
            System.out.println("General Activated");
            System.out.println();
            userProfile();
        }

       else if(user.equals("no") || user.equals("No") || user.equals("NO")) {
            System.out.println();
            userProfile();
        }

    }


    public static void silent(){
        System.out.println("   SILENT");
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to activate silent(yes or no)");
        System.out.println();
        String user = scan.nextLine();

        if(user.equals("yes") || user.equals("Yes") || user.equals("YES")) {
            System.out.println();
            System.out.println("Silent Activated");
            System.out.println();
            userProfile();
        }

        else if(user.equals("no") || user.equals("No") || user.equals("NO")) {
            System.out.println();
            userProfile();
        }

    }

    public static void meeting(){
        System.out.println("   MEETING");
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to activate meeting(yes or no)");
        System.out.println();
        String user = scan.nextLine();

        if(user.equals("yes") || user.equals("Yes") || user.equals("YES")) {
            System.out.println();
            System.out.println("Meeting Activated");
            System.out.println();
            userProfile();
        }

        else if(user.equals("no") || user.equals("No") || user.equals("NO")) {
            System.out.println();
            userProfile();
        }

    }

    public static void outdoor(){
        System.out.println("   OUTDOOR");
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to activate outdoor(yes or no)");
        System.out.println();
        String user = scan.nextLine();

        if(user.equals("yes") || user.equals("Yes") || user.equals("YES")) {
            System.out.println();
            System.out.println("Outdoor Activated");
            System.out.println();
            userProfile();
        }

        else if(user.equals("no") || user.equals("No") || user.equals("NO")) {
            System.out.println();
            userProfile();
        }

    }

    public static void indoor(){
        System.out.println("   INDOOR");
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to activate indoor(yes or no)");
        System.out.println();
        String user = scan.nextLine();

        if(user.equals("yes") || user.equals("Yes") || user.equals("YES")) {
            System.out.println();
            System.out.println("Indoor Activated");
            System.out.println();
            userProfile();
        }

        else if(user.equals("no") || user.equals("No") || user.equals("NO")) {
            System.out.println();
            userProfile();
        }

    }

    public static void headset(){
        System.out.println("   HEADSET");
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to activate headset(yes or no)");
        System.out.println();
        String user = scan.nextLine();

        if(user.equals("yes") || user.equals("Yes") || user.equals("YES")) {
            System.out.println();
            System.out.println("Headset Activated");
            System.out.println();
            userProfile();
        }

        else if(user.equals("no") || user.equals("No") || user.equals("NO")) {
            System.out.println();
            userProfile();
        }

    }

    public static void clock(){

        System.out.println("    CLOCK");
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                press 1 --> Alarm clock
                press 2 --> Clock settings
                press 3 --> Date setting
                press 4 --> Stopwatch
                press 5 --> Countdown timer
                press 6 --> Auto update of date and time
                press 7 --> Exit
                """);

        int number = scan.nextInt();

        switch (number) {
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("Clock setting");
            case 3 -> System.out.println("Date setting");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown timer");
            case 6 -> System.out.println("Auto update of date and time");
            case 7 -> menu();
            default -> clock();
        }

    }



    }
