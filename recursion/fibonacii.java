
import java.util.*;

public class fibonacii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Number for febonacci : ");
        int x = sc.nextInt();
        
        int a = 0;
        int b =1;
        System.out.print(a+" "+b+" ");
        fibo(x-2,a,b);
    //     System.out.println(fibo(x));
    // }

    // static int fibo(int x) {
    //     if (x <= 1) {
    //         return x;
    //     }
        
    //     // int x1 = fibo(x - 1);
    //     // int x2 = fibo(x - 2);
    //     return fibo(x-1) + fibo(x-2);

    }

    static void fibo(int n,int a,int b){
        if(n ==0 )return;

        int c = a+b;
        System.out.print(c+ " ");
        fibo(n-1,b,c);
    }
        
}
