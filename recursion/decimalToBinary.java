public class decimalToBinary {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(solve(n));
    }
    static String solve(int n ){
        if(n == 0 || n ==1 ){
            return Integer.toString(n);
        }
        return solve(n/2)+(n % 2);

    }
}
