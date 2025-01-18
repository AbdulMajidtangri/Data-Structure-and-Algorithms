import java.util.Scanner;

class Beet {
    int data;
    Beet left;
    Beet right;

    Beet(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public void insert(int key) {
        if (key > data) {
            if (right == null) {
                this.right = new Beet(key);
            } else {
                right.insert(key);
            }
        } else {
            if (left == null) {
                this.left = new Beet(key);
            } else {
                left.insert(key);
            }
        }
    }
}

public class Well{
    public static Beet insertIntoBST(Beet root, int data) {
        if (root == null) {
            return new Beet(data);
        }
        if (data > root.data) {
            // Insert into the right subtree
            root.right = insertIntoBST(root.right, data);
        } else {
            // Insert into the left subtree
            root.left = insertIntoBST(root.left, data);
        }
        return root;
    }

    public static void takeInput(Beet root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to insert into the BST (-1 to stop):");
        int data = sc.nextInt();
        while (data != -1) {
            root = insertIntoBST(root, data);
            data = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String[] args) {
        Beet root = null;
        System.out.println("Input the data to create the BST:");
        takeInput(root);
    }
}
