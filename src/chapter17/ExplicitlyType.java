package chapter17;

import java.util.stream.IntStream;

public class ExplicitlyType {
//    public static int product(int parameter1, int parameter2){
//
//
//    }
public static void main(String[] args) {
    IntStream.range(1, 10).forEach(System.out::print);
    System.out.println();
    IntStream.rangeClosed(1,10).forEach(System.out::print);
    System.out.println();
    System.out.println(IntStream.rangeClosed(1, 10).sum());
    System.out.println(IntStream.rangeClosed(1, 10).max().getAsInt());
    System.out.println(IntStream.range(1, 11).min().getAsInt());
    System.out.println(IntStream.rangeClosed(1, 10).map((int x) -> x * 2).sum());

}

}
