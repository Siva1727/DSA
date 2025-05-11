package bit_manipulation;

public class decimaltobinary {
    public static void main(String[] args) {
        //int ans = 0;
        int n = 10;
       // System.out.println(Integer.toBinaryString(n));
        System.out.println(new StringBuilder(bin(n)).reverse().toString());
    }
    static String bin(int n){
        String ans ="";
        while(n!=0 && n!=1){
            int rem = n%2;
            ans += rem;;
            n/=2;
        }
        ans = ans+n;
        return ans;
    }
    
}
