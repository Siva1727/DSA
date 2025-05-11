package bit_manipulation;

public class BinaryToDecimal{
    public static void main(String[] args) {
        //int n = 10100;
        // int i=1;
        // int ans = 0;
        // while(n!=0){
        //     int r = n%10;
        //     ans += (r*i);
        //     n/=10;
        //     i*=2;
        // }
        String str = "1010";
        System.out.println(Integer.parseInt(str,2));
    }
}
