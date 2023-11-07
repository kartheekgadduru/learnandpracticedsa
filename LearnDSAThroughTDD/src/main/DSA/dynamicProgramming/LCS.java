package main.DSA.dynamicProgramming;

import static java.lang.Math.max;

public class LCS {
    public int getLcs(String s1, String s2, int m, int n){
        if(m == 0 || n ==0){
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + getLcs(s1,s2,m-1,n-1);
        }else{
            return max(getLcs(s1, s2, m-1, n), getLcs(s1,s2,m, n-1));
        }
    }

    public int getLCSByIteration(String s1, String s2, int m, int n){
        int[][] subProblemTable = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    subProblemTable[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    subProblemTable[i][j] = 1 + subProblemTable[i-1][j-1];
                }else{
                    subProblemTable[i][j] = max(subProblemTable[i-1][j], subProblemTable[i][j-1]);
                }
            }
        }
        return subProblemTable[m][n];
    }


}
