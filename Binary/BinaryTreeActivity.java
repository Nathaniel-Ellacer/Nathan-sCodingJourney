package Binary;

import java.util.Scanner;

class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public void insertNodes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input values for the binary tree:\n");
        System.out.print("Enter value for root node: ");
        root = new Node(scanner.nextInt());

        System.out.print("Enter value for left child of root node: ");
        root.left = new Node(scanner.nextInt());

        System.out.print("Enter value for right child of root node: ");
        root.right = new Node(scanner.nextInt());

        System.out.print("Enter value for left child of node 2: ");
        root.left.left = new Node(scanner.nextInt());
        
        scanner.close(); // Close scanner to avoid resource leaks
    }

    public void displayPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            displayPreOrder(node.left);
            displayPreOrder(node.right);
        }
    }

    public void displayPostOrder(Node node) {
        if (node != null) {
            displayPostOrder(node.left);
            displayPostOrder(node.right);
            System.out.print(node.value + " ");
        }
    }
}

public class BinaryTreeActivity {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertNodes();
        
        System.out.println("Tree values in pre-order:");
        tree.displayPreOrder(tree.root);

        System.out.println("\nTree values in post-order:");
        tree.displayPostOrder(tree.root);
    }
}