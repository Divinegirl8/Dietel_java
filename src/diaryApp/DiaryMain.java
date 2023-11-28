package diaryApp;

import java.math.BigDecimal;
import java.util.*;

public class DiaryMain {
    static Diary myDiary;
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
        } else if (type.equals(BigDecimal.class)){
            object = type.cast(scanner.nextBigDecimal());
        }

        return object;
    }

    public static void mainMenu(){
        System.out.println("""
                ============================
                         MY DIARY
                =============================
                press 1 -> Create Diary
                press 2 -> Unlock Diary
                press 3 -> Exit

                """);
        String userInput = input(String.class);

        switch (userInput){
            case "1" -> createDiary();
            case "2" -> unlockDiary();
            case "3" -> System.exit(0);
            default -> mainMenu();
        }
    }

    private static void lockDiary() {
        if (myDiary == null) {
            System.out.println("Diary not created. Please create a diary first.");
            mainMenu();
        }
        try {
        myDiary.lockDiary();
            System.out.println("Diary locked");
            System.out.println();
        mainMenu();}
        catch (Exception exception){
            System.out.println(exception.getMessage());
            mainMenu();
        }
    }

    private static void unlockDiary() {
        if (myDiary == null) {
            System.out.println("Diary not created. Please create a diary first.");
            mainMenu();
        }

        System.out.println("Enter Password");
        String password = input(String.class);
        try {
        myDiary.unlockDiary(password);
            entryOptions();

        } catch (Exception exception){
            System.out.println(exception.getMessage());
            unlockDiary();
        }

    }

    private  static void entryOptions(){
        System.out.println("""
                press 1 -> Add Entry
                press 2 -> Find Entry By Id
                press 3 -> Update Entry
                press 4 -> Delete Entry
                press 5 -> Lock Diary
                """);
        String userEntry = input(String.class);

        switch (userEntry) {
            case "1" -> addEntry();
            case "2" -> findEntry();
            case "3" -> diaryUpdate();
            case "4" -> entryDelete();
            case "5" -> lockDiary();
            default -> {
                System.out.println("error!!!\nenter number from 1 -5");entryOptions();
            }
        }
    }

    private static void entryDelete() {
        System.out.println("Enter entry id");
        int entry_id = input(Integer.class);

        System.out.println("Are you sure you want to delete entry??");
        String response = input(String.class);

        while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")){
            System.out.println("Invalid input. Please enter 'yes' or 'no'");
            response = input(String.class);
        }

        if (response.equalsIgnoreCase("yes")) {
            try {
                myDiary.deleteEntry(entry_id);
                System.out.println("Entry deleted successfully.");
                entryOptions();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        } else {
            System.out.println("Entry not deleted.");
            entryOptions();
        }
    }


    private static void diaryUpdate() {

        System.out.println("Enter entry id: ");
        int id = input(Integer.class);

        System.out.println("write a title: ");
        String title = input(String.class);

        System.out.println("Compose your message: ");
        String body = input(String.class);

         try {
        myDiary.updateEntry(id,title,body);
             System.out.println("Diary has been updated");
        entryOptions();}
         catch (Exception exception){
             System.out.println(exception.getMessage());
             System.out.println();
             entryOptions();
         }

    }

    private static void findEntry() {
        System.out.println("Enter entry id: ");
        int id = input(Integer.class);
        try {
        Entry entry = myDiary.findEntryId(id);
        System.out.println(entry);
        entryOptions();}
        catch (Exception exception){
            System.out.println(exception.getMessage());
            entryOptions();
        }

    }


    private static void addEntry() {
        System.out.println("write a title: ");
        String title = input(String.class);

        System.out.println("Compose your message: ");
        String body = input(String.class);

      Entry entry= myDiary.createEntry(title,body);
        System.out.printf("Entry created successfully\n Your entry id is %d%n",entry.getId());
        System.out.println();



        entryOptions();
    }


    private static void createDiary() {
        System.out.println("Enter Username: ");
        String userName = input(String.class);

        System.out.println("Enter Password: ");
        String password = input(String.class);

        myDiary = new Diary(userName,password);
        System.out.println("Diary created successfully!!!");
        mainMenu();
    }



    public static void main(String[] args) {
        mainMenu();
    }


}
