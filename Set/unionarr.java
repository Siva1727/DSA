import java.util.*;

public class unionarr {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Integer arr1[] = {1,2,3};
        Integer arr2[] = {3,4,5,5,6};
        set.addAll(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        System.out.print(set);
    }
}
