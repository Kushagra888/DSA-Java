package ArrayList;
import java.util.ArrayList;


public class Reverse {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(9);
        list.add(1);
        list.add(4);
        list.add(8);

        System.out.println(list);

        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
