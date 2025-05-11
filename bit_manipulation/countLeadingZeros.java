package bit_manipulation;

public class countLeadingZeros {
    public static void main(String[] args) {
        int n = 30 ; //1100
        // int cnt = 0;

        // for(int i=32;i>=0;i--){
        //     if((n&(1<<i)) == 0){
        //         cnt++;
        //     }
        //     else break;
        // }
        // System.out.println(cnt);
        System.out.println(Integer.numberOfLeadingZeros(n));
    }
}
