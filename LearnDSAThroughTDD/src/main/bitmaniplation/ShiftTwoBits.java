package main.bitmaniplation;

import java.util.*;

public class ShiftTwoBits {
    public static void main(String[] args) {

       /*int[] num = {1,2,-9,12,98,20,13,7,8,9};
       int sum = 3;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            int diff = sum - num[i];
            if(set.contains(diff)){
                System.out.println(diff+ " "+num[i]);
            }else{
                set.add(num[i]);
            }
        }*/
        getMax(0, 0);

    }
    public static void update(){
        int allOnes = ~0;
        int num = 20;
        System.out.println("allOnes :: "+ allOnes);
        int j = 3;
        int left = allOnes << (j+1);
        int i = 1;
        System.out.println(left);
        int right = ((1 << 2) - 1);
        System.out.println("right :: "+ right);

        int mask = left | right;

        System.out.println("mask :: " + mask);

    }
    static int getMax(int a, int b){
      /*
      * Input: nums = [1,2,3], k = 3
Output: 2
* */
        int[] nums = {1,2,3};
        int count = 0;
        int k = 3;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == k){
                    count+=1;
                    break;
                }
            }
            System.out.println();
    }
        return a;
    }

}
