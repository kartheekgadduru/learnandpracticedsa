package main.DSA.array;

public class ProductArrayExceptItself {
    /*  O(n2) times*/
    static int[] arrayProductExceptSelf(int arr[]){
            if(arr.length < 2)
                return new int[]{};
        int[] results = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int currentProduct = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    currentProduct*=arr[j];
                }
            }
            results[i] = currentProduct;
        }
        return results;
    }
    static int[] arrayProductWithoutSelf(int arr[]){
        if(arr.length < 1){
            return new int[]{1};
        }
        int[] results = new int[arr.length];
        int prefixSoFar = 1; // put all results in current index from start with prefixsofor and update prefixsofar
        int postfixSoFar = 1; // update results from end with postfixsofar and update postfixsofar
        for (int i = 0; i < arr.length; i++) {
            results[i] = prefixSoFar;
            prefixSoFar = arr[i] * prefixSoFar;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            results[i] = results[i] * postfixSoFar;
            postfixSoFar = arr[i] * postfixSoFar;
        }
        return results;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        arrayProductWithoutSelf(arr);
    }
}
