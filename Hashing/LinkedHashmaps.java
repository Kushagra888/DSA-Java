package Hashing;
import java.util.*;

public class LinkedHashmaps {  // insertion order remains unchanged
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("China", 10);
        lhm.put("Spain", 90);
        lhm.put("Australia", 50);
        lhm.put("Mexico", 30);

        System.out.println(lhm);
    }
}
