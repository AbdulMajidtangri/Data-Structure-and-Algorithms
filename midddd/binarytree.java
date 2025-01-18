class AVL {
    int data;
    AVL left;
    AVL right;
    int height;
    private static final AVL nill = new AVL();

    // Private constructor for nill node
    private AVL() {
        left = right = nill;
        height = -1;
    }

    // Constructor for regular nodes with a single data point
    AVL(int data) {
        this.data = data;
        this.left = nill;
        this.right = nill;
        height = 1;
    }

    // Constructor for nodes with specific left and right children
    AVL(int data, AVL left, AVL right) {
        this.data = data;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }

    // Method to calculate the size of the tree
    public int size() {
        if (this == nill) return 0;
        return 1 + left.size() + right.size();
    }

    // Method to add a new key to the tree
    public void add(int key) {
        grow(key);
    }

    // Helper method to grow the tree with a new key
    public AVL grow(int key) {
        if (this == nill) {
            return new AVL(key);
        }
        if (this.data > key) {
            if (left == nill) {
                left = new AVL(key);
            } else {
                left = left.grow(key);
            }
        } else if (this.data < key) {
            if (right == nill) {
                right = new AVL(key);
            } else {
                right = right.grow(key);
            }
        } else {
            return this; // Key is already present
        }

        // Update height and rebalance the tree
        height = 1 + Math.max(left.height, right.height);
        return rebalance();
    }

    // Rebalancing the tree if needed
    public AVL rebalance() {
        if (left.height > right.height + 1) {
            if (left.right.height > left.left.height) {
                left = left.RotateLeft();
            }
            return RotateRight();
        } else if (right.height > left.height + 1) {
            if (right.left.height > right.right.height) {
                right = right.RotateRight();
            }
            return RotateLeft();
        }
        return this;
    }

    // Right rotation
    private AVL RotateRight() {
     right = new AVL(data, left.right, right);
     left = left.left;
     data = left.data;
        updateHeight();
        return right;
    }

    // Left rotation
    private AVL RotateLeft() {
        left = new AVL(data, left, right.left);
        data = right.data;
        right = right.right;
        updateHeight();
       return left;
    }

    private void updateHeight() {
        height = 1 + Math.max(left.height, right.height);
    }

    public String toString() {
        if (this == nill) return "";
        return left.toString() + " " + data + " " + right.toString();
    }
}

public class binarytree {
    public static void main(String[] args) {
        AVL a = new AVL(10);
        a.add(14);
        a.add(18);
        a.add(13);
        a.add(17);
        a.add(8);
        a.add(9);
        a.add(6);
        a.add(7);
        a.add(4);
        System.out.println("In-order Traversal of AVL Tree: " + a.toString());
        System.out.println("Size of AVL Tree: " + a.size());
    }
}
