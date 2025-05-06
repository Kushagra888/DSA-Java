package BinaryTrees;

public class NodesCountAndSum {
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

    public static int count(Node root) {
        // count the no. of nodes in a tree
        if(root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);

        return leftCount + rightCount + 1;
    }

    public static int sum(Node root) {
        // total sum of all nodes of a tree
        if(root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(6);
        root.left.right = new Node(5);

        // System.out.println(count(root));
        System.out.println(sum(root));
    }
}
