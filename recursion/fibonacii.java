<<<<<<< HEAD

import java.util.*;

public class fibonacii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Number for febonacci : ");
        int x = sc.nextInt();
        System.out.println(fibo(x));
    }

    static int fibo(int x) {
        if (x <= 1) {
            return x;
        }
        
        // int x1 = fibo(x - 1);
        // int x2 = fibo(x - 2);
        return fibo(x-1) + fibo(x-2);
    }
}
=======

import java.util.*;

public class fibonacii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth Number for febonacci : ");
        int x = sc.nextInt();
        System.out.println(fibo(x));
    }

    static int fibo(int x) {
        if (x <= 1) {
            return x;
        }
        
        // int x1 = fibo(x - 1);
        // int x2 = fibo(x - 2);
        return fibo(x-1) + fibo(x-2);
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
