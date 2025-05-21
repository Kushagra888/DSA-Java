package DPTwo;

public class StringConversion {
    // print no. of insertions and deletions to convert str1 to str2;

    public static void convert(String str1, String str2) {
        // lcs
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        // init
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
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

        int lcs = dp[n][m];

        System.out.println("Insertions in Str1: " + (m-lcs));
        System.out.println("Deletions in Str1: " + (n-lcs));

    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";

        convert(str1, str2);
    }
}
