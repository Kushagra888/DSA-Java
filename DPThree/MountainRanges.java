package DPThree;

public class MountainRanges {
    
    public static int mountain(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<dp.length; i++) {
            for(int j=0; j<i; j++) {
                int inside = dp[j];
                int outside = dp[i-j-1];
                // where i = no. of pairs, and dp[i] = ways to create mountain ranges using i pairs.
                dp[i] += inside * outside;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // n = no. of pairs
        // each pair consist of one upstroke = /, and one downstroke = \
        // mountain ranges = mountains and valleys , 
        // we need to find total ways to create mountain ranges.

        System.out.println(mountain(n));
    }
}
