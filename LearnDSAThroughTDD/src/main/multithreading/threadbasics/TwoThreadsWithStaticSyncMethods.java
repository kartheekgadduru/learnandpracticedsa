package main.multithreading.threadbasics;


public class TwoThreadsWithStaticSyncMethods {
    public static synchronized void m1()  {
        System.out.println("I'm a static synchronized method");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public synchronized void m2() {
        System.out.println("I'm a non-static synchronized method");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String ...args)  {
        TwoThreadsWithStaticSyncMethods a1 = new TwoThreadsWithStaticSyncMethods();
        TwoThreadsWithStaticSyncMethods a2 = new TwoThreadsWithStaticSyncMethods();

        Thread t1 = new Thread( () -> {
            a1.m1();
        });
        Thread t2 = new Thread( () -> {
            a1.m2();
        });
        t1.start();
        t2.start();
    }
}
