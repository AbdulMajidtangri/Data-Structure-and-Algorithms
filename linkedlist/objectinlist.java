class Node {
    Object data;
    int value;
    Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }

    Node(Object data, int value) {
        this.data = data;
        this.value = value;
        this.next = null;
    }

    public static Node insert(Object data, int id, Node start) {
        Node p = start;
        Node newnode = new Node(data, id);

        if (start == null || start.value > id) {
            newnode.next = start;
            return newnode;
        }
        while (p.next != null) {
            if (p.next.value > id) {
                break;
            }
            p = p.next;
        }
        newnode.next = p.next;
        p.next = newnode;
        return start;
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + "\nID: " + id;
    }

    public int getId() {
        return id;
    }
}

public class objectinlist {
    public static void main(String[] args) {
        Student ali = new Student(1, "Ali");
        Student kamran = new Student(44, "Kamran");
        Student aleem = new Student(3, "Aleem");

        Node start = null;
        start = Node.insert(ali, ali.getId(), start);
        start = Node.insert(kamran, kamran.getId(), start);
        start = Node.insert(aleem, aleem.getId(), start);

        Node temp = start;
        while (temp != null) {
            System.out.println(temp.data.toString() + " ");
            temp = temp.next;
        }
    }
}
