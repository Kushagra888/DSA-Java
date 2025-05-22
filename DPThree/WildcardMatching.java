package DPThree;

public class WildcardMatching {
    public static boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        // init
        // pattern is empty
        for(int i=1; i<dp.length; i++) {
            dp[i][0] = false;
        }
        // string is empty
        for(int j=1; j<dp[0].length; j++) {
            if(p.charAt(j-1) == '*') {
                dp[0][j] = true;
            } else {
                break;
            }
        }
        // empty s and empty p gets matched
        dp[0][0] = true;

        // bottom up
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                // valid
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*') {
                    // ignore *
                    boolean ans1 = dp[i][j-1];
                    // consider *
                    boolean ans2 = dp[i-1][j];
                    dp[i][j] = ans1 || ans2;
                }
                else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String text = "baaabab";
        String pattern = "*****ba*****ab";

        System.out.println(isMatch(text, pattern));
    }
}
