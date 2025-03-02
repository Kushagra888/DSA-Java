package Strings;

public class LargestString {

    // compareTo function in Strings check the strings lexicographically, means acc. to the size of the character.
    // compareToIgnoreCase functions does the same work but it ignores the case sensitivity.
    
    public static String giveLargest(String arr[]) {
        String largest = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        String arr[] = {"Apple", "Mango", "Banana"};

        System.out.println(giveLargest(arr));
    }
}
