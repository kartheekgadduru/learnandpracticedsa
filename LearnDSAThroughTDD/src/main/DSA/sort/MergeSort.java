package main.DSA.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MergeSort {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,-9,12,98,20,13,7,8,9);
       Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(ele -> ele, Collectors.counting()));
        //mergeSort(num);
    }

    static void mergeSort(int arr[]){
        int start = 0, end = arr.length , mid = start + (end - start)/2;
        printMergeSort(arr, start, end);

    }

    static  void printMergeSort(int[] arr, int start, int end) {
       if(start < end){
           int mid = start + (end -start)/2;
           printMergeSort(arr, start, mid);
           printMergeSort(arr, mid+1, end);
           mergeSortOfArray(arr, start, mid, end );
       }


    }

    // merging of two sub arrays to single sorted  array using recursion
    private static void mergeSortOfArray(int[] arr, int start, int mid, int end) {
        int i = start, j = mid+1, k = start;
        while (i <= mid && j <= end){
            if(arr[i] <= arr[j]){ //  first index of subarray of array and first
                k++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
