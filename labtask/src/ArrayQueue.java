interface Queue{
    public Object first();
    public void Add(Object r);
    public Object remove();
    public int size();

}
public class ArrayQueue implements Queue{
    public Object arr[];
    int size = 0;
    ArrayQueue(int capacity){
        arr = new Object[capacity];
    }
    public Object first(){
        if(size ==0){
            try {
               throw new Exception("The Queue IS Empty"); 
            } catch (Exception e) {
            }
        }
        return arr[0];
    }
    public void Add(Object r){
        if(size == arr.length){
            Object newa[] = new Object[arr.length*2];
            for(int i=0;i<arr.length;i++){
                newa[i] = arr[i];
            }
            arr = newa;
                    }
                    arr[size++] = r;
    }
    public Object remove(){
        if(size ==0){
            try {
               throw new Exception("The Queue IS Empty"); 
            } catch (Exception e) {
            }
        }
        Object na[] = new Object[arr.length-1];
        Object  t = arr[0];
        for(int i=0;i<arr.length-1;i++){
            na[i] = arr[i+1];
        }
        arr = na;
        size--;
         return t;
    }
    public int size(){
        return size;
    } 
     public static void main(String[] args) {
        ArrayQueue as  = new ArrayQueue(2);
        as.Add(2);
        as.Add(4);
        as.Add(6);
        System.out.println(as.first());
        System.out.println(as.remove());
        System.out.println(as.remove());
        System.out.println(as.remove());
        as.Add("ali");
        System.out.println(as.first());
    }
}

