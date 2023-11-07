package main.exceptionhandling;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class InterviewIQForBlackHawck extends Parent {

    public static void start() throws IOException, RuntimeException{
        throw new RuntimeException("this code is throwing exceptions");
    }
    public static void init(){
        try {
            start();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        /*Queue<Integer> queNum = new ArrayDeque<>();
        queNum.add(10);
        queNum.add(4);
        queNum.add(70);

        System.out.println(queNum.size()+" before size "+queNum.remove()+" -> "+ queNum.size());
        System.out.println(queNum.size()+" before size "+queNum.remove()+" -> "+ queNum.size());*/

        try {
            System.out.println(10/0);
        } catch (ArithmeticException ex) {
            System.out.println("Some on it we are going");
            System.exit(0);
            System.out.println("tuna is waiting ");
        }
        finally {
            System.out.println("making event ::");
        }
    }


}

interface WriteOneDefaultInterface{
    public default void print(){
        System.out.println("this is from defaultInterface method");
    }
}
class Parent{

}





