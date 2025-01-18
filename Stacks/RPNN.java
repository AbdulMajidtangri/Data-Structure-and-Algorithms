interface Stack{
    public Object push(Object a);
  public Object pop();
  public Object peek();
  public int size();
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
public class RPNN {
    RPNN(String []ags){
        ArrayStack s = new ArrayStack(ags.length);
        for(int i=0;i<ags.length;i++){
            if(ags[i].matches("\\d+")){
                s.push(Integer.parseInt(ags[i]));
            }
            else{
                int a = (int)s.pop();
                int b = (int)s.pop();
                switch(ags[i]){
                    case "+":s.push(a+b);break;
                    case "-":s.push(b-a);break;
                    case "*":s.push(a*b);break;
                    case "/":s.push(b/a);break;
                }
            }
            System.out.println(s.peek());
            // if(s.size()==0){
            //     System.out.println("Result: "+s.peek());
            //     break;
            //
            // }
        }
    }
   public static void main(String[] args) {
    String[] st = {"2", "3", "+", "4", "*", "5", "-"};
    RPNN r = new RPNN(st);
    
   } 
}
