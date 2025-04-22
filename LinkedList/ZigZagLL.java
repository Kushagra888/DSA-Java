package LinkedList;

public class ZigZagLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }

        System.out.println();
    }
    
    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node midNode = slow;

        // reverse 2nd half
        Node right = midNode.next;
        midNode.next = null;

        Node prev = null;
        Node curr = right;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate / zig-zag merging
        
        right = prev;
        Node left = head;
        Node leftN = null;
        Node rightN = null;
        
        while(left != null && right != null) {
            // initializing leftN and right N
            leftN = left.next;
            rightN = right.next;

            left.next = right;
            right.next = leftN;

            // update
            right = rightN;
            left = leftN;
        }

    }

    public static void main(String[] args) {
        // ZigZagLL ll = new ZigZagLL();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.head.next.next = new Node(3);
        // ll.head.next.next.next = new Node(4);
        // ll.head.next.next.next.next = new Node(5);
        // ll.head.next.next.next.next.next = new Node(6);

        // ll.print();
        // // 1-2-3-4-5-6

        // ll.zigZag();

        // ll.print();
        // // 1-6-2-5-3-4


    }
}
