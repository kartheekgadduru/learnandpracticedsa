package test.oops.polymorphism;


import main.oops.polymorphism.Child;
import main.oops.polymorphism.Parent;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PolymorphismTest {

@Test
public void doNotion(){
    Parent parent = new Child();
    parent.printNumb();
}
@Test
public void aaraysUtilsTest(){
    int[] num = {1,2,-9,12,98,20,13,7,8,9};
    Arrays.sort(num);
    for (Integer index :num) {
        System.out.println(index);
    }
}



}
