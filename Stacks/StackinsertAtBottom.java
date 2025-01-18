import java.util.Stack;
public class StackinsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(6);
        s.push(9);
        s.push(12);
        System.out.println(s);
        Stack<Integer> s2 = new Stack<>();
        while (s.size()>0) {
            s2.push(s.pop());
        }
        System.out.println(s2);
        s.push(0);
        while (s2.size()>0) {
            s.push(s2.pop());
        }
        System.out.println(s);
       
    }
}
