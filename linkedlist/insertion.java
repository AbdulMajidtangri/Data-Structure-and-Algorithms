
    public class insertion { 
        Node head = null;
        Node tail = null;
        public static  class  Node{
        int data;
        Node next;
        Node(int data ){
 this.data = data;
        }

    }
        public void display(){
            Node tempr = head;
            while(tempr!=null){
                System.out.print(tempr.data+"  ");
                tempr = tempr.next;
            }
        }
public void insertAtHead(int val){
    Node r= new Node(val);
    
    if(head==null)
    { head = r;
        tail=r;
    }
    else{
     r.next =  head;
      
        head =r ; 
    }
    
}
public void InsetAtEnd(int num){
 Node store = new Node(num);
 if(head== null){
    head =store;
    tail = store;
 }
 else{
    tail.next = store;
    tail = store;
 }
}
public void delete(int del){
    Node t= new Node(del);
    Node temp = head;

    if(head == null){
        return ;

    }
    else{
      while(temp!= null){
        if(temp == t){
        temp=null;
        }
        
        
temp = temp.next;
        
      }
    }
}
    public static void main(String[] args) {
  insertion in = new insertion();
  in.insertAtHead(456);
  in.insertAtHead(30);
  in.insertAtHead(90);
  in.insertAtHead(80);
  in.insertAtHead(50);
  in.InsetAtEnd(70);
  in.delete(30);
  in.display();
    }
  
}
