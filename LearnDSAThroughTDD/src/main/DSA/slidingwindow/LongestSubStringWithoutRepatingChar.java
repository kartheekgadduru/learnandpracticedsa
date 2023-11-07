package main.DSA.slidingwindow;

import java.util.HashSet;

public class LongestSubStringWithoutRepatingChar {
    static int getLength(String str){
        int left = 0, result = 0; // take a left pointer used to sliding pointer
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < str.length(); right++) {
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left+=1;
            }
            set.add(str.charAt(right));
            result = Math.max(result, right - left +1);
        }
        return result > 0 ? result  : -1;
    }

    // https://leetcode.com/problems/maximum-erasure-value/
    /*          Input: nums = [4,2,4,5,6]
                 Output: 17
                Explanation: The optimal subarray here is [2,4,5,6].
     */
    static int getSum(int arr[]){
        int left = 0, sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            while(set.contains(arr[i])){
                set.remove(arr[left]);
                sum-=arr[left];
            }
            set.add(arr[i]);
            sum+=arr[i];
        }
        return sum;
    }
}
