interface q{
    public Object first();
    public Object remove();
    public void Add(Object f);
    public int size();
}

public class prac implements q{
    public static class Node{
        Object data;
        Node next=this;
        Node prev=this;
        Node(Object data){
            this.data = data;
            this.next = this;
            this.prev = this;
        }
        Node(Object data,Node next,Node prev){
            this.data = data;
            this.next = next;
            this.prev =prev;
        }
    }
    Node head = new Node(null);
    int size = 0;
    public Object first(){
    if(size==0){
        throw new IllegalStateException("Queue is Empty");
    }
    return head.next.data;
    }
    public Object remove(){
        if(size==0){
            throw new IllegalStateException("Queue is Empty");
        }
        Object temp = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        --size;  
        return temp;
    }
    public void Add(Object f){       
        Node newNode = new Node(f,head, head.prev);
        head.prev.next = newNode;
        head.prev = newNode;
          ++size;
    }
  public  int size(){
        return size;
    }
    public String toString(){
        String s = "";
        for(Node temp = head.next;temp != head; temp = temp.next){
            s +=temp.data;
        }
        return s;
    }
    public Object [] toArray(){
        Object [] arr = new Object[size()];
        int i=0;
        for(Node temp = head.next;temp != head;temp= temp.next){
            arr[i++] = temp.data;
        }
        return arr;
    }
    public boolean Equal(prac p1,prac p2){
        boolean flag = true;
        if(p1.size()!= p2.size()){
 flag = false;
 return flag;
        } 
        Object []arr1 = p1.toArray();
        Object []arr2 = p2.toArray();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!= arr2[i]){
                flag = false;
                break;
            }
            
        }
        return flag;
    }

    public static void main(String[] args) {
       prac m = new prac();
       m.Add("Hello world"); 
       m.Add("Java");
       m.Add(233);
 System.out.println(m.toString());
Object e[] = m.toArray();
for(int i=0;i<e.length;i++){
    System.out.print(e[i]+" ");
}
System.out.println();
        prac n = new prac();
        n.Add("Hello world");
        n.Add("Java");
        n.Add(233);
       System.out.println(m.Equal(m, n));
    }
}