public class reverselink {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        public static Node Recursive(Node current, Node prev) {
            if (current == null) {
                return prev;
            }
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
          return  Recursive(current, prev);
        }
        // public static Node reverse(Node head){
        // Node current = head;
        // Node prev = null;
        // while (current!=null) {
        // Node temp = current.next;
        // current.next = prev;
        // prev = current;
        // current = temp;
        // }
        // return prev;
        // }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        Node current = head;
        Node prev = null;
        Node r = Node.Recursive(current, prev);
        while (r!= null) {
            System.out.print(r.data+" ");
            r = r.next;
        }                           
        // Node reversed = Node.reverse(head);
        // while (reversed!=null) {
        // System.out.print(reversed.data + " ");
        // reversed = reversed.next;
        // }
    }
}
