package BST;
import java.util.*;

// merge 2 bsts in a single bst

public class MergeBSTs {
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

    public static Node createBST(ArrayList<Integer> list, int sp, int ep) {
        if(sp > ep) {
            return null;
        }

        int mid = (sp+ep)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, sp, mid-1);
        root.right = createBST(list, mid+1, ep);

        return root;

    }


    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> inorder1 = new ArrayList<>();
        ArrayList<Integer> inorder2 = new ArrayList<>();

        getInorder(root1, inorder1);
        getInorder(root2, inorder2);

        ArrayList<Integer> finalList = new ArrayList<>();
        int i=0, j=0;

        while(i < inorder1.size() && j < inorder2.size()) {
            if(inorder1.get(i) < inorder2.get(j)) {
                finalList.add(inorder1.get(i));
                i++;
            } else {
                finalList.add(inorder2.get(j));
                j++;
            }
        }

        while(i < inorder1.size()) {
            finalList.add(inorder1.get(i));
            i++;
        }

        while(j < inorder2.size()) {
            finalList.add(inorder2.get(j));
            j++;
        }

        return createBST(finalList, 0, finalList.size()-1);

    }
    
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        preorder(root);

    }
}
