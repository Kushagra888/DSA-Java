package ArrayList;
import java.util.ArrayList;

public class Size {
 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(0);
        list.add(7);

        System.out.println(list.size());

        System.out.println();

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
