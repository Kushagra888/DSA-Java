package ArrayList;
import java.util.ArrayList;

public class WaterContainer {
    // container with most water by picking up two lines

    // Brute Force Approach - O(N^2)
    public static int water(ArrayList<Integer> height) {
        int maxWater = 0;

        for(int i=0; i<height.size(); i++) {
            for(int j=i+1; j<height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j-i;
                int area = ht*wd;

                maxWater = Math.max(maxWater, area);
            }
        }

        return maxWater;
    }

    // Two pointer approach - O(N)
    public static int newWater(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size()-1;

        int pani = 0;

        while(lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wtdh = rp - lp;
            int currArea = ht*wtdh;
            pani = Math.max(pani, currArea);


            if(height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        return pani;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(water(height));

        System.out.println(newWater(height));
    }
}
