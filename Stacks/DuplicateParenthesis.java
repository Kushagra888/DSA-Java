package Stacks;
import java.util.Stack;

public class DuplicateParenthesis {
    
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if(ch == ')') {

                int count = 0;

                while(s.peek() != '(') {
                    count++;
                    s.pop();
                }
                if(count < 1) {
                    return true;
                } else {
                    s.pop();
                }
            } 
            else { // opening
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b) - c)";
        String str2 = "((a+b) - ((c)))";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}

