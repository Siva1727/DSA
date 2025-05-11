package bit_manipulation;

public class swap {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);

        //System.out.println(a^(1<<2));
    }
}
