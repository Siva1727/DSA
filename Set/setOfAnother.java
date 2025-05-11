import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class setOfAnother {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {3,4,5,6};
        Set <Integer> set1 = new LinkedHashSet<>();
        Set <Integer> set2 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(arr1));
        set2.addAll(Arrays.asList(arr2));
    }
}
