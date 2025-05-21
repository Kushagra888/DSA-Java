package DPTwo;
// Longest common subsequence

import java.util.Arrays;

public class LCS {
    
    public static int lcsRec(String str1, String str2, int n, int m) {
        if(n == 0 || m == 0) {
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)) {
            return 1 + lcsRec(str1, str2, n-1, m-1);
        }
        else {  // diff chars
            return Math.max(lcsRec(str1, str2, n-1, m), lcsRec(str1, str2, n, m-1));
        }
    }

    public static int lcsMem(String str1, String str2, int n, int m, int dp[][]) {
        if(n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != -1) {
            return dp[n][m];
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)) {
            return dp[n][m] =  1 + lcsMem(str1, str2, n-1, m-1, dp);
        } else {
            return dp[n][m] = Math.max(lcsMem(str1, str2, n-1, m, dp), lcsMem(str1, str2, n, m-1, dp));
        }
    }

    public static int lcsTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        // init
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
                if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();

        System.out.println(lcsRec(str1, str2, n, m));  // 3

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println(lcsMem(str1, str2, n, m, dp));

        System.out.println();
        System.out.println(lcsTab("abcdge", "abedg"));


    }
}
