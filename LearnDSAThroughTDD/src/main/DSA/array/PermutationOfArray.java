package main.DSA.array;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    public static List<List<Integer>> getAllPermutation(int[] arr) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == 0) return lists;
        list.add(arr[0]);
        lists.add(list);
        return lists;
    }
    /*Input: nums = [1,2,3]
    Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]*/
}
