package test.DSA.sorting;

import main.DSA.sorting.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.DSA.sorting.MergeSort.getSortedArray;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void return_combined_sorted_array(){
        assertArrayEquals(getSortedArray(new int[]{2,4,5,7,9}, new int[]{3,4,6}), new int[]{2,3,4,4,5,6,7,9});
    }
    
}
