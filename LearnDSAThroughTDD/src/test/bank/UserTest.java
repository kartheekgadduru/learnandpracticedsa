package test.bank;

import main.bank.Address;
import main.bank.User;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    @Test
    public void shallowCloneTest(){
        Address address = new Address("frisgatan", "Malmo", "Sweden");
        User director = new User("president", "swess", address);
        User shallowUser = new User(director.getFirstName(), director.getFirstName(), director.getAddress());
        assertNotEquals(shallowUser, director); // even though these two objects not equal but change
                                            // in director will change other details
    }
    @Test
    public void userTest(){
       String s = "abbaca";
       int indices[] = {4,5,6,7,0,2,1,3};

        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread() {
            @Override
            public void run() {
                String s = getString("kartheek");
                System.out.println(Thread.currentThread().getName());
                System.out.println(s);
            }
        };
        thread.start(); //
        System.out.println(getString("tuna")); //


    }

    private synchronized  String getString(String s) {
        char ch[] = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
       return new String(ch);
    }

    private void reverseColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                int temp = matrix[j][i];
                matrix[i][j] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }

    private void transposeAMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
            int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r > 1)
            return mat;
        int newMatrix[] = new int[r * c];
        int k = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; i++){
                newMatrix[k++] = mat[i][j];
            }
        }
        return new int[][]{newMatrix};

    }
    public String  removeAllVowels(String str){
       return str.replaceAll("[aeiouAEIOU]", "");
    }



    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public int[] findOnceInEachTermOf(int number){
        int[] numOnce = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            if(i % 2 == 0){
                int temp = i / 2;
                numOnce[i] = numOnce[temp];
            }else{
                numOnce[i] = numOnce[i -1] + 1;
            }
        }
        return numOnce;
    }




@Test
public void distinctList(){
     int[] num = {1,2,-9,12,98,20,13,7,8,9};
    PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b -a);
    for (int i = 0; i < num.length; i++) {
        pq.add(num[i]);
    }
    int k = 4;
    for (int i = 0; i < k-1; i++) {
        pq.poll();
    }
    System.out.println(pq.peek());
}

}
