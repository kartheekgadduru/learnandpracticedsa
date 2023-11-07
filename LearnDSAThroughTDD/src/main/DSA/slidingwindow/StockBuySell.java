package main.DSA.slidingwindow;

public class StockBuySell {

    // This naive way using O(n2) time
    static int getMaxProfit(int arr[]){
        if(arr.length < 2){
            return 0;
        }
        int globalMaxProfit = 0;
        for (int i = 0; i < arr.length -1; i++) {
            int currentMaxProfit = 0;
            for (int j = i + 1; j < arr.length; j++) {
                currentMaxProfit = arr[j] - arr[i];
                globalMaxProfit = Math.max(globalMaxProfit, currentMaxProfit);
            }
        }
        return globalMaxProfit;
    }
    // Using two pointers left, right
    static int getMaxProfitByTwoPointers(int prices[]){
        int left = 0, right = 1;
        int maxProfit = 0;
        while(right < prices.length){
            int dayProfit = prices[right] - prices[left];
            if(dayProfit <= 0){
                left=right;
                // left ++ has bug and fails for some reason
            }else{
                maxProfit = Math.max(maxProfit, dayProfit);
            }
            right++;
        }
        return maxProfit;
    }
    //https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
    static int maxProfitByMultipleBuySell(int prices[]){
        int left = 0, right = 1;
        int maxProfit = 0;
        while(right < prices.length){
            int localProfitOrLoss = prices[right] - prices[left];
            if(localProfitOrLoss <= 0){
                left = right;
            }else{
                maxProfit+=localProfitOrLoss;
                left=right;
            }
            right ++;
        }
      return maxProfit;
    }

  //  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/

    public static void main(String[] args) {
        int arr[] = {1,2,4,2,5,7,2,4,9,0,9};
        /*System.out.println(getMaxProfit(arr));
        System.out.println(getMaxProfitByTwoPointers(arr));*/
        System.out.println(maxProfitByMultipleBuySell(arr));

    }

    /*https://leetcode.com/problems/maximum-difference-between-increasing-elements/submissions/*/
    static int maxDiff(int[] arr){
        int left = 0, right = 1;
        int ans = 0;
        while (right < arr.length){
            if(right > left && arr[right] > arr[left]){
                ans = Math.max(ans, Math.abs(arr[right] - arr[left]));
            }else{
                left = right;
            }
            right++;
        }
        return ans != 0 ? ans : -1;
    }
}
