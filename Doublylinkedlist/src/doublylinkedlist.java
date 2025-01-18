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

    public void insertAtHead(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void insertAtEnd(int val) {
        Node newnode = new Node(val);
        Node temp = head;
        if (head == null) {
            head = newnode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = head;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtposition(int val, int pos) {
        Node newnode = new Node(val);
        if (pos == 0) {
            insertAtHead(val);
        }
        int count = 0;
        Node temp = head;
        while (count < pos - 1 && temp.next != null) {
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            newnode.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newnode;
            }
            newnode.prev = temp;
            temp.next = newnode;
        }
    }

    public void deleteAtHead() {
        if (head == null) {
            return;
        }
        head = head.next;

    }

    public void deletetail() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtposi(int pos) {
        if (pos == 0) {
            head = head.next;
        }
        if (head == null) {
            return;
        }
        int count = 0;
        Node temp = head;
        while (count < pos && temp.next != null) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            return; 
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }
    public static void main(String[] args) {
        doublylinkedlist dl = new doublylinkedlist();
        System.out.println("The values are inserted at head");
        dl.insertAtHead(34);
        dl.insertAtHead(40);
        dl.printlist();
        System.out.println();
        System.out.println("The value is inserted at end");
        dl.insertAtEnd(70);
        dl.printlist();
        System.out.println("\nThe values are inserted at any position");
        dl.insertAtposition(100, 2);
        System.out.println();
        dl.printlist();

        // System.out.println("\nThe tail is deleted");
        // dl.deletetail();
        // System.out.println();

        // dl.printlist();

        // System.out.println("\nThe head is deleted");
        // dl.deleteAtHead();

        // System.out.println(
        // );
        // dl.printlist();
        System.out.println("The element is deleted at any position");
        System.out.println();
        dl.deleteAtposi(2);
        dl.printlist();
    }
}