class BT {
    int data;
    BT left, right;

    public BT(int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public BT(int data, BT left, BT right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void postOrder(BT z) {
        if (z == null) {
            return;
        }
        postOrder(z.left);
        postOrder(z.right);
        System.out.print(" " + z.data + " ");

    }

    public void inOrder(BT z) {
        if (z == null) {
            return;
        }
        inOrder(z.left);
        System.out.print(" " + z.data + " ");
        inOrder(z.right);
    }

    public void preOrder(BT z) {
        if (z == null) {
            return;
        }
        System.out.print(" " + z.data + " ");
        preOrder(z.left);
        postOrder(z.right);
    }

    public void Add(int data) {
        if (data > this.data) {
            if (this.right == null) {
                this.right = new BT(data);
            } else {
                this.right.Add(data);
            }

        } else {
            if (this.left == null) {
                this.left = new BT(data);
            } else {
                this.left.Add(data);
            }
        }
    }
public int size(){
    if(this.left == null && this.right == null){
        return 1;
}
if(left== null){
    return 1 + right.size();
}
if(right == null){
    return 1 + left.size();
}
return  1 + left.size() + right.size();
}
public int Height(){
    if(this.left == null && this.right == null){
        return 0;
}
if(left== null){
    return 1 + right.Height();
}
if(right == null){
    return 1 + left.Height();
}
return  1 + left.Height() + right.Height();
}
public void rebalance() {
    if (right.Height() > left.Height() + 1) {
        if (right.left.Height() > right.right.Height()) {
            right.rotateRight();
        }
        rotateLeft();
    } else if (left.Height() > right.Height() + 1) {
        if (left.right.Height() > left.left.Height()) {
            left.rotateLeft();
        }
        rotateRight();
    }
}

private void rotateLeft() {
    BT newLeft = new BT(data, left, right.left);
    data = right.data;
    right = right.right;
    left = newLeft;
}

private void rotateRight() {
    BT newRight = new BT(data, left.right, right);
    data = left.data;
    left = left.left;
    right = newRight;
}

}
public class start {
    public static void main(String[] args) {
        // BT f = new BT(1);
        // BT e = new BT(5);
        // BT D = new BT(2);
        // BT C = new BT(44,e,f);
        // BT B = new BT(34,D,null);
        // BT A = new BT(300,B,C);
        // System.out.println("travesing the tree in Postorder");
        // A.postOrder(A);
        // System.out.println("travesing the tree in InOrder");
        // A.inOrder(A);
        // System.out.println("travesing the tree in Pretorder");
        // A.preOrder(A);
        BT b = new BT(10);
        b.Add(5);
        b.Add(15);
        b.Add(12);
        b.Add(16);
        b.Add(3);
        b.Add(4);
        b.Add(2);
        b.Add(1);
        b.Add(0);
        b.Add(-1);
        // System.out.println("Post ORder traversal  of binary tree is");
        // b.postOrder(b);
        // System.out.println();
        // System.out.println("InOrder  traversal  of binary tree is");
        // b.inOrder(b);
    b.inOrder(b);
    System.out.println();
    System.out.println(b.data);
    }
}
