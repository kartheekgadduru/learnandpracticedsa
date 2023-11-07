package test.bank;

import main.bank.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void test_Equals_method(){
        Employee income = new Employee( "INR", 12);
        Employee expense = new Employee( "INR", 12);
        System.out.println(income.equals(expense));
    }
    @Test
    public void hashMap_using_stream(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,4);
        map.put(3,9);
        map.put(9,81);
     List<String> list = map.entrySet().stream().map(ele -> ele.getValue()+" --> "+ele.getKey()).collect(Collectors.toList());
        System.out.println("list ::: "+ list);
    }

    @Test
    public void custom_sorting_order(){

        List<Employee> empList = Arrays.asList(new Employee("INR", 12),new Employee("EUROS", 12), new Employee("AUD", 50), new Employee("KR", 500));
        Collections.sort(empList, Comparator.comparing(e -> e.name));
        for (Employee e : empList) {
            System.out.println(e.name);
        }
    }
    @Test
    public void getPair_testing(){
        System.out.println(getPair(new int[]{1, 2, -9, 12, 98, 20, 13, 7, 8, 9}, 20));
        assertEquals(getPair(new int[]{1, 2, -9, 12, 98, 20, 13, 7, 8, 9}, 20), new int[] {13,7});
    }
    @Test
    public void getDuplicates(){
        List<Integer> list = Arrays.asList(1,2,11,21,11,3,2,7,12);
       list.stream().filter(ele -> Collections.frequency(list, ele) > 1).collect(Collectors.toSet()).forEach(System.out::println);
    }



    public static int[]  getPair(int[] arr, int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j] == sum){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{-1};
    }
}
