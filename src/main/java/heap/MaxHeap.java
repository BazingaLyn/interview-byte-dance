package heap;

import java.util.ArrayList;

public class MaxHeap<E extends Comparable<E>> {

    private ArrayList<E> data;

    public MaxHeap(int capacity){
        data = new ArrayList<E>(capacity);
    }

    public MaxHeap(){
        data = new ArrayList<E>();
    }


    public int size(){
        return data.size();
    }


    public boolean isEmpty(){
        return data.isEmpty();
    }

    private int parent(int index){
        if(index == 0)
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        return (index - 1) / 2;
    }






//    public MaxHeap(E[] arr){
//        data = new ArrayList<E>();
//        for (int i = 0; i < arr.length; i++) {
//            data.add(arr[i]);
//        }
//
//    }


}
