class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
    Node(){}
}


public class basicinsert{
    public Node insertAtHead(Node head,int value){
            Node temp = new Node(value);
   if(head==null){
head = temp;
        }
        else{

           temp.next  = head;
       head = temp;  
        }
      
       return head;
    }
    public Node insertAtTail(Node tail,int value){
       Node temp = new Node(value);
       temp.next  = tail;
       tail = temp;
       return tail;
    }
    public void InsertPosition(Node head,int position,int value){
        Node r = new Node(value);
        int p = position;  
        Node temp = head;
        
int count =0;
while(count<p-1){
    temp = temp.next;
    count++;
}
        r.next =temp.next;
        temp.next =r;

        }
    
    public void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
         
    }

    public static void main(String[] args) {
      Node head = new Node(2);
      Node  tail= new Node();
      basicinsert n = new basicinsert();
      head=  n.insertAtHead(head,34);
      head=  n.insertAtHead(head,30);
      head=  n.insertAtHead(head,35);
      head=  n.insertAtHead(head,35);
       n.display(head);
       System.out.println();
       tail = n.insertAtTail(tail,40);
       n.display(head);
       System.out.println();
       n.InsertPosition(head, 1, 46);
       n.display(head);
       
    }
}