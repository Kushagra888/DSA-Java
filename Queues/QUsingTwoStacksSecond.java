package Queues;
import java.util.*;

public class QUsingTwoStacksSecond {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) { // O(1)
            s1.push(data);
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            
            int top = -1;

            while(!s1.isEmpty()) {
                top = s1.pop();
                if(s1.isEmpty()) {
                    break;
                }
                s2.push(top);
            }

            s1.clear();

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            
            int top = -1;

            while(!s1.isEmpty()) {
                top = s1.pop();
                s2.push(top);
            }

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            
            return top;
        }


    }

    public static void main(String[] args) {
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // System.out.println(q.isEmpty());
        // System.out.println(q.peek());
        // System.out.println(); System.out.println();

        // System.out.println(q.remove());
        // System.out.println(q.remove());
        // System.out.println(q.remove());
    }
}