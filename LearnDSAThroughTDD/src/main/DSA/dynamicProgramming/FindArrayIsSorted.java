package main.DSA.dynamicProgramming;

public class FindArrayIsSorted {
    // time complexity is O(n2)
    public static boolean isArraySorted(int[] arr){
        if(arr.length <= 1)
            return true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(!(arr[i] <= arr[j])){
                    return false;
                }
            }
        }
        return true;
    }
    // time complexity is O(n)
    public static boolean isSorted(int[] arr){
        if(arr.length <= 1)
            return true;
        for (int i = 0; i < arr.length; i++) {
            int next = i +1;
                if(next < arr.length && !(arr[i] <= arr[next]) ){
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {
   /*     System.out.println(isArraySorted(new int[]{1,1,1,1}));
        System.out.println(isArraySorted(new int[]{1,1,11,3}));*/
        System.out.println(isSorted(new int[]{1,1,1,1}));
        System.out.println(isSorted(new int[]{1,1,11,3}));
    }

}
