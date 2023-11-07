package main.DSA.array;

public class MaxSumOfSubArray {
    public static int getMaxSumeByNaive(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i +1; j < arr.length; j++) {
                sum+=+arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }

    // O(n) time, Given an integer array nums,
    // find the contiguous subarray which has the largest sum and return its sum.
    // if current sum is > maxSum assign maxSum and check currentSum < zero;
    public static int getMaxSumByKadanesRule(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
            }
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    // this using dp way only using O(1) space
    public static int getMaxSumFromByDP(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
           currSum = Math.max(arr[i], arr[i] + currSum);
           if(currSum > maxSum){
               maxSum = currSum;
           }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] =  {-2,1,-3,4,-1,2,1,-5,4};
      /*  System.out.println(getMaxSumeByNaive(arr));*/
        System.out.println(getMaxSumFromByDP(arr));
    }
}
