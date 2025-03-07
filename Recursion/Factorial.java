package Recursion;

public class Factorial {
    
    public static int printFact(int n) {
        // base case
        if(n == 0) {
            return 1;
        }

        return n * printFact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(printFact(5)); // 120
    }
}
