package Leetcode;

public class RegularExpression {
    public boolean isMatch(String s,String p){
        String value = p.replaceAll("\\*{3}", "*");
        System.out.println(value);
        return s.matches(value);
    }

    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();
        System.out.println(regularExpression.isMatch("abc","a***abc"));


    }
}
