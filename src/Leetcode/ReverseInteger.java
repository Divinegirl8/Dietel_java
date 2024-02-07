package Leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        String newValue = String.valueOf(x);
        StringBuilder convert = new StringBuilder();
        int output = 0;

        if (x < 0) {
            output = 1;
        }
        if (x >= 0) {
            output = 0;
        }

        for (int index = output; index < newValue.length(); index++) {
            convert.append(newValue.charAt(index));
        }

        long result;
        if (newValue.startsWith("-")) {
            result = -Long.parseLong(String.valueOf(convert.reverse()));
        } else {
            result = Long.parseLong(String.valueOf(convert.reverse()));
        }


        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(123));
    }
}
