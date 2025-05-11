import java.util.*;
public class ugly_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;
        for(int i=0;i<a;i++){
            int n=sc.nextInt();
            System.out.println(isUgly(n));
        }
    } 
    static boolean isUgly(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }
}
