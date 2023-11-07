package main.DSA.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    static int findMissingNumb(int nums[]){
        int rangeSum = 0;
        int arraySum  = 0;
        for (int i = 0; i <nums.length; i++) {
            arraySum+=nums[i];
            rangeSum+=i;
        }
        return rangeSum+nums.length - arraySum;
    }

    public static void main(String[] args) {
       /* List<Integer> list = Arrays.asList(40,9,30,2,1,3,8,11);
        int k = 3;
        minMax(list, k);
        int[] num = {1,2,-9,12,98,20,13,7,8,9};*/
        int arr[] = {1,3,5,4,7};
        lis(arr);

    }
    // Persistent system interview question
    static void minMax(List<Integer> arr, int k){
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.size() - k +1; i++) {
            for (int j = 0; j < k ; j++) {
                System.out.print(arr.get(j+i)+" , ");
                minVal = Math.min(arr.get(i + j), minVal);
            }
            System.out.println("minSofar --> "+ minVal);
            maxVal = Math.max(minVal, maxVal);
        }
        System.out.println("+++++++++ Result ++++++++++");
        System.out.println(maxVal);
    }

    static int lis(int[] nums){
            if(nums.length < 1)
                return -1;
            int lis[] = new int[nums.length];
            Arrays.fill(lis,1);
            int max = 1;
            for (int i = nums.length -1; i >= 0; i--) {
                for (int j = i+1; j < nums.length ; j++) {
                    if(nums[i] < nums[j]){
                        lis[i] = Math.max(1 + lis[j], lis[i]);
                    }
                }
                if(lis[i] > max){
                    max = lis[i];
                }
            }
            return max;
    }
}
