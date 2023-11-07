package main.DSA.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatrixRepresentationOfAGraph {
    public static void main(String[] args) {
        //adjacencyMatrixOfAGraph();
        adjacencyMatrixOfAGraphWithMap();
    }
    static void adjacencyMatrixOfAGraphWithArray(){
        int[][] graph = {{0,3}, {1,2},{1,5}, {2,4},{5,0},{5,4}};
        int n = graph.length;
        System.out.println(n);
        int adjacencyMatrix[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            adjacencyMatrix[graph[i][0]][graph[i][1]] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjacencyMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void adjacencyMatrixOfAGraphWithMap(){
        int[][] graph = {{0,3}, {1,2},{1,5}, {2,4},{5,0},{5,4}, {5,3}};
        int n = graph.length;
        int adjacencyMatrix[][] = new int[n][n];
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n; i++) {
            int a = graph[i][0], b = graph[i][1];
            List<Integer> list = new ArrayList<>();
            if(map.containsKey(a)){
                list.addAll(map.get(a));
            }
            list.add(b);
            map.put(a, list);
        }
        for(Map.Entry<Integer, List<Integer>> directedMap : map.entrySet()){
            System.out.println(directedMap.getKey() +"------->"+directedMap.getValue());

        }

    }
}
