package DPFour;
import java.util.Arrays;

// matrix chain multiplication

public class MCM {

    public static int mcm(int arr[], int i, int j) {
        // base case
        if(i == j) {
            return 0; // single matrix case
        }
        // arr[i] = arr[i-1] X arr[i]
        // arr[k] = arr[k-1] X arr[k]
        // size of result 1 : arr[i-1] X arr[k]

        // arr[k+1] = arr[k] X arr[k+1]
        // arr[j] = arr[j-1] X arr[j]
        // size of result 2 : arr[k] X arr[j]

        // cost3 = arr[i-1] X arr[k] X arr[j]

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1+cost2+cost3;

            ans = Math.min(ans, finalCost);
        }

        return ans;
    }

    public static int mcmMem(int arr[], int i, int j, int dp[][]) {
        if(i == j) {
            return 0; // single matrix cost will be 0
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<j; k++) {
            int cost1 = mcmMem(arr, i, k, dp);
            int cost2 = mcmMem(arr, k+1, j, dp);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            ans = Math.min(ans, cost1+cost2+cost3);
        }

        return dp[i][j] = ans;
    }

    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n+1][n+1];

        // init - single matrix case - cost = 0 
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(i == j) {
                    dp[i][j] = 0;
                }
            }
        }

        // bottom up - diagonally fill - from length of matrices = 2 to n-1

        for(int len=2; len<=n-1; len++) {
            for(int i=1; i<=n-len; i++) {
                // col = j
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                // dividing parts
                for(int k=i; k<j; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }

        return dp[1][n-1];
    }
 
    public static void main(String[] args) {
        // mcm with recursion
        int arr[] = {1,2,3,4,3}; // n = 5
        int n = arr.length;

        System.out.println(mcm(arr, 1, n-1));

        // mcm with memoization
        int dp[][] = new int[n+1][n+1];

        for(int i=0; i<dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(mcmMem(arr, 1, n-1, dp));

        // mcm with tabulation
        System.out.println(mcmTab(arr));
    }    
}
