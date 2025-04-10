package Queues;
import java.util.*;


public class Dq {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        // 3-2-1

        System.out.println(dq);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println("size: " + dq.size());


        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        // 3-2-1-4-5-6

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);

    }
}
