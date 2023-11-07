package main.DSA.Stacks;
//When you want to store answer so far processed results we can use stacks and Queues
// You want to put some result behind you that can be used later on
// you want particular group of elements inside a data structure
public class StackImp {

    int pointer = -1; // this pointer is helpful for as current index in the array
    private static final int DEFAULT_SIZE = 10;
    int[] stackArray;

    public StackImp(int stackSize) {
        this.stackArray = new int[stackSize];
    }

    public StackImp() {
       this(DEFAULT_SIZE);
    }

    public boolean push(int data){
         if(isFull()){
             throw new ArrayIndexOutOfBoundsException("array exceeded its length");
         }
         this.stackArray[++pointer] = data;
         return true;
    }

    public int pop() throws Exception {
        if(isEmpty())
            throw new Exception("Stack is empty");
         return this.stackArray[pointer--];

    }

    private boolean isFull() {
        return pointer == this.stackArray.length -1;
    }
    private boolean isEmpty() {
        return pointer == -1;
    }
}
