package Queues;

import java.util.*;

public class UsingJCF {
    
    public static void main(String[] args) {
        // queue is an interface which gets implemented by either LL or ArrayDeque Class. 
        
        // Queue<Integer> q = new LinkedList<>(); 

        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.size());

        System.out.println();

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
