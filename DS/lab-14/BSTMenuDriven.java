import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}

class BinarySearchTree {
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

    void delete(int data) {
        root = deleteRec(root, data);
    }

    Node deleteRec(Node root, int data) {
        if (root == null)
            return root;

        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else {
            if (root.left == null){
                return root.right;
            }    
            else if (root.right == null){
                return root.left;
            }    

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    boolean search(int data) {
        return searchRec(root, data);
    }

    boolean searchRec(Node root, int data) {
        if (root == null)
            return false;

        if (root.data == data)
            return true;

        if (root.data > data)
            return searchRec(root.left, data);
        else
            return searchRec(root.right, data);
    }

    void printInOrder() {
        printInOrderRec(root);
    }

    void printInOrderRec(Node root) {
        if (root != null) {
            printInOrderRec(root.left);
            System.out.print(root.data + " ");
            printInOrderRec(root.right);
        }
    }
}

public class BSTMenuDriven {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Binary Search Tree Menu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search a node");
            System.out.println("4. Print In-Order Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the data to insert: ");
                    int data = scanner.nextInt();
                    bst.insert(data);
                    break;
                case 2:
                    System.out.print("Enter the data to delete: ");
                    data = scanner.nextInt();
                    bst.delete(data);
                    break;
                case 3:
                    System.out.print("Enter the data to search: ");
                    data = scanner.nextInt();
                    if (bst.search(data))
                        System.out.println("Node found!");
                    else
                        System.out.println("Node not found!");
                    break;
                case 4:
                    System.out.println("In-Order Traversal: ");
                    bst.printInOrder();
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}