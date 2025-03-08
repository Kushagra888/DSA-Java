package Recursion;

public class Fibonacci {

    public static int fiboTerm(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fiboTerm(n-1) + fiboTerm(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fiboTerm(6));
    }
}
