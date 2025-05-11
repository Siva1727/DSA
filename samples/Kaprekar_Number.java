import java.util.*;

public class Kaprekar_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isKaprekar(n)) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is not a Kaprekar number.");
        }
    }
    static boolean isKaprekar(int n){
        if( n == 1)return true;
        int cnt_n  = String.valueOf(n).length();
        int sqre = n*n;
        int tens = 1;
        for(int i=0;i<cnt_n;i++){
            tens *= 10;
        }
        System.out.println(tens);
        int left = sqre / tens;
        int right = sqre % tens;
        System.out.println(right);
        System.out.println(left);
        return left + right == n;
    }
    
}
