package lesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test public void myStackIsEmpty(){
        MyStack<Integer> myStack = new MyStack<>();
       assertTrue(myStack.isEmpty());

    }

    @Test void testThatSizeOfMyStackIsZero(){
        MyStack<String> myStack = new MyStack<>();
        assertEquals(0,myStack.size());
    }

    @Test void testThatMyStackCanPush(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        assertEquals(1,myStack.size());
        assertFalse(myStack.isEmpty());
    }

    @Test void testThatMyStackCannotExceedTheDefaultCapacity(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        assertThrows(StackOverflowError.class, ()-> myStack.push("Victor"));
    }

    @Test void testThatMyStackIsFull(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        assertTrue(myStack.isFull());
    }
    @Test void testThatMyStackCanPushAndPop(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(12);
        myStack.push(11);
        myStack.pop();
        assertEquals(1,myStack.size());
    }

    @Test void testThatMyStackCanPushAndPop2(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(21);
        myStack.push(111);
        myStack.pop();
        assertEquals(1,myStack.size());
        myStack.push(2);
        myStack.pop();
        assertEquals(1,myStack.size());
    }

    @Test void testThatMyStackCannotPopAnEmptyStackContainer(){
        MyStack<Double> myStack = new MyStack<>();
        assertThrows(StackUnderFlow.class, myStack::pop);
    }

    @Test void testThatMyStackCanPeek(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        myStack.peek();
        assertEquals(3,myStack.size());

    }
    @Test void testThatMyStackCanExceedTheDefaultCapacity(){
        MyStack<String> myStack = new MyStack<>(6);
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        myStack.push("Tosin");
        myStack.push("Sharon");
        myStack.push("Precious");
        assertEquals(6,myStack.size());

    }



}