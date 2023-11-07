package main.DSA.array.TwoD;

public class TwoDArraySearchForIncreaseNumbers {
    static boolean isTargetExist(int[][]matrix, int target){
        int rowStart = 0, col = matrix[0].length;
        while(rowStart < matrix.length && col >= 0){
            if(target < matrix[rowStart][col-1]){
                col--;
            }else if(target > matrix[rowStart][col -1]){
                rowStart++;
            }else{
                return true;
            }
        }
        return false;
    }
}
