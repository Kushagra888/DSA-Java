package Backtracking;

public class GridWays {

    // Time complexity = O(2^n+m) Total right and down shifts = n+m, each cell has two choices.
    // It can be solved in linear time by using the formula: (n-1 + m-1)! / (n-1)! * (m-1)!
    
    public static int waysGrid(int i, int j, int n, int m) {
        // base case
        if(i == n-1 && j == m-1) { // condn for the last cell
            return 1;
        } else if (i == n || j == m) { // boundary cross condn
            return 0;
        }

        // recursion
        int w1 = waysGrid(i+1, j, n, m);
        int w2 = waysGrid(i, j+1, n, m);

        return w1 + w2;
    }

    
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("total no. of grid ways: " + (waysGrid(0, 0, n, m)));
    }
}
