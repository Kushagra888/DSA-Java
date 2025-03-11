package Recursion;

public class PowerOptimized {
    
    public static int xToN(int x, int n) {  // O(logn)
        // base case 
        if(n == 0) {
            return 1;
        }
        int res = xToN(x, n/2);

        int power = res * res;

        if(n%2 != 0) { // odd case
            power = power * x;
        }

        return power;
    }

    public static void main(String[] args) {
        System.out.println(xToN(2, 10));
        System.out.println(xToN(2, 6));
    }
}
