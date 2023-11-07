package main.multithreading.threadbasics;


import java.util.PriorityQueue;

public class TwoThreadsWithTuna {
    public static void main(String[] args) throws Throwable {
       try{
           System.out.println("insdie try");
       }catch (Exception ex){
           ex.printStackTrace();
       }
       finally {
           new TwoThreadsWithTuna().finalize();
       }

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("tuna");
        System.out.println(10/0);
        super.finalize();
    }
}



