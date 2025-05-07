package BST;
import java.util.*;

// convert bst to balanced bst

public class BSTToBalancedBST {
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

    public static void getInorder(Node root, ArrayList<Integer> inorder) {
        if(root == null) {
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node getBalancedBST(ArrayList<Integer> inorder, int sp, int ep) {
        if(sp > ep) {
            return null;
        }

        int mid = (sp+ep)/2;
        Node root = new Node(inorder.get(mid));

        root.left = getBalancedBST(inorder, sp, mid-1);
        root.right = getBalancedBST(inorder, mid+1, ep);
        return root;
    }

    public static Node convertBST(Node root) {
        // get inorder sequence
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // get balanced bst using inorder sequence
        return getBalancedBST(inorder, 0, inorder.size()-1);
    }

    public static void main(String[] args) {
        Node root1 = new Node(8);
        root1.left = new Node(6);
        root1.left.left = new Node(5);
        root1.left.left.left = new Node(3);

        root1.right = new Node(10);
        root1.right.right = new Node(11);
        root1.right.right.right = new Node(12);

        Node root = convertBST(root1);
        preorder(root);
        
    }
}
