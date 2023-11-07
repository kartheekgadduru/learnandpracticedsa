package test.DSA.array;

import main.DSA.array.FindAllMissingNumbersInArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.DSA.array.FindAllMissingNumbersInArray.getMissingNumbers;
import static org.junit.jupiter.api.Assertions.*;

class FindAllMissingNumbersInArrayTest {
    @Test
    public void xyz(){
        assertArrayEquals(getMissingNumbers(new int[]{1,3,3,2}), new int[]{4});
        assertArrayEquals(getMissingNumbers(new int[]{1,3,3,1}), new int[]{4,3});
    }


}
