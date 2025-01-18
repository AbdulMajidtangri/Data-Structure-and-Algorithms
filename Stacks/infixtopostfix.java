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

public class infixtopostfix {
    infixtopostfix(String []args){
        Stackk s = new Stackk(args.length);
        for(int i=0;i<args.length;i++){
            if(args.length>1){
                            System.out.print(args[i]+" ");
            }
            if(s.size()==0){
                
            }

        }
    }
  
    public static void main(String[] args) {
        String []st = {"a","A","b","M","(","d","A","e",")"};
        infixtopostfix f = new infixtopostfix(st);
    }
}
