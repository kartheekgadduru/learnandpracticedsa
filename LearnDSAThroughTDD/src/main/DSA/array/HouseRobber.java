package main.DSA.array;

public class HouseRobber {
    /*dynamic with recursion calls*/
    static int getMaxProfit(int arr[], int n){
        if(n > arr.length -1){
            return 0;
        }
        int result = 0;
        result+=Math.max(arr[n]+getMaxProfit(arr, n+2), getMaxProfit(arr, n+1));
        return result;
    }

    static int getMaxProfitByIterative(int arr[]){
        int rob1 = 0, rob2 = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp =  Math.max(arr[i]+rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        getMaxProfitByIterative(arr);
    }

    static boolean isValidSquare(int num){
        int left = 1, right = num;
        while (left <= right){
            int mid = left + (right -left)/2;
            if(mid * mid > num ){
                right = mid -1;
            }else if (mid * mid < num){
                left = mid +1;
            }else{
                return true;
            }
        }
        return  false;
    }

    static int squrt(int num ){
        if(num <= 3){
            return 1;
        }
        int left = 4, right = num;

        while(left <= right){
            int  mid = left + (right - left)/2;
            if(mid * mid == num){
                return mid;
            }
            else if(mid * mid <= num && (mid + 1) * (mid + 1) > num){
                return mid;
            }else{
                right = mid-1;
            }

        }
        return -1;
    }

}
