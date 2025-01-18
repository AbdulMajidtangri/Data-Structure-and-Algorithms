public class Binarytree {
    Object data;
    Binarytree left;
    Binarytree right;

    Binarytree(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Binarytree(Object data, Binarytree left, Binarytree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void sentdata(Object data) {
        this.data = data;
    }

    public void setleft(Binarytree left) {
        this.left = left;

    }

    public void setright(Binarytree right) {
        this.right = right;
    }

    public Object getdata() {
        return data;
    }

    public Binarytree getleft() {
        return left;
    }

    public Binarytree getright() {
        return right;
    }

    public void printlist(Binarytree b) {
        if (b == null)
            return;
        if (b.left != null) {
            System.out.println("Left Size " + left.data + " Element is :" + b.left.data);
        }
        if (b.right != null) {
            System.out.println("Right Size " + right.data + " Element is :" + b.right.data);
        }
        printlist(b.left);
        printlist(b.right);
    }

    public int size() {
        if (left == null && right == null) {
            return 1;
        }
        if (left == null) {
            return 1 + right.size();
        }
        if (right == null) {
            return 1 + left.size();
        }
        return 1 + left.size() + right.size();
    }

    public int height() {
        if(this== null){
            return 0;
        }
        int leftheight =(left != null) ? left.height() : 0;
        int rightheight = (right != null) ? right.height() : 0;
        // if (left == null && right == null) {
        //     return 0;
        // }

        // if (left == null) {
        //     return 1 + right.height();
        // }
        // if (right == null) {
        //     return 1 + left.height();
        // }
        return 1 + Math.max(leftheight, rightheight);
    }

    public boolean isLeaf() {
        return (left == null && right == null);
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (left != null) {
            sb.append(left + "");
        }
        sb.append(data);
        if (right != null) {
            sb.append(right + "");
        }
        return sb + "";
    }

    public String preOrdertoString() {
        StringBuffer sb = new StringBuffer();
        sb.append(data);
        if (left != null) {
            sb.append(left.preOrdertoString() + "");
        }
        if (right != null) {
            sb.append(right.preOrdertoString() + "");
        }
        return sb + "";
    }

    public String postOrdertoString() {
        StringBuffer sb = new StringBuffer();
        if (left != null) {
            sb.append(left.postOrdertoString() + "ma");
        }
        if (right != null) {
            sb.append(right.postOrdertoString() + "");
        }
        sb.append(data);
        return sb + "";
    }

    public boolean isFulltree(Binarytree a) {
        int height = a.height();
        int size = (int) Math.pow(2, a.height() + 1) - 1;
        if (size == a.size()) {
            return true;
        }
        return false;
    }

    public boolean Search(Object s, Binarytree a) {
        if (a == null) {
            return false;
        }
        if (a.data.equals(s)) {
            return true;
        }
        return Search(s, a.left) || Search(s, a.right);
    }

    public static void main(String[] args) {
        Binarytree e = new Binarytree("E", null, null);
        Binarytree c = new Binarytree("C", null, null);
        Binarytree D = new Binarytree("D", null, null);
        Binarytree B = new Binarytree("B", D, e);
        Binarytree A = new Binarytree("A", B, c);

        System.out.println(A.size());
        System.out.println(A.height());
        // pinting the tree in Inorder way
        String s = A.toString();
        System.out.println("InOrder traversal : "+s);
        // printing the PreOrder
        System.out.println();
        String s2 = A.preOrdertoString();
        System.out.println("PreOrder traversal : "+s2);
        System.out.println();
        // print the post order
        String s3 = A.postOrdertoString();
        System.out.println("PostOrder traversal : "+s3);
        // Chjekc the tree is full or not
        System.out.println(A.isFulltree(A));
        Binarytree g1 = new Binarytree("g");
        Binarytree f1 = new Binarytree("F");
        Binarytree e1 = new Binarytree("E");
        Binarytree c1 = new Binarytree("C", f1, g1);
        Binarytree D1 = new Binarytree("D");
        Binarytree B1 = new Binarytree("B", D1, e1);
        Binarytree A1 = new Binarytree("A", B1, c1);
        // cheacking the tree is this tree is full or not
        System.out.println("The tree is Full Not : "+A1.isFulltree(A1));
        // Searching in the Tree
        System.out.println("the Searching in the tree : "+A1.Search("C", A1));
    }
}
