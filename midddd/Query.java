
class aqueue{
    Object []arra;
   int size;
    aqueue(int capacity){
arra = new Object[capacity];
size = 0;
    }
    public Object  dequeue(){
        if (size == 0) {
            throw new IllegalStateException("Queue is Empty");
            } 
            if(arra.length== size){
                Object[] temp = new Object[arra.length-1];
                System.arraycopy(arra, 0,   temp, 0, arra.length);
                arra = temp;
            }
          Object r =  arra[0];
       for(int i=0;i<size -1;i++){
        arra[i] = arra[i+1];
       } 
       size--;
return r;
    }
public void enqueue(int add){
Object temp[] = new Object[arra.length+1];
System.arraycopy(arra, 0,   temp, 0, arra.length);
arra = temp;
arra[size++] = add;
}
 public int size(){
    return size;
 }
}
class queue{
    static class Node{
        Object data;
    Node next = this,prev = this;
    Node(Object data){
        this.data = data;

    }
    Node(Object data,Node next,Node prev){
    this.data = data;
    this.next = next;
    this.prev = prev;
    }  
    }
    private Node head = new Node(null);
    int size=0;
    public Object dequeue(){
       if(size == 0){
        throw new IllegalStateException("Queue is Empty");
       }
        Object temp = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        size--;
        return temp;
    }
    public void enqueue(Object data){
       
           Node newnode = new Node(data, head, head.prev);
           head.prev.next=newnode;
           head.prev = newnode;
size++;
    }
    public Object peek(){
        if(size == 0){
            throw new IllegalStateException("Queue is Empty");
            }
            return head.next.data;
    }
    public int size(){
        return size;
    }
public Object toArray(){
    Node temp = head.next;
    int i=0;
    Object []rr = new Object[size];
    while(temp != head){
rr[i++]  =temp.data;
temp= temp.next;
    }
    return rr;
}
public String toString(){
    String str = "";
    Node temp = head.next;
    while (temp != head) {
        str =temp.data+" ";
        temp = temp.next;
    }
    return str;
}
public Object deleteSecondEement(){
Object temp = head.next.next.data;
head.next.next = head.next.next.next;
head.next.next.prev = head.next;
return temp;
}
public void printlist(){
    Node temp = head.next;
    while (temp != head) {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
}public void print(queue qq){
    Node temp = qq.head.next;
    while (temp != qq.head) {
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
}
public queue clone(queue q1){
queue q2= new queue();
Node temp = q1.head.next;
while (temp != q1.head) {
    q2.enqueue(temp.data);
    temp = temp.next;
}
return q2;
}
}
public class Query{
public static void main(String[] args) {
    queue q = new queue();

    for(int i=1;i<10;i++){
        q.enqueue(i*5);
    }
    System.out.println(q.size());
q.printlist();
System.out.println();
  System.out.println(q.deleteSecondEement());
  q.printlist();

  queue qq  = new queue();
  qq = qq.clone(q);
System.out.println();  
  System.out.println("printing cloned list");
  qq.print(qq);
}
}