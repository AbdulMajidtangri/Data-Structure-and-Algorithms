public class Binarytree {
    Object data;
    Binarytree left, right;

    Binarytree(Object data) {
        this.data = data;
        this.left = right = null;
    }

    Binarytree(Object data, Binarytree left, Binarytree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public String ToString() {
        StringBuffer sb = new StringBuffer();
        if (left != null) {
            sb.append(left + " ");
        }
        sb.append(data);
        if (right != null) {
            sb.append(right + " ");
        }
        return sb + "";
    }

    public String preOrder() {
        StringBuffer sb = new StringBuffer();
        sb.append(data);
        if (left != null) {
            sb.append(left.preOrder() + "");
        }
        if (right != null) {
            sb.append(right.preOrder() + " ");
        }
        return sb + "";
    }

    public String PostOrder() {
        StringBuffer sb = new StringBuffer();
        if (left != null) {
            sb.append(left.PostOrder() + " ");
        }
        if (right != null) {
            sb.append(right.PostOrder());
        }
        sb.append(data);
        return sb + "";
    }

    public static void main(String[] args) {
        Binarytree e = new Binarytree("E", null, null);
        Binarytree c = new Binarytree("C", null, null);
        Binarytree D = new Binarytree("D", null, null);
        Binarytree B = new Binarytree("B", D, e);
        Binarytree A = new Binarytree("A", B, c);
        System.out.println(A.ToString());
    }
}
