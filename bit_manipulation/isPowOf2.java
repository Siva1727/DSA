package bit_manipulation;

public class isPowOf2 {
    public static void main(String[] args) {
        int n = 0b1000;
        System.out.println(((n &(n-1)) == 0) ? "Pow of two" : "Not pow of two");
    }
}
