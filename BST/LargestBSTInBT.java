package BST;

// size of the largest BST in a Binary Tree.

public class LargestBSTInBT {
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

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxSizeBST = 0;

    public static Info largestBST(Node root) {
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }

        if(leftInfo.isBST && rightInfo.isBST) {
            maxSizeBST = Math.max(maxSizeBST, size);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    public static void main(String[] args) {
        // binary tree - given
        Node root1 = new Node(50);
        root1.left = new Node(30);
        root1.left.left = new Node(5);
        root1.left.right = new Node(20);

        root1.right = new Node(60);
        root1.right.right = new Node(70);
        root1.right.left = new Node(45);
        root1.right.right.left = new Node(65);
        root1.right.right.right = new Node(80);

        // Info info = largestBST(root1);

        // System.out.println("size of largest bst in given bt: " + maxSizeBST);

    }

}
