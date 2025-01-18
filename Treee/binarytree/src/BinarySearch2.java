
public class BinarySearch2 {
    int key, height;
    BinarySearch2 left, right;
    public static final BinarySearch2 nill = new BinarySearch2(); // Initialize nill node

    // Default constructor for nill node
    BinarySearch2() {
        left = right = this;  // nill points to itself
        height = -1;          // nill has height -1
    }

    // Constructor for actual nodes
    public BinarySearch2(int key, BinarySearch2 left, BinarySearch2 right) {
        this.key = key;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }

    // Constructor to create a leaf node
    public BinarySearch2(int key) {
        this.key = key;
        left = right = nill;  // Leaf nodes point to nill
        height = 0;           // Leaf nodes have height 0
    }

    // Corrected size method
    public int size() {
        if (nill == null) {  // Stop recursion if this is the nill node
            return 0;
        }
        return 1 + left.size() + right.size();  // Recursively calculate size
    }

    public String toString() {
        if (this == nill) { 
            return "";  // Return empty string for nill
        }
        return left.toString() + " " + key + " " + right.toString(); // In-order traversal
    }

    public boolean add(int key) {
        int oldSize = size();
        grow(key);
        return size() > oldSize;
    }

    public BinarySearch2 grow(int key) {
        if (this == nill) {
            return new BinarySearch2(key);  // Insert new node if nill
        }
        if (key == this.key) {
            return this;  // Prevent duplicates
        }
        if (key < this.key) {
            left = left.grow(key);
        } else {
            right = right.grow(key);
        }
        rebalance();
        height = 1 + Math.max(left.height, right.height);
        return this;
    }

    public void rebalance() {
        if (right.height > left.height + 1) {
            if (right.left.height > right.right.height) {
                right.rotateRight();
            }
            rotateLeft();
        } else if (left.height > right.height + 1) {
            if (left.right.height > left.left.height) {
                left.rotateLeft();
            }
            rotateRight();
        }
    }

    private void rotateLeft() {
        BinarySearch2 newLeft = new BinarySearch2(key, left, right.left);
        key = right.key;
        right = right.right;
        left = newLeft;
    }

    private void rotateRight() {
        BinarySearch2 newRight = new BinarySearch2(key, left.right, right);
        key = left.key;
        left = left.left;
        right = newRight;
    }

    public static void main(String[] args) {
        BinarySearch2 tree = new BinarySearch2();
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);

        System.out.println("Tree size: " + tree.size());
        System.out.println("Tree contents: " + tree);
    }
}
