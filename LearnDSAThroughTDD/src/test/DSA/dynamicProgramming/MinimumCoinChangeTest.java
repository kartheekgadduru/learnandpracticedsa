package test.DSA.dynamicProgramming;

import main.DSA.dynamicProgramming.MinimumCoinChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCoinChangeTest {
    @Test
    public void get_fewestCoins_countBy_recursion(){
        Assertions.assertEquals(MinimumCoinChange.getMinCountCount(new int[]{2,3,4}, 3),1);

    }


}
