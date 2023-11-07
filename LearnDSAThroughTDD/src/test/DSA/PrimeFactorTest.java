package test.DSA;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {

    @Test
    public void getFactorsOfANumber(){
        assertEquals(getPrimeFactors(1), emptyList());
        assertEquals(getPrimeFactors(2), Arrays.asList(2));
        assertEquals(getPrimeFactors(3), Arrays.asList(3));
        assertEquals(getPrimeFactors(4), Arrays.asList(2,2));
        assertEquals(getPrimeFactors(5), Arrays.asList(5));
        assertEquals(getPrimeFactors(6), Arrays.asList(2,3));
        assertEquals(getPrimeFactors(7), Arrays.asList(7));
        assertEquals(getPrimeFactors(8), Arrays.asList(2,2,2));
        assertEquals(getPrimeFactors(9), Arrays.asList(3,3));
        assertEquals(getPrimeFactors(10), Arrays.asList(2,5));
        assertEquals(getPrimeFactors(3*17*11*2), Arrays.asList(2, 3, 11, 17));
        assertEquals(getPrimeFactors(3*15*21*22*19), Arrays.asList(2, 3,3, 3, 5, 7, 11, 19));
        assertEquals(getPrimeFactors(2*3*3*11*17*19*23), Arrays.asList(2, 3,3,11,17,19,23));

    }

    private List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        int reminder = number;
        int divisor = 2;

        while (reminder > 1 ){
            while(reminder % divisor  == 0){
                factors.add(divisor);
                reminder /= divisor;
            }
            divisor++;

        }
        return factors;

    }

}
