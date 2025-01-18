public class binarysearch {
    int key, height;
    binarysearch left, right;
    public static final binarysearch nill = new binarysearch();

    binarysearch() {
        left = right = this;
        height = -1;
    }

    public binarysearch(int key) {
        this.key = key;
        left = right = nill;
        height = 0;
    }

    private binarysearch(int key, binarysearch left, binarysearch right) {
        this.key = key;
        this.left = left;
        this.right = right;
        this.height = 1 + Math.max(left.height, right.height);
    }

    public int size() {
        if (this == nill) {
            return 0;
        }
        return 1 + left.size() + right.size();
    }

    public String toString() {
        if (this == nill) {
            return "";
        }
        return left.toString() + " " + key + "  " + right.toString(); // In-order traversal in tree
    }  public String toString2() {
        if (this == nill) {
            return "";
        }
        return left.toString() + " "+right.toString() +" "+ key ; // postorder traversal in tree
    }

    public boolean add(int key) {
        int oldsize = size();
        grow(key);
        return size() > oldsize;
    }

    public binarysearch grow(int key) {
        if (this == nill) {
            return new binarysearch(key);
        }
        if (key == this.key) {
            return this; // Prevent duplication
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
        }
        if (left.height > right.height + 1) {
            if (left.right.height > left.left.height) {
                left.rotateLeft();
            }
            rotateRight();
        }
    }

    private void rotateLeft() {
        left = new binarysearch(key, left, right.left);
        key = right.key;
        right = right.right;
    }

    private void rotateRight() {
        right  = new binarysearch(key, left.right, right);
        key = left.key;
        left = left.left;
    }

    public boolean search(int key) {
        if (this == nill) {
            return false;
        }
        if (this.key == key) {
            return true;
        } else if (this.key > key) {
            if (this.left != null) {
                return this.left.search(key);
            }
        } else {
            if (this.right != null) {
                return this.right.search(key);
            }
        }
        return false;
    }

    public static void main(String[] args) {
 binarysearch b1 = new binarysearch(22);
  b1.add(33);
   b1.add(44);
 b1.add(55); 
 b1.add(66);
 b1.add(77); b1.add(88);
  b1.add(87); b1.add(99); b1.add(95);
 b1.add(105);
 System.out.println( b1.toString());
 System.out.println();
 System.out.println(b1.toString2());
//   System.out.println(b1.size());
//  System.out.println(b1.search(
//     79));
    }
}
