import java.util.Scanner;

interface st {
    public Object pop();

    public Object push(Object x);

    public Object peek();

    public int size();
}

class Stackk implements st {
    Object[] Originalarr;
    Object[] newarr;
    Scanner sc = new Scanner(System.in);
    int size;

    Stackk(int size) {
        Originalarr = new Object[size];
    }

    public Object pop() {
        if (size > 0) {
            size--;
            Object element = Originalarr[size];
            Originalarr[size] = null;
            return element;
        }
        throw new IllegalStateException("The stack is empty");
    }
    public Object push(Object x) {
        if (size < 0) {
            throw new IllegalStateException("The stack is empty");
        }
        if (size == Originalarr.length) {
            newarr = new Object[Originalarr.length + 1];
            System.arraycopy(Originalarr, 0, newarr, 0, size);
            Originalarr = newarr;
        }
        Originalarr[size] = x;
        size++;
        return Originalarr[size - 1];
    }

    public Object peek() {
        if (size > 0) {
            return Originalarr[size - 1];
        }
        throw new IllegalStateException("The stack is empty");
    }

    public int size() {
        return size;
    }
}
public class myclass {
   public myclass(String []args){
        Stackk st = new Stackk(args.length);
        for(int i=0;i<args.length;i++){
            
           String inn = args[i];
           if(isAnOperator(inn)){
            double a = Double.parseDouble((String)st.pop());
            double b = Double.parseDouble((String)st.pop());
            double c = evaluate(a,b,inn);
           } 
        }
   } private boolean isAnOperator(String in){
            return (in.length()==1 && "ASMD".indexOf(in)>=0);//checks these elements in the string if does not exist it will through -1  totherwise it will through 1 
           }
           private double evaluate(double a,double b,String op){
double z = 0 ;
if(op.equals("A")){
    z = a+b;
}
if(op.equals("S")){
    z = a-b;
}
if(op.equals("M")){
    z = a*b;
}
if(op.equals("D")){
    z = a/b;
}
System.out.println(a+" "+op+" "+b+" "+z);
return z;
           }
           public static void main(String[] args) {
            String [] myString= {"7","2","A","5","8","2","D","S","M"};
            new RPN(myString);
           }
}

