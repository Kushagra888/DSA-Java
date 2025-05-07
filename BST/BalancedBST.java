package BST;

//  sorted array to balanced BST

public class BalancedBST {
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

    public static Node createBST(int arr[], int sp, int ep) {
        if(sp > ep) {
            return null;
        }

        int mid = (sp+ep)/2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, sp, mid-1);
        root.right = createBST(arr, mid+1, ep);

        return root;

    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = createBST(arr, 0, arr.length-1);
        preorder(root);
        
    }
}
