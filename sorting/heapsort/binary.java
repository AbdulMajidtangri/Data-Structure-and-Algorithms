public class binary {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static  void print(Node t){
        if(t == null)  return;
        System.out.println(" Root Node: " + t.data);

if(t.left != null){
    System.out.println("The left Node valus is :"+t.left.data);
}
else{
    System.out.println("The left Node is null");
}
if(t.right != null){
    System.out.println("The right Node valus is :"+t.right.data);
}
else{
    System.out.println("The right Node is null");
}

        print(t.left);
        print(t.right);
    }
    public static void main(String[] args) {
        Node n1 = new Node(23);
        Node n2 = new Node(45);
        Node n3 = new Node(60);
        Node n21= new Node(46);
        Node n22 = new Node(47);
        Node n31 = new Node(61);

        n1.left = n2;
        n1.right = n3;
        n2.left = n21;
        n2.right = n22;
        n3.left =  n31;
        binary.print(n1);
    }
}
