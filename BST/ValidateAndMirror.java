package BST;

// validate bst
// mirror bst

public class ValidateAndMirror {
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


    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean validate(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }

        if(min != null && root.data <= min.data) {
            return false;
        }
        if(max != null && root.data >= max.data) {
            return false;
        }

        return validate(root.left, min, root) && validate(root.right, root, max);
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    public static Node mirrorBst(Node root) {
        if(root == null) {
            return null;
        }

        Node leftMirror = mirrorBst(root.left);
        Node rightMirror = mirrorBst(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        preorder(root);

        System.out.println();
        System.out.println();
        System.out.println();

        root = mirrorBst(root);

        preorder(root);

        // System.out.println(validate(root, null, null));
        
    }
}
