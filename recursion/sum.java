<<<<<<< HEAD
public class sum {
    // Iterative approach :
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        System.out.println(sum(n,sum));
    }
    static int sum(int n,int sum){
        if(n < 1){
            return sum;
        }
        return sum(n-1,sum+n);
    }
    // Functional approach : 
    // public static void main(String[] args) {
    //     int n = 10;
    //     int sum = 0;
    //     System.out.println(sum(n));
    // }
    // static int sum(int n){
    //     if(n < 1){
    //         return 0;
    //     }
    //     return n+sum(n-1);
    // }
}
=======
public class sum {
    // Iterative approach :
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        System.out.println(sum(n,sum));
    }
    static int sum(int n,int sum){
        if(n < 1){
            return sum;
        }
        return sum(n-1,sum+n);
    }
    // Functional approach : 
    // public static void main(String[] args) {
    //     int n = 10;
    //     int sum = 0;
    //     System.out.println(sum(n));
    // }
    // static int sum(int n){
    //     if(n < 1){
    //         return 0;
    //     }
    //     return n+sum(n-1);
    // }
}
>>>>>>> 01ed7d3 (commit stack and queue)
