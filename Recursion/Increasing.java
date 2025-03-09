package Recursion;

public class Increasing {

    public static void printInc(int n) {
        // 1 2 3 4 5 6
        if(n == 1) {
            System.out.println(n);
            return;
        }

        printInc(n-1);

        System.out.println(n);

    }

    public static void main(String[] args) {
        printInc(6);
    }
}
