import java.util.Scanner;
import java.util.Stack;
public class stacks01{
  public static void dispalyreverserecursive(Stack<Integer> st){
   
     if(st.size()==0){
           return;
     }
  int x= st.pop();
     System.out.print(x+" ");
   dispalyreverserecursive(st);
   st.push(x);
  }
  public static void dispalyrack(Stack<Integer> st){
   
     if(st.size()==0){
           return;
     }
  int x= st.pop();
   dispalyrack(st); 
       System.out.print(x+" ");
   st.push(x);
  }
  public static void addbottom(Stack<Integer> st,int ele){
   
     if(st.size()==0){
      st.push(ele);
      return;
      }
      int x=st.pop();
       addbottom(st, ele);
       System.out.print(x+" ");
       st.push(x);
      //  st.push(ele);
       // System.out.println(st);
  
  }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(); 
          // System.out.println(st.isEmpty());
          Scanner sc= new Scanner(System.in);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // System.out.println(st);
        // dispalyreverserecursive(st);
        // System.out.println();
        // dispalyrack(st);
        // System.out.println();
        // System.out.println(st);
        addbottom(st, 20);
        System.out.println();
        System.out.println(st);
        // System.out.println(st);
        // System.out.println(st.size());
        // st.pop();
        // System.out.println(st);
        // System.out.println(st.size());
        // System.out.println(st.isEmpty());
        // Stack<Integer> st2 = new Stack<>(); 
        // for(int i=0;i<=st.size()+1;i++){
        //     int x = st.peek();
        //     st2.push(x);
        //     st.pop();
        // }

        //put the value of One Stack toanother stack

        // while (st.size()>0) {
        //     // int x = st.peek();
        //     // st2.push(x);
        //     // st.pop();
        //     st2.push(st.pop());
        // }     System.out.println(st2);
        // Stack<Integer> st3 = new Stack<>();
        // while (st2.size()>0) {
        //     // int x = st.peek();
        //     // st2.push(x);
        //     // st.pop();
        //     st3.push(st2.pop());
        // }  
        // System.out.println(st3);
 
        //how to put the Value at 0th index

        // Stack<Integer> st2 =new Stack<>();

        // while (st.size()>0) {
        //     st2.push(st.pop());
        // }
        // st2.push(5);
        // System.out.println(st2);
        // while (st2.size()>0) {
        //    st.push(st2.pop()); 
        // }
        // System.out.println(st);

        //how to put the  value at any index
      //    Stack<Integer> st2 =new Stack<>();
      //   System.out.println("At what index you want to insert the number");
      //   int indx = sc.nextInt();
      //   System.out.println("What value you want to insert in that particular index of Stack");
      //   int value = sc.nextInt();
      //   while (st.size()>indx) {
      //       st2.push(st.pop());
      //   }
      //   st2.push(value);
      // while(st2.size()>0){ 
      //   st.push(st2.pop());
      // }
      // System.out.println(st);


      //printing the element of the Stacks by the new stack
        // Stack<Integer> st2 = new Stack<>();
        // while (st.size()>0) {
        //   st2.push(st.pop());
        // }
        // while (st2.size()>0) {
        //   System.out.print(st2.peek()+" ");
        //   st.push(st2.pop());
        // }
        // System.out.println(st);
    }
}