package Strings;

public class Builder {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }

        System.out.println(sb);

        // It works same as string.
        // sb.charAt(0);
        // sb.equals();
        // sb.compareTo(sb);
        // sb.subSequence(0, 0);
        // sb.substring(ch, ch);

        // sb.toString();

        // This function can convert anything to an string but it must be an object.

        // Integer i = 10;
        // System.out.println(i);
        // System.out.println(i.toString());

        // Character ch = 'a';
        // System.out.println(ch);
        // System.out.println(ch.toString());
    }
}
