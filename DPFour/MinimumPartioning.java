package DPFour;

public class MinimumPartioning {

    public static int partion(int arr[]) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }

        // knapsack capacity W
        int W = sum/2;
        int n = arr.length;

        // 0-1 knapsack
        int dp[][] = new int[n+1][W+1];

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
                if(arr[i-1] <= j) {
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int sum1 = dp[n][W];
        int sum2 = sum - sum1;

        return Math.abs(sum1 - sum2);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 6, 11, 5};
        // min abs diff = 1

        System.out.println(partion(arr));
    }
}