class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  public static Node Recursive(Node head, int k) {
   
    Node current = head;
    Node prev = null;
     Node temp = null;
    int count = 0;
    if(head==null || head.next==null){
      return head;
    }
    if (current == null) {
      return prev;
    }
   
    while (current != null && count < k) {
      temp = current.next;
      current.next = prev;
      prev = current;
      current = temp;
      count++;
    }

    if (temp != null) {
      head.next = Recursive(temp, k);
    }
    return prev;
  }
}

public class reverseinKgroup {

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
   
    Node r = Node.Recursive(head, 2);
    while (r != null) {
      System.out.print(r.data + " ");
      r = r.next;
    }
  }
}