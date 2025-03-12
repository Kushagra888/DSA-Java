package Recursion;

public class RemoveDuplicates {
    
    public static void unqChars(String str, StringBuilder newStr, int idx, boolean map[]) {

        // base case
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);

        if(map[ch-'a'] == true) {
            unqChars(str, newStr, idx+1, map);
        } else {
            map[ch-'a'] = true;
            unqChars(str, newStr.append(ch), idx+1, map);
        }

    }

    public static void main(String[] args) {
        unqChars("apnnnaacollege", new StringBuilder(""), 0, new boolean[26]);
    }
}
