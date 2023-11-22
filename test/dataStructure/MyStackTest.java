package dataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    @Test void testMyStackIsEmpty(){
        MyStack<String> myStack = new MyStack<>();
        assertTrue(myStack.isEmpty());
    }
    @Test void testMySizeIsZero(){
        MyStack<Integer> myStack = new MyStack<>();
        assertEquals(0,myStack.size());
    }

    @Test void testMyStackCanPush(){
        MyStack<String> myStack = new MyStack<>();
        assertTrue(myStack.isEmpty());
        myStack.push("Song");
        assertEquals(1,myStack.size());
        assertFalse(myStack.isEmpty());
    }

    @Test void testMyStackIsFull(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        assertTrue(myStack.isFull());
    }

    @Test void testMyStackIsNotFull(){
        MyStack<Double> myStack = new MyStack<>();
        myStack.push(12.4);
        myStack.push(13.2);
        assertFalse(myStack.isFull());
    }

    @Test void testMyStackCanThrowAnException(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        assertThrows(StackOverflowError.class,() -> myStack.push(4));
    }

    @Test void testMyStackCanPop(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Sarah");
        myStack.push("Joy");
        myStack.push("Ope");
        myStack.pop();
        myStack.pop();
        assertEquals(1,myStack.size());
    }

    @Test void testMyStackCanPushAndPop(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Sarah");
        myStack.push("Joy");
        myStack.pop();
        assertEquals(1,myStack.size());

        myStack.push("Ope");
        myStack.pop();
        assertEquals(1,myStack.size());

        myStack.push("Favour");
        myStack.push("Vera");
        assertEquals(3,myStack.size());
    }

    @Test void testMyStackCanThrowStackUnderFlowException(){
        MyStack<Integer> myStack = new MyStack<>();
        assertThrows(StackUnderFlowError.class, myStack::pop);
    }

    @Test void testMyStackCanPeek(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(8);
        myStack.push(2);
        assertEquals(2,myStack.peek());
        assertEquals(2,myStack.size());

    }
    @Test void testMyStackArgsConstructor(){
        MyStack<String> myStack = new MyStack<>(10);
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        myStack.push("Faith");
        assertEquals(10,myStack.size());
       assertThrows(StackOverflowError.class ,() -> myStack.push("Ada"));
    }


}