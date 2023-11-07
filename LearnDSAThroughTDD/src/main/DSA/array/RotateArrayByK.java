package main.DSA.array;

public class RotateArrayByK {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7}, k = 3;
        rotate(nums, k);
    }
    // https://leetcode.com/problems/rotate-list/
    static void rotate(int[] nums, int k) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[k % nums.length] = nums[i];
            k++;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }
    }

}
