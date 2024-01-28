package leetcode;

public class ReverseStringWord {
    public String reverseWords(String s) {
      String[] convertToArray = s.trim().split("\\s+");
      StringBuilder value = new StringBuilder();

        for (int index = convertToArray.length-1; index >=  0; index--) {
            value.append(convertToArray[index]);

            if (index > 0){
                value.append(" ");
            }
        }
       return value.toString();
    }
}
