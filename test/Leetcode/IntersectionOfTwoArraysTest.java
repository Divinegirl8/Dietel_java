package Leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {
    @Test void testOne(){
        int[] input1 = {2,3,5,6,7,8};
        int[] input2 = {1,3,7,10,11,8};
        assertEquals(3,IntersectionOfTwoArrays.intersect(input1,input2));
    }

    @Test void testTwo(){
        int[] input1 = {5,4,11,13,9};
        int[] input2 = {9,11,15,1,14};
        assertEquals(9,IntersectionOfTwoArrays.intersect(input1,input2));
    }

}