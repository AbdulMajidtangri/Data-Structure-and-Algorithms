

interface Stackk {
public void push(Object o);
public Object pop();
public Object peek();
public int size();   
}
class ArrayStack implements Stackk {
    Object []arr;
    int size;
    ArrayStack(int capacity){
        arr = new Object[capacity];
        size = 0;
    }
    public Object peek(){
        if(size == 0) {
            throw new IllegalStateException("Stack Is Empty");
    }
    return arr[size-1];}
    public void push(Object o){
        Object newarr[] = new Object[arr.length*2];
        if(size==arr.length){
            System.arraycopy(arr,0,newarr,0,arr.length);
            arr = newarr;
        }
        arr[size++] = o;
    }
public Object pop(){
    if(size == 0) {
        throw new IllegalStateException("Stack Is Empty");
}
size--;
return arr[size];
}
public int size(){
    return size;
}
}
class Linkedstack implements Stackk {
    static class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
            this.next = null;
        }
        Node(Object data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    private Node top = null;
    int size=0;
    public Object peek(){
        if(size == 0) {
            throw new IllegalStateException("Stack Is Empty");
    }
    return top.data;
}
public void push(Object o){
    size++;
  top = new Node(o,top);

}
public Object pop(){
if(size == 0){
    throw new IllegalStateException("Stack Is Empty");
}
Object t = top.data;
top = top.next;
size--;
return t;
}
public int size() {
 return size;
}
}
public class Stack {
    public static void main(String[] args) {
        Linkedstack s = new Linkedstack();
        s.push("Apple2");
        s.push("BAnana2");
        s.push("Pinepple2");
        s.push("Orange");
        s.push("Pear2");
        s.push("Grapes");
        Linkedstack s2 = new Linkedstack();
       int half = s.size()/2;
       while (s.size()>half) {
        s2.push(s.pop());
       }
       Object m = s.pop();
System.out.println(m);
while (s.size()>0) {
    s2.push(s.pop());
}

    }
}
