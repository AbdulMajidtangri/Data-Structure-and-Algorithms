public class operationOnlikedlist {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // private Node head;
    public Node insert(int value, Node head) {
        Node newNode = new Node(value);
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

    public Node clone(operationOnlikedlist l, Node head) {
        Node temp = head;
        Node head2 = null;
        while (temp != null) {
            head2 = l.insert(temp.data, head2);
            temp = temp.next;
        }
        return head2;
    }

    public void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int searchsumavg(int search, Node head) {
        int sum = 0;
        int avg = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == search) {
                System.out.println("The element is Founded In the list");
            }

            sum += temp.data;
            temp = temp.next;
        }
        System.out.println("The Sum IS " + sum);
        avg = sum / 2;
        return avg;
    }

    public Node mergelists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head2;
        return head1;
    }
    public static int sum(Node head){
Node temp = head;
int sum = 0;
int count = 0;
while (temp != null) {
    count++;
    temp = temp.next;
}
return count;
    }

    public void sort(Node head) {
        Node current = head;
        boolean flag;
        do {
            flag = false;
            current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    flag = true;
                }
                current = current.next;
            }
        } while (flag);
    }
    public Node[] bifurcationOFlist(Node head) {
        int mid = sum(head) / 2;
        Node list1 = null;
        Node list2 = null;
        Node temp = head;
      int   count = 0;
        while (temp.next!= null && count<mid ) {
            list1 = insert(temp.data, list1);
            temp = temp.next;
            count++;
        } while (temp!= null  ) {
            list2 = insert(temp.data, list2);
            temp = temp.next;
        }
        return new Node[]{list1, list2};
    }

    public static void main(String[] args) {
        operationOnlikedlist l1 = new operationOnlikedlist();
        Node head = null;
        Node head22 = null;
        head = l1.insert(3, head);
        head = l1.insert(6, head);
        head = l1.insert(9, head);
        head = l1.insert(12, head);
        head = l1.insert(15, head);
        System.out.println("Clonig the List");
        l1.print(head);
        System.out.println();
        head22 = l1.clone(l1, head);
        l1.print(head22);
        System.out.println("Some operations");
        System.out.println();
        System.out.println("The Average of the elements " + l1.searchsumavg(3, head22));
        System.out.println("Merging lists");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1 = l1.insert(3, n1);
        n1 = l1.insert(5, n1);
        n1 = l1.insert(7, n1);
        n1 = l1.insert(9, n1);
        n1 = l1.insert(11, n1);
        n1 = l1.insert(13, n1);
        n1 = l1.insert(15, n1);
        n1 = l1.insert(18, n1);
        n2 = l1.insert(4, n2);
        n2 = l1.insert(6, n2);
        n2 = l1.insert(8, n2);
        n2 = l1.insert(10, n2);
        n1 = l1.mergelists(n1, n2);
        l1.print(n1);
        System.out.println();
        System.out.println("Sorted the merged list");
        l1.sort(n1);
        l1.print(n1);
        System.out.println();
System.out.println("Bifurcation");
 Node t[] = l1.bifurcationOFlist(n1);
  l1.print(t[0]);
  System.out.println();
  System.out.println("PAsrt 2:");
  l1.print(t[1]);
    }
}