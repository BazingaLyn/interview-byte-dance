package heap;

import java.util.ArrayList;

public class MaxHeap<E extends Comparable<E>> {

    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<Integer>();
        maxHeap.add(21);
        maxHeap.add(22);
        maxHeap.add(99);
        maxHeap.add(88);
        maxHeap.add(20);

        System.out.println(maxHeap.extractMax());
        System.out.println(maxHeap.extractMax());
        System.out.println(maxHeap.extractMax());
        System.out.println(maxHeap.extractMax());
        System.out.println(maxHeap.extractMax());


    }

    private ArrayList<E> data;

    public MaxHeap(int capacity) {
        data = new ArrayList<E>(capacity);
    }

    public MaxHeap() {
        data = new ArrayList<E>();
    }


    public int size() {
        return data.size();
    }


    public boolean isEmpty() {
        return data.isEmpty();
    }

    private int parent(int index) {
        if (index == 0)
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }


    public void add(E e) {
        data.add(e);
        siftUp(data.size() - 1);

    }

    public E findMax() {
        return data.get(0);
    }

    private void siftUp(int i) {
        while (i > 0 && data.get(parent(i)).compareTo(data.get(i)) < 0) {
            E temp = data.get(parent(i));
            data.set(parent(i), data.get(i));
            data.set(i, temp);
            i = parent(i);
        }
    }

    public E extractMax(){
        E e = data.get(0);
        data.set(0,data.get(data.size() - 1));
        data.remove(data.size() -1);
        siftDown(0);
        return e;
    }

    private void siftDown(int i) {
        while(leftChild(i) < data.size()){
            int j = leftChild(i);

            if(j + 1 < data.size() && data.get(j+1).compareTo(data.get(j)) > 0){
                j++;
            }

            if(data.get(i).compareTo(data.get(j)) > 0)break;

            E temp = data.get(i);
            data.set(i,data.get(j));
            data.set(j,temp);

            i = j;
        }
    }


}
