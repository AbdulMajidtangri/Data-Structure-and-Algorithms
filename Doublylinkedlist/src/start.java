public class start {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            this.data = val;
            this.next = null;
            this.prev = null;
        }

        Node(int val, Node next, Node prev) {
            this.data = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node insertAthead(Node head, int val) {
        if (head == null) {
            head = new Node(val);
            return head;
        } else {
            Node r = new Node(val);
            r.next = head;
            head.prev = r;
            head = r;
        }
        return head;
    }

    public static Node insertAtTail(Node head, int val) {
        Node newnod = new Node(val);
        if (head == null) {
            head = new Node(val);
            return head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnod;
            newnod.prev = temp;
        }
        return head;
    }

    public static Node insertAtpos(Node head, int val, int pos) {
        Node newnode = new Node(val);
        Node t = head;
        int c = 0;

        while (t != null) {
            c++;
            t = t.next;
        }
        if (head == null) {
            head = new Node(val);
            return head;
        }

        else {
            Node temp = head;
            int count = 1;
            if (pos == 1) {
                newnode.next = head;
                head.prev = newnode;
                head = newnode;
                return head;
            }
            while (temp != null) {
                count++;
                if (count == pos) {
                    break;
                }
                if (count == c) {
                    temp.next = newnode;
                    newnode.prev = temp;
                    return head;
                }
                temp = temp.next;
            }
            temp.next = new Node(val, temp.next, temp.next.prev);
        }

        return head;
    }

    public static void printlist(Node head) {
        Node temp = head;
        System.out.println();
        System.out.println("First moving forward in  the list");
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
        System.out.println();
        System.out.println("Now Moving backward in  the list");
        while (temp.prev != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.print(temp.data + " ");
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(22);
        Node n3 = new Node(33);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n1 = insertAtpos(n1, 233, 3);
        print(n1);
        // n1 = insertAtTail(n1, 0);
        // printlist(n1);
        // n1 = insertAthead(n1,23);
        // printlist(n1);
        // Node temp = n2;
        // System.out.println("Moving Backward");
        // while (temp!= null) {
        // System.out.println(temp.data);
        // temp = temp.prev;
        // }
        // temp = n2;
        // System.out.println("Moving forward");
        // while (temp.next!= null) {
        // System.out.println(temp.data);
        // temp = temp.next;
        // }
        // System.out.println(temp.data);
        // System.out.println("Moving from start to end");
        // while (temp!= null) {
        // System.out.println(temp.data);
        // temp = temp.prev;
        // }

    }
}