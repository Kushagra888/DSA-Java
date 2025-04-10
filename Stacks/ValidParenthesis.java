package Stacks;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening ch
            if(ch == '[' || ch == '{' || ch == '(') {
                s.push(ch);
            }
            else { // closing ch

                if(s.isEmpty()) {
                    return false;
                }

                if((ch == ']' && s.peek() == '[') || (ch == '}' && s.peek() == '{') || (ch == ')' && s.peek() == '(')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String str = "({[]})";
        String str2 = "{[(])}";

        System.out.println(isValid(str));
        System.out.println(isValid(str2));
    }
}
