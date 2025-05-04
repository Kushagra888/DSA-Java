package BinaryTrees;

public class MinDistance { // min distance between two nodes in a binary tree
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


    public static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null) {
            return rightLca;
        }
        if(rightLca == null) {
            return leftLca;
        }

        return root; 
    }

    public static int getDist(Node node, int n) {
        if(node == null) {
            return -1;
        }

        if(node.data == n) {
            return 0;
        }

        int leftDist = getDist(node.left, n);
        int rightDist = getDist(node.right, n);

        if(leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int validDist = Math.max(leftDist, rightDist);

        return validDist + 1;
    }

    public static int minDistance(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);

        int dis1 = getDist(lca, n1);
        int dis2 = getDist(lca, n2);

        return dis1+dis2;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDistance(root, 5, 7));

    }
}
