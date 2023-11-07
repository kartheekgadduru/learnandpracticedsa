package main.DSA.array;

import java.util.*;
import java.util.stream.Collectors;

public class LongestIncreasingSubsequence {
    private int i =1;
    public static void main(String[] args) {
        /*int[] arr = {17,18,5,4,6,1};
        initialmax(arr);*/

    }

    public int test(){
        int i =1;
        try{

        }finally {
            i =2;
        }
        return i;
    }
    static int majority(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int majorityElement = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> mapEntries : map.entrySet()){
            if(mapEntries.getValue() > length/3){
                list.add( mapEntries.getKey());
            }
        }
        return majorityElement;
    }

    static List<Integer> majorityElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> mapEntries : map.entrySet()){
            if(mapEntries.getValue() > length/3){
                list.add( mapEntries.getKey());
            }
        }
        return list;
    }

    static int minSubArrayLen(int target, int[] nums) {
        int minSubarrayLen = Integer.MAX_VALUE, left = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            while(sum >= target){
                minSubarrayLen = Math.min(minSubarrayLen, i - left +1);
                sum -= nums[left++]; // subtract so far some which is > target with left pointer Index
            }
        }
        return minSubarrayLen > nums.length ? 0 : minSubarrayLen;
    }

    static void initialmax(int arr[]){
        int lastIndexMax = -1;
        int newArray[] = new int[arr.length];
        for (int i = arr.length -1; i >= 0 ; i--) {
            newArray[i] = lastIndexMax;
            lastIndexMax = Math.max(arr[i], lastIndexMax);
        }
        for(int n : newArray){
            System.out.println(n);
        }
    }

    static int lengthOfLIS(int nums[]){
        int lis[] = new int[nums.length];
        Arrays.fill(lis, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j] && lis[i] < lis[j] +1){
                    lis[i] = 1 + lis[j];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lis.length; i++) {
            if(lis[i] > max){
                max = lis[i];
            }
        }
        return max;
    }
    /*
    * Increasing Triplet Subsequence
Russian Doll Envelopes
Maximum Length of Pair Chain
Number of Longest Increasing Subsequence
Minimum ASCII Delete Sum for Two Strings
Minimum Number of Removals to Make Mountain Array
Find the Longest Valid Obstacle Course at Each Position
Minimum Operations to Make the Array K-Increasing
    * */


}
