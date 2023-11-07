package main.multithreading.threadbasics;

public class SampleThreadTest {
    public static void main(String[] args) {
        ChildThread t1 = new ChildThread();
        t1.run();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" ::: "+ i);
        }
    }
}

class ChildThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+ " xyz ::: "+i);
        }
    }
}
