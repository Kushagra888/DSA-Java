package Heaps;
import java.util.*;


public class SlidingWindowMax {
    static class Number implements Comparable<Number> {
        int idx;
        int val;

        public Number(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        @Override
        public int compareTo(Number n2) {
            return n2.val - this.val;
        } 
    }

    public static void main(String[] args) {  // O(nlogk)
        int k = 3; // window size
        int val[] = {1,2,3,4,5,6,7,8,9,10};
        PriorityQueue<Number> pq = new PriorityQueue<>();

        int result[] = new int[val.length-k+1]; // n-k+1

        // adding first window
        for(int i=0; i<k; i++) {
            pq.add(new Number(i, val[i]));
        }

        result[0] = pq.peek().val;

        for(int i=k; i<val.length; i++) {
            // removing elements that are not in the window from the queue.
            while(pq.peek().idx <= i-k) {
                pq.remove();
            }

            pq.add(new Number(i, val[i]));
            result[i-k+1] = pq.peek().val;
        }


        // printing the result
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

    }

}