package main.DSA.dynamicProgramming;

public class NQueens {
    /*remove the changes you made in the previous row if no option left to place queen in current row which called backtracking
    * to check queen placed position safe/not can be verified by looking previous rows
    * (top, left-diagonal, right-diagonal) simple 2D array
    * we need to take min(r, c) when checking for left-diagonal, right-diagonal
    *  placed or not  weather */
    //
    /*we are not passing col as every time we need to start column from zero
    this has O(N3 + N!) times apprximate to N!
    * */
    public static int queens(boolean board[][], int row){
        if(row == board.length){
            display(board); // is used to place queen in the board
            System.out.println();
            return 1;
        }
        int count = 0;
        // Placing the Queen and checking for each row and column
        for (int col = 0; col < board.length; col++) {
             //Place the Queen if it is safe
            if(isSafe(board, col, row)){
                board[row][col] = true;
                count +=queens(board, row + 1);
                // when you come out of the function call reset the board value
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int col, int row) {
        for (int i = 0; i < row; i++) {
            //from zeroth row to current row column being constant
            if (board[i][col]) {
                return false;
            }
        }
            int maxLeftDiagonal = Math.min(row, col);
            // left diagonal
            for (int j = 0; j < maxLeftDiagonal; j++) {
                if(board[row -1][col - 1]){
                    return false;
                }
            }

        // Right diagonal which is board length - column -1 1
            int maxRightDiagonal = Math.min(row, board.length - col - 1);
            for (int j = 0; j < maxRightDiagonal; j++) {
                if(board[row - 1][col + 1]){
                    return false;
                }
            }
            return true;
    }

    private static void display(boolean[][] board) {
        for (boolean row[] : board){
            for (boolean element : row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 9;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));


    }

}
