package DPThree;

public class CountingTrees {
    // count the no. of ways bst can be formed using n nodes
    // variation of catalan

    public static int trees(int n) {
        int dp[] = new int[n+1];
        // init
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<dp.length; i++) {
            for(int j=0; j<i; j++) {
                int left = dp[j];
                int right = dp[i-j-1];
                // where i = nodes and dp[i] = ways to create bst using i nodes.
                dp[i] += left * right;
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        // n = no. of nodes in a bst.

        System.out.println(trees(n));
    }
}
