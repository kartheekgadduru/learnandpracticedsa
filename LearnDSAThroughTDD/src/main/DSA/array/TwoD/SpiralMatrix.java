package main.DSA.array.TwoD;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> getListBySpiralOf(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        return list;
    }
    public static void print2DArray(int[][] arr, int row, int column){
        int k = 0;
        int l = 0;
        int lastCol = column - 1;
        int lastRow = row - 1;
        while(k <= lastRow && l <= lastCol){
            for (int i = 0; i < column; i++) {
                System.out.print(arr[k][i]+" ");
            }
            k++;
            for (int i = k; i < lastRow; i++) {
                System.out.println(arr[i][lastCol] + " ");
            }
            lastCol--;
            if(k <= lastRow){
                for (int i = lastCol; i >= l ; i--) {
                    System.out.println(arr[lastRow][i]);
                }
                lastRow--;
            }
            if(l <= lastCol){
                for (int i = lastRow; i >= k ; i--) {
                    System.out.println(arr[lastRow]);
                }
                l++;
            }

        }
    }

    public static void main(String[] args) {
        /*print2DArray(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});*/
    }
}
