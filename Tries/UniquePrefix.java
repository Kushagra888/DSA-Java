package Tries;

// shortest unique prefix for every word

public class UniquePrefix {
    static class Node {
        Node children[] = new Node[26];
        boolean isEndOfWord = false;
        int freq;

        public Node() {
            freq = 1;
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i)-'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.isEndOfWord = true;
    }

    public static String[] findPrefixes(String words[]) {
        String res[] = new String[words.length];

        for(int i=0; i<words.length; i++) {
            res[i] = search(words[i]);
        }

        return res;
    }

    public static String search(String word) {
        Node curr = root;
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i)-'a';
            sb.append(word.charAt(i));

            if(curr.children[idx].freq == 1) {
                break;
            }

            curr = curr.children[idx];
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String words[] = {"zebra", "duck", "dog", "dove"};

        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }

        String res[] = findPrefixes(words);

        for(String val : res) {
            System.out.println(val);
        }
        System.out.println();

    }
}
