package bit_manipulation;

public class cntTrailing0 {
    public static void main(String[] args) {
        int n = 12 ; //1100
        // int cnt = 0;
        // while(((n & 1) == 0) && n !=0){
        //     cnt++;
        //     n = n>>1;
        // }
        // System.out.println(cnt);
        System.out.println(Integer.numberOfTrailingZeros(n));
       
    }
}
