package Chapter5;

public class SumSeries {
    public static void sumSeries(int integer) {

        int count = 0;
        long result = 0;

        while (count < integer){
            result += count;
            count += 1;

            System.out.println(count + "\t" + result);

        }

//        if you use product to solve there will be an incorrect result at some point

    }

    public static void main(String[] args) {
        sumSeries(100);
    }
}
