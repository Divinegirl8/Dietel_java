package diaryApp;

import java.math.BigDecimal;
import java.util.Scanner;

public class DiaryMainApp {
    static Diary myDiary;
    static Diaries myDairies = new Diaries();

    private static <E> E input(Class<E> type) {
        Scanner scanner = new Scanner(System.in);
        E object = null;

        if (type.equals(Integer.class)) {
            object = type.cast(scanner.nextInt());
        } else if (type.equals(String.class)) {
            object = type.cast(scanner.nextLine());
        } else if (type.equals(Double.class)) {
            object = type.cast(scanner.nextDouble());
        } else if (type.equals(Long.class)) {
            object = type.cast(scanner.nextLong());
        } else if (type.equals(BigDecimal.class)) {
            object = type.cast(scanner.nextBigDecimal());
        }

        return object;
    }


    public static void mainMenu() throws InterruptedException {

        System.out.println("""
                ============================
                         MY DIARY
                =============================
                press 1 -> Create Diary
                press 2 -> Add Entry
                press 3 -> Find Entry
                press 4 -> Update Entry
                press 5 -> Delete Entry
                press 6 -> Exit

                """);
        String userInput = input(String.class);

        switch (userInput) {
            case "1" -> createDiary();
            case "2" -> addEntry();
            case "3" -> findEntry();
            case "4" -> diaryUpdate();
            case "5" -> entryDelete();
            case "6" -> System.exit(0);
            default -> {
                System.out.println("Error!!!\nChoose between 1 - 6");
                mainMenu();
            }
        }
    }

    private static void lockDiary() throws InterruptedException {

        try {
            myDiary.lockDiary();
            System.out.println("Diary locked");
            System.out.println();
            mainMenu();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            mainMenu();
        }
    }






    private static void entryDelete() throws InterruptedException {
        Diary diary = unlockDiary();
     int entry_id = Integer.parseInt(validateId());

        System.out.println("Are you sure you want to delete entry??");
        String response = input(String.class);

        while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no'");
            response = input(String.class);
        }

        if (response.equalsIgnoreCase("yes")) {
            try {
                assert diary != null;
                diary.deleteEntry(entry_id);
                System.out.println("Entry deleted successfully.");
                mainMenu();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                mainMenu();
            }
        } else {
            System.out.println("Entry not deleted.");
            mainMenu();
        }
    }
    private static String validateId(){
        System.out.println("Enter entry id: ");
        String id = input(String.class);

        while (!id.matches("\\d+")) {
            System.out.println("id must consist of digits only\ntry again: ");
            id = input(String.class);
        }
        return id;
    }


    private static void diaryUpdate() throws InterruptedException {
        System.out.println("Please enter username and password to update entry ");
        Diary diary = unlockDiary();

        int convert_id = Integer.parseInt(validateId());
        String title = promptUserForTitle();
        System.out.println("Add more spice to your secret: ");
        String body = input(String.class);

        try {
            assert diary != null;
            diary.updateEntry(convert_id, title, body);
            System.out.println("Diary has been updated");
            mainMenu();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println();
            mainMenu();
        }

    }



    private static void findEntry() throws InterruptedException {
        System.out.println("Please enter username and password to find entry ");
        Diary diary = unlockDiary();


        int convert_id = Integer.parseInt(validateId());

        try {
            assert diary != null;
            Entry entry = diary.findEntryId(convert_id);
            System.out.println(entry);
            mainMenu();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            mainMenu();
        }

    }

    private static String getUsername(){
        System.out.println("Enter Username: ");
        return input(String.class);
    }
    private static String getPassword(){
        System.out.println("Enter Password: ");
        return input(String.class);
    }

    private static Diary findUserName(String userName){
       return myDairies.findDiaryByUserName(userName);
    }

    private static String promptUserForTitle(){
        System.out.println("Title: ");
        return input(String.class);
    }

    private static String promptUserForSecretMessage(){
        System.out.println("Tell your secret: ");
        return input(String.class);
    }

    private static Diary unlockDiary() throws InterruptedException {
        String userName = getUsername();
        String password = getPassword();

        try {
            Diary diary = findUserName(userName);
            diary.unlockDiary(password);
            confirmingValidation();
            return diary;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            mainMenu();
            return null;
        }
    }



    private static void addEntry() throws InterruptedException {
        System.out.println("Please enter username and password to create entry ");
           Diary diary = unlockDiary();

        String title = promptUserForTitle();
        String body = promptUserForSecretMessage();


        try {
            assert diary != null;
            Entry entry = diary.createEntry(title, body);
            confirmingValidation();
            System.out.printf("Entry created successfully\nYour entry id is %d%n", entry.getId());
            System.out.println();
            mainMenu();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            mainMenu();
        }
    }


    private static void createDiary()  {
        System.out.println("Enter Username: ");
        String userName = input(String.class);


        if (!userName.matches(".*[a-z].*\\d.*") || userName.length() < 5 || userName.matches("^[0-9].*")) {
            System.out.println("Username must consist of letters and digits,\nnumbers of characters must be grater than 4\nusername cannot start with a number\nusername should be all lower case");
            createDiary();
        }

        System.out.println("Enter Password: ");
        String password = input(String.class);

        while (password.length() < 5) {
            System.out.println("Password is weak, the length of password should be greater than 6\nEnter again");
            password = input(String.class);
        }


        try {
            myDairies.add(userName, password);
            creating();
            System.out.println("Diary created successfully!!!");
            System.out.println();

            mainMenu();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            createDiary();
        }
    }

    private static void creating() throws InterruptedException {

        String symbol = " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";

        System.out.print("Creating please hold on ");

        for (int index = 0; index < symbol.length(); index++) {
            System.out.print(symbol.charAt(index));
            java.lang.Thread.sleep(100);
        }
        System.out.println();
    }

    private static void confirmingValidation() throws InterruptedException {

        String symbol = "..............................";

        System.out.print("loading");

        for (int index = 0; index < symbol.length(); index++) {
            System.out.print(symbol.charAt(index));
            java.lang.Thread.sleep(100);
        }
        System.out.println();
        System.out.println("validation completed");
    }

    public static void main(String[] args) throws InterruptedException {
        mainMenu();
    }

}
