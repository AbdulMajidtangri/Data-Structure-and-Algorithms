import java.util.Stack;
public class recursivelyinsert {
    public static void display( Stack<Integer> st){
        if(st.size()==0)return;
 Object top = st.pop();
 display(st); 
   System.out.print(top+" ");
 st.push((Integer) top);
    }
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
  
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); 
        Stack<Integer> st3 = new Stack<>();
        display(st);   
    }
}
