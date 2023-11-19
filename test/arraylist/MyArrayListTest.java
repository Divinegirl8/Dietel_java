package arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static arraylist.MyArrayList.*;

class MyArrayListTest {

    private MyArrayList<String> myArrayList;

    @BeforeEach
    void setUp(){
       myArrayList = new MyArrayList<>();
    }

@Test
    void testThatTheArrayListIsEmpty(){
    assertTrue(myArrayList.isEmpty());
}

@Test
    void testThatTheArrayListIsNotEmpty(){

        myArrayList.add("Chi");
        assertFalse(myArrayList.isEmpty());
}

@Test
    void testArrayListSize(){

        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        assertEquals(10, myArrayList.size());
}

@Test
    void testArrayListEmptySize(){
        assertEquals(0,myArrayList.size());
}

    @Test
    void testThatTheArrayListLengthIsUnlimited(){

        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");

        assertEquals(15, myArrayList.size());
    }

    @Test
    void testThatTheArrayListLengthIsUnlimited2(){

        myArrayList.add("Chi");
        myArrayList.add("Yellow");
        myArrayList.add("Black");
        myArrayList.add("Orange");
        myArrayList.add("Purple");
        myArrayList.add("Magenta");
        myArrayList.add("Brown");
        myArrayList.add("White");
        myArrayList.add("Blue");
        myArrayList.add("Indigo");
        myArrayList.add("Violet");
        myArrayList.add("Silver");
        myArrayList.add("Ash");
        myArrayList.add("Nude");
        myArrayList.add("Tomato red");
        myArrayList.add("mint green");
        myArrayList.add("paper white");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");
        myArrayList.add("Chi");

        assertEquals(30, myArrayList.size());
    }

    @Test
    void testRemoveMethod(){
        myArrayList.add("Chi");
        myArrayList.add("Yellow");
        myArrayList.add("Black");
        myArrayList.add("Orange");
        myArrayList.add("Purple");

        assertEquals(4,myArrayList.remove("Black"));
        assertEquals(3,myArrayList.remove("Chi"));
        assertEquals(2,myArrayList.remove("Orange"));
        assertEquals(2,myArrayList.size());
        assertEquals(1,myArrayList.remove("Purple"));
        assertEquals(0,myArrayList.remove(0));
        assertTrue(myArrayList.isEmpty());
}

@Test
    void testMyArrayListCannotRemoveAnEmptyList(){
        assertEquals(0,myArrayList.remove(1));
}


@Test
    void testMyArrayListAddMethod_RemoveMethod_SizeMethod_IsEmptyMethod(){
        assertTrue(myArrayList.isEmpty());
        assertEquals(0,myArrayList.size());
        assertEquals(0,myArrayList.remove("Black"));
        myArrayList.add("Rice");
        assertFalse(myArrayList.isEmpty());
        assertEquals(1,myArrayList.size());
        myArrayList.add("Beans");
        assertEquals(2,myArrayList.size());
        myArrayList.remove(0);
        myArrayList.remove(0);
        assertEquals(0,myArrayList.size());
}

@Test
    void testGetMethod(){
        myArrayList.add("Value");
        myArrayList.add("2");
        myArrayList.add("Yellow");
        myArrayList.add("Blue");
        assertEquals("2",myArrayList.get(1));
        assertEquals("Blue",myArrayList.get(3));
}

@Test
    void testIndexOf(){

    myArrayList.add("Magenta");
    myArrayList.add("Brown");
    myArrayList.add("White");
    myArrayList.add("Blue");
    myArrayList.add("Indigo");
    myArrayList.add("Violet");
    myArrayList.add("Silver");
    myArrayList.add("Ash");
    myArrayList.add("Nude");
    myArrayList.add("Tomato red");
    myArrayList.add("mint green");
    myArrayList.add("paper white");

    assertEquals(9,myArrayList.indexOf("Tomato red"));
    assertEquals(3,myArrayList.indexOf("Blue"));
    assertEquals(-1,myArrayList.indexOf("Jug"));
    assertEquals(0,myArrayList.indexOf("Magenta"));

}

@Test
    void testLastIndexOf(){
        myArrayList.add("Rice");
        myArrayList.add("Egg");
        myArrayList.add("Rice");
        assertEquals(2,myArrayList.lastIndexOf("Rice"));
}

@Test
    void testElementIsFoundInTheList(){
        myArrayList.add("Blue");
        myArrayList.add("2");
        assertTrue(myArrayList.contains("2"));
}

    @Test
    void testElementIsNotFoundInTheList(){
        myArrayList.add("Blue");
        myArrayList.add("2");
        assertFalse(myArrayList.contains("5"));
    }

    @Test

    void testConvertToArray(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(3);
        arrayList.add(5);
        Object[] result = {3,5};
        assertArrayEquals(result,arrayList.toArray());
    }

    @Test

    void testMyArrayListClearMethod(){
        myArrayList.add("Magenta");
        myArrayList.add("Brown");
        myArrayList.add("White");
        myArrayList.add("Blue");
        myArrayList.add("Indigo");
        myArrayList.add("Violet");
        myArrayList.add("Silver");
        myArrayList.add("Ash");
        myArrayList.add("Nude");
        myArrayList.add("Tomato red");
        myArrayList.add("mint green");
        myArrayList.add("paper white");
        assertEquals(12,myArrayList.size());
        myArrayList.clear();
        assertEquals(0,myArrayList.size());
    }




}