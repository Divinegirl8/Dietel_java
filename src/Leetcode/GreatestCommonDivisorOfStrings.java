package Leetcode;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int gcdLength = valueOfGcdStrings(str1.length(), str2.length());

        String gcdString = str1.substring(0, gcdLength);

      if (isRepeatable(str1,gcdString) && isRepeatable(str2,gcdString)) {
          return gcdString;
      }
      return "";
    }

    public int valueOfGcdStrings(int lengthOfStringOne, int lengthOfStringTwo) {
        while (lengthOfStringTwo != 0) {
            int temp = lengthOfStringTwo;
            lengthOfStringTwo = lengthOfStringOne % lengthOfStringTwo;
            lengthOfStringOne = temp;
        }

        return lengthOfStringOne;
    }


    private boolean isRepeatable(String value1, String value2) {
        int value1Length = value1.length();
        int value2Length = value2.length();

        if (value1Length % value2Length != 0) {return false;}

        for (int index = 0; index < value1Length; index++) {
            if (value1.charAt(index) != value2.charAt(index % value2Length)) return false;
        }


        return true;
    }




}
