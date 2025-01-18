public class Node {
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
    public static Node insertAtHead(Node head,int data){
        if(head == null){
            return head;
        }
        head = new Node(data, head);
        return head;
    }
    public static Node insetAtTail(Node head,int val){
Node newnode = new Node(val);
        if(head == null){
            head = newnode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;
    }
    public static Node insertAtposition(Node head,int pos,int val){
        Node n = new Node(val);
        int count = 1;
        if(pos==1){
            n.next = head;
            head = n;
            return head;
        }
        Node temp = head;
        while (count<pos-1) {
            temp = temp.next;
            count++;
        }
        if(temp == null){
          throw new IllegalStateException("Cannot Enter More Elements");
        }
        n.next = temp.next;
        temp.next = n;
        return head;
    }
    public static Node deleteAtHead(Node head){
        if(head== null){
            return head;
        }
        head = head.next;
        return head;
    }
    public static Node  deleteAtTail(Node head){
        if(head== null){
            return head;
        }
        Node temp = head;
        while (temp.next.next != null) {
           temp = temp.next; 
        }
        temp.next =null;
        return head;
    }
    public static Node deleteAtPosition(Node head,int pos){
        if(pos==1){
            head = head.next;
            return head;
        }
        Node temp = head;
        int count =1;
        while (temp!= null) {
            count++;
if(count==pos){
    temp.next = temp.next.next;
}
            temp = temp.next;  
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head = insertAtHead(head, 4);
        head = insetAtTail(head,44);
        head  = insertAtposition(head,4,2200);
        head = deleteAtHead(head);
        head = deleteAtTail(head);
        head = deleteAtPosition(head, 1);
        while (head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
