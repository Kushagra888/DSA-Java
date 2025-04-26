package Hashing;
import java.util.*;


public class MajorityElement {
    

    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        // find all elements that appears more than n/3 times.

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Integer i : map.keySet()) {
            if(map.get(i) > n/3) {
                System.out.println(i);
            }
        }
    }

}
