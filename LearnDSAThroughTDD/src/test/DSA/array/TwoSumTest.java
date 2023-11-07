package test.DSA.array;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static main.DSA.array.TwoSum.getListOfAllTwoSums;
import static main.DSA.array.TwoSum.getTwoSumByHashMap;
import static main.DSA.array.TwoSum.getTwoSumByNaiveway;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void test_twoSum_By_naiveway(){
        assertArrayEquals(getTwoSumByNaiveway(new int [] {2,7,11,15}, 9), new int[]{0,1} );
        assertArrayEquals(getTwoSumByNaiveway(new int [] {2,7,11,15}, 3), new int[]{-1,-1} );
        assertArrayEquals(getTwoSumByNaiveway(new int [] {3,2,4}, 6), new int[]{1,2} );
    }
    @Test
    public void test_twoSum_By_hashMap(){
        assertArrayEquals(getTwoSumByHashMap(new int [] {2,7,11,15}, 9), new int[]{0,1} );
        assertArrayEquals(getTwoSumByHashMap(new int [] {2,7,11,15}, 3), new int[]{-1,-1} );
        assertArrayEquals(getTwoSumByHashMap(new int [] {3,2,4}, 6), new int[]{1,2} );
    }

    @Test
    public void test_should_reurn_listOF_All_twoSum(){
        List<List<Integer>> actualList = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        num.add(0);
        num.add(1);
        actualList.add(num);

        assertEquals(getTwoSumByHashMap(new int [] {2,7,11,15}, 9).toString(),  actualList.toString());
       /* assertArrayEquals(getTwoSumByHashMap(new int [] {3,2,4}, 6), new int[]{1,2} );
        System.out.println(getListOfAllTwoSums(new int[]{2,7,11,15,20}, 9));*/

    }

    public void m1(){

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            if(i % 2 == 0){
                even.add(i);
            }else{
                odd.add(i);
            }
        }
        list.add(even);
        list.add(odd);
        System.out.println(list);
    }


}
