package main.DSA.slidingwindow;

public class ContainerWithMostWater {
    static int findMostArea(int arr[]){
        int left = 0, right = arr.length -1;
        int result = Integer.MIN_VALUE;

        while(left < right){
            int area = (right -left) * Math.min(arr[left], arr[right]);
            result = Math.max(result, area);
            if(arr[left] < arr[right]){
                left+=1;
            }else{
                right-=1;
            }
        }
        return result;
    }
}
