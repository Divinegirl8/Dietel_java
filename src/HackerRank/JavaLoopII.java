package HackerRank;
import java.util.*;
import java.io.*;

public class JavaLoopII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();


        for(int i=0;i<t;i++){
            int total = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int z =0; z < n; z++){
            int result = (int) (a + Math.pow(2,z) * b);
            total += result;
            System.out.println(total);

        }}
        in.close();
    }
}
