package main.DSA.Maze;

import java.util.ArrayList;

public class MazeStartToEnd {
    /*Given the two integers m and n, return the number of possible unique paths
    that the robot can take to reach the bottom-right corner.*/
    public static int getNumber(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
   return getNumber(row, col -1 ) + getNumber(row -1, col);
    }
    // @todo Recursive solution is pending for the above method;
    static int getNumberIteration(int row, int col){
        int table[][] = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                if( j == 0 || i == 0){
                    table[i][j]  = 1;
                }
            }
        }
        for (int i = 1; i < row ; i++) {
            for (int j = 1; j < col ; j++) {
               table[i][j] = table[i][j-1] + table[i-1][j];
            }
            System.out.println();
        }
        return table[row -1 ][col -1];
    }
    public static void printAllDirection(String p, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(col > 1)
            printAllDirection(p+"R", row, col -1);
        if(row >1)
            printAllDirection(p+"D", row-1, col);
    }

    public static ArrayList<String> getPathList(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();

        if(col > 1)
            list.addAll(getPathList(p+"R", row, col -1));
        if(row >1)
            list.addAll(getPathList(p+"D", row-1, col));
        return list;
    }
    // Initial value of p (path) while making method call we pass it as "" (empty String)
    public static ArrayList<String> getPathListWithDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();

        if(row > 1 && col > 1)
            list.addAll(getPathListWithDiagonal(p+"D", row-1,col-1));
        if(col > 1)
            list.addAll(getPathListWithDiagonal(p+"H", row, col -1));
        if(row >1)
            list.addAll(getPathListWithDiagonal(p+"V", row-1, col));
        return list;
    }
// When you land on a new cell check whether that cell is obstacle or not ,
// if it is an obstacle return from that cell
    public static ArrayList<String> pathsWithObstacle(String p, char[][] maze, int row, int col){
        if(row == maze.length -1 && col == maze[0].length -1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(maze[row][col] == 'X'){
            return list;
        }
        if(row < maze.length -1)
            list.addAll(pathsWithObstacle(p+"D", maze,row + 1, col));
        if(col < maze.length - 1)
            list.addAll(pathsWithObstacle(p+"R", maze,row , col+1));
        return list;

    }

    public static void main(String[] args) {
        //printAllDirection("",3,3);
        /*char[][] maze = {{'0','0','0','X'},{'0','0','0','X'},{'0','0','0','X'}, {'0', '0', '0', '0'}};
        System.out.println( pathsWithObstacle("",maze,0,0));
        System.out.println( pathsWithObstacle("",maze,0,0).size());*/
        getNumberIteration(3,3);

    }
}
