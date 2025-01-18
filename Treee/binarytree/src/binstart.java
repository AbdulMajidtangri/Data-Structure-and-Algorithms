public class binstart {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void postorder(Node head) {
        if (head == null) {
            return;
        }
        postorder(head.left);
        postorder(head.right);
        System.out.println("the values are :"+head.data);

    }
    public static void preorder(Node head) {
        if (head == null) {
            return;
        }
        System.out.println("the values are :"+head.data);
        postorder(head.left);
        postorder(head.right);
    }
    public static void inOrder(Node head) {
        if (head == null) {
            return;
        }
        postorder(head.left);
        System.out.println("the values are"+head.data);
        postorder(head.right);
    }
    public static void print(Node head) {
        if (head == null) {
            return;

        }
        System.out.println("The parent data " + head.data);
        if (head.left != null) {
            System.out.println("the left side data is " + head.left.data);
        } else {
            System.out.println("Noting is got left aT TNE LEFT SIDE");
        }
        if (head.right != null) {
            System.out.println("The right side data is " + head.right.data);
        } else {
            System.out.println("Nothing is left at right side");
        }
        print(head.left);
        print(head.right);
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        // binstart.print(n1);
        // binstart.postorder(n1);
        // binstart.preorder(n1);
        binstart.inOrder(n1);
    }
}