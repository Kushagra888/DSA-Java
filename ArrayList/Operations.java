package ArrayList;
import java.util.ArrayList;

public class Operations {
    
    public static void main(String args[]) {

        // Declaration
        ArrayList<Integer> list = new ArrayList<>();

        // Operations

        // Add
        list.add(2); // O(1)
        list.add(6); // O(1)
        list.add(3); // O(1)
        list.add(8); // O(1)

        System.out.println(list);

        list.add(2,1); // O(n)

        System.out.println(list);

        // Get
        System.out.println(list.get(2)); // O(1)

        // Remove
        list.remove(2); // O(N)
        System.out.println(list);

        // Set
        list.set(1,0); // O(N)
        System.out.println(list);

        // Contains-Boolean method
        System.out.println(list.contains(8)); // O(N)
        System.out.println(list.contains(4)); // O(N)

    }
}
