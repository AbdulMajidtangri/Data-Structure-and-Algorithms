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
//reverse polish notation=postfix
public class RPN {
    public RPN(String[] args) {
        Stackk rpn=new Stackk(args.length);
        for(int i=0;i<args.length;i++) {
            String input=args[i];
            if(isAnOperator(input)) {
                double y=Double.parseDouble((String)rpn.pop());
                double x=Double.parseDouble((String)rpn.pop());
                double z=evaluate(x,y,input);
                rpn.push(" "+z);
            }
            else {
                rpn.push(input);
            }
        }
        
    }
    
        private boolean isAnOperator(String s) {
        return (s.length()==1 && "ASMD".indexOf(s)>=0);
    }
        private double evaluate(double x, double y, String op) {
            double z=0;
            if(op.equals("A")) {
                z=x+y;
            }
            else if(op.equals("S")) {
                z=x-y;
            }
            else if(op.equals("M")) {
                z=x*y;
            }
            else {
                z=x/y;
            }
            System.out.println(x+" "+op+" "+y+"="+z);
            return z;
    }
        public static void main(String[] args) {
            String [] myString= {"7","2","A","5","8","2","D","S","M"};
            new RPN(myString);
    
        }
    
    }