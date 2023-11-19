package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyArrayList<T> {
    private Object[] valueContainer = new Object[10];



    public  boolean isEmpty(){
        return size() == 0;
    }


    public int size(){
        int count = 0;
        for (Object value : valueContainer) {
            if (value != null) count++;
        }
        return count;
    }


    public int add(T value){

        if (size() == valueContainer.length){
            Object[] newValueContainer = new Object[valueContainer.length*2];

            for (int index = 0; index < valueContainer.length; index++) {
                newValueContainer[index] = valueContainer[index];
            }
            valueContainer = newValueContainer;
        }
        valueContainer[size()] =  value;
        return size();
    }

    public void addAll(MyArrayList<T> value){

        for (int index = 0; index < value.size(); index++) {
            valueContainer[size()] = value.get(index);
        }
    }


    public int remove(T value) {

        for (int index = 0; index < size(); index++) {
            if (Objects.equals(valueContainer[index], value)) {
                valueContainer  = removeIndex(valueContainer, index);
                break;
            }
        }
        return size();
    }

    public int remove(int index) {
        valueContainer = removeIndex(valueContainer, index);
        return size();
    }

    public Object[] removeIndex(Object[] initialArray, int indexToRemove) {
        Object[] newContainer = new Object[initialArray.length - 1];
        for(int temp = 0; temp < newContainer.length; temp++) {
            newContainer[temp] = initialArray[temp >= indexToRemove ? temp + 1 : temp];
        }
        return newContainer;
    }

    public T get(int index){
        if (index >= size()) throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds.");
        return (T) valueContainer[index];
    }

    public int indexOf(T value){

        for (int index = 0; index < size(); index++) {
            if (Objects.equals(valueContainer[index], value)) return index;
        }
        return -1;
    }

    public int  lastIndexOf(T value){
        for (int index = size() - 1; index >= 0; index--){
            if (Objects.equals(valueContainer[index], value))return index;
        }
        return -1;
    }

    public boolean contains(T values){
        for (int value = 0; value < size(); value++){
            if (Objects.equals(valueContainer[value], values)) return true;
        }
        return false;
    }

    public void clear(){
        Arrays.fill(valueContainer, null);
    }

    public Object[] toArray(){
        Object[] newArray = new Object[size()];

        for (int index = 0; index < size(); index++){
             newArray[index] = valueContainer[index];
        }
        return newArray;
    }

    public boolean containsAll(MyArrayList<T> value){
        for (int index = 0; index < value.size(); index++) {
            if (valueContainer[index] == value.get(index)) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("goat5");
        myArrayList.add("goat4");
        myArrayList.add("goat3");
        myArrayList.add("goat5");
        myArrayList.add("goat1");
        myArrayList.add("goat5");



MyArrayList<String> myArrayList1 = new MyArrayList<>();
myArrayList1.add("Lion1");
myArrayList1.add("Lion2");

myArrayList.addAll(myArrayList1);

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        System.out.println(myArrayList.containsAll(myArrayList1));

        System.out.println(Arrays.toString(myArrayList.toArray()));

    }




}
