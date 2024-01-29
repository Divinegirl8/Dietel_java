package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder string = new StringBuilder();

     int loop;
      if (word1.length() > word2.length()){
          loop = word1.length();
      }
      else {loop = word2.length();}

        for (int index = 0; index < loop; index++) {

            if (index < word1.length()){
                string.append(word1.charAt(index));}
            if (index < word2.length()){
            string.append(word2.charAt(index));}


        }
     return string.toString();

    }}

