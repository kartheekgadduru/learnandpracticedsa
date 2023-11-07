package main.DSA.heaps;

public class MinIntHeap {
    private int capacity = 10;
    private int size = 0;
    int[] items = new int[capacity];

    private int getLeftChildIndex(int parentIndex){ return 2 * parentIndex + 1;}
    private int getRightChildIndex(int parentIndex) {return 2 * parentIndex + 2;}
    private int getParentIndex(int childIndex) {return (childIndex - 1) / 2 ;}

}
