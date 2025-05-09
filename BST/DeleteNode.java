package BST;

public class DeleteNode {
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

    public static Node inorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }



    public static Node delete(Node root, int val) {
        if(root == null) {
            return null;
        }

        if(root.data > val) {
            // left subtree
            root.left = delete(root.left, val);
        } 
        else if(root.data < val) {
            // right subtree
            root.right = delete(root.right, val);
        }
        else {
            // if it is a leaf node
            if(root.right == null && root.left == null) {
                return null;
            }

            // if only one child
            if(root.right == null) {
                return root.left;
            } else if(root.left == null) {
                return root.right;
            }

            // both child
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        root = delete(root, 5);

        System.out.println();

        inorder(root);
    }
}

