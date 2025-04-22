package LinkedList;

public class MergeSort { //  merge sort in LL
    

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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // mid node
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } 
            else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next; 
        }

        return mergedLL.next;
    }


    public Node mergeSort(Node head) {
        // base case
        if(head == null || head.next == null) {
            return head;
        }

        // find mid, 1st half last node
        Node midNode = findMid(head);

        Node rightPart = midNode.next;
        midNode.next = null;

        // call merge sort for left and right part
        Node leftHead = mergeSort(head); // left 
        Node rightHead = mergeSort(rightPart); // right

        // call merge function
        return merge(leftHead, rightHead);


    }


    public static void main(String[] args) {
        // MergeSort ll = new MergeSort();
        // ll.head = new Node(6);
        // ll.head.next = new Node(8);
        // ll.head.next.next = new Node(1);
        // ll.head.next.next.next = new Node(7);
        // ll.head.next.next.next.next = new Node(3);

        // ll.print();

        // ll.head = ll.mergeSort(ll.head);

        // ll.print();


    }
}
