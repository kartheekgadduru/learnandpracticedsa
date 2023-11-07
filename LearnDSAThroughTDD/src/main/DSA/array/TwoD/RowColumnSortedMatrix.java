package main.DSA.array.TwoD;

public class RowColumnSortedMatrix {

    public int[]  getTargetIndexElements(int[][] matrix, int target){
        int row = 0, col = matrix[0].length -1;
        while (row < matrix.length && col >=0){
            if(matrix[row][col] == target){
                return new int[]{row, col};
            }else if(target > matrix[row][col]){
                row++;
            }else{
                col--;
            }
        }

    return new int[]{-1,-1};
    }


}
