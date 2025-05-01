package Greedy;
import java.util.*;

// max length chain of pairs
public class ChainOfPairs {

    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};


        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 0;

        // adding first pair
        chainLen++;
        int lastPairEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++) {
            if(pairs[i][0] > lastPairEnd) {   // start number > last Pair end number
                chainLen++;
                lastPairEnd = pairs[i][1];
            }
        }

        System.out.println("maximum chain length: " + chainLen);
    }
}

