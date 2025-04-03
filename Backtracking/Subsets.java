package Backtracking;

public class Subsets {
    public static void printSubsets(String str, String ans, int i) {
        // base case
        if(i == str.length()) {
            System.out.println(ans);
            return;
        }

        // recursion
        // choice-YES
        printSubsets(str, ans+str.charAt(i), i+1);

        // choice-NO
        printSubsets(str, ans, i+1);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
}
