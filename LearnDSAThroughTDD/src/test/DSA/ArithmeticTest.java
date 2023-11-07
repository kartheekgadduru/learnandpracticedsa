package test.DSA;


import main.DSA.Arithmetic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArithmeticTest {
    Arithmetic subject;

    @BeforeEach
    public  void setUP(){
        subject = new Arithmetic();
    }

    @Test
    public void return_null_if_arguments_zero(){
        Assertions.assertNull(subject.add(0,0));
    }
    @Test
    public void return_sum_if_arguments_not_zero(){
        assertEquals(20, subject.add(10,10) );
        assertEquals(1, subject.add(1,0));
        assertEquals( 11, subject.add(0,11));
    }


    @ParameterizedTest
    @ValueSource(ints = {11,113,1,3, Integer.MAX_VALUE})
    public void return_true_forAll_nonNegative_oddNumbers(int number){
        Assertions.assertTrue(subject.isOdd(number));

    }

}









