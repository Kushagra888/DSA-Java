package Queues;
import java.util.*;

public class QueueUsingDq {
    static class Queue {
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty() {
            return dq.isEmpty();
        }

        public static void add(int data) {
            dq.addLast(data);
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return dq.removeFirst();
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue();

        // q.add(1);
        // q.add(2);
        // q.add(3);

        // System.out.println(q.isEmpty());
        // System.out.println(q.peek());
        // System.out.println();


        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());

    }
}