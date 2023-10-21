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
        assertEquals(-4,subject(-4));
    }

    @Test
    void  testSubject(){
        assertEquals(4,subject(4));
    }


    @Test

    void testTotalStoreValues(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        ArrayList<Integer> result = total(valueCheck);
        assertEquals(137,result.get(0));
        assertEquals(216,result.get(1));
        assertEquals(154,result.get(2));
        assertEquals(227,result.get(3));
    }

    @Test

    void testAverageStoreValue(){
        int[][] valueCheck = {{67,21,49},{98,62,56},{93,34,27},{78,83,66}};
        ArrayList<Integer> value = total(valueCheck);
        ArrayList<Double> result = average(value,subject(3));
        assertEquals(72.0,result.get(1));
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
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(67,21,49)));
        list.add(new ArrayList<>(List.of(98,62,56)));
        list.add(new ArrayList<>(List.of(93,34,27)));
        list.add(new ArrayList<>(List.of(78,83,66)));

        ArrayList<Integer> value = passes(list);
        assertEquals(2,value.get(2));
        assertEquals(4,value.get(0));
    }

    @Test

    void failScore() {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(67,21,49)));
        list.add(new ArrayList<>(List.of(98,62,56)));
        list.add(new ArrayList<>(List.of(93,34,27)));
        list.add(new ArrayList<>(List.of(78,83,66)));

        ArrayList<Integer> value = fail(list);
        assertEquals(0,value.get(0));
        assertEquals(2,value.get(1));
        assertEquals(2,value.get(2));


    }

    @Test

    void position() {
        ArrayList<Integer> value = new ArrayList<>();
        value.add(137);
        value.add(216);
        value.add(154);
        value.add(227);
        ArrayList<String> positionValue = positionScore(value);
        assertEquals("4",positionValue.get(0));

    }


}