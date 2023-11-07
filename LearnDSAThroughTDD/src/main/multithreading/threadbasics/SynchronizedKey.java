package main.multithreading.threadbasics;

public class SynchronizedKey {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread first = new Thread(counter, "first");
        Thread second = new Thread(counter, "second");
        first.start();
        second.start();

        first.join();
        second.join();
        System.out.println(counter.count);
    }
    
}

class Counter extends Thread{
    int count = 0;
    int max = 1_000_00_000;
    @Override
    public void run() {
        for (int i = 1; i <= max; i++) {
            count+=1;
        }
        System.out.println(Thread.currentThread().getName());
    }
}

class CounterWithSynchronized extends Thread{
    int count = 0;
    int max = 1_000_00_000;
    @Override
    public synchronized void run() {
        for (int i = 1; i <= max; i++) {
            count+=1;
        }
    }
}
