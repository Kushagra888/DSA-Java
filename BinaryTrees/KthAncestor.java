package BinaryTrees;

public class KthAncestor {
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

    public static int kthAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }

        if(root.data == n) {
            return 0;
        }

        int foundLeft = kthAncestor(root.left, n, k);
        int foundRight = kthAncestor(root.right, n, k);

        if(foundLeft == -1 && foundRight == -1) {
            return -1;
        }

        int valid = Math.max(foundLeft, foundRight);

        if(valid+1 == k) {
            System.out.print(root.data + " ");
        }

        return valid+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthAncestor(root, 5, 2); // 1
    }
    
}
