package DPTwo;

import java.util.*;

// longest increasing subsequence

public class LIS {

    public static int lis(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int ele : arr) {
            set.add(ele);
        }

        int arr2[] = new int[set.size()];

        int k=0;
        for(int ele : set) {
            arr2[k] = ele;
            k++;
        }

        Arrays.sort(arr2);
        int n = arr.length;
        int m = arr2.length;

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
                if(arr[i-1] == arr2[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        int arr[] = {50,3,10,7,40,80};
        // LIS = 4

        System.out.println(lis(arr));

    }
}