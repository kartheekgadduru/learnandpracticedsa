package main.DSA.slidingwindow;
//https://leetcode.com/problems/continuous-subarray-sum/
public class MaxSubArraySumOfKelements {

    /*O(K * N) times
    * */
    static int maxSumByNaiveWay(int arr[], int k){
        int maxSum = 0;
        for (int i = 0; i < arr.length - k +1; i++) {
            int localSum = 0;
            for (int j = i; j < k +i; j++) {
                localSum+=arr[j];
            }
            maxSum = Math.max(localSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,-4,5,-2,3,1};
        int k = 2;
       /* System.out.println(maxSumByNaiveWay(arr, k));
        System.out.println(maxSumBySlidingWindow(arr, k));*/
        String str = "eccer";
        for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0,i-1)+str.substring(i));

        }
    }

    static int maxSumBySlidingWindow(int arr[], int k){
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        maxSum = sum;
        for (int i = k; i < arr.length - k +1; i++) {
            sum = sum - arr[i - k] + arr[k + (i - k)];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;



    }

}
