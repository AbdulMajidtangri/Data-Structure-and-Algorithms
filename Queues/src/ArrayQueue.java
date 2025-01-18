interface Queue{
    public Object first();
    public Object remove();
    public void Add(Object r);
    public int size();
}
public class ArrayQueue implements Queue{
    Object []arr;
    int size = 0;
  ArrayQueue(int capacity){
arr = new Object[capacity];
  }
  public Object first(){
    if(size==0){
        throw new IllegalStateException("Queue IS Empty");
    }
    return arr[0];
  }
  public Object remove(){
    if(size==0){
        throw new IllegalStateException("Queue IS Empty");
    }
    Object d = arr[size-1];
    size--;
    return d;
  }
  public void Add(Object t){
  if(arr.length==arr.length){
   Object []newarr = new Object[arr.length*2];
   for(int i=0;i<arr.length;i++){
    newarr[i] = arr[i];
   }
   arr = newarr;
  }
  arr[size++] = t;
  }
public int size(){
    return size;
}
    public static void main(String[] args) {
      ArrayQueue a = new ArrayQueue(3);
      a.Add(4);  
      a.Add(8);  
      a.Add(12); 
      a.Add("hello world"); 
      System.out.println(a.remove()); 
      System.out.println(a.remove()); 
      System.out.println(a.remove()); 
    }
}