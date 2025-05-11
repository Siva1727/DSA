
import java.util.*;

public class OddDivisorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int first = 0;
        int last = 0;
        if(n >=10)last = n%10;
        else last = n;
        while(n>10){
            n/=10;
        }
        System.out.println("First digit: " + n);
        System.out.println("Last digit: " + last);
    }
}
