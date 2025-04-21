package LinkedList;

public class DoublyLL {
    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public int removeFirst() {
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

        int val = head.data;
        head = head.next;
        head.prev = null;
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

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }


    public void addPos(int data, int pos) {
        int i = 0;
        Node prev = head;

        if(pos == 0) {
            addFirst(data);
            return;
        }

        while(i<pos-1) {
            prev = prev.next;
            i++;
        }

        Node newNode = new Node(data);

        newNode.next = prev.next;
        prev.next.prev = newNode;
        prev.next = newNode;
        newNode.prev = prev;
    }

    public int removePos(int pos) {
        if(head == null) {
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }

        if(pos == 0) {
            removeFirst();
        }

        int i = 0;
        Node curr = head;

        while(i<=pos-1) {
            curr = curr.next;
            i++;
        }

        int val = curr.data;

        curr.next.prev = curr.prev;
        curr.prev.next = curr.next;

        curr.next = null;
        curr.prev = null;

        return val;
    }



    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();

        dll.removeFirst();
        dll.removeLast();

        dll.print();
        System.out.println(size);

       
        dll.reverse();
        dll.print();
    }
}
