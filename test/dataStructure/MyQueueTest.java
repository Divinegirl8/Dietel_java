package dataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test

    void testThatMyQueueIsEmpty(){
        MyQueue<Double> queue = new MyQueue<>();

        assertTrue(queue.isEmpty());
    }

    @Test

    void testThatMyEmptyQueueSizeIsZero(){
        MyQueue<String> queue = new MyQueue<>();
        assertEquals(0,queue.size());
    }

    @Test

    void testThatMyQueueCanAdd(){
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(2);
        queue.add(3);
        assertEquals(2,queue.size());
    }

    @Test

    void testThatMyQueueCanAddUnlimitedValues(){
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        assertEquals(16,queue.size());
    }

    @Test

    void testThatMyQueueCanRemove(){
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        assertEquals(3,queue.remove());
    }

    @Test

    void testThatMyQueueCanAddAndRemove(){
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        assertEquals(4,queue.size());
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        assertEquals(0,queue.size());
        assertTrue(queue.isEmpty());
        assertEquals(0,queue.remove());
    }

    @Test

    void testQueuePeekMethod(){
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Banana");
        queue.add("Mango");
        queue.add("Strawberry");
        assertEquals("Banana",queue.peek());
        queue.remove();
        assertEquals("Mango",queue.peek());
        queue.remove();
        queue.add("Orange");
        assertEquals("Strawberry",queue.peek());
    }

    @Test

    void testMyQueueContainsMethod(){
        MyQueue<String> queue = new MyQueue<>();
        queue.add("Banana");
        queue.add("Mango");
        assertTrue(queue.contains("Mango"));
        assertFalse(queue.contains("Apple"));

    }

    @Test

    void testMyQueueToArrayMethod(){
        MyQueue<Boolean> queue = new MyQueue<>();
        queue.add(true);
        queue.add(false);
        Object[] expected = {true,false};
        assertArrayEquals(expected,queue.toArray());
    }
}