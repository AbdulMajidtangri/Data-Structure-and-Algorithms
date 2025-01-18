
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
public class SolvingRPN {
  public   SolvingRPN(String []arr){
        ArrayStack as= new ArrayStack(arr.length);
        for(int i=0;i<arr.length;i++){
            String input = arr[i];
            if(isAnOperator(input)){
              double x = Double.parseDouble((String)as.pop());
              double y = Double.parseDouble((String)as.pop());
              double z = evaluate(x,y,input);
              as.push(z);
            }else{
            as.push(input);
        }
        }
        
    }
    public boolean isAnOperator(String s){
           return (s.length()==1 && "ASMD".indexOf(s)>=0 );
 
    }
    public double evaluate(double x,double y,String op){
        double z = 0;
        if(op.equals("A")){
            z = x+y;
        }
        if(op.equals("S")){
            z = x-y;
        }
        if(op.equals("D")){
            z = x/y;
        }
        if(op.equals("M")){
            z =  x * y;
        }
        System.out.println("The x is "+x+" THE opreator is "+op+" the y is"+y+" the final Value "+z);
        return z;
    }
    public static void main(String[] args) {
        String[] mys = {"2","2","A","6","4","M","6","5","S"};
       new  SolvingRPN(mys);
    }
}
