import java.util.*;
public class Collatz_Conjecture 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = collatz(n);
        System.out.println("Number of steps to reach 1: " + result);
    }
    static int collatz(int n) {
        int cnt = 0;
        if(n <= 0) {
            return -1; // Invalid input
        }
        if(n == 1) {
            return 0; // Already at 1
        }
        while( n!=1)
        {
            if(n%2 == 0)
            {
                n/=2;
            }
            else
            {
                n = (n*3)+1;
            }
            cnt++;
        }
        return cnt;
    }
}
