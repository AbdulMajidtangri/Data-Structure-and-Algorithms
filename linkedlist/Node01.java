public class Node01 {
    int data;// it Contain the value of the element
    Node01 next;// it states the addres of the next element in linkedlist

    Node01(int data) {
        this.data = data;
    }
    public static void main(String[] args) {
        // Node01 n1 = new Node01(1);
        // Node01 n2 = new Node01(2);
        // Node01 n3 = new Node01(3);
        // Node01 n4 = new Node01(4);

        // System.out.println(n1.data);//1
        // System.out.println(n2.data);//2
        // System.out.println(n3.data);//3
        // System.out.println(n4.data);//4
        // n1.next = n2;
        // n2.next = n3;
        // n3.next = n4;
        // n4.next = n1;
        // System.out.println(n1.next.data);
        // System.out.println(n2.next.data);
        // System.out.println(n3.next.data);
        // System.out.println(n4.next.data);
        // Node01 n1 = new Node01(1);
        // n1.next = new Node01(2);
        // n1.next.next = new Node01(3);
        // n1.next.next.next = new Node01(4);
        // System.out.println(n1.next.next.data);
        // Node01 temp = n1;
        // System.out.println(temp.data);
        // temp.next = new Node01(2);
        // temp = temp.next;
        // temp.next = new Node01(3);
        // temp = temp.next;
        // System.out.println(temp.data);
        Node01 n1 = new Node01(1);
        Node01 t = n1;
        int count =0;
        for(int i=0;i<4;i++){
            t.next = new Node01(i+1);
            t = t.next;
            count+=1;
        }
        while (t!=null) {
            System.out.println(t.data);
            t = t.next;
        }
        System.out.println();
        System.out.println("Total Element are in the list "+count);
      }
    }
