package Hashing;
import java.util.*;

public class TreemapsInJava { // keys are sorted in ascending order
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();

        tm.put("Spain", 90);
        tm.put("China", 10);
        tm.put("Mexico", 30);
        tm.put("Australia", 50);


        System.out.println(tm);
    }

}
