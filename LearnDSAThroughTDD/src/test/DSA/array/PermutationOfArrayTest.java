package test.DSA.array;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.DSA.array.PermutationOfArray.getAllPermutation;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationOfArrayTest {
    List<List<Integer>> lists;
    @BeforeEach
    public void setUp(){
       lists = new ArrayList<List<Integer>>();
    }

    @Test
    public void Nothing(){
        assertEquals(getAllPermutation(new int[]{}), lists);
    }

    @Test
    public void array_With_oneElement(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        assertEquals(getAllPermutation(new int[]{1}), lists);
    }
    @Test
    public void array_With_twoElement(){
        List<Integer> list = new ArrayList<>();
        int[] arr = {1, 2};
        for (int i = 0; i < arr.length; i++) {

            list.add(arr[arr[i]]);
            list.add(2);
            lists.add(list);
        }
        assertEquals(getAllPermutation(new int[]{1,2}), lists);
    }


}
