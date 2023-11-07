package main.DSA.dynamicProgramming;
// if current row value is > current column => copy the values from previous row {table[i][j] = table[i-1][j]}
// else pick minimum coins which constitute to amount ( 1 + remaining amount, previous row coin value, amount)
// {table[i][j] = Math.max(table[i-1][j], 1 + table[i][j - arr[i]}

// Similar way for Maximum number of coin exchange is
// if current row value is > current column => copy the values from previous row {table[i][j] = table[i-1][j]}
// table[i-1][j] + 1 + table[i][j - arr[i]

import java.util.Arrays;

public class MinimumCoinChange {
    public static int getMinCountCount(int[] arr, int amount) {
        int row = arr.length + 1 ;
        int col = amount +1;
        int table[][] = new int[row][col];


        for (int i = 1; i <= row; i++) { // coins loop
            for (int j = 1; j <= col; j++) { // amount loop
                if(j - arr[i-1] >= 0){
                    table[i][j] = Math.min(1 + table[i][j - arr[i-1]], table[i -1][j]);
                }else{
                    table[i][j] = table[i -1][j];
                }
            }
        }

        return table[row][col];
    }

    static int getMinCoins(int[] coins, int amount){
        int dp[] = new int[ amount +1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        for (int i = 1; i < amount +1 ; i++) { // amount loop
            for (int j = 0; j < coins.length; j++) { // coins array loop
                if(i - coins[j] >= 0 )
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
            }
        }

        return dp[amount] > amount ?  -1 : dp[amount];
    }
    public int uniquePaths(int m, int n) {
            if(m == 1 || n == 1){
                return 1;
            }
            return Math.max(uniquePaths(m-1, n), uniquePaths(m, n -1));
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int amt = 11;
        System.out.println(getMinCoins(arr, 11));
     //   System.out.println(getMinCountCount(arr, 11));

       /* int coins[] =  {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );*/

    }

    static int minCoins(int coins[], int coinLength, int amount)
    {
        // base case
        if (amount == 0) return 0;
        int res = Integer.MAX_VALUE;
        // Try every coin that has smaller value than V
        for (int i=0; i<coinLength; i++)
        {
            if (coins[i] <= amount)
            {
                int sub_res = minCoins(coins, coinLength, amount-coins[i]);
                // Check for INT_MAX to avoid overflow and see if
                // result can minimize
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res)
                    res = sub_res + 1;
            }
        }
        return res;
    }
}

// A Dynamic Programming based Java
// program to find minimum of coins
// to make a given change V
class GFG
{
    // m is size of coins array
    // (number of different coins)
    static int minCoins(int coins[], int amtLen, int amount)
    {
        // table[i] will be storing
        // the minimum number of coins
        // required for i value. So
        // table[V] will have result
        int table[] = new int[amount + 1];
        // Base case (If given amount is 0)
        table[0] = 0;
        // Initialize all table values as Infinite
        for (int i = 1; i <= amount; i++)
            table[i] = Integer.MAX_VALUE;
        // Compute minimum coins required for all
        // values from 1 to amount
        for (int i = 1; i <= amount; i++)
        {
            // Go through all coins smaller than i
            for (int j = 0; j < amtLen; j++)
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                        table[i] = sub_res + 1;
                }
        }
        if(table[amount]==Integer.MAX_VALUE)
            return -1;
        return table[amount];
    }
    // Driver program
    public static void main (String[] args)
    {
        int coins[] = {9, 6, 5, 1};
        int m = coins.length;
        int V = 11;
        System.out.println ( "Minimum coins required is "
                + minCoins(coins, m, V));
    }
}
