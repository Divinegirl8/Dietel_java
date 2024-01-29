package Leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringTest {
    @Test void case_One(){
        MergeString mergeString = new MergeString();

        String word1 = "abc";
        String word2 = "pqr";
         String output = "apbqcr";
         assertEquals(output,mergeString.mergeAlternately(word1,word2));

    }

    @Test void case_Two(){
        MergeString mergeString = new MergeString();

       String word1 = "ab";
       String word2 = "pqrs";
        String output = "apbqrs";
        assertEquals(output,mergeString.mergeAlternately(word1,word2));

    }
    @Test void case_Three(){
        MergeString mergeString = new MergeString();

        String word1 = "abcd", word2 = "pq";
        String output = "apbqcd";
        assertEquals(output,mergeString.mergeAlternately(word1,word2));

    }



}