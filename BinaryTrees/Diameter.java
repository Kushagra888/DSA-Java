package BinaryTrees;

public class Diameter {
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

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    // approach 1 O(N^2)
    public static int diameter(Node root) {
        if(root == null) {
            return 0;
        }

        // left sub-tree diameter
        int leftD = diameter(root.left);

        // right sub-tree diameter
        int rightD = diameter(root.right);

        // left sub-tree height
        int leftHt = height(root.left);

        // right sub-tree height
        int rightHt = height(root.right);

        int selfDia = leftHt + rightHt + 1;

        return Math.max(selfDia, Math.max(leftD, rightD));
        
        
    }

    static class Info {
        int diameter;
        int height;

        public Info(int d, int h) {
            this.diameter = d;
            this.height = h;
        }
    }

    // approach 2 - O(N)
    public static Info diameter2(Node root) {
        if(root == null) {
            return new Info(0, 0);
        }

        Info leftData = diameter2(root.left);
        Info rightData = diameter2(root.right);

        int selfDiam = leftData.height + rightData.height + 1;
        int dia = Math.max(selfDiam, Math.max(leftData.diameter, rightData.diameter));

        int ht = Math.max(leftData.height, rightData.height) + 1;

        return new Info(dia, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(6);
        root.left.right = new Node(5);

        System.out.println(diameter(root));
        System.out.println(diameter2(root).diameter);
    }
}

