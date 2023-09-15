package Chapter4;

public class Mystery3 {
    public static void main(String[] args) {
        int row = 5;
        while (row >= 1) {
            int column = 5;
            while (column >= 1) {
                System.out.print(row % 2 == 0 ? "X" : "O");
                ++column;
            } // end while
            --row;
            System.out.println();
        }
    }
}

// The above code will keep iterating because of the condition set in the nested while, the value assigned in column will always be greater than 1 and the prefix increment set in
// the column i.e ++column will keep increasing the value