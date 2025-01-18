
public class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }

    Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }
    
    public static Node2 insert(int value, Node2 start) {
        Node2 p = start;
        if (start == null || start.data > value) {
            start = new Node2(value, start);
            return start;
        }
        while (p.next != null) {
            if (p.next.data > value) {
                break;
            }
            p = p.next;
        }
        p.next = new Node2(value, p.next);
        return start;
    }

    public static void printlist(Node2 start) {
        Node2 temp = start;
        int sum = 0;
        int count = 0;
        System.out.println("The total Elements are");
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("the Last Element is "+temp.data);
        System.out.println("The Elements at Even position are");
        temp = start;
        count = 0;
        while (temp != null) {
           

            if (count%2==0) {
                System.out.print(temp.data + " ");
            } sum += temp.data;
            temp = temp.next;
            count++;
        }
        temp = start;
        count = 0;
        System.out.println();
        System.out.println("The elements at Odd position are");
        while (temp != null) {
            if (count%2!=0) {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
            count++;
        }
        System.out.println();
        System.out.println("The Sum is "+sum);
        double avg = (double) sum/count;
        System.out.println("The average is "+avg);
        
    }

    public static void main(String[] args) {

        Node2 n = new Node2(1);
        for (int i = 0; i < 15; i++) {
            n = Node2.insert(2 + i, n);
        }
        Node2.printlist(n);
    }
}
