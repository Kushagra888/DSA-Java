package DPOne;
// No. of ways to climb the nth stair from the ground.
import java.util.*;

public class ClimbingStairs {
    // recursion = 2^n, memoization = O(n)
    
    public static int waysMem(int n, int dp[]) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = waysMem(n-1, dp) + waysMem(n-2, dp);
    }

    public static int waysTab(int n) {
        int dp[] = new int[n+1];

        dp[0] = 1;

        for(int i=1; i<dp.length; i++) {
            if(i == 1) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(waysMem(n, dp));

        System.out.println(waysTab(4));
    }
} 

