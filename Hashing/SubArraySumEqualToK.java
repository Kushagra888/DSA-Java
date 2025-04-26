package Hashing;
import java.util.*;

public class SubArraySumEqualToK {
    public static void main(String[] args) {
        int arr[] = {10,2,-2,-20,10};
        int k = -10;

        // return the no. of subarrays with sum equals to k
        int sum = 0;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
            //  sum, count of subarrays

        for(int j=0; j<arr.length; j++) {
            sum += arr[j];
            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
    }
}
