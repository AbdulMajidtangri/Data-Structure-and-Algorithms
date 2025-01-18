public class stacklink {
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        } 
     }
         static Node pop(Node head){
   if(head==null || head.next==null){

    return null;
   }
   Node temp =head;
   while (temp.next.next != null) {
    temp = temp.next;
   }
   temp.next = null;
  return head;
        }
       static  Node push(Node head,int value){
          
            Node newnNode = new Node(value);
            if(head == null){
                
                return newnNode;
            }

            if(head.next == null){
                head.next = newnNode;
                return head;
            }
            Node temp = head;
            while (temp.next != null) {
               temp =  temp.next;
            }
            temp.next = newnNode;
         return head;
        }
         static int peek(Node head){
          
            if(head == null){
                return head.data;
            }

            if(head.next == null){
               
                return head.data;
            }
            Node temp = head;
            while (temp.next != null) {
               temp =  temp.next;
            }
          
         return temp.data;
        }
  static boolean isEmpty(Node head){
    if(head == null){
        return true;
  }
  return false;
}

    public static void main(String[] args) {
        Node head = new Node(1);
        head = null; 
 System.out.println(stacklink.isEmpty(head));
        head = stacklink.push(head,2);
        head = stacklink.push(head,3);
        head = stacklink.push(head,34);
        System.out.println("Top element is: "+stacklink.peek(head));
        head = stacklink.pop(head);
        System.out.println("Top element after pop is: "+stacklink.peek(head));
        System.out.println(stacklink.isEmpty(head));
    }
}
