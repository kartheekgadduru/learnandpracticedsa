package main.DSA.binaryserach;

public class FindFirstAndLastPosition {

    //1.  Find Position of an element in a sorted array of size infinite
    //2. Find Peak index on a mountain array ex: [1,2,3,4,5,16,17,18,9,3,2] --> 6
    //3. Search in mountain of an array (Hint :- 1. find peak index, 2. do binary search on first array starts(0, peak index)
    //  3. if not found do binary search from (peakIndex+1, end)
    //4. Find the index of target after rotating sorted array by K times
    // 5. Find the Rotation count in a Rotated Sorted array
    // 6. Split Array Largest Sum { i/p : [7,2,5,10,8], m = 2 | O/P : 18 (can be solved by applying BS min sum of full array and max value of element in array

    static int getIndexOf(int target, int[] infiniteArray){
        int start = 0;
        int end = 1;
        int len = 0;
            while(target > infiniteArray[end]){
                len =  end + (end - start + 1) * 2;
                start = end +1;
                end = len;
            }
        return binarySearchOf(target, infiniteArray, start,end);
    }

    private static int binarySearchOf(int target, int[] infiniteArray, int start, int end) {
        while (start <= end ){
            int mid = (start + end )/2;
            if(target > infiniteArray[mid]){
                start = mid +1;
            }else if (target < infiniteArray[mid]){
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }


}
