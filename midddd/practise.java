import java.util.ArrayList;

class FiFo {
    static class Node {
        Object data;
        Node next = this, prev = this;

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
    int size;

    public void Add(Object value) {
        Node newnode = new Node(value, head, head.prev);
        head.prev.next = newnode;
        head.prev = newnode;
        size++;
    }

    public Object remove() {
        if (size == 0) {
            throw new IllegalStateException("Queue IS Emppty");
        }
        if (head.next == head)
            return null;
        Object d = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        size--;
        return d;
    }

    public Object first() {
        if (size == 0) {
            throw new IllegalStateException("Queue IS Emppty");
        }
        return head.next.data;
    }

    public int size() {
        return size;
    }

    public Object getMiddle() {
        if (size == 0) {
            throw new IllegalStateException("Queue IS Emppty");
        }
        int half = size / 2;
        int count = 1;
        Node temp = head.next;
        while (temp != head) {
            if (count == half)
                break;
            count++;
            temp = temp.next;
        }
        Object remain = temp.data;
        return remain;
    }

    public FiFo merge(FiFo q1, FiFo q2) {
        if (q1.size == 0)
            return q2;
        if (q2.size == 0)
            return q1;

        Node temp = q1.head.next;
        Node temp2 = q2.head.next;
        q1.head.prev.next = q2.head.next;
        q2.head.next.prev = q1.head.prev;
        q2.head.prev.next = q1.head;
        q1.size += q2.size;

        return q1;
    }

    public boolean contianfivethElemen() {
        return size == 5;
    }
    public void deltethirdelement() {
        if (size < 3) {
            throw new IllegalStateException("Third Element does not exist");
        }
        if (size > 3) {
            Node temp = head.next;
            for (int i = 1; i < 2; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
    public void peeksecond() {
        if (size < 2) {
            throw new IllegalStateException("More Then  1  Element does not exist");
        }
        System.out.println(head.prev.prev.data);
    }

    public boolean Fifiequals(FiFo f1, FiFo f2) {
        if (f1.size != f2.size) {
            return false;
        }
        boolean flag = true;
        Node temp = f1.head.next;
        Node temp2 = f2.head.next;
        while (temp != f1.head && temp2 != f2.head) {
            if (!temp.data.equals(temp2.data)) {
                flag = false;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return flag;
    }

    public boolean lastelemnetFifiequals(FiFo f1, FiFo f2) {
        return f1.head.prev.equals(f2.head.prev);
    }

    public Object toArray() {
        Object[] arr = new Object[size];
        int j = 0;
        Node temp = head.next;
        for (int i = 0; i < size; i++) {
            arr[j++] = temp.data;
            temp = temp.next;
        }
        return arr;
    }

    public String toString() {
        String str = "";
        Node temp = head.next;
        while (temp != head) {
            str += temp.data + " ";
            temp = temp.next;
        }
        return str;
    }

    public void printreverse() {
        Node temp = head.prev;
        while (temp != head) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public void printorder(FiFo q) {
        Node temp = q.head.next;
        while (temp != q.head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class practise {
    public static void main(String[] args) {
        FiFo first = new FiFo();
        FiFo Second = new FiFo();
        FiFo third = new FiFo();
        first.Add("Lachknow");
        first.Add("Benazirawam");
        first.Add("civiltrain");
        Second.Add("first");
        Second.Add("Second");
        Second.Add("third");
        third.Add("KHI TO RWP");
        third.Add("HYD TO SUK");
        third.Add("LHR TO PSH");
        ArrayList<FiFo> collection = new ArrayList<>();
        collection.add(first);
        collection.add(Second);
        collection.add(third);
        System.out.println(collection.size());
        System.out.println("Printing the list");
        for (FiFo q : collection) {
            System.out.print(q.toString() + " ");
        }
        Object r = collection.remove(collection);

        System.out.println();
        System.out.println(r);
    }
}
