package main.DSA.slidingwindow;

public class LongestSubarrayWith1sByDeleting1zero {

    public int longestSubArray(int[] nums){
        int left = 0, right = 0, count =0, result = 0;
        for (right = 0; right < nums.length; right++){
            count+= nums[right] == 0 ? 1:0;
            while(count > 1){
                count -= nums[left++] ==0 ?1:0;
            }
            result = Math.max(result, right - left); // we need to delete one 0 zero from problem
        }
        return result;
    }
}
