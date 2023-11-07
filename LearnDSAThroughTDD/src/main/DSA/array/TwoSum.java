package main.DSA.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static int[] getTwoSumByNaiveway(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Save ith index and value in array in hashMap if diff not contains in
    public static int[] getTwoSumByHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // [2,7,11,15], k = 9, --> 2, 7,
        for (int i = 0; i < arr.length; i++) {
           int diff =  target - arr[i];
           if(map.containsKey(diff)){
               return new int[]{map.get(diff), i};
           }else{
               map.put(arr[i], i);
           }
        }
        return new int[]{-1,-1};
    }

    /*Two Sum II - Input Array Is Sorted
    * apply binary search as on target
    * */
    static int[] getTwoSumFrom(int[] sortedArr, int target){
        int start = 0;
        int end = sortedArr.length -1;
        while(start < end){
            int sum = sortedArr[start] + sortedArr[end];
            if(sum == target){
                return new int[]{start, end};
            }else if(sum < target){
                start ++;
            }else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }

    public static List<List<Integer>> getListOfAllTwoSums(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> outerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int diff =  target - arr[i];
            if(map.containsKey(diff)){
                List<Integer> list = new ArrayList<>();
                list.add(map.get(diff));
                list.add(i);
                outerList.add(list);
            }else{
                map.put(arr[i], i);
            }
        }
        return outerList;
    }
}
