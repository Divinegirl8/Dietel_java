package leetcode;

public class StringToInteger {
//    public int myAtoi(String s) {
//        String newValue = s.replaceAll("\\D","");
//        return Integer.parseInt(newValue);
//    }

    public String myAtoi(String s) {
       return s.trim().stripTrailing();
    }



    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();

        System.out.println(stringToInteger.myAtoi("/  /++=kskjj42"));
    }
}
