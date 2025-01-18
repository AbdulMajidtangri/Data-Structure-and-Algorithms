public class PNode {
    int data;
    PNode next;
    PNode(int data){
        this.data = data;
       
    }
    static void printllist(PNode node) {
        while (node!= null) {  
            System.out.println(node.data);    
            node = node.next;
        }
    }
    public static void main(String []args){
        PNode head = new PNode(1);
        PNode n2= new PNode(2);
        PNode n3= new PNode(34);
        head.next=n2;
        n2.next=n3;
        // PNode e =head;
        // while (e != null) {  
        //     System.out.println(e.data);    
        // e = e.next;
        // }
        // PNode r = head;
        // for(int i=0;i<4;i++){
        //      PNode newn = new PNode(34);
        //     r.next = newn;
        //     r = newn;
        //     System.out.println(newn.data);
        // }
        printllist(head);
    }
}
