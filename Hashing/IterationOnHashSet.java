package Hashing;
import java.util.*;

public class IterationOnHashSet {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // 1. Using Iterators
        // 2. Using for each loop

        set.add(4);
        set.add(2);
        set.add(1);
        set.add(8);
        set.add(5);
        set.add(2);

        // 1.
        // Iterator itr = set.iterator();

        // while(itr.hasNext()) {
        //     System.out.println(itr.next());
        // }


        // 2.
        for(Integer i : set) {
            System.out.println(i);
        }
        
    }
}
