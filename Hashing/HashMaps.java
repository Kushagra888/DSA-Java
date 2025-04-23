package Hashing;
import java.util.*;

public class HashMaps {

    public static void iterate(HashMap<String, Integer> map) {
        Set<String> keys = map.keySet();

        System.out.println(keys);

        for(String k : map.keySet()) {
            System.out.println("Key: " + k + " ,Value: " + map.get(k));
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100); // Insert O(1)
        map.put("China", 130);
        map.put("Srilanka", 40);
        map.put("Indonesia", 50);

        // System.out.println(map);

        // // Get O(1)
        // System.out.println(map.get("India"));

        // // ContainsKey O(1)
        // System.out.println(map.containsKey("China"));
        // System.out.println(map.containsKey("Bhopal"));

        // // Remove O(1)
        // System.out.println(map.remove("China"));

        // System.out.println(map);

        // System.out.println(map.size());
        // map.clear();
        // System.out.println(map.isEmpty());

        iterate(map);

    }
}

