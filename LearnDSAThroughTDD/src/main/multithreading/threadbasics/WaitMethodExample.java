package main.multithreading.threadbasics;

public class WaitMethodExample {
    public static void main(String[] args) {
        System.out.println("kartheek is king");
        synchronized (args){
            System.out.println("inside synchronized method");
            try {
                args.wait();
                System.out.println("let see here about it ");
            }catch (InterruptedException ex ){
                ex.printStackTrace();
            }
        }
    }
}
