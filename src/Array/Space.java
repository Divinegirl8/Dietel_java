package Array;

public class Space {
    public static void main(String[] args) {
        int[][] items = {{34,23,65},{23,67,44,68}};

        for (int[] iterate: items){
            for (int item : iterate){
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
