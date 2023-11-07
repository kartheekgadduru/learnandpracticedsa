package test.DSA.array;

import main.DSA.array.SubSetOfArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubSetOfArrayTest {
    @Test
    public void return_subsets_fromArray(){
        assertArrayEquals(SubSetOfArray.displayAllSubsets(new int[]{1}), new int[]{1});
    }
}
