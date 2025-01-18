import java.util.Stack;

public class InfixToPos2fix {

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return 0;
    }

    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char charAt = expression.charAt(i);

            if (Character.isLetterOrDigit(charAt)) {
                output.append(charAt);
            } else if (charAt == '(') {
                stack.push(charAt);
            } else if (charAt == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop();
            } else if (isOperator(charAt)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(charAt)) {
                    output.append(stack.pop());
                }
                stack.push(charAt);
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix: " + infixExpression);
        System.out.println("Postfix: " + postfixExpression);
    }
}
