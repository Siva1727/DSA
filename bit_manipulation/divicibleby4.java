package bit_manipulation;

public class divicibleby4 {
    public static void main(String[] args) {
        int n = 32;
        System.out.println((n & 3)==0 ? "Divicible by 4 " : "Not divicible by 4");
    }
}
