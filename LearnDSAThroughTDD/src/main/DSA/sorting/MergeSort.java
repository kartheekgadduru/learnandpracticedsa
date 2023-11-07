package main.DSA.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

public class MergeSort {
    public  int[] mergeSort(int arr[], int left, int right){
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid );
            mergeSort(arr, mid+1, right );
            sortTwoArrays(arr, left, mid, right);
        }
        return new int[]{-1};
    }

    private static void sortTwoArrays(int[] arr, int left, int mid, int right) {
        while(left < mid && mid < right){
            if(arr[left] > arr[mid]){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid++] = temp;

            }else{
                left++;
            }
        }
    }

    /*Input:
        nums1 = [1,2,3,0,0,0], m = 3
        nums2 = [2,5,6],       n = 3

        Output: [1,2,2,3,5,6]
    */
    public static int[] getSortedArray(int[] arr1, int[] arr2){
        int ptr1 = 0;
        int ptr2 = 0;
        int k = 0;
        int[] mergeSortedArr = new int[arr1.length + arr2.length];
        while(ptr1 < arr1.length && ptr2 < arr2.length){
            if(arr1[ptr1] < arr2[ptr2]){
                mergeSortedArr[k++] = arr1[ptr1++];
            }else{
                mergeSortedArr[k++] = arr2[ptr2++];
            }
        }
        while(ptr1 < arr1.length){
            mergeSortedArr[k++] = arr1[ptr1++];
        }
        while (ptr2 < arr2.length){
            mergeSortedArr[k++] = arr2[ptr2++];
        }
        return mergeSortedArr;
    }

    /* int arr1[] =  {4,5,6,0,0,0}, m = 3, n = 3, arr2[] = {1, 2, 3};*/
    static void merge(int[] arr1, int m, int[] arr2, int n) {
        int ptr1 = m-1, ptr2 = n-1, k = m+n -1;
        while(ptr1 >= 0 && ptr2 >= 0){
            if(arr1[ptr1] < arr2[ptr2]){
                arr1[k--] = arr2[ptr2--];
            }else{
                arr1[k--] = arr1[ptr1--];
            }
        }
        while(ptr2 >= 0){
            arr1[k--] = arr2[ptr2--];
        }
    }
}
