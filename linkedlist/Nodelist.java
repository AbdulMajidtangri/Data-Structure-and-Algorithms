import java.util.Scanner;

class  Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
        public class Nodelist {
 
   
    public static void main(String[] args) {

        // Node e=  new Node(2);
        // Node e2=  new Node(4);
        // Node e3=  new Node(6);
        // Node e4=  new Node(8);
        // e.next = e2;
        // e2.next = e3;
        // e3.next = e4;
        // System.out.println(e.data);
        // System.out.println(e.next.data);
        // System.out.println(e.next.next.data);
        // Node e = new Node(30);
        // e.next = new Node(23);
        // e.next.next = new Node(20);
        // e.next.next.next = new Node(15);

        // System.out.println(e.next.next.next.data);
        // Node head = new Node(0);
        // Node temp=  head;
        // for(int i=0;i<4;i++){
        //    Node n = new Node(i+10);
        //    System.out.println(n.data);
        //    n = n.next; 
        // }
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
                Node head=  new Node(n1);
                System.out.println(head.data);
                


        

    }
}
