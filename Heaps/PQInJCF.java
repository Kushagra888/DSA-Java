package Heaps;
import java.util.*;

public class PQInJCF {
    public static void main(String[] args) {
        // Priority Queue in JCF
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(2); // O(logn)
        pq.add(9);
        pq.add(5);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }
    }
}
