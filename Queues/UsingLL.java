package Queues;

public class UsingLL {
    
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head; // front
        static Node tail; // rear
        

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            // if its first element
            if(head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int res = head.data;
            if(head == tail) {
                // only single node
                head = tail = null;
            } else {
                head = head.next;
            }

            return res;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue();

        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while(!q.isEmpty()) {
        //     System.out.print(q.peek() + " ");
        //     q.remove();
        // }
    
    }
}
