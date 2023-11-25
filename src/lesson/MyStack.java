package lesson;

public class MyStack<T> {

    private int defaultCapacity = 3;
    private int size;
    private
    Object[] myStackContainer;


    public MyStack(){
        myStackContainer = new Object[defaultCapacity];
    }

    public MyStack(int capacity){
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be greater than zero");
        myStackContainer = new Object[capacity];
        defaultCapacity = capacity;

    }
    public boolean isEmpty() {
         return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T value) {
        if (isFull()) throw new StackOverflowError("Stack is full");
        myStackContainer[size++] = value;
    }

    public boolean isFull(){
        return size == defaultCapacity;
    }

    public void pop() {
        if (size <= 0) {throw new StackUnderFlow("Stack is empty");}
        --size;
    }

    public Object peek() {
        if (size <= 0) {throw new StackUnderFlow("Stack is empty");}
        return myStackContainer[size - 1];
    }
}
