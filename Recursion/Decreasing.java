package Recursion;

public class Decreasing {

    public static void printDec(int n) {
        // 6 5 4 3 2 1

        // base case
        if(n == 1) {
            System.out.println(1);
            return;
        }

        System.out.println(n);
        printDec(n-1); // recursive leap of faith
    }
    public static void main(String[] args) {
        printDec(6);
    }
}
