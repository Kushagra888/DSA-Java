package DPThree;

import java.util.Arrays;

public class Catalan {

    public static int cat(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int ans = 0;
        for(int i=0; i<n; i++) {
            ans += cat(i) * cat(n-i-1);
        }
        return ans;
    }

    // O(N*N)
    public static int catMem(int n, int dp[]) {
        if(n == 0 || n == 1) {
            return 1;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int ans=0;
        for(int i=0; i<n; i++) {
            ans += catMem(i, dp) * catMem(n-i-1, dp);
        }
        return ans;
    }

    // O(N*N)
    public static int catTab(int n) {
        int dp[] = new int[n+1];

        // init
        dp[0] = 1;
        dp[1] = 1;

        // bottom up
        for(int i=2; i<dp.length; i++) {
            for(int j=0; j<i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);

        System.out.println(catMem(n, dp));

        System.out.println();
        System.out.println(catTab(5));
    }
}
