package ArrayList;
import java.util.ArrayList;


public class TwoDList {

    public static void main(String args[]) {
        
        // Declare
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i);
            list2.add(2*i);
            list3.add(3*i);
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        
        System.out.println(mainList);

        // printing main list via nested loops

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> curr = mainList.get(i);
            for(int j=0; j<curr.size(); j++) {
                System.out.print(curr.get(j) + " ");
            }
            System.out.println();
        }

    }
}
