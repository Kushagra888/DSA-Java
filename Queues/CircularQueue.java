package Queues;

public class CircularQueue {
    
    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            // if queue is full
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }

            // if it is first element
            if(front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int ans = arr[front];

            // if it's the only element
            if(front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return ans;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            return arr[front];
        }

    }

    public static void main(String[] args) {
        // Queue q = new Queue(3);

        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());
        // q.add(4);
        // System.out.println(q.remove());
        // q.add(5);


        // System.out.println();

        // while(!q.isEmpty()) {
        //     System.out.print(q.remove() + " ");
        // }


    }
}
