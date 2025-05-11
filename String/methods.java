package String;
import java.lang.*;
import java.util.*;
public class methods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'a';
        String str = "Siva Chidhambaram ";
        String str2 = "Siva";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('C'));
        System.out.println(str.indexOf('a', 3));
        System.out.println(str.indexOf(str2));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s+",""));
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.subSequence(4,6));
        System.out.println("start with: " + str.startsWith("Siva"));
        System.out.println("end with: " + str.endsWith("ram"));
        System.out.println("contains: " + str.contains("Chidhambaram"));
        System.out.println(str.compareTo(str2));
        String[] parts = str.split("a");
        System.out.println(Arrays.toString(parts));
    }

}
