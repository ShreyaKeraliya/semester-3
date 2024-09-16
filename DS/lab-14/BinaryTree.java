import java.util.*;

class Node {
        int value;
        Node left, right;
        
        public Node(int value) {
            this.value = value;
            }
    }
    class Tree{
        Node root;
        
        public Node constTree(int[] a, int i) {
            if (i>=a.length) {
                return null;
            }
            Node temp = new Node(a[i]);
            temp.left = constTree(a, 2*i+1);
            temp.right = constTree(a, 2*i+2);
            return temp;

        }
        public void preorder(Node node) {
            if (node != null) {
                System.out.print(node.value + "->");
                preorder(node.left);
                preorder(node.right);
            }
        }
        public void inorder(Node node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.value + "->");
                inorder(node.right);
            }
        }
        public void postorder(Node node) {
            if (node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.print(node.value + "->");
            }
        }
    }
    public class BinaryTree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Tree tree = new Tree();
            tree.root = tree.constTree(a, 0);
            System.out.println("preorder");
            tree.preorder(tree.root);
            System.out.println();
            System.out.println("inorder");
            tree.inorder(tree.root);
            System.out.println();
            System.out.println("postorder");
            tree.postorder(tree.root);

        }

    
}