package main.DSA.array;

import java.util.HashMap;

public class ThreeSumInArray {
    static int threeSum(int arr[], int target){
        // we need to use hashset and 1lp with current_sum = x-lp[1]
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                int sum = target - (arr[i] + arr[j]);
                if(map.containsKey(sum)){
                    System.out.print(map.get(sum) + " ");
                    System.out.print(map.get(arr[i])+ " ");
                    System.out.println(map.get(arr[j]));
                }else{
                   map.put(arr[j], j);
                }
            }
            map.put(arr[i], i);
        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        int nums[] = {12, 3, 4, 1, 6, 9}; //0,1,5
        int target = 24;
        threeSum(nums, target);

    }
}
