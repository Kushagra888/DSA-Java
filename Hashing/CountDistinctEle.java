package Hashing;
import java.util.*;

public class CountDistinctEle {
    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};

        // count no. of distinct/unique elements in the array.

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println("no. of distinct elements: " + set.size());
    }
    
}
