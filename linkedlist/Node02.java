public class Node02 {

  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }

  }

  public static class Linklist {
    Node head = null;
    Node tail = null;

    void addElementAtstart(int val) {
      Node e = new Node(val);
      if (head == null) {
        head = e;
        tail = e;

      } else {
        e.next = head;
      }
      head = e;
    }

    void insertAt(int index, int val) {
      Node n1 = new Node(val);
      Node t = head;
      for (int i = 1; i <= index - 1; i++) {
        t = t.next;
      }
      n1.next = t.next;
      t.next = n1;

    }

    void addAtEnd(int e) {
      Node n = new Node(e);
      if (head == null) {
        head = n;
        tail = n;
      } else {
        tail.next = n;
      }
      tail = n;
    }

    void display() {
      Node t = head;
      while (t != null) {
        System.out.print(t.data + " ");
        t = t.next;
      }                

    }

    int size() {
      int r = 0;
      Node t = head;
      while (t != null) {
        t = t.next;
        r++;
      }
      return r;

    }
  }

  public static void main(String[] args) {
    Linklist l = new Linklist();
    l.addAtEnd(3);
    l.addAtEnd(223);
    l.addAtEnd(2);
    l.addElementAtstart(344);
    l.insertAt(0, 204);
    l.display();
    System.out.println();
    System.out.println();
    System.out.println("The size is :" + l.size());
    System.out.println();
    // Node02 n = new Node02(3);
    // Node02 n2 = new Node02(6);
    // Node02 n3 = new Node02(9);
    // Node02 n4 = new Node02(12);
    // n.next = n2;
    // n2.next = n3;
    // n3.next = n4;
    // int count = 0;
    // while (n !=null) {
    // System.out.print(n.data+",");
    // n = n.next;
    // count ++;
    // }
    // System.out.println("The number of the elements are "+count);

  }

}
