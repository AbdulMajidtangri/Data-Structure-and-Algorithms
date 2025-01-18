import java.lang.reflect.Array;

class linkedQueue {
    static class Node {
        Object data;
        Node next = this;
        Node prev = this;

        Node(Object data) {
            this.data = data;
            this.next = this;
            this.prev = this;
        }

        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head = new Node(null);
    int size = 0;

    public Object First() {
        if (size == 0) {
            throw new IllegalStateException("Queue IS Empty");
        }
        return head.next.data;
    }

    public Object Dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue IS Empty");
        }
        Object r = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return r;
    }

    public void Enqueue(Object o) {
        Node newnode = new Node(o, head, head.prev);
        head.prev.next = newnode;
        head.prev = newnode;
        size++;
    }

    public int size() {
        return size;
    }

    public void printlist() {
        Node temp = head.prev;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    public String toString(){
        String str = "";
        Node temp = head.next;
        while (temp != head) {
            str +=temp.data+" ";
            temp = temp.next;
        }
    return str;
    }
    public int summ() {
        int sum = 0;
        Node temp = head.next;
        while (temp != head) {
            sum += (Integer) temp.data;
            temp = temp.next;
        }
        return sum;
    }

    public void deleteseconselemnet() {
        Node temp = head.next;
        if (size == 1) {
            head.next = null;
        }
        head.next.next = head.next.next.next;
        head.next.next.prev = head.next;
        head.next = head.next.next.next;
    }
    public Object toArray(){
        Object []arr= new Object[size];
     int count =0;
     Node temp = head.next;
     while (temp != head) {
        arr[count++] = temp.data;
        temp= temp.next;
     }
     return arr;
    }
}

class ArrayQueue {
    Object[] arr;
    int size;

    ArrayQueue(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue Is Empty");
        }
        return arr[0];
    }

    public Object Dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue Is Empty");
        }
        Object front = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return front;
    }

    public void Enqueue(Object o) {
        if (size == arr.length) {
            Object[] temp = new Object[arr.length * 2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[size++] = o;
    }

    public int size() {
        return size;
    }
}

public class Queue {
    public static void main(String[] args) {
        linkedQueue q = new linkedQueue();
        for (int i = 1; i < 10; i++) {
            q.Enqueue(i * 10);
        }
        System.out.println(q.toString());
System.out.println();
        q.printlist();
        System.out.println(q.summ());
        System.out.println();
        q.deleteseconselemnet();
        q.printlist();
    }
}
