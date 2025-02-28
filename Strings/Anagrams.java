package Strings;
import java.util.*;

public class Anagrams {
    
    public static void main(String args[]) {
        String str1 = "horse";
        String str2 = "sesroh";

        if(str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean res = Arrays.equals(ch1, ch2);

            if(res) {
                System.out.println("anagrams....");
            } else {
                System.out.println("Not anagrams....");
            }

            
        } else {
            System.out.println("Not anagrams...");
        }
    }
}
