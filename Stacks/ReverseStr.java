package Stacks;
import java.util.Stack;

public class ReverseStr {
    
    
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder res = new StringBuilder("");

        while(!s.isEmpty()) {
            res.append(s.pop());
        }

        return res.toString();

    }
    
    public static void main(String[] args) {
        

        String str = "abc";

        String res = reverse(str);
        System.out.println(res);
    }
}
