import java.util.Stack;
public class InfixB {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int) ch;
            // the ascii vcalue of '0' is 48 and the ascii value of '9' is 57
            if (asci >= 48 && asci <= 57) {
                val.push(asci - 48);
            } else if (op.size() == 0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek()!= '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '+')    val.push(v1 + v2);                   
                    if (op.peek() == '-')    val.push(v1 - v2);                    
                    if (op.peek() == '*')    val.push(v1 * v2);                 
                    if (op.peek() == '/')    val.push(v1 / v2);                   
                    op.pop();
                }
                op.pop();
            }
             else {
                if (ch == '+' || ch == '-') {
                    // do work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '+')    val.push(v1 + v2);                   
                    if (op.peek() == '-')    val.push(v1 - v2);                    
                    if (op.peek() == '*')    val.push(v1 * v2);                 
                    if (op.peek() == '/')    val.push(v1 / v2);                   
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if (op.peek() == '*') val.push(v1 * v2);
                        if (op.peek() == '/') val.push(v1 / v2);
                        // push
                        op.pop();
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        // val stack size --> 1
        while (val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '+') {
                val.push(v1 + v2);
            }
            if (op.peek() == '-') {
                val.push(v1 - v2);
            }
            if (op.peek() == '*') {
                val.push(v1 * v2);
            }
            if (op.peek() == '/') {
                val.push(v1 / v2);
            }
            op.pop();
        }
        System.out.println(val.peek());
  
    }
}
