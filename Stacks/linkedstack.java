interface Stack{
    public  Object pop();
    public  Object push(Object r);
    public  Object peek();
    public  int  size();
}

 class ArrayStack implements Stack {
     Object newarr[];
    int size=0;
    ArrayStack(int capacity){
        newarr = new Object[capacity];
        this.size=size;
    }
    public Object pop(){
        if(size==0){
            throw new IllegalStateException("The Stack Is Empty");
        }
        --size;
        return newarr[size];
    }
    public Object  push(Object a){
if(newarr.length==size){
    Object n[] = new Object[newarr.length*2];
    for(int i=0;i<newarr.length;i++){
        n[i] = newarr[i];
    }
    newarr = n;
} newarr[size] = a;
size++;
 return newarr;
    }
    public Object peek(){
        if(size==0){
            throw new IllegalStateException("The Stack Is Empty");
        }
    System.out.print(newarr[size-1]+" ");
    return newarr[size-1];
    }
    public int size(){
        return size;
    }
}
public class linkedstack implements Stack{
    private Node head;
    private int size;
    public static class Node{
        Object data;
        Node next;
  Node(Object data,Node next){
    this.data = data;
    this.next = next;
  }
    }
    public  Object pop(){
        if(size==0){
            throw new IllegalStateException("Stack Is Empty");
        }
        Object oldtop = head.data;
        head = head.next;        
        --size;
return oldtop;
        }
        
public Object peek(){
    if(size==0){
        throw new IllegalStateException("Stack Is Empty");
    }   
     System.out.print(head.data+" ");
   return head.data;
}

public Object push(Object r){
    ++size;
    head = new Node(r, head);
   return head.data;
}
public int size(){
    return size;
}
public static ArrayStack convertAtoL(linkedstack ll){
ArrayStack as1 = new ArrayStack(ll.size());
ArrayStack as2 = new ArrayStack(ll.size());
  while (ll.size()>0) {
    as1.push(ll.pop());
  }
  while (as1.size()>0) {
    as2.push(as1.pop());
    as2.peek();
  }
  return as2;
}
    public static void main(String[] args) {
        linkedstack s1 = new linkedstack();
        s1.push("kamran");
        s1.push("Sachin");
        s1.push("Ali");
        s1.push("Kalesh");
        // System.out.println("\n\n The Stack top to Bottom");
        // linkedstack s2 = new linkedstack();
        // while (s1.size()>0) {
        //     s2.push(s1.pop());
        //     s2.peek();
        // }
        //         int half = s2.size()/2;
        //         linkedstack s3 = new linkedstack();
        //         linkedstack s4 = new linkedstack();
        //         System.out.println();
        //         System.out.println("\n\nThe Stack is Splited");
        //         System.out.println("First half");
        //         while (s2.size()>half) {
        //             s3.push(s2.pop());
        //             s3.peek();
        //         }
        //         System.out.println();
        //         System.out.println("\n\nSecond Half");
        //         while (s2.size()>0) {
        //             s4.push(s2.pop());
        //             s4.peek();
        //         }
        //         System.out.println();
        //         System.out.println("\n\nMerged Stacks are");
        //         linkedstack s5 = new linkedstack();
        //        while (s3.size()>0) {
        //         s5.push(s3.pop());
        //         s5.peek();
        //        } 
        //        while (s4.size()>0) {
        //         s5.push(s4.pop());
        //         s5.peek();
        //        } 
        //        System.out.println();
        //        System.out.println("\n\nPutting the value of Linkedlist  into the Array");
        //        convertAtoL(s5);
    }
}