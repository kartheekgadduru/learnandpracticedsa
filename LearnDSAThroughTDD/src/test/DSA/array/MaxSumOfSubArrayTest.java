package test.DSA.array;

import main.DSA.array.MaxSumOfSubArray;
import org.junit.jupiter.api.Test;

import static main.DSA.array.MaxSumOfSubArray.getMaxSumeByNaive;
import static org.junit.jupiter.api.Assertions.assertEquals;


class MaxSumOfSubArrayTest {
    @Test
    public void test_max_sum_by_naiveway(){
        assertEquals(getMaxSumeByNaive(new int[]{1,2,3,4,5}), 15);
        assertEquals(getMaxSumeByNaive(new int[]{1,2,3,4}), 10);
        assertEquals(getMaxSumeByNaive(new int[]{1,2,-3,4}), 4);
        assertEquals(getMaxSumeByNaive(new int[]{1,2,-3,-4}), 3);
        assertEquals(getMaxSumeByNaive(new int[]{1, 3, 8, -2, 6, -8, 5}), 16);
        assertEquals(getMaxSumeByNaive(new int[]{-2,3,-1,2}), 4);
        assertEquals(getMaxSumeByNaive(new int[]{5,4,-1,7,8}), 23);
    }
    @Test
    public void test_max_sum_by_kadanesRule(){
        assertEquals(getMaxSumeByNaive(new int[]{1,2,3,4,5}), 15);
        assertEquals(getMaxSumeByNaive(new int[]{1,2,3,4}), 10);
        assertEquals(getMaxSumeByNaive(new int[]{1,2,-3,4}), 4);
        assertEquals(getMaxSumeByNaive(new int[]{1,2,-3,-4}), 3);
        assertEquals(getMaxSumeByNaive(new int[]{1, 3, 8, -2, 6, -8, 5}), 16);
        assertEquals(getMaxSumeByNaive(new int[]{-2,3,-1,2}), 4);
        assertEquals(getMaxSumeByNaive(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        assertEquals(getMaxSumeByNaive(new int[]{5,4,-1,7,8}), 23);
    }


}
