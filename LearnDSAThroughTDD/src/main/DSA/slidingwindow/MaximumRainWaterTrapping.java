package main.DSA.slidingwindow;

public class MaximumRainWaterTrapping {
    /*use two pointers one at zero, other at last index of array
    * along with two values which maxHeight from left, right so far
    * */
    static int maxWaterCanBeSaved(int height[]){
        int leftPtr = 0, rightPtr = height.length -1, leftMax = height[leftPtr], rightMax = height[rightPtr];
        int result = 0;
        while (leftPtr < rightPtr){
            if(leftMax < rightMax){
                leftPtr+=1;
                leftMax = Math.max(leftMax, height[leftPtr]);
                result+= leftMax - height[leftPtr];

            }else {
                rightPtr-=1;
                rightMax = Math.max(rightMax, height[rightPtr]);
                result+= rightMax - height[rightPtr];
            }
        }
        return result;

    }
}
