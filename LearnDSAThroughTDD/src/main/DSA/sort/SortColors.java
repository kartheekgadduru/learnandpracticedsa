package main.DSA.sort;

import java.util.List;

/*Given an array nums with n objects colored red, white, or blue,
 sort them in-place so that objects of the same color are adjacent,
 with the colors in the order red, white, and blue.
 We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/
public class SortColors {

    // Though it is sorted using O(n) times, we are using two loops
    //
    static int[] soringByCountSort(int colors[]){
        int zerosCount = 0, onceCount = 0, twosCount = 0;
        for (int i = 0; i < colors.length; i++) {

            if(colors[i] == 0){
                zerosCount++;
            }else if(colors[i] == 1){
                onceCount++;
            }else{
                twosCount++;
            }
        }
        for (int i = 0; i < colors.length; i++) {
            if(onceCount != 0){
                colors[i] = 0;
                onceCount--;
            }else if(onceCount != 0){
                colors[i] = 1;
            }else{
                colors[i] = 2;

            }
        }
        return colors;
    }

    // Solving using Dutch National flag Algorithm
    // which says need to used 3 pointers namely (low, middle) at sorting index, (high) at ending
    // Moving the mid pointer crossing high while do it
   /* Whenever I see 0, I swap it with element present at low position.
    When I get 1, I just let it be and when i encounter 2 I swap it with element at high position*/
    static int[] soringByDutchNathionalFlagAlgo(int colors[]){
        int low = 0, mid = 0, end = colors.length -1;
            while(mid <= end){
                if(colors[mid] == 0){
                    int temp = colors[low];
                    colors[low] = colors[mid];
                    colors[mid] = temp;
                    low++;
                    mid++;
                }else if(colors[mid] == 1){
                    mid++;
                }else{
                    int temp = colors[end];
                    colors[end] = colors[mid];
                    colors[mid] = temp;
                    end--;
                }
            }
        return colors;

    }


}
