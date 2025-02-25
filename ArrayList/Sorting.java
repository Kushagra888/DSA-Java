package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(9);
        list.add(0);
        list.add(2);
        list.add(5);

        System.out.println(list);

        Collections.sort(list); // ascending order sort

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // descending order sort

        System.out.println(list);

        // Collections.reverseOrder() is a comparator function which has its own logic to sort an arraylist, you can have your manual logic inside a comparator function
    }
}
