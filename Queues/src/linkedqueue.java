interface Queue {
    Object first();
    Object Enqueue(Object r);
    Object Dequeue();
    int size();
}

public class linkedqueue implements Queue {
    private static class Node {
        Object data;
        Node next = this;
        Node prev = this;

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head = new Node(null); 
    private int size = 0;


    public int size() {
        return size;
    }

 
    public Object first() {
        if (size == 0) {
            System.err.println("Queue is empty");
        }
        return head.next.data;
    }

  
    public Object Dequeue() {
        if (size == 0) { 
            System.err.println("Queue is empty");
        }
        Object temp = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return temp;
    }

    public Object Enqueue(Object r) {
        ++size;
        Node newNode = new Node(r, head, head.prev); 
        head.prev.next = newNode;
        head.prev = newNode;
        return newNode.data;
    }

    public String toString() {
        String s = "";
        for (Node temp = head.next; temp != head; temp = temp.next) {
            s += temp.data + " ";
        }
        return s.trim();
    }

    public Object[] toArray() {
        Object[] arr = new Object[size()];
        int i = 0;
        for (Node temp = head.next; temp != head; temp = temp.next) {
            arr[i++] = temp.data;
        }
        return arr;
    }

    public boolean equals(linkedqueue l1, linkedqueue l2) {
        boolean flag = true;
        if (l1.size() != l2.size()) {
            flag = false;
            return flag;
        } else {
            Object[] arr1 = l1.toArray();
            Object[] arr2 = l2.toArray();
            for (int i = 0; i < arr1.length; i++) {
                if (!arr1[i].equals(arr2[i])) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            return flag;
        }
    }

    public void Reverse() {
        for (Node temp = head.prev; temp != head; temp = temp.prev) {
            System.out.print(temp.data + " ");
        }
    }

    public linkedqueue Clone() {
        linkedqueue t = new linkedqueue();
        for (Node temp = head.prev; temp != head; temp = temp.prev) {
            t.Enqueue(temp.data);
        }
        return t;
    }
public Object seconelement(){
    if(head.next== null){
        throw new IllegalStateException("Queue is empty");
    }
    return head.next.next.data;
}
public Object thirdelement(){
    if(head.next== null){
        throw new IllegalStateException("Queue is empty");
    }
    return head.next.next.next.data;
}

    public static void main(String[] args) {
        linkedqueue monthlypocket = new linkedqueue();
        linkedqueue monthlypocket2 = new linkedqueue();

        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            Object t = monthlypocket.Enqueue(50 * i);
            sum += (Integer) t;
        }
        for (int i = 1; i <= 3; i++) {
            Object t = monthlypocket2.Enqueue(50*i);
        }
    System.err.println(monthlypocket.equals(monthlypocket, monthlypocket2));
        // System.out.println("First element: " + monthlypocket.first());
        // System.out.println("Sum: " + sum);

        // Object[] arr = monthlypocket.toArray();
        // System.out.print("The array is ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // String g = monthlypocket.toString();
        // System.out.println("The string is: " + g);
        // System.out.println(monthlypocket.equals(monthlypocket, monthlypocket2));
        // monthlypocket.Reverse();
        // monthlypocket = monthlypocket.Clone();
        // System.out.println();
        // System.out.println("The Second element is ");
        // System.out.println(monthlypocket.seconelement());
        // System.out.println("The third element is ");
        // System.out.println(monthlypocket.thirdelement());
    }
}
