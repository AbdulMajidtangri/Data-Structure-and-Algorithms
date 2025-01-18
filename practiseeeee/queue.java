
class linkedqueue{
 static class Node{
    Object data;
    Node next = this;
    Node prev = this;

 Node(Object data){
this.data = data;
this.next = next;
 }
 Node(Object data,Node next,Node prev){
    this.data = data;
    this.next= next;
    this.prev = prev;
 }
 }
 private Node head = new Node(null);
 int size;
 public void Enqueue(Object d){
    size++;
    Node nwnode = new Node(d, head, head.prev);
    head.prev.next = nwnode;
    head.prev = nwnode;
 }
 public Object Dequeue(){
  Object temp =  head.next.data;
  head.next = head.next.next;
  head.next.prev = head;
  size--;
  return temp;
 }
 public Object peek(){
    return head.next.data;
 }
 public int size(){
    return size;
 }
 public Object sencondelement(){
    if(size<2){
        throw new IllegalStateException("Sencond does not exist");
    }
    return head.next.next.data;
 }
 public linkedqueue CopyQueue(linkedqueue q1){
 linkedqueue lq2 = new linkedqueue();
 Node curr = head.next;
 while (curr != head) {
    lq2.Enqueue(curr.data);
    curr = curr.next;
 }
 return lq2;
 }
 public void display(linkedqueue lq){
    Node curr = lq.head.next;
 while (curr != lq.head) {
    System.out.println(curr.data);
    curr = curr.next;
 }
 }
}

public class queue {
    public static void main(String[] args) {
        linkedqueue lq = new linkedqueue();
        lq.Enqueue("order 1");
        lq.Enqueue("order 2");
        lq.Enqueue("order 3");
        lq.Enqueue("order 4");

      

        // Get a copy of the second element
        System.out.println("Second Element in Queue: " + lq.sencondelement());

        // Get a copy of the entire queue
        System.out.println("Copied Queue:");
        linkedqueue q2 = new linkedqueue();
       q2 =  lq.CopyQueue(lq);
       q2.display(lq);
    }
}
