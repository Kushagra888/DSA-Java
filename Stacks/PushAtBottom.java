package Stacks;
import java.util.Stack;

public class PushAtBottom {

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
    }

    public static void pushBottom(Stack<Integer> s, int data) {
        // base case
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        

        pushBottom(s, 5);

        printStack(s);

    }
}
