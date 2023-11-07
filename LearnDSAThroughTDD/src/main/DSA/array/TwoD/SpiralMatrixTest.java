package main.DSA.array.TwoD;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static main.DSA.array.TwoD.SpiralMatrix.getListBySpiralOf;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SpiralMatrixTest {
    @Test
    public void nothing(){
        assertEquals(getListBySpiralOf(new int[][] {{}}), new ArrayList<Integer>());
        ArrayList<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        assertEquals(getListBySpiralOf(new int[][] {{1,2}}), actual);
    }

    @Test
    public void twoDArray(){
        int[][] arr = {{1,2,3,4,5,6}};
        System.out.println(arr[0]);
        System.out.println(arr.length);
    }

    

}
