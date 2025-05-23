package Tries;

public class Main {
    static class Node {
        Node children[] = new Node[26]; // 26 chars in alphabet
        boolean isEndOfWord = false;

        public Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();
    

    public static void main(String[] args) {
        
    }
}
