//package dataStructure;
//
//public class MyStack<T> {
//    private int size;
//
//    private int defaultCapacity = 3;
//    Object[] myStackContainer;
//
//
//    public MyStack(){
//        myStackContainer = new Object[defaultCapacity];
//    }
//
//    public MyStack(int capacity){
//        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be greater than 0");
//        myStackContainer = new Object[capacity];
//        defaultCapacity = capacity;
//    }
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public int size(){
//        return size;
//    }
//
//    public void push(T value){
//        if(isFull()) throw new StackOverflowError("Stack is full");
//        myStackContainer[size++] = value;
//    }
//
//    public boolean isFull(){
//        return size == defaultCapacity;
//    }
//
//
//    public void pop() {
//        if (size <= 0){throw new StackUnderFlowError("Stack is empty");}
//        --size;
//    }
//
//
//    public Object peek() {
//        if (size <= 0) {throw new StackUnderFlowError("Stack is empty");}
//        return myStackContainer[size - 1];
//    }
//
//    public T get(int value){
//        return (T) myStackContainer[value];
//    }
//
//    public static void main(String[] args) {
//        MyStack<String> myStack = new MyStack<>();
//
//        myStack.push("Divine");
//        myStack.push("Sam");
//
//
//        for (int index = 0; index < myStack.size(); index++) {
//            System.out.println(myStack.get(index));
//
//        }
//        System.out.println(myStack.peek());
//    }
//}
