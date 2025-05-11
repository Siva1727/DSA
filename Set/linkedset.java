import java.util.LinkedHashSet;
import java.util.Set;

public class linkedset {
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(5);
        System.out.println(set);
    }
}
