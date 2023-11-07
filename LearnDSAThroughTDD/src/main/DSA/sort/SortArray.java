package main.DSA.sort;

public class SortArray {

    public static void bubbleSort (int[] arr){
        //-2,5,3,10
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,-9,12,-98,120,13,7,8,9};
    }

    public static void  selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min_index]){
                    
                }

            }

        }
    }

}
