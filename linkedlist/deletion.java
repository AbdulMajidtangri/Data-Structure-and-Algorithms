public class deletion{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public Node deletehead(Node head) {
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;

    }

    public Node deletelast(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public Node removek(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }
        
        int connt = 0;
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            connt++;
            if (connt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public Node removeElement(Node head, int elm) {
        if (head == null)
            return head;
        if (head.data==elm) {
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }
     
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            if (temp.data==elm) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public void printlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node i = new Node(6);
        Node e = new Node(12);
        Node o = new Node(5);
        head.next = i;
        i.next = e;
        e.next = o;

     deletion p = new deletion();
        // p.printlist(head);
        // Node t = p.deletehead(head);
        // System.out.println();
        // p.printlist(t);
        // Node r = p.deletelast(head);
        // System.out.println();
        // p.printlist(r);
        // System.out.println();
        // Node tr = p.removek(head, 3);
        // Node q = p.removeElement(head,12);
        Node q = p.removek(head,4);
        p.printlist(q);
    }

}