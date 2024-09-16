import java.util.*;

class Node {
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data = data;
            }
    }
    class Tree{
        Node root;
        
        void insert(int data) {
            root = insertRec(root, data);
        }
    
        Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
    
            if (data < root.data)
                root.left = insertRec(root.left, data);
            else if (data > root.data)
                root.right = insertRec(root.right, data);
    
            return root;
        }
    
        public void preorder(Node node) {
            if (node != null) {
                System.out.print(node.data + "->");
                preorder(node.left);
                preorder(node.right);
            }
        }
        public void inorder(Node node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.data + "->");
                inorder(node.right);
            }
        }
        public void postorder(Node node) {
            if (node != null) {
                postorder(node.left);
                postorder(node.right);
                System.out.print(node.data + "->");
            }
        }
    }
    public class BSTtraversals {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Tree tree = new Tree();
            for (int i = 0; i < n; i++) {
                int data = sc.nextInt();
                tree.insert(data);
            }
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