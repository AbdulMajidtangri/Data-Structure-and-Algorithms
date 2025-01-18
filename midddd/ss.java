class sam{
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
    Node top = null;
    int size =0;
    public void push(Object data){
top = new Node(data,top);
size++;
    }
    public Object pop(){
       if(size ==0) {
        throw new IllegalStateException("Stack Is Empty");
       }
       Object t = top.data;
       top = top.next;
       size--;
       return t;

    }
    public Object peek(){
        if(size ==0) {
            throw new IllegalStateException("Stack Is Empty");
           }
           Object temp = top.data;
           return temp;
    }
    public int size(){
        return size;
    }
}
class walim{
    Object[]arr;
    int size;
    walim(int capacity){
        arr = new Object[capacity];
        this.size = 0;
    }
    public void push(Object d){
        if(arr.length == size){
            Object temp[] = new Object[arr.length*2];
            System.arraycopy(arr,0,temp,0,arr.length);
            arr = temp;
        }
        arr[size++] = d;
    }
    public Object pop(){
        if(size ==0) {
            throw new IllegalStateException("Stack Is Empty");
           }
           Object re =arr[size-1];
           arr[--size] = null; // Clear the reference for garbage collection
           return re;
    }
    public Object peek(){
        if(size ==0) {
            throw new IllegalStateException("Stack Is Empty");
           }
           Object de = arr[size-1];
           return de;
    }
    public int size(){
        return size;
    }
}
public class ss{
    public static void main(String[] args) {
        walim s1 = new walim(2);
        s1.push("ALi");
        s1.push("KAmran");
        s1.push("Sachin");
        s1.push("Akram");
        s1.push("Aleem");
        s1.push("Imran");
        s1.push("Abdullah");
        System.out.println(s1.size());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.size());
    }
}