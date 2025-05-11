import java.util.Stack;
public class InfixToPrefix {
    public static void main(String[] args) {
        //String infix = "(A+B)*(C-D)";
        String infix = "((A+B)^C)";   
        // String str = new StringBuilder(infix).reverse().toString();
        String str = Reverse(infix);
        int i=0;
        int n=str.length();
        Stack<Character>st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        while(i < n){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans.append(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.peek());
                    st.pop();
                }
                st.pop();
            } 
            else{
                // while(!st.isEmpty() && pri(ch) < pri(st.peek())){
                //     ans.append(st.pop());
                // }
                // st.push(ch);

                if(ch =='^'){
                    while (!st.isEmpty() && pri(ch) <= pri(st.peek())) { 
                        ans.append(st.pop());
                    }
                }
                else{
                    while (!st.isEmpty() && pri(ch) < pri(st.peek())) { 
                        ans.append(st.pop());
                    }
                }
                st.push(ch); 
            }
            i++;
        }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        //ans.reverse().toString();
        System.out.println(ans.reverse().toString());

    }
    static int pri(char ch){
        switch (ch) {
            case '*':
            case '/':
                return 2;

            case '+':
            case '-':
                return 1;

            case '^':
                return 3;

            default:
                return -1;
        }
    }
    static String Reverse(String str){
        StringBuilder rev = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch == '('){
                rev.append(')');
            }
            else if(ch == ')'){
                rev.append('(');
            }
            else rev.append(ch);
        }
        return rev.toString();
    }

}
