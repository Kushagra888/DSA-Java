package Stacks;
import java.util.Stack;

public class ReverseStack {

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }

        System.out.println();
    }
    
    public static void pushAtBottom(Stack<Integer> s, int data) {

        // base case
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        // base case
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(5);
        s.push(0);
        s.push(7);


        reverse(s);

        printStack(s);
    }
}
