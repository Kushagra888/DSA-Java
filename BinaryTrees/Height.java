package BinaryTrees;

public class Height {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if(root == null) {
            return 0;
        }

        int leftH = height(root.left);  // height of left sub tree
        int rightH = height(root.right);  // height of right sub tree

        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(6);
        root.left.right = new Node(5);

        System.out.println(height(root));
    }
}
