public class Nodeposition {
    int data;
    Nodeposition next;

    Nodeposition(int data) {
        this.data = data;
    }
    public static Nodeposition position(int value, int pos, Nodeposition head) {
        Nodeposition newnode = new Nodeposition(value);
        int count = 1;
        Nodeposition temp = head;
        if (head == null) {
            return newnode;
        }
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
            return head;
        }
        while (temp.next != null) {
            if (count == pos) {              
        break;  
            }
            count++;
            temp = temp.next;
        }
        newnode.next = temp.next;
                temp.next = newnode;
    
        return head;
    }
    public static void main(String[] args) {
        Nodeposition np = new Nodeposition(10);
        np.next = new Nodeposition(20);
        np.next.next = new Nodeposition(30);
        np.next.next.next = new Nodeposition(40);
        np = Nodeposition.position(12, 1, np);
        Nodeposition h = np;
        while (h!= null) {
           System.out.println(h.data+" "); 
           h =h.next;
        }
    }
}
