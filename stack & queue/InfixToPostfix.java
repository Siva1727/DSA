import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        // String infix = "A+B*(C^D-E)/F";
        String infix = "A^B^C";
        System.out.println("Postfix Expression: " + infixToPostfix(infix));
    }

    static String infixToPostfix(String exp) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // If character is an operand, add it to the output
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            } 
            // If character is '(', push to stack
            else if (ch == '(') {
                st.push(ch);
            } 
            // If character is ')', pop and add to output until '(' is found
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // Remove '(' from stack
            } 
            // If an operator is encountered
            else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop all remaining operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            default: return -1;
        }
    }
}
