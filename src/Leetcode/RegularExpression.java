package Leetcode;

public class RegularExpression {
    public boolean isMatch(String s,String p){
        StringBuilder add = new StringBuilder();
        for (int index = 0; index < p.length(); index++) {
            if (String.valueOf(p.charAt(index)).equals("*")) {
                add.append(p.charAt(index));
            }
        }
        int length = add.length();
        String regex = "\\*{" + length + "}";

        String value = p.replaceAll(regex, "*");
        return s.matches(value);
    }

    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();
        System.out.println(regularExpression.isMatch("abc","a***abc"));


    }
}
