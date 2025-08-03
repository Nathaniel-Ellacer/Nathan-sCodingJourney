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

        System.out.print("Enter value for root node: ");
        root = new Node(scanner.nextInt());

        System.out.print("Enter value for left child of root node: ");
        root.left = new Node(scanner.nextInt());

        System.out.print("Enter value for right child of root node: ");
        root.right = new Node(scanner.nextInt());

        System.out.print("Enter value for left child of node 2: ");
        root.left.left = new Node(scanner.nextInt());
    }

    public void display(Node node) {
        if (node != null) {
            System.out.print(node.value + " ");
            display(node.left);
            display(node.right);
        }
    }
}

public class Bina {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertNodes();
        System.out.println("Tree values in pre-order:");
        tree.display(tree.root);
    }
}