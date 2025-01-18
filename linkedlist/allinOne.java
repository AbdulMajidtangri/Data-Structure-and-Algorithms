public class allinOne {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next = null;
        }
        Node(int data,Node next){
            this.data =data;
            this.next = next;
        }


    }
    public static Node insert(int value,Node head){
        if(head == null|| head.data > value ){
  head = new Node(value,head);
  return head;
        }
        Node temp = head;
        while (temp.next!= null) {
            if(temp.next.data> value){
                break;
            }
            temp = temp.next;
        }
        temp.next = new Node(value,temp.next);
        return head;        
    }
//     public static Node insertAthead(Node head,int value){
// Node newnode = new Node(value);
// if(head==null){
//     head = newnode;
//     return head;
// }
//        newnode.next = head;
//        head= newnode;
//         return head;
//     }
//     public static Node insertAtposition(Node head,int value,int pos){
// Node newnode = new Node(value);
// if(pos==1){
//     newnode.next = head;
//     head = newnode;
//     return head;
// }
// Node temp = head;
// for(int i=1;i<pos-1 && temp != null;i++){
//      temp = temp.next;
// }
// if(temp==null){
//     System.out.println("The position is out off Bound");
// }
// newnode.next = temp.next;
// temp.next = newnode;
// return head;
//     }
//     public static Node deleteAtanypos(Node head,int pos){
//         if(pos==1){
//             head = head.next;
//             return head;
//         }
//         Node temp = head;
//         int count =1;
//         while (temp!=null) {
//             count++;
//             if(count==pos){
//                 temp.next = temp.next.next;
//                 break;
//             }
//             temp = temp.next;
//         }
//         return head;
//     }

//     public static Node Clone(Node head){
//         Node head2 = null;
//         Node temp = head;
//         while (temp!= null) {
//             head2 = insert(temp.data, head2);
//             temp = temp.next;
//     }
//     return head2;
// }
public static Node mergelists(Node head1,Node head2){

    
        Node temp1 = head1;
    while(temp1.next != null){
        temp1 = temp1.next;
    }
    temp1.next = head2;
    return head1;
}

// public static boolean search(Node head,int target){
//    Node temp = head;
//    boolean flag = false;
//     while (temp != null) {
//     if(temp.data==target){
//      flag = true;
//     }
//         temp = temp.next;
//     }
//     return flag;
// }
    public static void main(String[] args) {
        allinOne n = new allinOne();
        Node head = null; 
        Node head2 = null; 
        //  head = n.insertAthead(head, 5);
        head = n.insert(10, head);
         head = n.insert(20, head);
         head = n.insert(25, head);
         head = n.insert(35, head);

         head2 = n.insert(100, head);
         head2 = n.insert(200, head);
         head2 = n.insert(255, head);
         head2 = n.insert(355, head);
    Node r  =   mergelists(head, head2);
         while (r!= null) {
            System.out.print(r.data+" ");
    r= r.next;
}
    //   head =    n.insertAtposition(head,45,4);
    //   head = n.deleteAtanypos(head,2);
    //   Node temp = head;
    //     Node head2 = null; 
    //            head2 = n.insertAthead(head, 5);
    //     head2 = n.insert(10, head);
    //      head2 = n.insert(20, head);
//       head2 = n.deleteAtanypos(head,2);
//    Node r =  mergelists(head, head2);


//         Node head2 = null; 
//                head2 = n.insertAthead(head, 500);
//         head2 = n.insert(300, head);
//          head2 = n.insert(200, head);
//       head2 =    n.insertAtposition(head,450,2);
//       Node merge = mergelists(head, head2);
// Node temp = merge;
//         while(temp!= null ){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
    //     System.out.println();
    //   head =    n.deleteAtanypos(head, 2, 4);
    //     temp = head;
    //     while(temp!= null ){
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    //     Node head2 = n.Clone(head);
    //     temp = head2;
    //     System.out.println("The Collend List is");
    //     while(temp!= null ){
    //         System.out.print(temp.data + " ");
    //         temp = temp.next;
    //     }
    //     System.out.println();
    //    boolean g = n.search(head2, 100);
    //    System.out.println(g);
    }
}
