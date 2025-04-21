package LinkedList;

public class Cycle {
    
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
    
    // detect cycle
    public static boolean isCycle() {  // Floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;   //+1
            fast = fast.next.next; //+2

            if(slow == fast) { // cycle found
                return true;
            }
        }

        return false; // not found
    }

    // remove cycle
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                cycle = true;
                break;
            }
        }

        if(cycle == false) {
            System.out.println("cycle not found");
            return;
        }

        // find last node
        slow = head;
        Node lastNode = null;

        while(slow != fast) {
            lastNode = fast;

            slow = slow.next; //+1
            fast = fast.next; //+1
        }


        // remove cycle
        lastNode.next = null;

    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next;

        // 1 - 2 - 3 - 2

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
