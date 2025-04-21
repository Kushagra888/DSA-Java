package LinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class JCF { // LL in java collection framework
    
    public static void main(String[] args) {
        // creation
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(6);

        ll.add(4,5);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        ll.remove(1);

        System.out.println(ll);

        ll.addLast(1);

        System.out.println(ll);

        // size
        System.out.println(ll.size());

        Collections.sort(ll);
        System.out.println(ll);

        Collections.sort(ll, Collections.reverseOrder());
        System.out.println(ll);

        System.out.println(ll.get(2));
    }
}
