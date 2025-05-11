<<<<<<< HEAD
public class recursion {
    public static void main(String[] args) {
        //int a = 6;
        int n = 5;
        func(n,n);
    }
    static  void func(int a, int n){
        if(a < 1){
            return;
        }
        func(a-1, n);
        System.out.println(a);
    }
}
=======
public class recursion {
    public static void main(String[] args) {
        //int a = 6;
        int n = 5;
        func(n,n);
    }
    static  void func(int a, int n){
        if(a < 1){
            return;
        }
        func(a-1, n);
        System.out.println(a);
    }
}
>>>>>>> 01ed7d3 (commit stack and queue)
