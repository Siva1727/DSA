
public class palindrom {

    public static void main(String[] args) {
        String str = "madm";
        System.out.println(paldr(0, str));
    }

    static boolean paldr(int i, String str) {
        if (i >= str.length() / 2) {
            return true;
        }
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
            return false;
        }
        return paldr(i + 1, str);
    }
}
