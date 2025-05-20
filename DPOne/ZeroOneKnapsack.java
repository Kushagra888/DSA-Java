package DPOne;
import java.util.*;

public class ZeroOneKnapsack {

    // recursion = 2^n, memoization = O(n*W)
    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        // base case
        if(W == 0 || n == 0) {
            return 0;
        }

        // already calculated
        if(dp[n][W] != -1) {
            return dp[n][W];
        }

        // valid
        if(wt[n-1] <= W) {
            int include = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1, dp);
            int exclude = knapsack(val, wt, W, n-1, dp);

            return dp[n][W] = Math.max(include, exclude);
        } 
        // invalid
        else { 
            return dp[n][W] = knapsack(val, wt, W, n-1, dp);
        }
    }


    // tabulation
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 0;
        }

        for(int j=0; j<dp[0].length; j++) {
            dp[0][j] = 0;
        }

        // bottom up 
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                // valid
                if(wt[i-1] <= j) {
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j-wt[i-1]], dp[i-1][j]);
                } 
                else { // not valid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int n = val.length;
        int W = 7;

        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(knapsack(val,wt,W,n,dp));

        System.out.println();
        System.out.println(knapsackTab(val, wt, W));
    }
}
