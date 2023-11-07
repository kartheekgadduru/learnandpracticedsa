package main.designpatterns.singleton;

import sun.reflect.Reflection;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SingletonPattern {
    public static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
    }

    public static SingletonPattern getInstance(){
        if(instance == null){
            return new SingletonPattern();
        }
        return instance;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.peek();
        stack.isEmpty();
       try{
           int i = 10/0;
       }catch (Throwable ex){
           System.out.println(ex);
       }
    }


    public static void unsupportedError(){
        List lis = Arrays.asList(1,2);
        List nums = lis;
        nums.add(3.4);


    }



    public void callException(){
        try{
            throw new Exe1();
        }catch (Exe0 exe0){
            System.out.println("exeo caught ");
        }catch (Exception ex){
            System.out.println("execeptio parent is holoding");
        }

    }


    public void wrapperExample(){

        Float aFloat = new Float("2.0");
        int x = aFloat.intValue();
        byte xbyte = aFloat.byteValue();
        double xdouble = aFloat.doubleValue();
        System.out.println(x+xbyte+xdouble);
    }


}

class A {
    public A() throws IOException {
        throw new IOException();
    }
}
class B extends  A{


    public B() throws IOException {
        System.out.println("b");
       /* try{
         //   super();

        }catch (IOException ioex){
            System.out.println("io exception thrown");
        }*/
    }
}

class Exe0 extends Exception{}
class Exe1 extends  Exe0{};




