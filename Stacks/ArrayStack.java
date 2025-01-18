interface Stack{
    public Object push(Object a);
  public Object pop();
  public Object peek();
  public int size();
}
public class ArrayStack implements Stack {
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
 return newarr[size-1];
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
    public static void main(String[] args) {
        ArrayStack s1 = new ArrayStack(4);
        s1.push("kamran");
        s1.push("Sachin");
        s1.push("Ali");
        s1.push("Kalesh");
        System.out.println(s1.pop());

        // System.out.println("Reverse The Stack top to Bottom");
        // ArrayStack s2 = new ArrayStack(4);
        // while (s1.size()>0) {
        //     s2.push(s1.pop());
        //     s2.peek();
        // }
        //         int half = s2.size()/2;
        //         ArrayStack s3 = new ArrayStack(4);
        //         ArrayStack s4 = new ArrayStack(4);
        //         System.out.println();
        //         System.out.println("The Stack is Splited");
        //         System.out.println("First half");
        //         while (s2.size()>half) {
        //             s3.push(s2.pop());
        //             s3.peek();
        //         }
        //         System.out.println();
        //         System.out.println("Second Half");
        //         while (s2.size()>0) {
        //             s4.push(s2.pop());
        //             s4.peek();
        //         }
        //         System.out.println();
        //         System.out.println("Merged Stacks are");
        //         ArrayStack s5 = new ArrayStack(4);
        //        while (s3.size()>0) {
        //         s5.push(s3.pop());
        //         s5.peek();
        //        } 
        //        while (s4.size()>0) {
        //         s5.push(s4.pop());
        //         s5.peek();
        //        } 
    }
}
