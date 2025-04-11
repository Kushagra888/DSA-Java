package Queues;
import java.util.*;

// first non repeating letters in a stream of characters.

public class NonRepeating {
    
    public static void nonRepeating(String str) {
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.println("-1");
            } else {
                System.out.println(q.peek());
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";

        nonRepeating(str);
    }

}
