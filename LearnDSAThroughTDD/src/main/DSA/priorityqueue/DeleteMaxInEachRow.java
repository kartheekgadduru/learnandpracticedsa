package main.DSA.priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class DeleteMaxInEachRow {
    public static void main(String[] args) {
        int[][] grid = {
                {5, 2, 8},
                {1, 6, 3},
                {7, 4, 9}
        };
        deleteGreatestInEachRow(grid);

    }
    public static int deleteGreatestInEachRow(int[][] grid) {

        ArrayList<PriorityQueue<Integer>> list = new ArrayList<>();

        int m = grid.length; // total number of rows in grid.
        int n = grid[0].length; // total number of columns in grid.

        // Let's fill the list.
        for (int i = 0; i < grid.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < grid[0].length; j++) {
                pq.add(grid[i][j]);
            }
            list.add(pq);
        }
/*        pay attention for the below code
for(PriorityQueue<Integer> pq: list){
            System.out.println(pq);
            while(!pq.isEmpty()){
                System.out.print(pq.poll()+" ");
            }
            System.out.println();
        }*/
    int result=0;
    	for (int i=0;i<n;i++) {
        int num=-1;
        for (int j=0;j<m;j++) {
            PriorityQueue<Integer> pq=list.get(j);
            int temp = pq.poll();
            num=Math.max(num, temp);
        }

        result+=num;
    }
    	return result;
    }

}
