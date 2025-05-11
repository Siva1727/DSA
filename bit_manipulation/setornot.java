package bit_manipulation;

public class setornot {
    public static void main(String[] args) {
        int n = 10;
        int k=5;

        System.out.println(n &(1<<k));

        // if((n&(1<<k)) != 0)System.out.println("Set");
        // else System.out.println("Not set");

        System.out.println((n & (1 << k)) != 0 ? "Set" : "Not set");
 
    }   
}
