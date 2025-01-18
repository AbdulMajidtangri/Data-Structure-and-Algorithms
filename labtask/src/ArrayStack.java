interface Stack{
    public Object pop();
    public void push(Object r);
    public int size();
    public Object peek();
}
class Arrayst implements Stack{
    private Object []newarr;
    int size = 0;
    public Arrayst(int capacity){
 newarr =  new Object[capacity];
    }
    public Object pop(){
        if(size ==0){
            try {
                throw new Exception("Stack Is Empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
   size--;
   return newarr[size];
    }
    public void push(Object r){
        if(size == newarr.length){
Object newa[] = new Object[newarr.length*2];
for(int i=0;i<newarr.length;i++){
    newa[i] = newarr[i];
}
newarr = newa;
        }
        newarr[size++] = r;
    }
    public void pushall(Object[] e){
        if(size == newarr.length){
            Object newa[] = new Object[newarr.length*2];
            for(int i=0;i<newarr.length;i++){
                newa[i] = newarr[i];
            }
            newarr = newa;
                    }
                    for (Object arr: e) {
                        push(arr);
                    }
    }
public Object peek(){
    if(size ==0){
        try {
            throw new Exception("Stack Is Empty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    return newarr[size-1];
}
public int size(){
    return size;
}


}
public class  ArrayStack{
public static void main(String[] args) {
    Arrayst s1 = new Arrayst(2);
    // s1.push(3);
    // s1.push(6);
    // s1.push(9);
    // s1.push(12);
    // System.out.println(s1.peek());
    // System.out.println(s1.pop());
    // System.out.println(s1.pop());
    String []arr ={"A","B","C"};
    s1.push(arr);
    System.out.println( s1.peek());
    s1.pushall(arr);
   for(int i=0;i<arr.length;i++){
    System.out.print(s1.pop()+" ");
   }

}
}