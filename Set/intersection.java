import java.util.*;

public class intersection {
    public static void main(String[] args) {
        // int arr1[] = {1,2,3,4};
        // int arr2[] = {3,4,5,6};
        // List<Integer> ls1 = new ArrayList<>();
        // List<Integer> ls2 = new ArrayList<>();

        // for (int i : arr1) {
        //     ls1.add(i);
        // }
        
        // for (int i : arr2) {
        //     ls2.add(i);
        // }
        // ls1.retainAll(ls2);
        // System.out.println(ls1);

        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {3,4,5,6};
        Set <Integer> set1 = new LinkedHashSet<>();
        Set <Integer> set2 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(arr1));
        set2.addAll(Arrays.asList(arr2));
        set1.retainAll(set2);
        //set1.removeAll(set2);
        System.out.println(set1);

    }
}
