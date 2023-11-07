package test.DSA.BinarySearchUtils;

import main.DSA.binaryserach.BinarySearchUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BinarySearchUtilsTest {
    @Test
    public void findSmallestLargerCharOf_return_correctValue(){
        assertEquals(BinarySearchUtils.findSmallestLargerCharOf('a', new char []{'c','i','j'}), 'c' );
        assertEquals(BinarySearchUtils.findSmallestLargerCharOf('c', new char []{'c','f','j'}), 'f' );
        assertEquals(BinarySearchUtils.findSmallestLargerCharOf('g', new char []{'c','i','j'}), 'i' );
        assertEquals(BinarySearchUtils.findSmallestLargerCharOf('i', new char []{'c','e','f','i','k'}), 'k' );
    }


}
