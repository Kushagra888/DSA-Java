package Recursion;

public class StackOverflow {
    public static void print(int val) {
        // without base case , it will run infinite times, and causes the call stack to overflow.
        System.out.println("hii");
        
        print(val);
    }

    public static void main(String[] args) {
        print(8);
    }
}
