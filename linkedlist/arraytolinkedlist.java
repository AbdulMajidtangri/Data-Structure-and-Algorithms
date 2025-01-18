public class arraytolinkedlist{  
         public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
 public  Node arrtoll(int arr[]){
   if(arr.length==0) return null;
    Node head= new Node(arr[0]);
   Node temp = head;
for(int i=0;i<arr.length;i++){
    Node rest= new Node(arr[i]);
  temp.next = rest;
  temp = rest;
}
return head;

 }

    public static void main(String []args){
 int arr[]={1,2,3,4}; 
 arraytolinkedlist e = new arraytolinkedlist();

 Node he =  e.arrtoll(arr);
 Node w = he;
 while (w != null) {
    System.out.println(w.data);
    w = w.next;
    
 }
    }
}