package arraylist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {
    @Test

    void testMySetIsEmpty(){
        MySet<Integer> set = new MySet<>();
        assertTrue(set.isEmpty());
    }

    @Test

    void testMySetIsNotEmpty(){
        MySet<Double> set = new MySet<>();
        set.add(3.4);
        assertFalse(set.isEmpty());
    }

    @Test

    void testMySetCanAddValue(){
        MySet<String> set = new MySet<>();
        set.add("White");
        set.add("Pink");
        set.add("Yellow");
        assertEquals(3,set.size());
    }
    @Test

    void testMySetCannotAddUniqueValues(){
        MySet<Integer> set = new MySet<>();
        set.add(9);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(9);
        set.add(1);
        set.add(2);
        assertEquals(4,set.size());
    }

    @Test

    void testMySetCanRemoveByValue(){
        MySet<String> set = new MySet<>();
        set.add("Yellow");
        set.add("Black");
        set.add("Purple");
        set.add("Blue");
        set.add("Black");
        assertEquals(4,set.size());
        set.remove("Yellow");
        set.remove("Blue");
        assertEquals(2,set.size());
    }

    @Test

    void testMySetCanRemoveByIndex(){
        MySet<Integer> set = new MySet<>();
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        assertEquals(5,set.size());
        set.remove(2);
        set.remove(0);
        assertEquals(3,set.size());
    }

    @Test

    void testMySetContainsMethod(){
        MySet<Integer> set = new MySet<>();
        set.add(2);
        set.add(1);
        set.add(3);

        assertTrue(set.contains(2));
        assertFalse(set.contains(0));
    }

    @Test

    void testAddAllMethod(){
        MySet<Integer> set = new MySet<>();
        set.add(2);
        set.add(1);
        set.add(3);
        assertEquals(3,set.size());
        MySet<Integer> set2 = new MySet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set.addAll(set2);
        assertEquals(6,set.size());
    }

    @Test

    void testClearMethod(){
        MySet<String> set = new MySet<>();
        set.add("Yellow");
        set.add("Black");
        set.add("Purple");
        set.add("Blue");
        set.add("Black");
        assertEquals(4,set.size());
        set.clear();
        assertEquals(0,set.size());

    }

    @Test

    void testConvertToArray(){
        MySet<String> set = new MySet<>();
        set.add("Yellow");
        set.add("Black");
        set.add("Purple");
        set.add("Blue");
        set.add("Black");

        Object[] result = {"Yellow","Black","Purple","Blue"};
        assertArrayEquals(result,set.toArray());

    }





}