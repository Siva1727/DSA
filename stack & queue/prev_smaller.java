import java.util.Arrays;
import java.util.Stack;
public class prev_smaller {
    public static void main(String[] args) {
        int[]A = {4,5,2,10,8};
        Stack<Integer>st = new Stack<>();
        int ans[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            while(!st.isEmpty() && st.peek() >= A[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(A[i]);
        }
        System.out.println(Arrays.toString(ans));
    }
}
