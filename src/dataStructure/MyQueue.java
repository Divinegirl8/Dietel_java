package dataStructure;

import java.util.Arrays;

public class MyQueue<D> {
    Object[] queueContainer = new Object[10];

    public int size(){
        int count = 0;
        for (int index = 0; index < queueContainer.length; index++) {
            if (queueContainer[index] != null) count++;
        }
        return count;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int add(D value){
        if (size() == queueContainer.length){
            Object[] newContainer = new Object[queueContainer.length * 2];

            for (int index = 0; index < queueContainer.length; index++) {
                newContainer[index] = queueContainer[index];
            }
            queueContainer = newContainer;

        }

        queueContainer[size()] = value;
        return size();
    }

    public void addAll(MyQueue<D> value){
        for (int index = 0; index < value.size(); index++) {
            queueContainer[size()] = value.get(index);
        }
    }

    public Object[] removeM(){
        Object[] newContainer = new Object[queueContainer.length-1];
        for (int index = 1; index < size(); index++) {
          newContainer[index - 1] = queueContainer[index];
        }
        return newContainer;
    }

    public int remove(){
        if (size() == 0) return 0;
        queueContainer = removeM();
        return size();
    }

    public int remove(D value){
        if (size() == 0) return 0;
        if (queueContainer[0] == value){
        queueContainer = removeM();}
        return size();
    }

    public D get(int index){
        if (index >= size()) throw new  ArrayIndexOutOfBoundsException("Index" + index + "Out of Bounds");

        return (D) queueContainer[index];
    }

    public D peek(){
        if (isEmpty()) return null;
        return (D) queueContainer[0];
    }

    
    public boolean contains(D value){
        for (int index = 0; index < size(); index++) {
            if (queueContainer[index].equals(value)) return true;
        }
        return false;
    }

    public Object[] toArray(){
        Object[] newArray = new Object[size()];

        for (int index = 0; index < size(); index++) {
            newArray[index] = queueContainer[index];
        }
        return newArray;
    }

    public boolean containsAll(MyQueue<D> value){
        for (int index = 0; index < value.size(); index++) {
            if (queueContainer[index] == value.get(index)) return true;
        }
        return false;
    }

    public void clear(){
        Arrays.fill(queueContainer,null);
    }





    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(2);
        queue.add(54);
        queue.add(7);
        queue.add(8);

        MyQueue<Integer> queue2 = new MyQueue<>();
        queue2.add(23);
        queue2.add(24);
queue.remove(2);
        queue.addAll(queue2);

        for (int index = 0; index < queue.size(); index++) {
            System.out.println(queue.get(index));
        }
        System.out.println(Arrays.toString(queue.toArray()));

//        Queue<Integer> v = new Queue<Integer>() {

//
//            @Override
//            public boolean offer(Integer integer) {
//                return false;
//            }
//

//
//            @Override
//            public Integer poll() {
//                return null;
//            }
//
//            @Override
//            public Integer element() {
//                return null;
//            }
//

//
//            @Override
//            public Iterator<Integer> iterator() {
//                return null;
//            }
//

//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//

//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//

//        }
    }

}
