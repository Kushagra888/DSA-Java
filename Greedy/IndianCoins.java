package Greedy;
import java.util.*;

public class IndianCoins {
// greedy approach will only work on conical coin system or number system like in Indian denominations.

    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        int value = 590;

        Arrays.sort(coins, Comparator.reverseOrder());

        int minCoins = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<coins.length; i++) {
            if(coins[i] <= value) {
                while(coins[i] <= value) {
                    value -= coins[i];
                    minCoins++;
                    list.add(coins[i]);
                }
            }
        }

        System.out.println("Min no. of coins required = " + minCoins);
        System.out.println(list);
    }
}

