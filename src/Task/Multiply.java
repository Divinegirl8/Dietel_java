package Task;

public class Multiply {
    public static void main(String[] args) {
        for (int count = 1; count <= 12; count++) {
            for (int row = 1; row <= 20; row++) {
                System.out.print(row + "*" + count + "=" + row * count );
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
