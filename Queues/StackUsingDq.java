package Queues;
import java.util.*;

public class StackUsingDq {
    static class Stack {
        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty() {
            return dq.isEmpty();
        }

        public static void push(int data) {
            dq.addLast(data);
        }

        public static int pop() {
            if(isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        // Stack s = new Stack();

        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s.isEmpty());

        // System.out.println(s.peek());
        // System.out.println();

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
    }
}
