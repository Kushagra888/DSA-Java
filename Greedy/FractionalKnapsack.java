package Greedy;
import java.util.*;

public class FractionalKnapsack {
    
    public static void main(String[] args) {
        int value[] = {60, 120, 100};
        int weight[] = {10, 30, 20};
        int W = 50;


        double ratio[][] = new double[value.length][2];
        // 0 -> idx
        // 1 -> ratio

        for(int i=0; i<ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (value[i] / (double) weight[i]);
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); 
        // ascending order sorting based on ratio.

        int capacity = W;
        int ans = 0;

        for(int i=ratio.length-1; i>=0; i--) { // descending order - loop of ratios.
            int idx = (int) ratio[i][0];
            if(capacity >= weight[idx]) { // full weight inclusion
                ans += value[idx];
                capacity -= weight[idx];
            } else {
                // fractional weight inclusion
                ans += (int)(capacity * ratio[i][1]);
                capacity = 0;
                break;
            }
        }

        System.out.println("Total final value: " + ans);
    }
}

