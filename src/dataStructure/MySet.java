package dataStructure;

import java.util.Arrays;
import java.util.Objects;

public class MySet<E> {
    private Object[] setContainer = new Object[10];


    public int size(){
        int count = 0;
        for (Object value : setContainer) {
            if (value != null) count++;
        }
        return count;
    }


    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean contains(E value){
        for (int index = 0; index < size(); index++) {
            if (setContainer[index] == value) return true;
        }
        return false;
    }



    public void add(E value) {
        if (!contains(value)) {
            addValue(value);

        }
    }

    public void addAll(MySet<E> value) {
        for (int index = 0; index < value.size(); index++) {
            if (!contains(value.get(index))){
                setContainer[size()] = value.get(index);}
            }
        }


    public void addValue(E value){

        if (size() == setContainer.length){
            Object[] newValueContainer = new Object[setContainer.length*2];

            for (int index = 0; index < setContainer.length; index++) {
                newValueContainer[index] = setContainer[index];
            }
            setContainer = newValueContainer;
        }
        setContainer[size()] =  value;
    }

    public boolean containsAll(MySet<E> value){
        for (int index = 0; index < value.size(); index++) {
            if (setContainer[index] == value.get(index)) return true;
        }
        return false;
    }


    public E get(int index){
        if (index >= size()) throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds.");
        return (E) setContainer[index];
    }

    public void remove(E value) {

        for (int index = 0; index < size(); index++) {
            if (Objects.equals(setContainer[index], value)) {
                setContainer  = removeIndex(setContainer, index);
                break;
            }
        }
    }

    public void remove(int index) {
        setContainer = removeIndex(setContainer, index);

    }

    public Object[] removeIndex(Object[] initialArray, int indexToRemove) {
        Object[] newContainer = new Object[initialArray.length - 1];
        for(int temp = 0; temp < newContainer.length; temp++) {
            newContainer[temp] = initialArray[temp >= indexToRemove ? temp + 1 : temp];
        }
        return newContainer;
    }



    public void clear(){
        Arrays.fill(setContainer,null);
    }

    public Object[] toArray(){
        Object[] newArray = new Object[size()];

        for (int index = 0; index < size(); index++){
            newArray[index] = setContainer[index];
        }
        return newArray;
    }






    public static void main(String[] args) {
        MySet<String> set = new MySet<>();
        set.add("Blue");
        set.add("Black");
        set.add("Brown");
        set.add("Yellow");

        MySet<String> set2 = new MySet<>();
        set2.add("Yellow");
        set2.add("Indigo");
        set2.add("Purple");
        set2.add("Blue");

        set.addAll(set2);

        for (int index = 0; index < set.size(); index++) {
            System.out.println(set.get(index));
        }
        System.out.println(set.containsAll(set2));
        System.out.println(Arrays.toString(set.toArray()));

        set.clear();
        System.out.println(set.size());






    }


}
