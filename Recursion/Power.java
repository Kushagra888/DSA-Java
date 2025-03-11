package Recursion;

public class Power {
    
    public static int xToN(int x, int n) {
        // base case
        if(n == 0) {
            return 1;
        }

        return x * xToN(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(xToN(2, 5));
    }
}
