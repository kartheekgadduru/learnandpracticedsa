package main.DSA.queues;

public class CustomQueue {
    int queueArray[];
    private final static int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size) {
        this.queueArray = new int[size];
    }
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int data){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("Queue exceeds it size");
        }
        this.queueArray[end++] = data;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = this.queueArray[0];
        // we need to shift the array by one elements
        for (int i = 1; i <= end; i++) {
            this.queueArray[i-1] = this.queueArray[i];
        }
        end--;
        return removed;
    }

    private boolean isEmpty() {
        return end == -1;
    }

    private boolean isFull() {
        return end == queueArray.length -1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < end; i++) {
            System.out.println(this.queueArray[i]);
        }

    }

    public static void main(String[] args) throws Exception {
        CustomQueue cq = new CustomQueue();
        cq.push(12);
        cq.push(20);
        cq.display();
        cq.pop();
        System.out.println("after removed ");
        cq.display();
    }

}
