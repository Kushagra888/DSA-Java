package Greedy;
import java.util.*;

public class Chocola {
    // calculate the min. cost to cut the chocolate of n x m size into squares
    // min. cost to cut the board into squares
    // chess board - 64 squares - n = 8 & m = 8
    // total cuts = (n-1) + (m-1)

    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        // expensive cuts first
        Arrays.sort(costVer, Comparator.reverseOrder()); // descending order sort
        Arrays.sort(costHor, Comparator.reverseOrder()); // descending order sort

        int v = 0, h = 0;
        int vp = 1, hp = 1;

        int totalCost = 0;
        
        while(v < costVer.length && h < costHor.length) {
            if(costVer[v] > costHor[h]) {
                // vertical cut
                totalCost += (hp * costVer[v]);
                vp++;
                v++;
            } else {
                // horizontal cut
                totalCost += (vp * costHor[h]);
                hp++;
                h++;
            }
        }

        while(v < costVer.length) {
            // vertical cut
            totalCost += (hp * costVer[v]);
            vp++;
            v++;
        }

        while(h < costHor.length) {
            // horizontal cut
            totalCost += (vp * costHor[h]);
            hp++;
            h++;
        }

        System.out.println("Total min cost: " + totalCost);

    }

}

