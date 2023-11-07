package test.DSA.dynamicProgramming;

import main.DSA.dynamicProgramming.LCS;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCSTest {

    @Test
    public void m1(){
        LCS lcs = new LCS();
        assertEquals(lcs.getLcs("app", "supp", 3,4), 2);
        assertEquals(lcs.getLcs("tuna", "vuna", 4,4), 3);
        assertEquals(lcs.getLCSByIteration("tuna", "vuna", 4,4), 3);
    }


}
