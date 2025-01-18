public class linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public Node insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = new Node(data);
        } else {
            newnode.next = head;
            head = newnode;
        }

        return head;
    }

    public Node insertt(int value) {
        if (head == null || head.data > value) {
            head = new Node(value, head);
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data > value) {
                break;
            }
            temp = temp.next;
        }
        temp.next = new Node(value, temp.next);
        return head;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // insert at head
    public Node insertAtHead(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        return head;
    }

    // insertAtPosition
    public Node insertAtPosition(int data, int position) {
        Node newnode = new Node(data);
        if (position == 1) {
            newnode.next = head;
            head = newnode;
        }
        int count = 1;
        Node temp = head;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    // insertAtEnd
    public Node InsertAtEnd(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = new Node(data);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }

    // deleteAtHead
    public Node deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
        return head;

    }

    public Node deleteAtPosition(int position) {
        if (position == 1) {
            head = head.next;
            return head;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
   public Node  deleteAtEnd(){
    if(head == null){
        return null;
    }
    Node temp = head ;
    while(temp.next.next!= null){
        temp = temp.next;
        }
        temp.next = null;
        return head ;
   }
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.head = l.insertt(44);
        l.head = l.insertt(5);
        l.head = l.insertt(31);
        l.head = l.insertt(1);
        l.print();
        System.out.println();
        l.head = l.insertAtHead(404);
        l.print();
        System.out.println();
        l.head = l.insertAtPosition(100, 3);
        l.print();
        System.out.println();
        l.head = l.InsertAtEnd(344);
        l.print();
        System.out.println();
        l.head = l.deleteAtPosition(8);
        l.print();
    }
}
