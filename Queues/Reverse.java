package Queues;
import java.util.*;

public class Reverse {
    
    public static void reverse(Queue<Integer> q) {
        if(q.isEmpty()) {
            return;
        }

        int front = q.remove();
        reverse(q);
        q.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q);

        reverse(q);

        System.out.println(q);
    }
}
