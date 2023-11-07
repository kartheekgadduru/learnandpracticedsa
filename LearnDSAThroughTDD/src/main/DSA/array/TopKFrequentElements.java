package main.DSA.array;


import java.util.HashMap;

/*Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]*/
public class TopKFrequentElements {
    /*Can be solved by applying bucket sort on given array
    * 1. we need to use hashmap to solve the problem (hashmap<integer, integer) List of list*/
        static int[] getKMostOccurred(int arr[], int k){
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int num : arr) {
                        map.put(num, map.getOrDefault(num, 0) + 1);
                }

         return new int[]{}; // need finish the solulation
        }

}
