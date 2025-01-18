import java.util.Stack;
public class prefixExpresion {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println(str);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int) ch;
            // the ascii vcalue of '0' is 48 and the ascii value of '9' is 57
            if (asci >= 48 && asci <= 57) {
                String r = " "+ch;
                val.push(r);
            } else if (op.size() == 0 || ch=='(' || op.peek()=='(') {
                op.push(ch);
            }
            else if(ch==')'){
                while (op.peek()!= '(') {
                    String  v2 = val.pop();
                    String v1 = val.pop();
                      char  c = op.pop();
   String com = c + v1+v2;    
   val.push(com);         
                }
                op.pop();
            }
             else {
                if (ch == '+' || ch == '-') {
                    // do work
                    String  v2 = val.pop();
                    String  v1= val.pop();
                   char o = op.pop();    
                   String h = o + v1 + v2;  
                   val.push(h); 
                   op.push(ch);          
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char c = op.pop();
                        String h = c + v1 + v2;
                        val.push(h);
                        // push
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
        }
        // val stack size --> 1
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
           char t= op.pop();
           String h = t + v1+ v2;
           val.push(h); 
        }
        String prefix = val.pop();
        System.out.println(prefix);
 }
}
