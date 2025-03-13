package Recursion;

public class TilingProblem {
    // tile size = 2 x 1
    
    public static int waysToTile(int n) { // floor size = 2 x n , n = length of the floor.
        // base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // kaam
        // vertical - choice
        int verWays = waysToTile(n-1);
        
        // horizontal - choice
        int horWays = waysToTile(n-2);

        return verWays + horWays; // total no. of ways

    }

    public static void main(String[] args) {
        System.out.println(waysToTile(4));
    }
}
