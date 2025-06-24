class Node {
    int data;
    Node left, right;

    // Constructor
    public Node(int data) {
        this.data = data;
    }
}

class BinarySearchTree {
    Node root;

    // Insert method
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Helper recursive function to insert a new value
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data); // Insert on left
        } else if (data > root.data) {
            root.right = insertRec(root.right, data); // Insert on right
        }

        return root;
    }

    // Inorder Traversal (Left -> Root -> Right)
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder Traversal of BST:");
        bst.inorder();
    }
}
