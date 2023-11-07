package main.DSA.binaryserach;

public class BinarySearchUtils {
    public static int findCeilOf(int target, int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int ceil = -1;
        while(start <= end){
            int mid = (start +end)/2;
            if(arr[mid] >= target){
                ceil = arr[mid];
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return ceil;
    }

    //  Return index/number
    public static int findFloorAt(int target, int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int floor = -1;
        while(start <= end){
            int mid = (start +end)/2;
            if(arr[mid] <= target){
                floor = arr[mid];
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        findMin(nums);
    }

    public static char findSmallestLargerCharOf(char target, char[] arr){
        int start = 0;
        int end = arr.length -1;
        char largeChar = Character.MAX_VALUE;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] > target){
                end=mid-1;
                largeChar = arr[mid];
            }else {
                start=mid+1;
            }
        }
        return largeChar;
    }
    static int getTargetIndex(int arr[], int target){
        int start = 0, end = arr.length -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    static int findPeakIndexInMountainArray(int arr[]){
        int start = 0, end = arr.length -1;
        while (start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid+1]){ // value in right of mid is less which means mid might be our answer
                end = mid;
            }else{
                start = mid +1;
            }
        }
        /*after all execution of while both end and start will become same*/
        return start;
    }
    /*
    * Find a Peak Element II
Pour Water Between Buckets to Make Water Levels Equal
Count Hills and Valleys in an Array*/

   /* static int[] peakGrid(int grid[][]){

    }*/

    public int findInMountainArray(int target, MountainArray mountainArr) {
            int start = mountainArr.get(0), end = mountainArr.get(mountainArr.length()/2);
            int minTarget = getIndexOfTarget(target,mountainArr, start , end);
            if(minTarget < 0 ){
                return getIndexOfTarget(target, mountainArr, end +1 , mountainArr.length() -1);
            }else{
                return minTarget;
            }
    }

    private int getIndexOfTarget(int target, MountainArray mountainArr, int start, int end) {
        while (start < end){
            int mid = start + (end -start)/2;
            if(mountainArr.get(mid) > target){ // value in right of mid is less which means mid might be our answer
                end = mid;
            }else if(mountainArr.get(mid) < target){
                start = mid +1;
            }else{
                return mid;
        }
        /*after all execution of while both end and start will become same*/
    }
        return -1;
    }
    static int findMin(int[] nums) {
        int s = 0, e = nums.length -1;
        while(s < e){
            int mid = s + (e -s)/2;
            if(nums[mid] > nums[s]){
                s = mid +1;
            }else{
                e = mid;
            }
        }
        System.out.println(nums[e]);
        return nums[s];
    }
}

interface MountainArray {
    public int get(int index);
    public int length();
}
