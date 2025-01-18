class Binarytree {
    int data;
    Binarytree left;
    Binarytree right;
    int height;
    private static final Binarytree nill = new Binarytree();

    private Binarytree() {
        height = -1;
        this.left = this.right = nill;
    }

    Binarytree(int data) {
        this.data = data;
        height = 0;
        this.left = this.right = nill;
    }

    Binarytree(int data, Binarytree left, Binarytree right) {
        this.data = data;
        this.left = left;
        this.right = right;
        height = 1 + Math.max(left.height, right.height);
    }

    public int size() {
        if (left == nill && right == nill) {
            return 1;
        }
        if (left == null) {
            return 1 + right.size();
        }
        if (right == null) {
            return 1 + left.size();
        }
        return 1 + (left.size() + right.size());
    }

    public void add(int key) {
        grow(key);
    }

    public Binarytree grow(int key) {
        if (this == nill) {
            return new Binarytree(key);
        }
        if (key == data) {
            return this;
        }
        if (data < key) {
            if (right == nill) {
                this.right = new Binarytree(key);

            } else {
                right = right.grow(key);
            }
        }
        if (data > key) {
            if (left == null) {
                this.left = new Binarytree(key);
            } else {
                left = left.grow(key);
            }
        }
        reblanace();
        height = 1 + Math.max(left.height, right.height);

        return this;
    }

    private void reblanace() {
        if (right.height > left.height + 1) {
            if (right.left.height > right.right.height) {
                right.RotateRight();
            }
            RotateLeft();
        }
        if (left.height > right.height + 1) {
            if (left.right.height > left.left.height) {
                left.RotateLeft();
            }
            RotateRight();
        }
    }

    private void RotateLeft() {
        left = new Binarytree(data, left, right.left);
        data = right.data;
        right = right.right;
    }

    private void RotateRight() {
        right = new Binarytree(data, left.right, right);
        data = left.data;
        left = left.left;
    }

    public int height() {
        if (left == nill && right == nill) {
            return 0;
        }
        if (left == nill) {
            return 1 + right.height();
        }
        if (right == nill) {
            return 1 + left.height();
        }
        return 1 + Math.max(left.height(), right.height());
    }

    public void Inorder() {
        if (this == nill) {
            return;
        }
        left.Inorder();
        System.out.print(" " + data + " ");
        right.Inorder();

    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        if (this == nill) {
            return buffer + "";
        }
        if (left != nill) {
            buffer.append("" + left.toString());
        }
        buffer.append(" "+data);
        if (right != null) {
            buffer.append("" + right.toString());
        }

        return buffer + "".trim();
    }

    public String toStringpost() {
        StringBuffer buffer = new StringBuffer();
        if (this == nill) {
            return buffer + "";
        }
        if (left != nill) {
            buffer.append("" + left.toString());
        }

        if (right != null) {
            buffer.append("" + right.toString());
        }
        buffer.append(" "+data);
        return buffer + "".trim();
    }
public boolean isFulltree(Binarytree b){
int actualheigth = b.height();
int  size = (int)Math.pow(2,b.height()-1)+1;
if(size== b.size()){
    return true;
}
return false;
}
    public boolean search(int key) {
        if (this == nill) {
            return false;
        }
        if (key == data) {
            return true;
        }
        return left.search(key) || right.search(key);
    }

    public boolean search2(int key) {
        if (this == nill) {
            return false;
        }
        if (key == data) {
            return true;
        }
        if (left != nill && key < left.data) {
            left.search2(key);
        }
        if (right != nill && key > right.data) {
            right.search2(key);
        }
        return false;
    }
}

public class Practise {
    public static void main(String[] args) {

        Binarytree root = new Binarytree(4);
        root.add(5);
        root.add(10);
        root.add(100);
        root.add(110);
        root.add(120);
        root.add(130);
        root.add(140);
        root.add(7);
        root.add(2);
        root.add(3);
        root.add(1);
        root.add(0);
        root.add(99);
        root.add(44);
        root.add(66);
        root.add(80);
        System.out.println(root.toString());
        System.out.println("post Order traversal :");
        System.out.print(root.toStringpost());
        System.out.print("<- Root element");
        System.out.println();
        System.out.println("Doing linear Searching :" + root.search(80));
        System.out.println("Doing Searching by the complexity OF (Log)n :" + root.search(40));
    }
}