package main.DSA.array;

import java.io.Externalizable;
import java.util.HashMap;
import java.util.Hashtable;

public class CanJumpProblem {
    public static void main(String[] args) {
        /*int arr[] = {2,3,1,1,4};
        canJump(arr);*/
      //  divide(-2147483648, -1);
        System.out.println(Math.abs(0.44528));
       myPow(2.0000, -2);

    }
    static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Hashtable<Object, Object> hash = new Hashtable<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result+=map.get(s.charAt(i));
        }
        return result;

    }
    static double myPow(double x, int n) {
        if(n == 0){
            return x;
        }
        double result = 1.0000;
        for(int i = 1; i <= Math.abs(n) ; i++){
            if(n < 0){
                result = result * (1/x);
            }else{
                result = result * x;
            }

        }
        return result;

    }
    static  int divide(int dividend, int divisor) {
        int result = 0;

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if(dividend == divisor){
            result+=1;
        }
        while(dividend > divisor){
            result +=1;
            dividend-=divisor;
        }
        return sign == -1 ? -result : result;

    }
    static boolean canJump(int[] nums) {
        int curr = 0; //current idx
        int last =0; //last idx
        for(int i=0;i<nums.length ;i++ ){
            last = Math.max(last, i+nums[i] );

            if(i== curr){
                curr = last;
            }
        }

        if(curr >=nums.length-1 ) return true;
        else return false;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

     int row = obstacleGrid.length, col = obstacleGrid[0].length;
     if(obstacleGrid[0][0] == 1 || obstacleGrid[row -1][col - 1] == 1)
         return 0;

     return fun(obstacleGrid, row -1, col) + fun(obstacleGrid, row, col -1);
    }
/* @todo need finish this coding problem*/
    private int fun(int[][] obstacleGrid, int row, int col) {
        return -1;

    }
}
