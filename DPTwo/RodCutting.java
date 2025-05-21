package DPTwo;

public class RodCutting {
    
    public static int maxValue(int lengths[], int price[], int rodLen) {
        int n = lengths.length;
        int dp[][] = new int[n+1][rodLen+1];

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
                if(lengths[i-1] <= j) {
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-lengths[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][rodLen];
    }

    public static void main(String[] args) {
        int lengths[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int rodLen = 8;

        System.out.println(maxValue(lengths, price, rodLen));
    }
}
