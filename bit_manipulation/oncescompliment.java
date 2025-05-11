package bit_manipulation;

public class oncescompliment {
    public static void main(String[] args) {
        int a = 10;
    
        // int com = ~a;
        // String ab = Integer.toBinaryString(a);
        // String comb = Integer.toBinaryString(com);
        // System.out.println(ab);
        // System.out.println(comb);

        int k=2;
        int ans = a^(1<<k-1);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(ans));
    }
}
