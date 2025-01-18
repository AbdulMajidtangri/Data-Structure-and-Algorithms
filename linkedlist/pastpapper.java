class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
        this.next = null;
    }
    public static int size(Node head1, Node head2) {
        int size1 = 0, size2 = 0;
        Node temp1 = head1, temp2 = head2;
        while (temp1 != null) {
            size1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }
        int mix = size1 + size2;
        return mix;
    }
    public static Node[] merge(Node head1, Node head2) {
        int size = Node.size(head1, head2);
        Node[] merged = new Node[size];
        int i = 0;
        Node temp1 = head1;
        while (temp1 != null) {
            merged[i] = temp1;
            i++;
            temp1 = temp1.next;
        }
        temp1 = head2;
        while (temp1 != null) {
            merged[i] = temp1;
            i++;
            temp1 = temp1.next;
        }
        return merged;
    }
    public static void main(String[] args) {
        Node head = new Node("list");
        head = null;
        Node head1 = new Node("Fruit");
        head1.next = new Node("Cake");
        head1.next.next = new Node("Bread");
        Node head2 = new Node("Chicken");
        head2.next = new Node("Beef");
        head2.next.next = new Node("Potato");
        Node head3[] = Node.merge(head1, head2);
        System.out.println("Merged Linked List is:");
       
    }
}