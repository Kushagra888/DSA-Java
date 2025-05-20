package DPOne;
// return true or false if its possible to achieve target sum using the elements of nums.
    
public class TargetSumSubset {

    public static boolean targetSum(int nums[], int sum) {
        int n = nums.length;
        boolean dp[][] = new boolean[n+1][sum+1];

        // init
        for(int i=0; i<dp.length; i++) {
            dp[i][0] = true;
        }
        for(int j=1; j<dp[0].length; j++) {
            dp[0][j] = false;
        }

        // bottom up
        for(int i=1; i<dp.length; i++) {
            for(int j=1; j<dp[0].length; j++) {
                // valid
                if(nums[i-1] <= j && dp[i-1][j-nums[i-1]]) {
                    dp[i][j] = true;
                }
                else if(dp[i-1][j]) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[n][sum];

    }

    public static void main(String[] args) {
        int nums[] = {4,2,7,1,3};
        int target = 10;

        System.out.println(targetSum(nums, target));
    }
}
