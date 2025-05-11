package bit_manipulation;

public class Onsetcount {
    public static void main(String[] args) {
        //int n =0b1010;
        String num = "1010";
        int n = Integer.parseInt(num,2);

        int cnt=0;
        while(n!=0){
            if((n&1) == 1){
                cnt++;
            }
            n = n>>1;
        }
        System.out.println(cnt);
    }
}
