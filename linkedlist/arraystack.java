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

public class arraystack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 4;
        Stackk st = new Stackk(size);
        st.push("AppLE");
        st.push("Tomato");
        st.push("Kivi");
        st.push("Mangoes");
        // st.peek();
        System.out.println();

        // Transfer elements from st to st2
        Stackk st2 = new Stackk(size);
        System.out.println("Top to bottom");
        while (st.size() > 0) {
            Object s = st.pop();

            System.out.print(st2.push(s) + " ");
        }
        int half = size / 2;
        Stackk st3 = new Stackk(half);
        Stackk st4 = new Stackk(size - half);
        Stackk st5 = new Stackk(size);
        System.out.println();
        while (st2.size() > half) {
            st3.push(st2.pop());
        }
        while (st2.size() > 0) {
            st4.push(st2.pop());
        }
        System.out.println("Boths Stacks are");
        System.out.println("1:");
        while (st3.size() > 0) {
            st5.push(st3.peek());
            System.out.println(st3.pop());
        }
        System.out.println("2:");
        while (st4.size() > 0) {
            st5.push(st4.peek());
            System.out.println(st4.pop());
        }System.out.println("Merged stacks are : ");
        while (st5.size() > 0) {
            System.out.print(st5.pop() + " ");
        }
    }
}
