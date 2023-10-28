package Array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Jonathan.GetRow.rowElement;
import static org.junit.jupiter.api.Assertions.*;
import static Array.StudentGrade.*;
class StudentGradeFunctionTest {
    @Test
    void testStudent(){
        assertEquals(3,student(3));
        assertEquals(4,student(-4));
    }

    @Test
    void  testSubject(){
        assertEquals(4,subject(4));
        assertEquals(67,student(-67));
    }


    @Test

    void testTotalStoreValues(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        int[] expected = {137,216,154,227};
       assertArrayEquals(expected,result);
    }

    @Test

    void testAverageStoreValue(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        double[] result = average(total(valueCheck),subject(valueCheck[0].length));
        double[] expected = {45.67,72.00,51.33,75.67};
        assertArrayEquals(expected,result);

    }

    @Test

    void testGetSubject(){

        ArrayList<ArrayList<Integer>> value = new ArrayList<>();
        value.add(new ArrayList<>(List.of(67,21,49)));
        value.add(new ArrayList<>(List.of(98,62,56)));
        value.add(new ArrayList<>(List.of(93,34,27)));
        value.add(new ArrayList<>(List.of(78,83,66)));

        ArrayList<ArrayList<Integer>> column = new ArrayList<>();
        column.add(new ArrayList<>(List.of(67,98,93,78)));
        column.add(new ArrayList<>(List.of(21,62,34,83)));
        column.add(new ArrayList<>(List.of(49,56,27,66)));

        ArrayList<ArrayList<Integer>> expected = getSubject(value);
        assertEquals(column,expected);
    }

    @Test

    void testTotalSubject(){
        ArrayList<ArrayList<Integer>> item = new ArrayList<>();
        item.add(new ArrayList<>(List.of(67,21,49)));
        item.add(new ArrayList<>(List.of(98,62,56)));
        item.add(new ArrayList<>(List.of(93,34,27)));
        item.add(new ArrayList<>(List.of(78,83,66)));

        ArrayList<Integer> expected = totalSubjectCal(item);
        assertEquals(336,expected.get(0));
        assertEquals(200,expected.get(1));
        assertEquals(198,expected.get(2));

    }

    @Test

    void averageSubjectList(){
        ArrayList<ArrayList<Integer>> item = new ArrayList<>();
        item.add(new ArrayList<>(List.of(67,21,49)));
        item.add(new ArrayList<>(List.of(98,62,56)));
        item.add(new ArrayList<>(List.of(93,34,27)));
        item.add(new ArrayList<>(List.of(78,83,66)));

        ArrayList<Integer> value = totalSubjectCal(item);
        ArrayList<Double> expected = averageSubject(value,student(item.size()));
        assertEquals(49.5,expected.get(2));
    }

    @Test

    void maximumSubject(){
        ArrayList<ArrayList<Integer>> item = new ArrayList<>();
        item.add(new ArrayList<>(List.of(67,21,49)));
        item.add(new ArrayList<>(List.of(98,62,56)));
        item.add(new ArrayList<>(List.of(93,34,27)));
        item.add(new ArrayList<>(List.of(78,83,66)));
        ArrayList<Integer> value = maximumScore(item);
        assertEquals(83,value.get(1));
        assertEquals(66,value.get(2));
    }

    @Test

    void minimumScore(){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(67,21,49)));
        list.add(new ArrayList<>(List.of(98,62,56)));
        list.add(new ArrayList<>(List.of(93,34,27)));
        list.add(new ArrayList<>(List.of(78,83,66)));
        ArrayList<Integer> value = minimumScores(list);
        assertEquals(67, value.get(0));
        assertEquals(21,value.get(1));
        assertEquals(27,value.get(2));

    }

    @Test

    void passScore(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] value = passes(valueCheck);
        int[] expected = {4,2,2};
       assertArrayEquals(expected,value);
    }

    @Test

    void failScore() {
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] value = fail(valueCheck);
        int[] expected = {0,2,2};
        assertArrayEquals(expected,value);



  }

    @Test

    void position() {
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        int[] position = positionScore(result);
        int[] expected = {4,2,3,1};
        assertArrayEquals(expected,position);

    }

    @Test

    void testHardestSubject(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] value = fail(valueCheck);
        int result = getHardestSubject(value);
        assertEquals(2,result);
    }

    @Test

    void testHardestSubjectIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] value = fail(valueCheck);
        int result = getHardestSubjectIndex(value);
        assertEquals(2,result);
    }

    @Test

    void testEasiestSubject(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] value = passes(valueCheck);
        int result = getEasiestSubject(value);
        assertEquals(4,result);
    }

    @Test
    void testEasiestSubjectIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] value = passes(valueCheck);
        int result = getEasiestSubjectIndex(value);
        assertEquals(1,result);
    }

    @Test

    void testOverallBestStudent(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int expected = 98;
        int output = getOverallBest(valueCheck);
        assertEquals(expected,output);

    }

    @Test

    void testOverallBestSubjectIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int expected = 1;
        int output = getOverallBestIndex(valueCheck);
        assertEquals(expected,output);

    }

    @Test

    void testOverallBestStudentIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        assertEquals(2,getOverallBestStudentIndex(valueCheck));
    }



    @Test

    void testOverallWorstStudent(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int expected = 21;
        int output = getOverallWorst(valueCheck);
        assertEquals(expected,output);

    }

    @Test

    void testOverallWorstSubjectIndex() {
        int[][] valueCheck = {{67, 21, 49}, {98, 62, 56}, {93, 34, 27}, {78, 83, 66}};
        int expected = 2;
        int output = getOverallWorstIndex(valueCheck);
        assertEquals(expected, output);

    }

    @Test

    void testOverallWorstStudentIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        assertEquals(1,getOverallWorstStudentIndex(valueCheck));
    }




    @Test

    void testBestStudent(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        assertEquals(227,bestStudent(result));
    }


    @Test

    void testBestStudentIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        assertEquals(4,bestStudentIndex(result));
    }


    @Test

    void testWorstStudent(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        assertEquals(137,worstStudent(result));
    }

    @Test

    void testWorstStudentIndex(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        assertEquals(1,worstStudentIndex(result));
    }

    @Test

    void testOverallTotal(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        assertEquals(734,overallTotal(result));}

    @Test

    void testOverallAverage(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        int[] result = total(valueCheck);
        assertEquals(183.5,averageOverAllTotal(result,student(valueCheck.length)));}


}