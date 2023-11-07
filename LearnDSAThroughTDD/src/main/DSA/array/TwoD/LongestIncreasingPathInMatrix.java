package main.DSA.array.TwoD;

import static java.lang.Math.max;

public class LongestIncreasingPathInMatrix {
    static void getMaxPathLength(int[][] matrix){
        int[][] dp = new int[matrix.length -1][matrix[0].length -1];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
              dp[row][col] =  doDFS(matrix, row, col);
            }

        }
    }

    static int doDFS(int[][] matrix, int row, int col) {
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length ){
            return 0;
        }
        int currentVal = matrix[row][col];
        if(currentVal >= matrix[row][col -1] || currentVal >= matrix[row][col -1] || currentVal >= matrix[row -1][col] || currentVal >= matrix[row+1][col]){
            return 0;
        }
        int res = 1;
        res = max(res, 1 + doDFS(matrix, row + 1, col));
        res = max(res, 1 + doDFS(matrix, row - 1, col));
        res = max(res, 1 + doDFS(matrix, row  , col + 1));
        res = max(res, 1 + doDFS(matrix, row  , col - 1));

        return res;

    }
}
