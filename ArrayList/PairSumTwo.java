package ArrayList;
import java.util.ArrayList;

public class PairSumTwo {
    // find the pair for the target sum in a sorted and rotated array list
    // brute force approach takes O(N^2) time

    // two pointer approach with linear time O(N)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();

        // finding the breaking point
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        // initializing the pointers
        int lp = bp+1;
        int rp = bp;

        
        while(lp != rp) {
            // if target found  -- case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            else if(list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            } else {  // case 3
                rp = (n + rp - 1) % n;
            }
        }

        return false;

    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 19;

        System.out.println(pairSum(list, target));
    }
}
