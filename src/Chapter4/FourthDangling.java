package Chapter4;

public class FourthDangling {
    public static void main(String[] args) {
// a

        int y = 8;
        int x = 5;

        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

        System.out.println();

// b
         y = 8;
         x = 5;

        if (y == 8) {
            if (x == 5){
                System.out.println("@@@@@");}}
            else{
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&"); }

        System.out.println();
//c

         y = 8;
         x = 5;

        if (y == 8) {
            if (x == 5){
                System.out.println("@@@@@");}}
        else{
            System.out.println("#####");
            System.out.println("$$$$$");}
            System.out.println("&&&&&");

        System.out.println();



// d

         y = 7;
         x = 5;

        if (y == 8) {
            if (x == 5){
                System.out.println("@@@@@");}}
        else{
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&"); }


   }




}
