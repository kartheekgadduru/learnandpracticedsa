package main.DSA.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

import static java.lang.Math.abs;

public class ContainsDuplicates {
    static boolean doesHaveDuplicates(int arr[]) {
        if (arr.length < 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return false;
            } else {
                set.add(arr[i]);
            }
        }
        return true;
    }

    /* Given an integer array nums and an integer k,
     * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
     * */
    static boolean hasDuplicateIndecesDiff(int arr[], int k) {
        if (arr.length < 1) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && abs(map.get(arr[i]) - i) <= k) {
                {
                    return true;
                }
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }

    /* Given an integer array nums and two integers k and t,
     * return true if there are two distinct indices i and j in the array such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.
     * */
    static boolean containsDuplicatesIII(int arr[], int t, int k) {

            if (arr.length < 1) {
                return false;
            }
            for (int i = 0; i < arr.length -1; i++) {
                for (int j = i + 1; j < arr.length ; j++) {
                    if(absValue(arr[i] , arr[j]) <= t && abs(i -j) <= k){
                        return true;
                    }
                }

            }
            return false;
        }


        static int absValue(int left, int right){
            return abs(abs(left) - abs(right)) ;
        }

    public static void main(String[] args) {
      /*int arr[] = {-2147483648,2147483647};
        System.out.println(containsDuplicatesIII(arr,1,1));*/

        int arr[] = {1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr));
    }

    // This method is failing for input = int arr[] = {1,3,7,11,12,14,18};
    static int lenLongestFibSubseq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++){
            map.put(arr[i], i);
        }
        int defaultCount = 2;
        int first = 0, second = 1;
        for(int i = 2; i < arr.length; i++){
            int sum = arr[first] + arr[second];
            if(map.containsKey(sum)){
                defaultCount +=1;
                int temp = second;
                second = i;
                first = temp;
            }
        }

        return defaultCount == 2 ? -1: defaultCount;

    }
}

