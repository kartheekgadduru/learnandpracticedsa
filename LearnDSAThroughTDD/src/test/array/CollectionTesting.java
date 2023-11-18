package test.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class CollectionTesting {
    @Test
    public void characterCount(){
        String s = "Kartheek";
        Comparator<Character> ch = (a, b) -> a.compareTo(b);
        Arrays.asList(s.toCharArray()).stream().limit(5).forEach(System.out::println);
    }
    @Test
    public void nothing(){
        List<Character>[] buckets = new List[10];
        for (int i = 0; i < 10; i++) {

        }

    }

    @Test
    public void minheap(){
        int[] num = {1,2,-9,12,98,20,13,7,8,9};
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b -a);
        for (Integer n : num) {
            pq.add(n);
        }
      //  pq.poll();
        System.out.println(pq.peek());

    }




}
