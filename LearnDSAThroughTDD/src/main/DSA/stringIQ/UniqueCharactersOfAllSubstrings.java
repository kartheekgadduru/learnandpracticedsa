package main.DSA.stringIQ;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueCharactersOfAllSubstrings {

    public static void main(String[] args) throws InterruptedException  {
        /*String str = "ABC";
        *//*https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/*//*
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                System.out.print(str.substring(i, j+1)+" -> ");
            }
            System.out.println();
        }*/
        Counter counter = new Counter();
        Thread first = new Thread(counter, "First");
        Thread second = new Thread(counter, "Second");
        second.setPriority(9);
        first.start();
        second.start();

        first.join();
        second.join();

        System.out.println(counter.count);

       /* String str = "I am kartheek";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
            }
        }
        Map<Character, Integer> filteredMap = map.entrySet()
                .stream()
                .filter(ele -> ele.getValue() >  2)
                .collect(Collectors.toMap(Map.Entry :: getKey, b -> b.getValue()));*/
    }

}
class Counter extends Thread{
    int count = 0;
    int max = 1_000_00_000;
    @Override
    public void run() {
        Thread.yield();
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
