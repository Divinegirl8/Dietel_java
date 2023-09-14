package SnackTwo;

// still working on it

public class Table {
    public static void main(String[] args) {

        for (int count = 1; count <= 5; count++){
            int secondColumn = count + 1;

            int result = secondColumn * count * 2;

//             int result = (int)Math.pow(count,secondColumn);


                System.out.println(count + "\t" + secondColumn + "\t" + result);



        }
    }

}
