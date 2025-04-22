package LinkedList;


public class LL {

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
    public static int size = 0;


    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;

        // If it is your first Node
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // newNode.next = head
        newNode.next = head;

        // head = newNode
        head = newNode;
    }

    public void addLast(int data) {

        // creating a new Node
        Node newNode = new Node(data);
        size++;

        // If it is your first Node
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // tail.next = newNode
        tail.next = newNode;

        // tail = newNode
        tail = newNode;
    }

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

    public void addPos(int pos, int data) {
        if(pos == 0) {
            addFirst(data); // In this case head will be changing.
            return;
        }

        int i = 0;
        Node temp = head;

        // temp at prev node
        while(i < pos-1) {
            temp = temp.next;
            i++;
        }

        // new node
        Node newNode = new Node(data);
        size++;

        newNode.next = temp.next;

        temp.next = newNode;

    }

    public int removeFirst() {
        // if ll is empty
        if(head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } 
        else if(size == 1) { // if it has only one node
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removeLast() {
        if(head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int i = 0;
        Node temp = head;

        while(i < size-2) {
            temp = temp.next;
            i++;
        }
        // temp is at prev node
        int val = temp.next.data;  // tail.data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        if(head == null) {
            System.out.println("LL is empty");
            return -1;
        }

        int i = 0;
        Node temp = head;

        while(temp != null) {

            if(temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1; // key not found
    }

    public int recHelper(Node head, int key, int i) {
        // base case
        if(head == null) {
            return -1; // key not found
        }

        else if(head.data == key) {
            return i;
        }

        return recHelper(head.next, key, i+1);
    }

    public int recSearch(int key) {
        return recHelper(head, key, 0);
    }

    public void reverse() {
        // 3 variables and 4 steps

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;  // reverse step
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthFromEnd(int n) {
        if(head == null) {
            System.out.println("ll is empty");
            return;
        } 

        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        // corner case
        if(n == sz) {
            head = head.next; // deleting the head node
            return;
        }

        int i = 1;
        int end = sz-n;
        Node prev = head;

        while(i < end) {
            prev = prev.next;
            i++;
        }
       
        prev.next = prev.next.next;
        size--;
    }

    // slow-fast concept
    public Node findMid() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;      // +1
            fast = fast.next.next; // +2
        }

        return slow; // mid node
    }

    public boolean checkPalindrome() {

        // base case -- no element or one element LL is always palindrome
        if(head == null) {
            return true;
        } else if(head.next == null) {
            return true;
        }

        // find mid node
        Node midNode = findMid();

        // reverse right part
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right part head
        Node left = head;

        // check left part == right part
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;

    }


    public static void main(String[] args) {
        LL ll = new LL();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addPos(2,8);
        // ll.print(); // 1 2 8 3 4
        // ll.removeNthFromEnd(3);
        // ll.print();
        
        
        // palindrome
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // 1 2 2 1
        System.out.println(ll.checkPalindrome());


        // ll.reverse();
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.itrSearch(30));
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(size); // ll.size
    }


}
