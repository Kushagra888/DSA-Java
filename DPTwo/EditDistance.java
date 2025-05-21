package DPTwo;

public class EditDistance {
    // min. no of operations to change word1 to word2.
    
    public static int dist(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int dp[][] = new int[n+1][m+1];

        // init
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                }
                if(j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        // bottom up
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                // valid
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    // diff chars
                    // insert, del, replace
                    int insert = dp[i][j-1];
                    int del = dp[i-1][j];
                    int replace = dp[i-1][j-1];
                    dp[i][j] = Math.min(insert, Math.min(del, replace)) + 1;
                }
            }
        }

        return dp[n][m];
        
    }

    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        // 5 operations  
        System.out.println(dist(word1, word2));
    }
}
