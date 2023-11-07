package main.DSA.array.TwoD;

import static java.lang.Math.abs;
import static java.lang.Math.max;

public class IslandCount {
    static int numberOfIslandPresent(char[][] grid){

        int row = grid.length, col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == '1'){
                    count+=1;
                    searchForIslands(grid, i, j);
                }
                abs(10);
            }
        }
        return count;
    }


    public static void main(String[] args) {


    }


    private static void searchForIslands(char[][] grid, int row, int col) {
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0){
            return;
        }
        if(grid[row][col] == '1'){
            grid[row][col] = '0';
        }else{
            return;
        }
        searchForIslands(grid, row, col -1);
        searchForIslands(grid, row, col + 1);
        searchForIslands(grid, row -1, col );
        searchForIslands(grid, row +1, col );
    }

    public int kthSmallest(int[][] matrix, int k) {
        int row = (k / matrix.length) -1;
        int col = (k % matrix.length) -1;
        return matrix[row][col];
    }

}
