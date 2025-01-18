public class doublylinkedlist {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head = null;

    public void insertAtHead(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void insertAtend(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        newnode.prev = temp;

    }

    public void insertAtposition(int data, int pos) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        if (pos == 1) {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        } else {
            int count = 1;
            Node temp = head;
            while (count < pos - 1 && temp.next != null) {
                temp = temp.next;
                count++;
            }
            if (temp.next == null) {
                temp.next = newnode;
                newnode.prev = temp;
                newnode.next = null;
            } else if (temp.next != null) {
                newnode.next = temp.next;
                newnode.prev = temp;
                temp.next = newnode;

            }
        }
    }

    public void deleteAtstart() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null)
            return;
        if (head.next == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public void deleteAtpos(int pos) {
        if (head == null)
            return;
        if (pos == 0) {
            head = head.next;
        }
        Node temp = head;
        int count = 0;
        while (count < pos && temp != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null)
            return;

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublylinkedlist d1 = new doublylinkedlist();
        d1.insertAtHead(2);
        d1.insertAtHead(4);
        d1.insertAtHead(8);
        d1.insertAtHead(12);
        d1.insertAtposition(20, 5);
        d1.displayForward();
        // d1.deleteAtEnd();
        // d1.displayForward();

        // d1.deleteAtstart();
        // d1.displayForward();
        d1.deleteAtpos(2);
        d1.displayForward();
    }
}