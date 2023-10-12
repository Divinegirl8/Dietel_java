package Jonathan;

public class GetColumn {
public static int[] getColumn(int[][] dataset, int column, int start, int stop){
int[] new_list = new int[(stop-start) + 1];
int new_value = column - 1;
int count = 0;
    for (int startposition = start - 1; startposition < stop; startposition++) {
        new_list[count] = dataset[startposition][new_value];
        count++;
    }
    return new_list;
}
}
